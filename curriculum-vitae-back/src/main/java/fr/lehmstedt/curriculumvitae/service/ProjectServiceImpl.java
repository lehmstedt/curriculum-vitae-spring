package fr.lehmstedt.curriculumvitae.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.lehmstedt.curriculumvitae.entity.Project;
import fr.lehmstedt.curriculumvitae.repository.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public List<Project> getAll() {
		
		return projectRepository.findAll();
	}

}
