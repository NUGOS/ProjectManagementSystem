package ua.ldv.goit;

import ua.ldv.goit.config.DatabaseManager;
import ua.ldv.goit.config.PostgresProvider;
import ua.ldv.goit.config.PropertiesUtil;
import ua.ldv.goit.dl.CustomerRepository;
import ua.ldv.goit.dl.DevelopersRepository;
import ua.ldv.goit.dl.ProjectsRepository;
import ua.ldv.goit.dl.SkillsRepository;
import ua.ldv.goit.model.converter.CustomersConverter;
import ua.ldv.goit.model.converter.DevelopersConverter;
import ua.ldv.goit.model.converter.ProjectsConverter;
import ua.ldv.goit.model.converter.SkillsConverter;
import ua.ldv.goit.model.dto.CustomersDto;
import ua.ldv.goit.model.dto.DevelopersDto;
import ua.ldv.goit.model.dto.ProjectsDto;
import ua.ldv.goit.model.dto.SkillsDto;
import ua.ldv.goit.service.CustomersService;
import ua.ldv.goit.service.DevelopersService;
import ua.ldv.goit.service.ProjectsService;
import ua.ldv.goit.service.SkillsService;

import java.sql.Date;
import java.util.List;

public class App {
    public static void main(String[] args) {
        PropertiesUtil util = new PropertiesUtil();

        DatabaseManager dbConnector = new PostgresProvider(
                util.getHostname(), util.getPort(), util.getSchema(), util.getUser(), util.getPassword());

        DevelopersRepository developersRepository = new DevelopersRepository(dbConnector);
        DevelopersConverter developersConverter = new DevelopersConverter();
        DevelopersService developersService = new DevelopersService(developersConverter, developersRepository);

        ProjectsRepository projectsRepository = new ProjectsRepository(dbConnector);
        ProjectsConverter projectsConverter = new ProjectsConverter();
        ProjectsService projectsService = new ProjectsService(projectsConverter, projectsRepository);

        CustomerRepository customerRepository = new CustomerRepository(dbConnector);
        CustomersConverter customersConverter = new CustomersConverter();
        CustomersService customersService = new CustomersService(customersConverter, customerRepository);

        SkillsRepository skillsRepository = new SkillsRepository(dbConnector);
        SkillsConverter skillsConverter = new SkillsConverter();
        SkillsService skillsService = new SkillsService(skillsConverter, skillsRepository);

        System.out.println("\u001B[32m================================================================================\u001B[0m");
        System.out.println("\u001B[31m1. Show amount of salary for one project by id\u001B[0m");
        final int sumSalary = projectsRepository.getAmountOfSalaryForOneProject(2);
        System.out.println("The amount salary developers of the project " + sumSalary);
        System.out.println("\u001B[32m================================================================================\u001B[0m");

        System.out.println("\u001B[31m2. Show developers of project by id\u001B[0m");
        List<DevelopersDto> listOfDevelopersOfProjectById = developersService.developersOfProjectById(3);
        System.out.println(listOfDevelopersOfProjectById);
        System.out.println("\u001B[32m================================================================================\u001B[0m");

        System.out.println("\u001B[31m3. Show developers of project by name\u001B[0m");
        List<DevelopersDto> listOfDevelopersOfProjectByName =
                developersService.developersOfProjectByName("Siri");
        System.out.println(listOfDevelopersOfProjectByName);
        System.out.println("\u001B[32m================================================================================\u001B[0m");

        System.out.println("\u001B[31m4. Show developers by industry\u001B[0m");
        List<DevelopersDto> listOfDevelopersByIndustry = developersService.developersByIndustry("Java");
        System.out.println(listOfDevelopersByIndustry);
        System.out.println("\u001B[32m================================================================================\u001B[0m");

        System.out.println("\u001B[31m5. Show developers by skill level\u001B[0m");
        List<DevelopersDto> listOfDevelopersBySkillLevel = developersService.developersBySkillLevel("Junior");
        System.out.println(listOfDevelopersBySkillLevel);
        System.out.println("\u001B[32m================================================================================\u001B[0m");

        System.out.println("\u001B[31m6. Show projects: date, name and count developers\u001B[0m");
        List<ProjectsDto> listOfProjectsDateAndCountDev = projectsService.projectsDateCountDevDto();
        System.out.println(listOfProjectsDateAndCountDev);
        System.out.println("\u001B[32m================================================================================\u001B[0m");

        // form to create/update developer
        DevelopersDto developer = new DevelopersDto();
        developer.setName("Василий Иванович");
        developer.setAge(15);
        developer.setGender("male");
        developer.setMail("iva@ivan.com");
        developer.setCompanyId(3);
        developer.setSalary(1300);

        // create developer
//        developersService.create(developer);

        // form to create/update skills
        SkillsDto skills = new SkillsDto();
        skills.setDevelopersId(8);
        skills.setIndustry("C++");
        skills.setSkillLevel("Middle");

        // create developer skills
//        skillsService.createDeveloperSkills(skills);

        // update developer
//        final int devUpdate = developersService.update(developer);
//        System.out.println("UPDATED columns count " + devUpdate);

        // show developer by id
//        DevelopersDto developerById = developersService.read(8);
//        System.out.println(developerById.toString());

        // show all developers
//        List<DevelopersDto> developersAll = developersService.read();
//        System.out.println(developersAll.toString());

        // delete developer
//        developersService.delete(developer);

        // form to create/update project
        ProjectsDto project = new ProjectsDto();
        project.setId(7);
        project.setName("Test");
        project.setDescription("Application test.");
        project.setCompanyId(1);
        project.setCustomerId(2);
        project.setDate(Date.valueOf("2022-04-13"));

        // create project
//        projectsService.create(project);

        // update project
//        final int projectUpdate = projectsService.update(project);
//        System.out.println("UPDATED columns count " + projectUpdate);

        // show project by id
//        ProjectsDto projectById = projectsService.read(1);
//        System.out.println(projectById.toString());

        // show all projects
//        List<ProjectsDto> projectsAll = projectsService.read();
//        System.out.println(projectsAll.toString());

        // delete project
//        projectsService.delete(project);

        // form to create/update customer
        CustomersDto customer = new CustomersDto();
        customer.setId(4);
        customer.setName("Nasa");
        customer.setBusiness("Space exploration");

        // create customer
//        customersService.create(customer);

        // update customer
//        final int customerUpdate = customersService.update(customer);
//        System.out.println("UPDATED columns count " + customerUpdate);

        // show customer by id
//        CustomersDto customerById = customersService.read(1);
//        System.out.println(customerById.toString());

        // show all customers
//        List<CustomersDto> customersAll = customersService.read();
//        System.out.println(customersAll.toString());

        // delete customer
//        customersService.delete(customer);
    }
}
