package ua.ldv.goit.model.converter;

import ua.ldv.goit.model.dao.DevelopersDao;
import ua.ldv.goit.model.dto.DevelopersDto;

public class DevelopersConverter {
    public DevelopersDto convert(DevelopersDao developersDao) {
        DevelopersDto dto = new DevelopersDto();
        dto.setId(developersDao.getId());
        dto.setName(developersDao.getFirstName() + " " + developersDao.getLastName());
        dto.setAge(developersDao.getAge());
        dto.setGender(developersDao.getGender());
        dto.setMail(developersDao.getMail());
        dto.setCompanyId(developersDao.getCompanyId());
        dto.setSalary(developersDao.getSalary());
        dto.setIndustry(developersDao.getIndustry());
        dto.setSkillLevel(developersDao.getSkillLevel());
        return dto;
    }

    public DevelopersDao convert(DevelopersDto developersDto) {
        DevelopersDao dao = new DevelopersDao();
        dao.setId(developersDto.getId());
        dao.setFirstName(developersDto.getName().split("\\s")[0]);
        dao.setLastName(developersDto.getName().substring(developersDto.getName().lastIndexOf(" ") + 1));
        dao.setAge(developersDto.getAge());
        dao.setGender(developersDto.getGender());
        dao.setMail(developersDto.getMail());
        dao.setCompanyId(developersDto.getCompanyId());
        dao.setSalary(developersDto.getSalary());
        dao.setIndustry(developersDto.getIndustry());
        dao.setSkillLevel(developersDto.getSkillLevel());
        return dao;
    }
}
