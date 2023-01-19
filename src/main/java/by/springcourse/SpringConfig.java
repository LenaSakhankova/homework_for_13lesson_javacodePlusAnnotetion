package by.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.proporties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic()
{return new ClassicalMusic();}
    @Bean
    public JazzMusic jazzMusic()
    {
        return new JazzMusic();
    }
    @Bean
    public PopMusic popMusic()
    {
        return new PopMusic();
    }
    @Bean
    public ArrayList<Music> listOfGenres(){
        ArrayList<Music> listOfGenres = new ArrayList<>();
        listOfGenres.add(jazzMusic());
        listOfGenres.add(popMusic());
        listOfGenres.add(classicalMusic());
        return listOfGenres;
    }
    @Bean
    public MusicPlayer musicPlayer()
    {
        return new MusicPlayer(listOfGenres());
    }
}
