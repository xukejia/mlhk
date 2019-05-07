package com.direct;
import java.util.List;
import java.util.regex.Pattern;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.direct.gn.db.mongodb.service.BaseMongoDAO;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application-test.xml")
public class TestMongoDB2 {
	private static Logger logger = LoggerFactory.getLogger(TestMongoDB2.class);
	@Resource
	private BaseMongoDAO<DBObject, String> mongoService;

	@Test
	public void test() {
		String st = "20170403";
		logger.info("gwMongoClear:" + st);
		DBObject delQuery = new BasicDBObject();
		Pattern pattern = Pattern.compile(".*" + st + ".*");
		delQuery.put("key", new BasicDBObject("$regex", pattern));
//		delQuery.put("key", "BJS-BKK-20170403-20170411");
		// mongoService.remove(delQuery, MONGO_TABLE_GW);
		List<DBObject> list = mongoService.find(delQuery, "gw");
		System.out.println(list.size());
		for (Object dbo : list) {
			System.out.println(dbo.toString());
		}
	}
}
