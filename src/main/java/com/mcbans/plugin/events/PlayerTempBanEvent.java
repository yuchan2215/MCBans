package com.mcbans.plugin.events;

import java.util.UUID;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerTempBanEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean isCancelled = false;

    private String player;
    private String playerIP;
    private String sender;
    private String reason;
    private String duration;
    private String measure, playerUUID, senderUUID;

    public PlayerTempBanEvent(String player, String playerUUID, String playerIP, String sender, String senderUUID, String reason, String duration, String measure) {
        this.player = player;
        this.playerIP = playerIP;
        this.sender = sender;
        this.reason = reason;
        this.duration = duration;
        this.measure = measure;
        this.playerUUID = playerUUID;
        this.senderUUID = senderUUID;
    }

    public UUID getPlayerUUID() {
		return UUID.fromString(playerUUID);
	}

	public UUID getSenderUUID() {
		return UUID.fromString(senderUUID);
	}
	
    public String getPlayerName() {
        return this.player;
    }

    public String getPlayerIP() {
        return this.playerIP;
    }

    public String getSenderName() {
        return this.sender;
    }

    public void setSenderName(String senderName) {
        this.sender = senderName;
    }

    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDuration() {
        return this.duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getMeasure() {
        return this.measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    @Override
    public boolean isCancelled() {
        return this.isCancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.isCancelled = cancelled;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
