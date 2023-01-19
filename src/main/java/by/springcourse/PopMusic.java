package by.springcourse;

import java.util.ArrayList;
import java.util.List;


public class PopMusic implements Music {
        @Override
        public List getSong() {
                    List<String> popMusicList = new ArrayList<>();
            popMusicList.add("Wind cries Mary");
            popMusicList.add("Yesterday");
            popMusicList.add("Girl");

            return popMusicList;
        }
}
