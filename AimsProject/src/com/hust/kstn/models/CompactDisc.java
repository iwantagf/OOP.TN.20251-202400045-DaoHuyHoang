package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompactDisc extends Disc {
    private String artist;
    private List<Track> tracks = new ArrayList<>();

    public CompactDisc(String title, String category, String artist, double price) {
        super(title, price, category);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
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
        return "CD[" + this.getId() + "]["
                + this.getTitle() + "]["
                + this.getPrice() + "]["
                + this.getCategory() + "]["
                + this.artist + "]["
                + this.totalLength() + "]"
                + "\nTracks: " + this.tracks;
    }
}

