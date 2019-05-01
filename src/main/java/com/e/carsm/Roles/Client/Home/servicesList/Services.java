package com.e.carsm.Roles.Client.Home.servicesList;

public class Services {
    private int id ;
    private String service ;
    private String prix ;

    public Services() {
    }

    public Services(int id, String service, String prix) {
        this.id = id;
        this.service = service;
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }
}
