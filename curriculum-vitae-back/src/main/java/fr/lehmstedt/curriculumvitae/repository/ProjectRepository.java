package fr.lehmstedt.curriculumvitae.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.lehmstedt.curriculumvitae.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long>{

	List<Project> findAll();
}
