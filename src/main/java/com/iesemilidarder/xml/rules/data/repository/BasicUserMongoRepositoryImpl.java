package com.iesemilidarder.xml.rules.data.repository;

import com.iesemilidarder.xml.rules.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

/**
 * com.iesemilidarder.xml.rules.data.repository
 * Class BasicUserMongoRepositoryImpl
 * 30/05/2019
 *
 * @author berto (alberto.soto@gmail.com)
 */
@Repository
public class BasicUserMongoRepositoryImpl implements BasicUserRepository {

    private final MongoOperations mongoOperations;

    @Autowired
    public BasicUserMongoRepositoryImpl(MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
    }

    @Override
    public User findOne(int id) {
        return mongoOperations.findOne(new Query(Criteria.where("id").is(id)), User.class);
    }

    @Override
    public User save(User person) {
        mongoOperations.save(person);
        return person;
    }
}
