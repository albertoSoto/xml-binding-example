package com.iesemilidarder.xml.rules.data.repository;

import com.iesemilidarder.xml.rules.data.User;

/**
 * com.iesemilidarder.xml.rules.data.repository
 * Class BasicUserRepository
 * 30/05/2019
 *
 * @author berto (alberto.soto@gmail.com)
 */
public interface BasicUserRepository {
    User findOne(int id);
    User save(User user);
}
