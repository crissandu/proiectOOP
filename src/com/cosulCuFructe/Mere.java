package com.cosulCuFructe;

import com.Tema3.FructeSalbatice;

import java.sql.SQLData;
import java.sql.SQLException;
import java.sql.SQLInput;
import java.sql.SQLOutput;

public class Mere extends Fructe implements FructeSalbatice, Comparable, SQLData {




    private String culoare;
    private int vechime;
    String textMar;


    public Mere() {
    }

    public String getCuloare() {
        return culoare;
    }

    public int getVechime() {
        return vechime;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }

    @Override
    void seOxideaza() {
        //
    }

    @Override
    public void siMaiMulteVitamine() {
        System.out.println("Am si vitamina tz");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String getSQLTypeName() throws SQLException {
        return null;
    }

    @Override
    public void readSQL(SQLInput stream, String typeName) throws SQLException {

    }

    @Override
    public void writeSQL(SQLOutput stream) throws SQLException {

    }
}
