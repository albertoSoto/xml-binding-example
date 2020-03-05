package com.iesemilidarder.xml;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DBObject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * com.iesemilidarder.xml
 * Class MongoDbSpringIntegrationTest
 * 29/05/2019
 *
 * @author berto (alberto.soto@gmail.com)
 */
/*@EnableConfigurationProperties
@EnableAutoConfiguration
@RunWith(SpringRunner.class)
@ContextConfiguration(classes={MongoDBConfiguration.class})
@TestPropertySource("test.properties")*/
public class MongoDbSpringIntegrationTest {
    @Autowired
    MongoTemplate mongoTemplate;

/*    @Autowired
    MongoUserRepository repository;*/

    @Test
    public void test() {
        // given
        DBObject objectToSave = BasicDBObjectBuilder.start()
                .add("key", "value")
                .get();
        // when
        mongoTemplate.save(objectToSave, "users");

        //repo search
        //Assert.assertNotNull(repository.findFirstByName("Jack Bauer"));
    }

}

