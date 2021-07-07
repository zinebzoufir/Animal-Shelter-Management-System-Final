
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

import static java.util.Objects.requireNonNull;

import java.util.AbstractList;

public class Identifiants<K,V> implements Map<K,V>{



    /** The one and only key in this tiny map */
    private K key;

    /** The value for the only key in this tiny map */
    private V value;

    /**
     * Constructor
     */
    public Identifiants()
    {
    }

    /**
     * Constructs map with a single key and value pair.
     *
     * @param key
     *            The key
     * @param value
     *            The value
     */
    public Identifiants(K key, V value)
    {
        put(key, value);
    }


    /**
     * @see java.util.Map#size()
     */
    public int size()
    {
        return (key != null) ? 1 : 0;
    }

    /**
     * @see java.util.Map#isEmpty()
     */
    public boolean isEmpty()
    {
        return size() == 0;
    }

    /**
     * @see java.util.Map#containsKey(java.lang.Object)
     */
    public boolean containsKey(Object key)
    {
        return key.equals(this.key);
    }

    /**
     * @see java.util.Map#containsValue(java.lang.Object)
     */
    public boolean containsValue(Object value)
    {
        return value.equals(this.value);
    }

    /**
     * @see java.util.Map#get(java.lang.Object)
     */
    public V get(Object key)
    {
        if (key.equals(this.key))
        {
            return value;
        }

        return null;
    }

    /**
     * @see java.util.Map#put(java.lang.Object, java.lang.Object)
     */
    public V put(K key, V value)
    {
        // Replace?
        if (key.equals(this.key))
        {
            V oldValue = this.value;

            this.value = value;

            return oldValue;
        }
        else
        {
            // Store
            this.key = key;
            this.value = value;

            return null;
        }
    }

    /**
     * @see java.util.Map#remove(java.lang.Object)
     */
    public V remove(Object key)
    {
        if (key.equals(this.key))
        {
            V oldValue = value;

            this.key = null;
            value = null;

            return oldValue;
        }

        return null;
    }

    /**
     * @see java.util.Map#putAll(java.util.Map)
     */
    public void putAll(Map< ? extends K, ? extends V> map)
    {
        if (map.size() <= 10)
        {
            Entry< ? extends K, ? extends V> e = map.entrySet().iterator().next();

            put(e.getKey(), e.getValue());
        }
        else
        {
            throw new IllegalStateException("Map full.  Cannot add " + map.size() + " entries");
        }
    }

    /**
     * @see java.util.Map#clear()
     */
    public void clear()
    {
        key = null;
        value = null;
    }

    /**
     * @see java.util.Map#keySet()
     */
    public Set<K> keySet()
    {
        return new AbstractSet<K>()
        {
            @Override
            public Iterator<K> iterator()
            {
                return new Iterator<K>()
                {
                    public boolean hasNext()
                    {
                        return index < Identifiants.this.size();
                    }

                    public K next()
                    {
                        if (!hasNext())
                        {
                            throw new NoSuchElementException();
                        }
                        index++;

                        return key;
                    }

                    public void remove()
                    {
                        Identifiants.this.clear();
                    }

                    int index;
                };
            }

            @Override
            public int size()
            {
                return Identifiants.this.size();
            }
        };
    }

    /**
     * @see java.util.Map#values()
     */
    public Collection<V> values()
    {
        return new AbstractList<V>()
        {
            @Override
            public V get(int index)
            {
                if (index > size() - 1)
                {
                    throw new IndexOutOfBoundsException();
                }
                return value;
            }

            @Override
            public int size()
            {
                return Identifiants.this.size();
            }
        };
    }

    /**
     * @see java.util.Map#entrySet()
     */
    public Set<Entry<K, V>> entrySet()
    {
        return new AbstractSet<Entry<K, V>>()
        {
            @Override
            public Iterator<Entry<K, V>> iterator()
            {
                return new Iterator<Entry<K, V>>()
                {
                    public boolean hasNext()
                    {
                        return index < Identifiants.this.size();
                    }

                    public Entry<K, V> next()
                    {
                        if (!hasNext())
                        {
                            throw new NoSuchElementException();
                        }
                        index++;

                        return new Map.Entry<K, V>()
                        {
                            public K getKey()
                            {
                                return key;
                            }

                            public V getValue()
                            {
                                return value;
                            }

                            public V setValue(V value)
                            {
                                V oldValue = Identifiants.this.value;

                                Identifiants.this.value = value;

                                return oldValue;
                            }
                        };
                    }

                    public void remove()
                    {
                        clear();
                    }

                    int index = 0;
                };
            }

            @Override
            public int size()
            {
                return Identifiants.this.size();
            }
        };
    }
}
