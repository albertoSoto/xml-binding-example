package com.iesemilidarder.xml;

import com.iesemilidarder.xml.rules.data.repository.CustomRepository;
import com.iesemilidarder.xml.rules.data.repository.MongoUserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

/*@EnableConfigurationProperties
@EnableAutoConfiguration
@RunWith(SpringRunner.class)*/
public class ConnectionTest extends TicketTest {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    MongoUserRepository repository;

    @Autowired
    CustomRepository crepo;

    @Before
    public void setup() throws IOException {
        log.debug("=========================================================");
        log.debug("Trying to connect to :");
        log.debug(getProperty("spring.data.mongodb.uri"));
        log.debug("=========================================================");
    }

    @Test
    public void testMoviesCount() {
        long expected = 4;
        Assert.assertEquals("Check your connection string", expected, repository.findAll().size());
    }
}
