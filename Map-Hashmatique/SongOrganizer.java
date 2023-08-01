import java.util.HashMap;

public class SongOrganizer {
    public static void main(String[] args) {
        // Create the trackList HashMap with the song titles as keys and lyrics as values
        HashMap<String, String> trackList = new HashMap<>();

        // Add songs to the trackList
        trackList.put("Song 1", "Lyrics for Song 1...");
        trackList.put("Song 2", "Lyrics for Song 2...");
        trackList.put("Song 3", "Lyrics for Song 3...");
        trackList.put("Song 4", "Lyrics for Song 4...");

        // Pull out one song by its title
        String songTitleToRetrieve = "Song 2";
        String lyricsOfRetrievedSong = trackList.get(songTitleToRetrieve);

        // Print out the retrieved song's title and lyrics
        System.out.println("Retrieved Song: " + songTitleToRetrieve);
        System.out.println("Lyrics: " + lyricsOfRetrievedSong);

        // Print out all track names and lyrics
        System.out.println("\nAll Tracks and Lyrics:");
        for (String trackTitle : trackList.keySet()) {
            String lyrics = trackList.get(trackTitle);
            System.out.println("Track: " + trackTitle);
            System.out.println("Lyrics: " + lyrics + "\n");
        }
    }
}
