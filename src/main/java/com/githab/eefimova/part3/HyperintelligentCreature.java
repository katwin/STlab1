package com.githab.eefimova.part3;

import java.util.ArrayList;
import java.util.List;

public class HyperintelligentCreature extends Human {
    private int meaningsOfLife;
    private List<Issue> issues = new ArrayList<>();
    private BrokianUltraCricket playingNow;


    public HyperintelligentCreature(int meaningsOfLife) {
        super();
        this.meaningsOfLife = meaningsOfLife;
    }

    public void disputeAboutMeaningOfLife() {
        meaningsOfLife++;
    }

    public void sitDownAndSolveIssue(Issue issue) {
        issue.setSolved(true);
        issues.add(issue);
    }

    public void playTheGame(BrokianUltraCricket game) {
        playingNow = game;
    }

    public int getMeaningsOfLife() {
        return meaningsOfLife;
    }

    public List<Issue> getIssues() {
        return issues;
    }

    public BrokianUltraCricket getPlayingNow() {
        return playingNow;
    }

    public boolean tiredOfArguing() {
        if (meaningsOfLife > 100) {
            return true;
        } else
            return false;
    }

    public boolean haveAllIssuesBeenResolved() {
        return issues.stream().allMatch(Issue::isSolved);
    }
}
