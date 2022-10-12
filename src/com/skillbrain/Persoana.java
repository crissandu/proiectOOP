package com.skillbrain;

public class Persoana {

    private String nume;
    private String prenume;
    private long CNP = 1242566424;
    private String dataNastere;

    private final String SPECIE = "HOMO_SAPIENS";

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public long getCNP() {
        return CNP;
    }

    public String getDataNastere() {
        return dataNastere;
    }

    public void setDataNastere(String dataNastere) {
        this.dataNastere = dataNastere;
    }
}
