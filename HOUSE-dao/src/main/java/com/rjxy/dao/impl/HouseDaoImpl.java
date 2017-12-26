package com.rjxy.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateCallback;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.rjxy.bean.House;
import com.rjxy.bean.HouseOA;
import com.rjxy.bean.PageBean;
import com.rjxy.dao.HouseDao;

public class HouseDaoImpl extends HibernateDaoSupport implements HouseDao {

	/**
	 * 分页查询 House 无查询条件 (non-Javadoc)
	 * 
	 * @see com.rjxy.dao.HouseDao#findHouseListPage(com.rjxy.bean.PageBean)
	 */
	@Override
	public List<House> findHouseListPage(final PageBean<House> page) {

		return getHibernateTemplate().execute(new HibernateCallback<List<House>>() {
			@Override
			public List<House> doInHibernate(Session session) throws HibernateException {
				SQLQuery sqlQuery = session.createSQLQuery(
						" SELECT * FROM (SELECT ROWNUM AS rowno, t.* FROM House t  WHERE ROWNUM <?) table_alias WHERE table_alias.rowno >=?");
				sqlQuery.addEntity(House.class);
				sqlQuery.setParameter(0,
						(page.getCurrentPage() - 1) * page.getCurrentCount() + 1 + page.getCurrentCount());
				sqlQuery.setParameter(1, (page.getCurrentPage() - 1) * page.getCurrentCount() + 1);
				@SuppressWarnings("unchecked")
				List<House> list = sqlQuery.list();
				return list;
			}
		});
	}

	/**
	 * 分页查询 House 有查询条件 (non-Javadoc)
	 * 
	 * @see com.rjxy.dao.HouseDao#findHouseListPage(com.rjxy.bean.PageBean)
	 */
	@Override
	public List<House> findHouseListPage(final PageBean<House> page, final HouseOA houseOA) {
		return getHibernateTemplate().execute(new HibernateCallback<List<House>>() {
			@Override
			public List<House> doInHibernate(Session session) throws HibernateException {
				String hql = " SELECT * FROM (SELECT ROWNUM AS rowno, t.* FROM House t  WHERE ROWNUM <? and price<=?  and price>?   and  floorage<=? and floorage>? ";
				if (!houseOA.getStreetId().equals("%%")) {
					hql += "and  street_id like  " + houseOA.getStreetId();
				}
				if (!houseOA.getTypeId().equals("%%")) {
					hql += "and type_id like  " + houseOA.getTypeId();
				}
				if (!houseOA.getTitle().equals("%%")) {
					hql += " and   title like  '%" + houseOA.getTitle() + "%'";
				}
				hql += ")table_alias WHERE table_alias.rowno >=?";
				SQLQuery sqlQuery = session.createSQLQuery(hql);

				sqlQuery.addEntity(House.class);
				sqlQuery.setParameter(0,
						(page.getCurrentPage() - 1) * page.getCurrentCount() + 1 + page.getCurrentCount());
				sqlQuery.setParameter(1, Integer.parseInt(houseOA.getMaxPrice()));
				sqlQuery.setParameter(2, Integer.parseInt(houseOA.getMixPrice()));
				sqlQuery.setParameter(3, Integer.parseInt(houseOA.getMaxFloorage()));
				sqlQuery.setParameter(4, Integer.parseInt(houseOA.getMixFloorage()));
				sqlQuery.setParameter(5, (page.getCurrentPage() - 1) * page.getCurrentCount() + 1);
				@SuppressWarnings("unchecked")
				List<House> list = sqlQuery.list();
				return list;
			}
		});
	}

	/**
	 * 获得无条件查询的总行数
	 * 
	 * @return int
	 * @param 李湘鄂
	 * @serialData 2017-12-8
	 */
	@Override
	public int getHoseTotalCount() {
		return getHibernateTemplate().execute(new HibernateCallback<Integer>() {
			@Override
			public Integer doInHibernate(Session session) throws HibernateException {
				String hql = "select count(*) from House";
				SQLQuery sqlQuery = session.createSQLQuery(hql);
				int parseInt = Integer.parseInt(sqlQuery.uniqueResult() + "");
				return parseInt;
			}
		});
	}

	/**
	 * 
	 * 获取有条件查询的总行数
	 * 
	 * @see com.rjxy.dao.HouseDao#getHoseTotalCount(com.rjxy.bean.HouseOA)
	 */
	@Override
	public int getHoseTotalCount(final HouseOA houseOA) {
		return getHibernateTemplate().execute(new HibernateCallback<Integer>() {
			@Override
			public Integer doInHibernate(Session session) throws HibernateException {
				String hql = " SELECT count(1) FROM  House  WHERE price<=?  and price>?   and  floorage<=? and floorage>? ";
				if (!houseOA.getStreetId().equals("%%")) {
					hql += " and  street_id like  " + houseOA.getStreetId();
				}
				if (!houseOA.getTypeId().equals("%%")) {
					hql += " and  type_id like  " + houseOA.getTypeId();
				}
				if (!houseOA.getTitle().equals("%%")) {
					hql += " and title like '%" + houseOA.getTitle() + "%'";
				}
				SQLQuery sqlQuery = session.createSQLQuery(hql);

				sqlQuery.setParameter(0, Integer.parseInt(houseOA.getMaxPrice()));
				sqlQuery.setParameter(1, Integer.parseInt(houseOA.getMixPrice()));
				sqlQuery.setParameter(2, Integer.parseInt(houseOA.getMaxFloorage()));
				sqlQuery.setParameter(3, Integer.parseInt(houseOA.getMixFloorage()));
				int parseInt = Integer.parseInt(sqlQuery.uniqueResult() + "");
				return parseInt;
			}
		});
	}

	/**
	 * 查询表中所有的House
	 * 
	 * @return List<House>
	 * @param 李湘鄂
	 * @serialData 2017-12-8
	 */
	@Override
	public List<House> findHouseList() {
		return getHibernateTemplate().execute(new HibernateCallback<List<House>>() {
			@Override
			public List<House> doInHibernate(Session session) throws HibernateException {
				String hql = "from House";
				Query query = session.createQuery(hql);
				@SuppressWarnings("unchecked")
				List<House> list = query.list();
				return list;
			}
		});
	}

	/**
	 * 
	 * 添加租房信息
	 * 
	 * @see com.rjxy.dao.HouseDao#saveHouse(com.rjxy.bean.House)
	 */
	@Override
	public void saveHouse(House house) {
		getHibernateTemplate().save(house);
	}

	/**
	 * 
	 * 更新租房信息
	 * 
	 * @see com.rjxy.dao.HouseDao#updateHouse(com.rjxy.bean.House)
	 */
	@Override
	public void updateHouse(House house) {
		getHibernateTemplate().update(house);
	}

	/**
	 * 
	 * 根据租房Id查询租房详细信息
	 * 
	 * @see com.rjxy.dao.HouseDao#getHouseById(java.lang.String)
	 */
	@Override
	public House getHouseById(String hid) {
		House house = getHibernateTemplate().get(House.class,Integer.parseInt(hid));
		return house;
	}

}
