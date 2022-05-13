package com.kenoh.projectmanager.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenoh.projectmanager.models.Project;
import com.kenoh.projectmanager.repositories.ProjectRepository;

@Service
public class MainService {

	@Autowired
	private ProjectRepository projectRepo;
	
//	Find All Project
	public List<Project> allProjects(){
		return projectRepo.findAll();
	}
	
//	Find A PROJECT
	public Project findOneProject(Long id) {
		Optional<Project> optionalProject = projectRepo.findById(id);
		if(optionalProject.isPresent()) {
			return optionalProject.get();
		}else {
			return null;
		}
	}
	
//	CREATE A PROJECT
	public Project createProject(Project project) {
		return projectRepo.save(project);
	}
	
//	UPDATE PROJECT
	public Project updateProject(Project project) {
		return projectRepo.save(project);
	}
	
//  DELETE PROJECT
	public void deleteProject(Long id) {
		projectRepo.deleteById(id);
	}
}
