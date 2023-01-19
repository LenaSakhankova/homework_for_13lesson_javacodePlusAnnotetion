package by.springcourse;

import java.util.ArrayList;
import java.util.List;

public class JazzMusic implements Music{
    @Override
    public List getSong() {
        List<String> classicalMusicList = new ArrayList<>();
        classicalMusicList.add("Take five");
        classicalMusicList.add("The sidewinder");
        classicalMusicList.add("Una mas");
        return classicalMusicList;
    }
}
