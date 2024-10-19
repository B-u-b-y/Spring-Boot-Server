package org.example.main.Clubs;
import jakarta.persistence.*;

@Entity
@Table(name = "clubs")
public class Clubs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int club_id;

    @Column(nullable = false)
    private String club_code;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String domestic_competition_id;

    @Column(nullable = false)
    private int squad_size;

    @Column
    private Double average_age;

    @Column(nullable = false)
    private int foreigners_number;

    @Column(nullable = false)
    private double foreigners_percentage;

    @Column(nullable = false)
    private int national_team_players;

    @Column(nullable = false)
    private String stadium_name;

    @Column(nullable = false)
    private int stadium_seats;

    @Column(nullable = false)
    private String net_transfer_record;

    @Column(nullable = false)
    private int last_season;

    public int getClub_id() {
        return club_id;
    }

    public void setClub_id(int club_id) {
        this.club_id = club_id;
    }

    public String getClub_code() {
        return club_code;
    }

    public void setClub_code(String club_code) {
        this.club_code = club_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomestic_competition_id() {
        return domestic_competition_id;
    }

    public void setDomestic_competition_id(String domestic_competition_id) {
        this.domestic_competition_id = domestic_competition_id;
    }

    public int getSquad_size() {
        return squad_size;
    }

    public void setSquad_size(int squad_size) {
        this.squad_size = squad_size;
    }

    public Double getAverage_age() {
        return average_age;
    }

    public void setAverage_age(double average_age) {
        this.average_age = average_age;
    }

    public int getForeigners_number() {
        return foreigners_number;
    }

    public void setForeign_number(int foreign_number) {
        this.foreigners_number = foreign_number;
    }

    public double getForeign_percentage() {
        return foreigners_percentage;
    }

    public void setForeign_percentage(double foreign_percentage) {
        this.foreigners_percentage = foreign_percentage;
    }

    public int getNational_team_players() {
        return national_team_players;
    }

    public void setNational_team_players(int national_team_players) {
        this.national_team_players = national_team_players;
    }

    public String getStadium_name() {
        return stadium_name;
    }

    public void setStadium_name(String stadium_name) {
        this.stadium_name = stadium_name;
    }

    public int getStadium_seats() {
        return stadium_seats;
    }

    public void setStadium_seats(int stadium_seats) {
        this.stadium_seats = stadium_seats;
    }

    public String getNet_transfer_record() {
        return net_transfer_record;
    }

    public void setNet_transfer_record(String net_transfer_record) {
        this.net_transfer_record = net_transfer_record;
    }

    public int getLast_season() {
        return last_season;
    }

    public void setLast_season(int last_season) {
        this.last_season = last_season;
    }

    public Clubs() {
    }

    public Clubs(int club_id, String club_code, String name, String domestic_competition_id, int squad_size, double average_age, int foreign_number, double foreign_percentage, int national_team_players, String stadium_name, int stadium_seats, String net_transfer_record, int last_season) {
        this.club_id = club_id;
        this.club_code = club_code;
        this.name = name;
        this.domestic_competition_id = domestic_competition_id;
        this.squad_size = squad_size;
        this.average_age = average_age;
        this.foreigners_number = foreign_number;
        this.foreigners_percentage = foreign_percentage;
        this.national_team_players = national_team_players;
        this.stadium_name = stadium_name;
        this.stadium_seats = stadium_seats;
        this.net_transfer_record = net_transfer_record;
        this.last_season = last_season;
    }

}
