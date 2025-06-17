package com.fluffsadev.warpath.raidingmanagement;

public class RaidManager {

    private static int difficulty = 1; // default difficulty

    private static boolean raidRunning = false;

    public static void setDifficulty(int diff) {
        difficulty = diff;
    }

    public static int getDifficulty() {
        return difficulty;
    }

    public static void startRaid(int diff) {
        if (raidRunning) return; // no double raids

        difficulty = diff;
        raidRunning = true;

        System.out.println("Raid started with difficulty: " + difficulty);

        // Here, add your raid spawn logic, timers, etc
        // Like spawning mobs, tracking waves, etc
    }

    public static void stopRaid() {
        raidRunning = false;

        System.out.println("Raid stopped");
        // Clear raid mobs, reset state, etc
    }

    public static boolean isRaidRunning() {
        return raidRunning;
    }
}
