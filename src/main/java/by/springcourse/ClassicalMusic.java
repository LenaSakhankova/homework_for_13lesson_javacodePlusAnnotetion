package by.springcourse;

import java.util.ArrayList;
import java.util.List;


public class ClassicalMusic implements Music {
    @Override
    public List getSong() {
        List<String> classicalMusicList = new ArrayList<>();
        classicalMusicList.add("Symphony");
        classicalMusicList.add("A Hymn to the Virgin");
        classicalMusicList.add("Don't Look Down");
        return classicalMusicList;
    }
}
