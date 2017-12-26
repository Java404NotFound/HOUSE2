package com.rjxy.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.rjxy.bean.Street;
import com.rjxy.dao.StreetDao;

public class StreetDaoImpl extends HibernateDaoSupport implements StreetDao {

	@Override
	public List<Street> findStreetListByDId(final int did) {
		// Criteria

		return getHibernateTemplate().execute(new HibernateCallback<List<Street>>() {
			@Override
			public List<Street> doInHibernate(Session session) throws HibernateException {
				Query query = session.createQuery("from Street where district_id=?");
				query.setParameter(0, did);
				@SuppressWarnings("unchecked")
				List<Street> list = query.list();
				return list;
			}
		});

	}

	@Override
	public Street getStreetById(final Integer sid) {
		return getHibernateTemplate().execute(new HibernateCallback<Street>() {
			@Override
			public Street doInHibernate(Session session) throws HibernateException {
				Query query = session.createQuery("from Street where id=?");
				query.setParameter(0, sid);
				@SuppressWarnings("unchecked")
				List<Street> list = query.list();
				if (list != null) {
					return list.get(0);
				}
				return null;
			}
		});
	}

}
