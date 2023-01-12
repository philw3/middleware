package com.middleware.middleware_tec.resource;


import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/all")
public class Resource {

    private UserRepository usersRepository;

    public Resource(UserRepository usersRepository) {
        this.usersRepository = usersRepository;
    }


    @GetMapping("/")
    public List<Users> all() {

        return usersRepository.findAll();
    }

    @Transactional
    @GetMapping("/create")
    public List<Users> users() {
        Users users = new Users();
        users.setId(1);
        users.setName("Sam");
        users.setSalary(3400);
        users.setTeamName("Development");

        //usersRepository.save(users);
        usersRepository.saveAndFlush(users);

        return usersRepository.findAll();
    }
}
