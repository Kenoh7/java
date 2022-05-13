import java.util.Set;
import java.util.HashMap;

public class Hashmatique {
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Meteora", "Somewhere I Belong");
        trackList.put("Moon", "Papercut");
        trackList.put("Sun", "Numb");
        trackList.put("Star", "In the End");

        String lyric = trackList.get("Sun");
        System.out.println("Song for Sun is: " + lyric);

        Set<String> keys = trackList.keySet();
        for(String key : keys){
            System.out.println(key);
            System.out.println(trackList.get(key));
        }
    }
}
