import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            songs.add(new Song(title, duration));
            return true;
        }

        return false;
    }

    public Song findSong(String titleOfSong) {
        for (Song song : songs) {
            if (song.getTitle().equals(titleOfSong)) {
                return song;
            }
        }
        return null;
    }

    public boolean addPlayList(int trackNumber, LinkedList<Song> list) {


    }

    public boolean addPlayList(String titleOfSong, LinkedList<Song> list) {

    }
}
