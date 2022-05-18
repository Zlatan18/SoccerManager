package com.soccermanager.model;

public class Score {
    private int team1,team2;
    private String nameTeam1, nameTeam2;
    private String goal1, goal2;

    public Score() {
    }

    public Score(int team1, int team2, String nameTeam1, String nameTeam2, String goal1, String goal2) {
        this.team1 = team1;
        this.team2 = team2;
        this.nameTeam1 = nameTeam1;
        this.nameTeam2 = nameTeam2;
        this.goal1 = goal1;
        this.goal2 = goal2;
    }

    public int getTeam1() {
        return team1;
    }

    public void setTeam1(int team1) {
        this.team1 = team1;
    }

    public int getTeam2() {
        return team2;
    }

    public void setTeam2(int team2) {
        this.team2 = team2;
    }

    public String getNameTeam1() {
        return nameTeam1;
    }

    public void setNameTeam1(String nameTeam1) {
        this.nameTeam1 = nameTeam1;
    }

    public String getNameTeam2() {
        return nameTeam2;
    }

    public void setNameTeam2(String nameTeam2) {
        this.nameTeam2 = nameTeam2;
    }

    public String getGoal1() {
        return goal1;
    }

    public void setGoal1(String goal1) {
        this.goal1 = goal1;
    }

    public String getGoal2() {
        return goal2;
    }

    public void setGoal2(String goal2) {
        this.goal2 = goal2;
    }
}
