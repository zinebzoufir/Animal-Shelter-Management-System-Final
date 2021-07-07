public class Animal {
    private String ID_Animal;
    private String Nom_Animal;
    private String type;
    private String race;
    private String sex;
    private String age;
    private String vaccined;
    private String dateVaccination;
    private String maladies;
    private String castration;
    private String dateCastration;
    private String endroitRescousse;
    private String statutAdoption;
    private String numAdoptions;
    private String derniereAdoptionDate;
	/*private String nomNouveauProprietaire;
	private String sexProprietaire;
	private String phoneNumberProprietaire;
	private String CIN_proprietaire;
	private String emailProprietaire;
	private String ID_Responsable;
	private String Nom_Responsable;
	private String NumResponsabe;*/
//###################################################################################################################################################################################


    public Animal(String ID_Animal, String Nom_Animal, String type, String race, String sex, String age, String vaccined, String dateVaccination, String maladies, String castration, String dateCastration, String endroitRescousse, String statutAdoption, String numAdoptions, String derniereAdoptionDate) {
        super();
        this.ID_Animal=ID_Animal;
        this.Nom_Animal=Nom_Animal;
        this.type=type;
        this.race=race;
        this.sex=sex;
        this.age=age;
        this.vaccined=vaccined;
        this.dateVaccination=dateVaccination;
        this.maladies=maladies;
        this.castration=castration;
        this.dateCastration=dateCastration;
        this.endroitRescousse=endroitRescousse;
        this.statutAdoption=statutAdoption;
        this.numAdoptions=numAdoptions;
        this.derniereAdoptionDate=derniereAdoptionDate;
    }
    //#############################################################################
    public String getID_Animal() {
        return ID_Animal;
    }
    public void setID_Animal(String iD_Animal) {
        ID_Animal = iD_Animal;
    }
    public String getNom_Animal() {
        return Nom_Animal;
    }
    public void setNom_Animal(String nom_Animal) {
        Nom_Animal = nom_Animal;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getRace() {
        return race;
    }
    public void setRace(String race) {
        this.race = race;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getVaccined() {
        return vaccined;
    }
    public void setVaccined(String vaccined) {
        this.vaccined = vaccined;
    }
    public String getDateVaccination() {
        return dateVaccination;
    }
    public void setDateVaccination(String dateVaccination) {
        this.dateVaccination = dateVaccination;
    }
    public String getMaladies() {
        return maladies;
    }
    public void setMaladies(String maladies) {
        this.maladies = maladies;
    }
    public String getCastration() {
        return castration;
    }
    public void setCastration(String castration) {
        this.castration = castration;
    }
    public String getDateCastration() {
        return dateCastration;
    }
    public void setDateCastration(String dateCastration) {
        this.dateCastration = dateCastration;
    }
    public String getEndroitRescousse() {
        return endroitRescousse;
    }
    public void setEndroitRescousse(String endroitRescousse) {
        this.endroitRescousse = endroitRescousse;
    }
    public String getStatutAdoption() {
        return statutAdoption;
    }
    public void setStatutAdoption(String statutAdoption) {
        this.statutAdoption = statutAdoption;
    }
    public String getNumAdoptions() {
        return numAdoptions;
    }
    public void setNumAdoptions(String numAdoptions) {
        this.numAdoptions = numAdoptions;
    }
    public String getDerniereAdoptionDate() {
        return derniereAdoptionDate;
    }
    public void setDerniereAdoptionDate(String derniereAdoptionDate) {
        this.derniereAdoptionDate = derniereAdoptionDate;
    }

//###############################################################################################################################
	/*
	public String getSexProprietaire() {
		return sexProprietaire;
	}
	public void setSexProprietaire(String sexProprietaire) {
		this.sexProprietaire = sexProprietaire;
	}
	public String getNomNouveauProprietaire() {
		return nomNouveauProprietaire;
	}
	public void setNomNouveauProprietaire(String nomNouveauProprietaire) {
		this.nomNouveauProprietaire = nomNouveauProprietaire;
	}
	public String getPhoneNumberProprietaire() {
		return phoneNumberProprietaire;
	}
	public void setPhoneNumberProprietaire(String phoneNumberProprietaire) {
		this.phoneNumberProprieta
	}
	public String getCIN_proprietaire() {
		return CIN_proprietaire;
	}
	public void setCIN_proprietaire(String cIN_proprietaire) {
		CIN_proprietaire = cIN_proprietaire;
	}
	public String getEmailProprietaire() {
		return emailProprietaire;
	}
	public void setEmailProprietaire(String emailProprietaire) {
		this.emailProprietaire = emailProprietaire;
	}
	public String getID_Responsable() {
		return ID_Responsable;
	}
	public void setID_Responsable(String iD_Responsable) {
		ID_Responsable = iD_Responsable;
	}
	public String getNom_Responsable() {
		return Nom_Responsable;
	}
	public void setNom_Responsable(String nom_Responsable) {
		Nom_Responsable = nom_Responsable;
	}
	public String getNumResponsabe() {
		return NumResponsabe;
	}
	public void setNumResponsabe(String numResponsabe) {
		NumResponsabe = numResponsabe;
	}*/


}