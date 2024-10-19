package org.example.main.Players;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "players")
public class Players {

    @Column(nullable = false)
    private Integer player_id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int last_season;

    @Column(nullable = false)
    private int current_club_id;

    @Column(nullable = false)
    private String player_code;

    @Column(nullable = false)
    private String country_of_birth;

    @Column(nullable = false)
    private String city_of_birth;

    @Column(nullable = false)
    private String country_of_citizenship;

    @Column(nullable = false)
    private Date date_of_birth;

    @Column(nullable = false)
    private String sub_position;

    @Column(nullable = false)
    private String position;

    @Column(nullable = false)
    private String foot;

    @Column(nullable = false)
    private Double height_in_cm;

    @Column
    private Double market_value_in_euro;

    @Column
    private Integer highest_market_value_in_eur;

    @Column(nullable = false)
    private String contract_expiration_date;

    @Column(nullable = false)
    private String agent_name;

    @Column
    private String img_url;

    @Column(nullable = false)
    private String url;

    @Column(nullable = false)
    private String current_club_domestic_competition_id;

    @Column(nullable = false)
    private String current_club_name;

    @Column(nullable = false)
    private double age;

    @Column
    private String image_url;
    @Id
    private Long id;

    public Integer getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(Integer player_id) {
        this.player_id = player_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLast_season() {
        return last_season;
    }

    public void setLast_season(int last_season) {
        this.last_season = last_season;
    }

    public int getCurrent_club_id() {
        return current_club_id;
    }

    public void setCurrent_club_id(int current_club_id) {
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

    public Double getHeight_in_cm() {
        return height_in_cm;
    }

    public void setHeight_in_cm(double height_in_cm) {
        this.height_in_cm = height_in_cm;
    }

    public Double getMarket_value_in_euro() {
        return market_value_in_euro;
    }

    public void setMarket_value_in_euro(double market_value_in_euro) {
        this.market_value_in_euro = market_value_in_euro;
    }

    public Integer getHighest_market_value_in_eur() {
        return highest_market_value_in_eur;
    }

    public void setHighest_market_value_in_eur(int highest_market_value_in_eur) {
        this.highest_market_value_in_eur = highest_market_value_in_eur;
    }

    public String getContract_expiration_date() {
        return contract_expiration_date;
    }

    public void setContract_expiration_date(String contract_expiration_date) {
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

    public void setImage_url(String img_url) {
        this.image_url = img_url;
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

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public Players() {
    }

    public Players(Integer player_id, String name, int last_season, int current_club_id, String player_code, String country_of_birth, String city_of_birth, String country_of_citizenship, Date date_of_birth, String sub_position, String position, String foot, Double height_in_cm, Double market_value_in_euro, Integer highest_market_value_in_eur, String contract_expiration_date, String agent_name, String img_url, String url, String current_club_domestic_competition_id, String current_club_name, double age, String image_url, Long id) {
        this.player_id = player_id;
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
        this.market_value_in_euro = market_value_in_euro;
        this.highest_market_value_in_eur = highest_market_value_in_eur;
        this.contract_expiration_date = contract_expiration_date;
        this.agent_name = agent_name;
        this.img_url = img_url;
        this.url = url;
        this.current_club_domestic_competition_id = current_club_domestic_competition_id;
        this.current_club_name = current_club_name;
        this.age = age;
        this.image_url = image_url;
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Players{" +
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
                ", market_value_in_euro=" + market_value_in_euro +
                ", highest_market_value_in_eur=" + highest_market_value_in_eur +
                ", contract_expiration_date='" + contract_expiration_date + '\'' +
                ", agent_name='" + agent_name + '\'' +
                ", img_url='" + img_url + '\'' +
                ", url='" + url + '\'' +
                ", current_club_domestic_competition_id='" + current_club_domestic_competition_id + '\'' +
                ", current_club_name='" + current_club_name + '\'' +
                ", age=" + age +
                ", image_url='" + image_url + '\'' +
                ", id=" + id +
                '}';
    }

}
