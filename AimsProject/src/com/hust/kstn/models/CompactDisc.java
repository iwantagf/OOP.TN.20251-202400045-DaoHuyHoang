package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompactDisc {
    private static int nbCompactDiscs = 0;

    private int id;
    private String title;
    private String category;
    private String artist;
    private double price;
    private List<Track> tracks = new ArrayList<>();

    public CompactDisc(String title, String category, String artist, double price) {
        this.title = title;
        this.category = category;
        this.artist = artist;
        this.price = price;
        ++nbCompactDiscs;
        this.id = nbCompactDiscs;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getArtist() {
        return artist;
    }

    public double getPrice() {
        return price;
    }

    public List<Track> getTracks() {
        return Collections.unmodifiableList(tracks);
    }

    public int totalLength() {
        int sum = 0;
        for (Track track : tracks) {
            sum += track.getLength();
        }
        return sum;
    }

    public void addTrack(Track track) {
        if (track == null) return;
        if (tracks.contains(track)) {
            System.out.println("Track already exists: " + track.getTitle());
            return;
        }
        tracks.add(track);
        System.out.println("Added track: " + track.getTitle());
    }

    public void removeTrack(Track track) {
        if (track == null) return;
        if (tracks.isEmpty()) {
            System.out.println("No tracks to remove");
            return;
        }
        if (tracks.remove(track)) {
            System.out.println("Removed track: " + track.getTitle());
        } else {
            System.out.println("Track not found: " + track.getTitle());
        }
    }

    @Override
    public String toString() {
        return "CD[" + this.id + "]["
                + this.title + "]["
                + this.price + "]["
                + this.category + "]["
                + this.artist + "]["
                + this.totalLength() + "]"
                + "\nTracks: " + this.tracks;
    }
}

