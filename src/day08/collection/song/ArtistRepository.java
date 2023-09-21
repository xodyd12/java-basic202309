package day08.collection.song;

import java.util.HashMap;
import java.util.Map;

public class ArtistRepository {

    // key: 가수이름, value: 가수객체
    private static Map<String,Artist> artistList;

    static {
        artistList = new HashMap<>();
    }
}
