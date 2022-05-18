package edu.greenriver.sdev.jpa_project.service;

import edu.greenriver.sdev.jpa_project.model.Anime;
import edu.greenriver.sdev.jpa_project.repository.IAnimeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService
{
    private IAnimeRepository repo;

    public AnimeService(IAnimeRepository repo)
    {
        this.repo = repo;
    }

    public List<Anime> getAnimes()
    {
        return repo.findAll();
    }
}
