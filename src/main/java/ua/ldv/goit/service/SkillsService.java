package ua.ldv.goit.service;


import ua.ldv.goit.dl.SkillsRepository;
import ua.ldv.goit.model.converter.SkillsConverter;
import ua.ldv.goit.model.dto.SkillsDto;

public class SkillsService {
    private final SkillsConverter converter;
    private final SkillsRepository skillsRepository;

    public SkillsService(SkillsConverter converter, SkillsRepository skillsRepository) {
        this.converter = converter;
        this.skillsRepository = skillsRepository;
    }

    public void createDeveloperSkills(SkillsDto skillsDto) {
        skillsRepository.createDeveloperSkills(converter.convert(skillsDto));
    }
}
