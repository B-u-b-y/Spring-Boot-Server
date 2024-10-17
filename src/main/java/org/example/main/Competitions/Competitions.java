package org.example.main.Competitions;

import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
@Table(name = "competitions")
public class Competitions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String competition_id;

    @Column(nullable = false)
    private String competition_code;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String sub_type;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private int country_id;

    @Column(nullable = false)
    private String country_name;

    @Column(nullable = false)
    private String domestic_league_code;

    // Getters and setters


    public String getCompetition_id() {
        return competition_id;
    }

    public void setCompetition_id(String competition_id) {
        this.competition_id = competition_id;
    }

    public String getCompetition_code() {
        return competition_code;
    }

    public void setCompetition_code(String competition_code) {
        this.competition_code = competition_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSub_type() {
        return sub_type;
    }

    public void setSub_type(String sub_type) {
        this.sub_type = sub_type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getDomestic_league_code() {
        return domestic_league_code;
    }

    public void setDomestic_league_code(String domestic_league_code) {
        this.domestic_league_code = domestic_league_code;
    }

    public Competitions() {}

    public Competitions(String competition_id, String competition_code, String name, String sub_type, String type, int country_id, String country_name, String domestic_league_code) {
        this.competition_id = competition_id;
        this.competition_code = competition_code;
        this.name = name;
        this.sub_type = sub_type;
        this.type = type;
        this.country_id = country_id;
        this.country_name = country_name;
        this.domestic_league_code = domestic_league_code;
    }
}
