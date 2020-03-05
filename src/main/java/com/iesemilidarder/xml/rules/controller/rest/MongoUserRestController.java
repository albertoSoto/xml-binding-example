package com.iesemilidarder.xml.rules.controller.rest;

import com.iesemilidarder.xml.rules.data.User;
import com.iesemilidarder.xml.rules.data.repository.MongoUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * com.iesemilidarder.xml.rules.controller
 * Class MongoUserController
 * 29/05/2019
 *
 * @author berto (alberto.soto@gmail.com)
 */
@RestController
@RequestMapping(path = "/rest/api/v1/users")
public class MongoUserRestController {
    @Autowired
    MongoUserRepository repository;

    @RequestMapping(path = "/get",method = RequestMethod.GET)
    public List<User> getUsers() {
        return repository.findAll();
    }
}
