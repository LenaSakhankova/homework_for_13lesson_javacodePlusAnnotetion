package by.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static by.springcourse.GenreOfMusic.CLASSICAL;


public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }


    private ArrayList<Music> listOfGenres = new ArrayList<>();

    public MusicPlayer(ArrayList<Music> listOfGenres)
    {
this.listOfGenres.addAll(listOfGenres);
    }
    // IoC

    public String playMusic() {
        Random rand = new Random();
            return (String)(listOfGenres.get(rand.nextInt(3)).getSong().get(rand.nextInt(3)));
    }
}
