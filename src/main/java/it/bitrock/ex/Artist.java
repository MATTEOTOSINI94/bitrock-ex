package it.bitrock.ex;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Artist implements Comparable<Artist>  {
    //First one is called Artist and contains the following attribute: id, name, surname, artisticalName, dateOfBirth
    private Integer id;
    private String name,surname,artisticalName;
    private LocalDate dateOfBirth;

    public Artist(Integer id, String name, String surname, String artisticalName, String dateOfBirth) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.artisticalName = artisticalName;
        this.dateOfBirth = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public Artist() {
    }


    @Override
    public int compareTo(Artist o) {
        int n = this.getId().compareTo(o.getId());
        if (n==0){
            n= this.getDateOfBirth().compareTo(o.getDateOfBirth());
            if (n==0){
                n=this.getName().compareTo(o.getName());
            }
        }
        return n;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getArtisticalName() {
        return this.artisticalName;
    }

    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setArtisticalName(String artisticalName) {
        this.artisticalName = artisticalName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String toString() {
        return "Artist(id=" + this.getId() + ", name=" + this.getName() + ", surname=" + this.getSurname() + ", artisticalName=" + this.getArtisticalName() + ", dateOfBirth=" + this.getDateOfBirth() + ")";
    }
}
