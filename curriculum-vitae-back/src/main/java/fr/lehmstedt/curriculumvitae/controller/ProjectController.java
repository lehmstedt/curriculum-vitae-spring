package fr.lehmstedt.curriculumvitae.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.lehmstedt.curriculumvitae.entity.Project;
import fr.lehmstedt.curriculumvitae.service.ProjectService;

@RestController
@RequestMapping("projects")
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@GetMapping("")
	public List<Project> getAll(){
		
		return projectService.getAll();
	}
	

}
