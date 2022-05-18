package edu.greenriver.sdev.jpa_project.controllers;

import edu.greenriver.sdev.jpa_project.model.Anime;
import edu.greenriver.sdev.jpa_project.service.AnimeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/anime")
public class AnimeAPI
{
    private AnimeService service;

    public AnimeAPI(AnimeService service)
    {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Anime>> getAllAnimes()
    {
        List<Anime> animes = service.getAnimes();

        //return new ResponseEntity<>(animes, HttpStatus.OK);
        return ResponseEntity.ok(animes);
    }
}
