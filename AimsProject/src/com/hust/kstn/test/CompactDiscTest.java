package com.hust.kstn.test;

import com.hust.kstn.models.CompactDisc;
import com.hust.kstn.models.Track;

public class CompactDiscTest {
    public static void main(String[] args) {
        CompactDisc cd = new CompactDisc("Greatest Hits", "Pop", "Various Artists", 150000.0);
        CompactDisc st = new CompactDisc("Nhac song mien Tay", "Nhac song", "Various Artists", 3600000.0);

        Track t1 = new Track("Song 1", 180);
        Track t2 = new Track("Song 2", 200);
        Track t3 = new Track("Song 3", 220);

        Track only = new Track("Lien khuc bong co may", 360);

        System.out.println("=== Add tracks ===");
        cd.addTrack(t1);
        cd.addTrack(t2);
        cd.addTrack(t3);
        cd.addTrack(t2); 
        st.addTrack(only);
        st.addTrack(only);

        System.out.println(cd);
        
        System.out.println("\n=== Remove tracks ===");
        cd.removeTrack(t2);
        cd.removeTrack(t2);

        System.out.println("\n=== CD info ===");
        System.out.println(cd);
        System.out.println(st);
    }
}

