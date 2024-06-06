package be.ehb.matthias_lannoo.model.tables;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Reporter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    @Size(min = 2, max = 50)
    private String naam;
    @Email
    private String email;


    @ManyToOne
    @JoinColumn(name = "news_id", nullable = true)
    private News news;

    public Reporter() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public @NotBlank @Size(min = 2, max = 50) String getNaam() {
        return naam;
    }

    public void setNaam(@NotBlank @Size(min = 2, max = 50) String naam) {
        this.naam = naam;
    }

    public @Email String getEmail() {
        return email;
    }

    public void setEmail(@Email String email) {
        this.email = email;
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }
}
