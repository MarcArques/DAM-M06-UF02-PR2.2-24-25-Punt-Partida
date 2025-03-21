package com.project;

public class Ciutada {


    private long ciutadaId;
    private Ciutat ciutat;
    private String nom;
    private String cognom;
    private int edat;

    public Ciutada() {}


    public Ciutada(String nom, String cognom, int edat) {
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
    }

    public long getCiutadaId() {
        return ciutadaId;
    }

    public Ciutat getCiutat() {
        return ciutat;
    }

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }
    
    public int getEdat() {
        return edat;
    }

    public void setCiutadaId(long ciutadaId) {
        this.ciutadaId = ciutadaId;
    }

    public void setCiutat(Ciutat ciutat) {
        this.ciutat = ciutat;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    @Override
    public String toString() {
        return "Ciutada - " + this.getCiutadaId() + ": " + this.getNom() + " "+ this.getCognom() + " , edat " + this.getEdat() + " anys";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        Ciutada ciutada = (Ciutada) o;
        return ciutadaId == ciutada.ciutadaId;
    }
    
    @Override
    public int hashCode() {
        return Long.hashCode(ciutadaId);
    }
    
}