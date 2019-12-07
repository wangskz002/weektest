package com.bw.test;

import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import com.bw.entity.Goods;
import com.bw.mapper.GoodsMapper;



public class DemoTest{
	//(7)其中商品添加要做单元测试（核心）(5分)
	@Test
	public void addTest() throws Exception{
		AbstractApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");
		SqlSessionFactory object = (SqlSessionFactory) ap.getBean("factory");
		SqlSession openSession = object.openSession(true);
		openSession.getMapper(GoodsMapper.class).add(new Goods(null, "哈哈哈", "2017-09-10", 1, 0, "1", 999.0));
		openSession.close();
		ap.close();
	}
	//(8)其中商品的删除要做单元测试（核心）(5分)
	@Test
	public void delTest() throws Exception{
		AbstractApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");
		SqlSessionFactory object = (SqlSessionFactory) ap.getBean("factory");
		SqlSession openSession = object.openSession(true);
		openSession.getMapper(GoodsMapper.class).updatestatus("1,2");
		openSession.close();
		ap.close();
	}
	//(9)其中商品修改要做单元测试（核心）(5分)
	@Test
	public void updateTest() throws Exception{
		AbstractApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");
		SqlSessionFactory object = (SqlSessionFactory) ap.getBean("factory");
		SqlSession openSession = object.openSession(true);
		openSession.getMapper(GoodsMapper.class).update(new Goods(2, "雷柏鼠标", "2017-09-10 17:22:33", 1, 0, 1, 999.0));
		openSession.close();
		ap.close();
	}
}
