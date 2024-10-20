package org.example.main.Players;

import jakarta.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "players")
public class Players {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long player_id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer last_season;

    @Column(nullable = false)
    private Integer current_club_id;

    @Column(nullable = false)
    private String player_code;

    @Column(nullable = false)
    private String country_of_birth;

    @Column(nullable = false)
    private String city_of_birth;

    private String country_of_citizenship;

    @Temporal(TemporalType.DATE)
    private Date date_of_birth;

    private String sub_position;

    @Column(nullable = false)
    private String position;

    @Column(nullable = false)
    private String foot;

    private Float height_in_cm;

    @Column(nullable = false)
    private String market_value_in_eur;

    @Column(nullable = false)
    private String highest_market_value_in_eur;

    private Date contract_expiration_date;

    @Column(nullable = false)
    private String agent_name;

    @Column(nullable = false)
    private String image_url;

    @Column(nullable = false)
    private String url;

    @Column(nullable = false)
    private String current_club_domestic_competition_id;

    @Column(nullable = false)
    private String current_club_name;

    private Float age;

    // Getters and Setters
    public Long getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(Long player_id) {
        this.player_id = player_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLast_season() {
        return last_season;
    }

    public void setLast_season(Integer last_season) {
        this.last_season = last_season;
    }

    public Integer getCurrent_club_id() {
        return current_club_id;
    }

    public void setCurrent_club_id(Integer current_club_id) {
        this.current_club_id = current_club_id;
    }

    public String getPlayer_code() {
        return player_code;
    }

    public void setPlayer_code(String player_code) {
        this.player_code = player_code;
    }

    public String getCountry_of_birth() {
        return country_of_birth;
    }

    public void setCountry_of_birth(String country_of_birth) {
        this.country_of_birth = country_of_birth;
    }

    public String getCity_of_birth() {
        return city_of_birth;
    }

    public void setCity_of_birth(String city_of_birth) {
        this.city_of_birth = city_of_birth;
    }

    public String getCountry_of_citizenship() {
        return country_of_citizenship;
    }

    public void setCountry_of_citizenship(String country_of_citizenship) {
        this.country_of_citizenship = country_of_citizenship;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getSub_position() {
        return sub_position;
    }

    public void setSub_position(String sub_position) {
        this.sub_position = sub_position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getFoot() {
        return foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }

    public Float getHeight_in_cm() {
        return height_in_cm;
    }

    public void setHeight_in_cm(Float height_in_cm) {
        this.height_in_cm = height_in_cm;
    }

    public String getMarket_value_in_eur() {
        return market_value_in_eur;
    }

    public void setMarket_value_in_eur(String market_value_in_eur) {
        this.market_value_in_eur = market_value_in_eur;
    }

    public String getHighest_market_value_in_eur() {
        return highest_market_value_in_eur;
    }

    public void setHighest_market_value_in_eur(String highest_market_value_in_eur) {
        this.highest_market_value_in_eur = highest_market_value_in_eur;
    }

    public Date getContract_expiration_date() {
        return contract_expiration_date;
    }

    public void setContract_expiration_date(Date contract_expiration_date) {
        this.contract_expiration_date = contract_expiration_date;
    }

    public String getAgent_name() {
        return agent_name;
    }

    public void setAgent_name(String agent_name) {
        this.agent_name = agent_name;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCurrent_club_domestic_competition_id() {
        return current_club_domestic_competition_id;
    }

    public void setCurrent_club_domestic_competition_id(String current_club_domestic_competition_id) {
        this.current_club_domestic_competition_id = current_club_domestic_competition_id;
    }

    public String getCurrent_club_name() {
        return current_club_name;
    }

    public void setCurrent_club_name(String current_club_name) {
        this.current_club_name = current_club_name;
    }

    public Float getAge() {
        return age;
    }

    public void setAge(Float age) {
        this.age = age;
    }

    public Players(){}

    public Players(String name, Integer last_season, Integer current_club_id, String player_code, String country_of_birth, String city_of_birth, String country_of_citizenship, Date date_of_birth, String sub_position, String position, String foot, Float height_in_cm, String market_value_in_eur, String highest_market_value_in_eur, Date contract_expiration_date, String agent_name, String image_url, String url, String current_club_domestic_competition_id, String current_club_name, Float age) {
        this.name = name;
        this.last_season = last_season;
        this.current_club_id = current_club_id;
        this.player_code = player_code;
        this.country_of_birth = country_of_birth;
        this.city_of_birth = city_of_birth;
        this.country_of_citizenship = country_of_citizenship;
        this.date_of_birth = date_of_birth;
        this.sub_position = sub_position;
        this.position = position;
        this.foot = foot;
        this.height_in_cm = height_in_cm;
        this.market_value_in_eur = market_value_in_eur;
        this.highest_market_value_in_eur = highest_market_value_in_eur;
        this.contract_expiration_date = contract_expiration_date;
        this.agent_name = agent_name;
        this.image_url = image_url;
        this.url = url;
        this.current_club_domestic_competition_id = current_club_domestic_competition_id;
        this.current_club_name = current_club_name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Player{" +
                "player_id=" + player_id +
                ", name='" + name + '\'' +
                ", last_season=" + last_season +
                ", current_club_id=" + current_club_id +
                ", player_code='" + player_code + '\'' +
                ", country_of_birth='" + country_of_birth + '\'' +
                ", city_of_birth='" + city_of_birth + '\'' +
                ", country_of_citizenship='" + country_of_citizenship + '\'' +
                ", date_of_birth=" + date_of_birth +
                ", sub_position='" + sub_position + '\'' +
                ", position='" + position + '\'' +
                ", foot='" + foot + '\'' +
                ", height_in_cm=" + height_in_cm +
                ", market_value_in_eur='" + market_value_in_eur + '\'' +
                ", highest_market_value_in_eur='" + highest_market_value_in_eur + '\'' +
                ", contract_expiration_date=" + contract_expiration_date +
                ", agent_name='" + agent_name + '\'' +
                ", image_url='" + image_url + '\'' +
                ", url='" + url + '\'' +
                ", current_club_domestic_competition_id='" + current_club_domestic_competition_id + '\'' +
                ", current_club_name='" + current_club_name + '\'' +
                ", age=" + age +
                '}';
    }
}
