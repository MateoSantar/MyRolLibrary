package com.example.myrolcharapp.models;

import java.util.ArrayList;
import java.util.Dictionary;

public class Character {
    private String name,clas,race,background,alignment;
    private int level;

    private Dictionary<String,Integer> stats;
    private ArrayList<String> skills;

    public Character(String name, String clas, String race, String background, String alignment, int level) {
        this.name = name;
        this.clas = clas;
        this.race = race;
        this.background = background;
        this.alignment = alignment;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Dictionary<String, Integer> getStats() {
        return stats;
    }

    public void setStats(Dictionary<String, Integer> stats) {
        this.stats = stats;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }
}
