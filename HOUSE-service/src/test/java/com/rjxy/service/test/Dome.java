//package com.rjxy.service.test;
//
//import javax.annotation.Resource;
//
//import org.hibernate.SessionFactory;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.rjxy.service.HouseService;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath*:applicationContext-*.xml")
//public class Dome {
//	@Resource(name="sessionFactory")
//	private SessionFactory sf ;
//	@Resource(name="houseService")
//	private HouseService hs;
//	@Test
//	public void fun1() {
//		int hoseTotalPage = hs.getHoseTotalCount();
//     System.out.println(hoseTotalPage);
//	}
//
//	@Test
//	public void fun2() {
//		int hoseTotalPage = hs.getHoseTotalCount();
//     System.out.println(hoseTotalPage);
//	}
//}
