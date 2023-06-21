package model;

public class ScoreModel {

    private int xScore = 0;
    private int oScore = 0;


    public int getoScore() {
        return oScore;
    }

    public int getxScore() {
        return xScore;
    }

    public void setxScore(int xScore) {
        this.xScore = xScore;
    }

    public void setoScore(int oScore) {
        this.oScore = oScore;
    }
}
