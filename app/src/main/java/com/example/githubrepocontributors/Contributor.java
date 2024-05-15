package com.example.githubrepocontributors;

public class Contributor {
    private String login;
    private int contributions;

    @Override
    public String toString() {
        return login + " (" + contributions + ")";
    }
}
