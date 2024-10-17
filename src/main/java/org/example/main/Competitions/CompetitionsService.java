package org.example.main.Competitions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetitionsService {

    @Autowired
    private CompetitionsRepository competitionsRepository;

    public List<String> competitionbyCountry(String country_name) {
        System.out.println("Country name: " + country_name);
        System.out.println(competitionsRepository.findbyCountryName(country_name));
        return competitionsRepository.findbyCountryName(country_name);
    }

    public List<String> getCountryNames() {
        return competitionsRepository.findCountryNames();
    }
}
