package me.task3;

@SuppressWarnings("all")
public class Disk {
    private String artist;
    private String title;
    private int length;

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    Disk(String title, String artist, int length) {
        this.artist = artist;
        this.title = title;
        this.length = length;
    }

    public String getInString() {
        return artist + ": " + title + ", " + length + " minute(s)";
    }

    public boolean itsCreatedBy(String author) {
        return artist.equalsIgnoreCase(author);
    }

    public int compareLength(Disk toDisk) {
        return length == toDisk.length ? 0 : (length > toDisk.length ? 1 : -1);
        //return Integer.compare(length, toDisk.length);
    }
}
