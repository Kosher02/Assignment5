package com.company.entities;

public class Stone {
    private int id;
    private String stone_name;
    private int Price_in_gr;
    private String Stone_name;


    public Stone() {

    }

    public Stone(int id, String name, String surname, boolean gender) {
        setStone_name(stone_name);
        setPrice_in_tg(Price_in_gr);

    }

    public Stone(int id, String stone_name, int price_in_gr) {
        setId(id);
        setStone_name(Stone_name);
        setInt(Price_in_gr;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return setStone_name;
    }

    public void setName(String stone_name) {
        this.stone_name = stone_name;
    }


    public int getPrice_in_gr() {
        return Price_in_gr;
    }

    public void setPrice_in_tg(int Price_in_gr) {
        this.Price_in_gr = Price_in_gr;
    }

    @Override
    public String toString() {
        return "Stone{" +
                "id=" + id +
                ", name='" + Stone_name + '\'' +
                ", price='" + Price_in_gr + '\'' +
                '}';
    }

    public String getStone_name() {
    }
}