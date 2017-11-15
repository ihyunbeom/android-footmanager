package com.hattrick.ihyunbeom.hat_client;

/**
 * Created by HyunBum on 2017. 7. 14..
 */

public class ListViewItem {

    private int type;

    private String playerName;
    private String playerPosition;
    private String playerGoal;
    private String playerOuting;

    private String gameDate;
    private String gameOpp;
    private String gameScore;
    private String gameResult;

    private String stadTitle;
    private String stadTelephone;
    private String stadAddres;
    private String stadRoad;

    public ListViewItem() {
    }

    public void setType(int type) {
        this.type = type ;
    }

    public void setPlayerName(String name) {
        this.playerName = name ;
    }
    public void setPlayerPosition(String pos) {
        this.playerPosition = pos ;
    }
    public void setPlayerGoal(String goal) {
        this.playerGoal = goal ;
    }
    public void setPlayerOuting(String out) {
        this.playerOuting = out ;
    }

    public void setGameDate(String date) {
        this.gameDate = date ;
    }
    public void setGameOpp(String opp) {
        this.gameOpp = opp ;
    }
    public void setGameScore(String score) {
        this.gameScore = score ;
    }
    public void setGameResult(String result) {
        this.gameResult = result ;
    }

    public int getType() {
        return this.type;
    }

    public String getPlayerName() {
        return this.playerName;
    }
    public String getPlayerPosition() {
        return this.playerPosition;
    }
    public String getPlayerGoal() {
        return this.playerGoal;
    }
    public String getPlayerOuting() {
        return this.playerOuting;
    }

    public String getGameDate() {
        return this.gameDate;
    }
    public String getGameOpp() {
        return this.gameOpp;
    }
    public String getGameScore() {
        return this.gameScore;
    }
    public String getGameResult() {
        return this.gameResult;
    }

    /////
    public void setStadTitle(String stadTitle) {
        this.stadTitle = stadTitle ;
    }
    public void setStadTelephone(String stadTelephone) {
        this.stadTelephone = stadTelephone ;
    }
    public void setStadAddres(String stadAddres) { this.stadAddres = stadAddres ; }
    public void setStadRoad(String stadRoad) { this.stadRoad = stadRoad ; }

    public String getStadTitle() {
        return this.stadTitle;
    }
    public String getStadTelephone() {
        return this.stadTelephone;
    }
    public String getStadAddres() {
        return this.stadAddres;
    }
    public String getStadRoad() {
        return this.stadRoad;
    }
    /////



}
