package com.demo.Question4.Participants;

import com.demo.Question4.Awards.Award;

public class Teacher implements Participant{
    private String name;
    private int numSCI;
    private double score;

    public Teacher(String name, int numSCI, double score) {
        this.name = name;
        this.numSCI = numSCI;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumSCI() {
        return numSCI;
    }

    public void setNumSCI(int numSCI) {
        this.numSCI = numSCI;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public void accept(Award judge) {
        judge.visit(this);
    }
}
