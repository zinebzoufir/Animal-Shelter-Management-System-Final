Notre application de gestion est une solution gérée pour les refuges pour animaux, les groupes de secours et les installations de contrôle des animaux. Elle offre des outils pour stocker, ajouter ou supprimer les données des animaux de compagnie du refuge (noms, race, âge,...), ainsi que les données des propriétaires si l'animal est adopté ou en cours d'adoption.

-L'application écrite en Java utilise Swing comme interface graphique principale.  
-La classe homepage est la classe principale de l'application qui affiche la page de connexion:
 les identifiants utilisés: root/root ou encore admin1/admin1, admin2/admin2, admin3/admin3.
-La classe Identifiants implémente l'interface Map<K,V>.
-La classe LoginSuccess représente le menu de l'application où l'utilisateur (responsable du refuge) pourra choisir quelle base de données souhaite-t-il de voir ou encore de se déconnecter. 
-Les deux classes proprietairesBDD et animalsBDD abritent les bases de données:
	*Une section consacrée à l'ajout d'une nouvelle ligne dans la BDD.
	*On peut supprimer les lignes en sélectionnant la ligne souhaitée et en cliquant sur le bouton "Supprimer"
	*On peut actualiser la base de données avec le bouton "Mettre à jour"
	*On peut revenir à la page principale.

Remarques:
*Pour la section "About" dans la page de connexion, elle a été construite avec Swing IU designer (IU Form) d'Intellij. Pour une meilleure visibilité, on vous recommende de lancer le code d'application "RefugeAnimalier_Intellij" avec Intellij.
*Le fichier RefugeAnimalier_Eclipse a été compilé avec JDK 15 sur Eclipse.

About:
This project is brought to you by : Laila Allam , Latifa Hammani and Zineb Zoufir.
This Animal shelter gestion project is the work of three dedicated students at the National Institue of Posts and Telecommunications under the supervision of Professor Youness LAGHOUAOUTA
