package be.ehb.matthias_lannoo.model.tables;

import jakarta.persistence.*;
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
    @NotBlank
    private String categorie;
    @NotBlank
    private String inhoud;

    @OneToMany(mappedBy = "news")
    private List<Reporter> reporters = new ArrayList<>();

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

    public @NotBlank String getCategorie() {
        return categorie;
    }

    public void setCategorie(@NotBlank String categorie) {
        this.categorie = categorie;
    }

    public @NotBlank String getInhoud() {
        return inhoud;
    }

    public void setInhoud(@NotBlank String inhoud) {
        this.inhoud = inhoud;
    }
}
