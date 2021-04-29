package com.githab.eefimova.part3;

public class Issue {
    private String description;
    private boolean solved;

    public Issue(String description) {
        this.description = description;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }

    public String getDescription() {
        return description;
    }

    public boolean isSolved() {
        return solved;
    }
}
