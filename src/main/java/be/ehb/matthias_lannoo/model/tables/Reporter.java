package be.ehb.matthias_lannoo.model.tables;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Reporter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY);
    private int id;
    @NotBlank
    @Size(min = 2, max = 50)
    private String naam;


    @ManyToOne
    @JoinColumn(name = "news_id", nullable = true)

    public Reporter() {
    }
}
