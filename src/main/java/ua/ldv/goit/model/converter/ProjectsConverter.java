package ua.ldv.goit.model.converter;


import ua.ldv.goit.model.dao.ProjectsDao;
import ua.ldv.goit.model.dto.ProjectsDto;

public class ProjectsConverter {

    public ProjectsDto convert(ProjectsDao projectsDao) {
        ProjectsDto dto = new ProjectsDto();
        dto.setId(projectsDao.getId());
        dto.setName(projectsDao.getName());
        dto.setDescription(projectsDao.getDescription());
        dto.setCompanyId(projectsDao.getCompanyId());
        dto.setCustomerId(projectsDao.getCustomerId());
        dto.setDate(projectsDao.getDate());
        dto.setCountDevelopers(projectsDao.getCountDevelopers());
        return dto;
    }

    public ProjectsDao convert(ProjectsDto projectsDto) {
        ProjectsDao dao = new ProjectsDao();
        dao.setId(projectsDto.getId());
        dao.setName(projectsDto.getName());
        dao.setDescription(projectsDto.getDescription());
        dao.setCompanyId(projectsDto.getCompanyId());
        dao.setCustomerId(projectsDto.getCustomerId());
        dao.setDate(projectsDto.getDate());
        dao.setCountDevelopers(projectsDto.getCountDevelopers());
        return dao;
    }
}
