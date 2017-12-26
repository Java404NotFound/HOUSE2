//package com.rjxy.dao.test;
//
//import java.util.List;
//
//import javax.annotation.Resource;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import com.rjxy.bean.House;
//import com.rjxy.bean.PageBean;
//import com.rjxy.bean.Type;
//import com.rjxy.dao.HouseDao;
//import com.rjxy.dao.TypeDao;
//
//
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath*:applicationContext-*.xml")
//public class Dome {
//	@Resource(name="houseDao")
//  private HouseDao houseDao;
//	@Resource(name="typeDao")
//	private TypeDao typeDao;
//	public void setTypeDao(TypeDao typeDao) {
//		this.typeDao = typeDao;
//	}
//	public void setHouseDao(HouseDao houseDao) {
//		this.houseDao = houseDao;
//	}
//	@Test
//	public void fun1() {
//		 List<Type> list = typeDao.findTypeList();
//   for(Type type:list){
//	   System.out.println(type.getName());
//   }
//	}
//	@Test
//	public void fun2() {
//		int hoseTotalPage = houseDao.getHoseTotalCount();
//     System.out.println(hoseTotalPage);
//	}
//	
//	@Test
//	public void fun3() {
//		PageBean<House> bean= new PageBean<House>();
//		bean.setCurrentCount(3);
//		bean.setCurrentPage(1);
//   List<House> list = houseDao.findHouseListPage(bean);
//   for(House h :list){
//	   System.out.println(h.getId());
//   }
//	}
//}
