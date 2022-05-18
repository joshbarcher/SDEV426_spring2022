package edu.greenriver.sdev.jpa_project.repository;

import edu.greenriver.sdev.jpa_project.model.Anime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAnimeRepository extends JpaRepository<Anime, Integer>
{
}
