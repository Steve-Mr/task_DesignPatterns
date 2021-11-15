package com.demo.Question4.Participants;

import com.demo.Question4.Awards.Award;

public class Student implements Participant{
    private String name;
    private int numSCI;
    private double avgScore;

    public Student(String name, int numSCI, double avgScore) {
        this.name = name;
        this.numSCI = numSCI;
        this.avgScore = avgScore;
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

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public void accept(Award judge) {
        judge.visit(this);
    }
}
