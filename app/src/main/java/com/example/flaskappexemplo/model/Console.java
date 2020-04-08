package com.example.flaskappexemplo.model;

public class Console {
    private long id;
    private String name;
    private String status;
    private int qtd_games;
    private int year;
    private double price;

    public Console() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQtdgames() {
        return qtd_games;
    }

    public void setQtdgames(int qtd_games) {
        this.qtd_games = qtd_games;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name;
    }
}
