package com.githab.eefimova.part3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HyperintelligentCreatureTest {
    private HyperintelligentCreature defaultIntelligent;
    private Issue issue;
    private HyperintelligentCreature maybeTiredIntelligent;
    private BrokianUltraCricket game;

    @BeforeEach
    void setUp() {
        defaultIntelligent = new HyperintelligentCreature(95);
        maybeTiredIntelligent = new HyperintelligentCreature(100);
        issue = new Issue("global warming");
        game  = new BrokianUltraCricket();
    }

    @Test
    void disputeAboutMeaningOfLife() {
        int currentMeanings = defaultIntelligent.getMeaningsOfLife();
        defaultIntelligent.disputeAboutMeaningOfLife();
        int newMeanings = defaultIntelligent.getMeaningsOfLife();
        Assertions.assertEquals(currentMeanings+1,newMeanings);
    }

    @Test
    void getIssues() {
        issue.getDescription();
        issue.setSolved(true);
        Assertions.assertTrue(issue.isSolved());
        int currentIssues = defaultIntelligent.getIssues().size();
        defaultIntelligent.getIssues().add(issue);
        int newIssues = defaultIntelligent.getIssues().size();
        Assertions.assertEquals(currentIssues+1, newIssues);
    }

    @Test
    void sitDownAndSolveIssue() {
        Issue issueCheck = new Issue("kekw");
        defaultIntelligent.sitDownAndSolveIssue(issueCheck);
        Assertions.assertTrue(issueCheck.isSolved());
    }

    @Test
    void playTheGame() {
        defaultIntelligent.playTheGame(game);
        Assertions.assertEquals(defaultIntelligent.getPlayingNow(), game);
    }

    @Test
    void tiredOfArguing() {
        boolean before = maybeTiredIntelligent.tiredOfArguing();
        maybeTiredIntelligent.disputeAboutMeaningOfLife();
        boolean after = maybeTiredIntelligent.tiredOfArguing();
        Assertions.assertNotEquals(before, after);
    }

    @Test
    void haveAllIssuesBeenResolved() {
        Issue issue1 = new Issue("first");
        Issue issue2 = new Issue("second");
        Issue issue3 = new Issue("third");
        issue1.setSolved(true);
        issue2.setSolved(true);
        issue3.setSolved(true);
        Assertions.assertTrue(defaultIntelligent.haveAllIssuesBeenResolved());
    }
}
