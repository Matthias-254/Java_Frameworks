package be.ehb.matthias_lannoo.model.tables;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.util.ArrayList;
import java.util.List;

@Entity
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    private String naam;
    private String categorie;
    @NotBlank
    private String inhoud;
    @NotBlank
    private String reporterNaam;
    @Email
    private String reporterEmail;

    public News() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public @NotBlank String getNaam() {
        return naam;
    }

    public void setNaam(@NotBlank String naam) {
        this.naam = naam;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public @NotBlank String getInhoud() {
        return inhoud;
    }

    public void setInhoud(@NotBlank String inhoud) {
        this.inhoud = inhoud;
    }

    public @NotBlank String getReporterNaam() {
        return reporterNaam;
    }

    public void setReporterNaam(@NotBlank String reporterNaam) {
        this.reporterNaam = reporterNaam;
    }

    public @Email String getReporterEmail() {
        return reporterEmail;
    }

    public void setReporterEmail(@Email String reporterEmail) {
        this.reporterEmail = reporterEmail;
    }
}
