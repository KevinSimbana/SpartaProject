package com.sparta.sorting.controller;

public class Timer {
    private long startTime;
    private long endTime;
    private long time;

    public Timer(){
    }

    public void startTime(){
        this.startTime = System.nanoTime();
    }

    public void endTime(){
        this.endTime = System.nanoTime();
        this.time = endTime - startTime;
    }

    public long getTime() {
        return time;
    }

}
