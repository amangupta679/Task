package com.amang;

import java.util.Map;

public class Country {

    private String countryName;

    private String currencyName;

    @Override

    public String toString() {

        return "Country [countryName=" + countryName + ", currencyName=" + currencyName + ", states=" + states + "]";

    }

    private Map<String,String> states;

    

    private Country() {}

    

    public String getCountryName() {

        return countryName;

    }

    public String getCurrencyName() {

        return currencyName;

    }

    public Map<String,String> getStates() {

        return states;

    }

    public void setCountryName(String countryName) {

        this.countryName = countryName;

    }

    public void setCurrencyName(String currencyName) {

        this.currencyName = currencyName;

    }

    public void setStates(Map<String,String> states) {

        this.states = states;

    }

    

}

 
