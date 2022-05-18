package edu.greenriver.sdev.jpa_project;

import edu.greenriver.sdev.jpa_project.model.Anime;
import edu.greenriver.sdev.jpa_project.repository.IAnimeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JpaProjectApplication
{
    public static void main(String[] args)
    {
        ApplicationContext context = SpringApplication.run(JpaProjectApplication.class, args);

        IAnimeRepository repo = context.getBean(IAnimeRepository.class);

        Anime[] animes = {
            Anime.builder()
                .title("Akira")
                .genre("Science Fiction")
                .episodeCount(1)
                .productionCompany("Anime Inc")
                .build(),
            Anime.builder()
                .title("Cowboy Bebop")
                .genre("Science Fiction")
                .episodeCount(25)
                .productionCompany("Anime Inc")
                .build(),
            Anime.builder()
                .title("One piece")
                .genre("Shounen")
                .episodeCount(1000)
                .productionCompany("Anime Inc")
                .build()
        };

        for (Anime anime : animes)
        {
            repo.save(anime);
        }
    }
}
