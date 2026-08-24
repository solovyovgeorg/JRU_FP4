package domain;

import jakarta.persistence.*;
import java.math.BigDecimal;

    @Entity
    @Table(schema = "world", name = "country_language")
    public class CountryLanguage {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Integer id;

        @ManyToOne
        @JoinColumn(name = "country_id")
        private Country country;

        private String language;

        @Column(name = "is_official", columnDefinition = "BIT")
        private Boolean isOfficial;

        private BigDecimal percentage;


        //Getters and Setters omitted

}
