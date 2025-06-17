package com.fluffsadev.warpath.basehandler;

import net.minecraft.world.ChunkCoordIntPair;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class BaseInfo {
    private UUID ownerUUID; // Who owns the claim that started the base
    private String teamName; // Which team the base belongs to
    private Set<ChunkCoordIntPair> claimedChunks = new HashSet<>(); // All connected chunks
    private Block center; // Optional: central point for GUI/map/raids
    private String baseName; // Optional: display name if you wanna name bases

    public BaseInfo(UUID ownerUUID, String teamName) {
        this.ownerUUID = ownerUUID;
        this.teamName = teamName;
    }

    public void addChunk(ChunkCoordIntPair chunk) {
        claimedChunks.add(chunk);
    }

    public Set<ChunkCoordIntPair> getChunks() {
        return claimedChunks;
    }

    // Getters/setters for other fields...
}
