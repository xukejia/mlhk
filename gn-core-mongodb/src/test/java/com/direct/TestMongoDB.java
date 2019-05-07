package com.direct;
import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.direct.gn.db.mongodb.model.DbDocument;
import com.direct.gn.db.mongodb.service.BaseMongoDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application-test.xml")
public class TestMongoDB
{
    @Resource
    private BaseMongoDAO<DbDocument<String>, String> MongoDBService;
    
    @Test
    public void test()
    {
        String table = "test";
        DbDocument<String> query = new DbDocument<String>();
        query.setKey("tb-2016-11-11");
        DbDocument<String> update = new DbDocument<String>();
        update.setKey("tb-2016-11-11");
        update.setTime(System.currentTimeMillis());
        update.setValue("dddddddddddddddddddddddddddd2222");
        MongoDBService.update(query, update , table);
        System.out.println(MongoDBService.find(query, table));
        MongoDBService.remove(query, table);
        System.out.println(MongoDBService.find(query, table));
    }
}
