package com.iesemilidarder.xml;

import com.iesemilidarder.xml.rules.repository.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@EnableConfigurationProperties
@EnableAutoConfiguration
@RunWith(SpringRunner.class)
public class ConnectionTest extends TicketTest {
    protected final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserRepository repository;

    @Before
    public void setup() throws IOException {
        log.info("Trying to connect to :");
        log.info(getProperty("spring.data.mongodb.uri"));
    }

    @Test
    public void testMoviesCount() {
        long expected = 4;
        Assert.assertEquals("Check your connection string", expected, repository.findAll().size());
    }
}
