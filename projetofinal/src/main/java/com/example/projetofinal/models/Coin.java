package com.example.projetofinal.models;

import androidx.annotation.NonNull;

public class Coin {

    private String id;
    private String symbol;
    private String name;
    private String image;
    private float current_price;
    private float market_cap ;
    private int market_cap_rank;
    private float fully_diluted_valuation;
    private float total_volume;
    private float high_24h;
    private float low_24h;
    private float price_change_24h;
    private float price_change_percentage_24h;
    private float market_cap_change_24h;
    private float market_cap_change_percentage_24h;
    private float circulating_supply;
    private float total_supply;
    private float max_supply;
    private float ath;
    private float ath_change_percentage;
    private float atl;
    private float atl_change_percentage;

    public Coin(String id, String symbol, String name, String image, float current_price, float market_cap, int market_cap_rank, float fully_diluted_valuation, float total_volume, float high_24h, float low_24h, float price_change_24h, float price_change_percentage_24h, float market_cap_change_24h, float market_cap_change_percentage_24h, float circulating_supply, float total_supply, float max_supply, float ath, float ath_change_percentage, float atl, float atl_change_percentage) {
        this.id = id;
        this.symbol = symbol;
        this.name = name;
        this.image = image;
        this.current_price = current_price;
        this.market_cap = market_cap;
        this.market_cap_rank = market_cap_rank;
        this.fully_diluted_valuation = fully_diluted_valuation;
        this.total_volume = total_volume;
        this.high_24h = high_24h;
        this.low_24h = low_24h;
        this.price_change_24h = price_change_24h;
        this.price_change_percentage_24h = price_change_percentage_24h;
        this.market_cap_change_24h = market_cap_change_24h;
        this.market_cap_change_percentage_24h = market_cap_change_percentage_24h;
        this.circulating_supply = circulating_supply;
        this.total_supply = total_supply;
        this.max_supply = max_supply;
        this.ath = ath;
        this.ath_change_percentage = ath_change_percentage;
        this.atl = atl;
        this.atl_change_percentage = atl_change_percentage;
    }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getSymbol() { return symbol; }

    public void setSymbol(String symbol) { this.symbol = symbol; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getImage() { return image; }

    public void setImage(String image) { this.image = image; }

    public float getCurrent_price() { return current_price; }

    public void setCurrent_price(float current_price) { this.current_price = current_price; }

    public float getMarket_cap() { return market_cap; }

    public void setMarket_cap(float market_cap) { this.market_cap = market_cap; }

    public int getMarket_cap_rank() { return market_cap_rank; }

    public void setMarket_cap_rank(int market_cap_rank) { this.market_cap_rank = market_cap_rank; }

    public float getFully_diluted_valuation() { return fully_diluted_valuation; }

    public void setFully_diluted_valuation(float fully_diluted_valuation) { this.fully_diluted_valuation = fully_diluted_valuation; }

    public float getTotal_volume() { return total_volume; }

    public void setTotal_volume(float total_volume) { this.total_volume = total_volume; }

    public float getHigh_24h() { return high_24h; }

    public void setHigh_24h(float high_24h) { this.high_24h = high_24h; }

    public float getLow_24h() { return low_24h; }

    public void setLow_24h(float low_24h) { this.low_24h = low_24h; }

    public float getPrice_change_24h() { return price_change_24h; }

    public void setPrice_change_24h(float price_change_24h) { this.price_change_24h = price_change_24h; }

    public float getPrice_change_percentage_24h() { return price_change_percentage_24h; }

    public void setPrice_change_percentage_24h(float price_change_percentage_24h) { this.price_change_percentage_24h = price_change_percentage_24h; }

    public float getMarket_cap_change_24h() { return market_cap_change_24h; }

    public void setMarket_cap_change_24h(float market_cap_change_24h) { this.market_cap_change_24h = market_cap_change_24h; }

    public float getMarket_cap_change_percentage_24h() { return market_cap_change_percentage_24h; }

    public void setMarket_cap_change_percentage_24h(float market_cap_change_percentage_24h) { this.market_cap_change_percentage_24h = market_cap_change_percentage_24h; }

    public float getCirculating_supply() { return circulating_supply; }

    public void setCirculating_supply(float circulating_supply) { this.circulating_supply = circulating_supply; }

    public float getTotal_supply() { return total_supply; }

    public void setTotal_supply(float total_supply) { this.total_supply = total_supply; }

    public float getMax_supply() { return max_supply; }

    public void setMax_supply(float max_supply) { this.max_supply = max_supply; }

    public float getAth() { return ath; }

    public void setAth(float ath) { this.ath = ath; }

    public float getAth_change_percentage() { return ath_change_percentage; }

    public void setAth_change_percentage(float ath_change_percentage) { this.ath_change_percentage = ath_change_percentage; }

    public float getAtl() { return atl; }

    public void setAtl(float atl) { this.atl = atl; }

    public float getAtl_change_percentage() { return atl_change_percentage; }

    public void setAtl_change_percentage(float atl_change_percentage) { this.atl_change_percentage = atl_change_percentage;}

    @NonNull
    @Override
    public String toString() {
        return "Nome:"+name+"; id: "+id+"; preço: "+current_price;
    }

}
