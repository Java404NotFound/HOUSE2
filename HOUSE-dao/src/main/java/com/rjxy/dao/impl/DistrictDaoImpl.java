package com.rjxy.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.rjxy.bean.District;
import com.rjxy.dao.DistrictDao;

public class DistrictDaoImpl extends HibernateDaoSupport implements DistrictDao {

	@Override
	public List<District> findDistrictList() {
		// Criteria
		DetachedCriteria dc = DetachedCriteria.forClass(District.class);
		@SuppressWarnings("unchecked")
		List<District> list = (List<District>) getHibernateTemplate().findByCriteria(dc);
		return list;

	}

	@Override
	public District getDistristById(final Integer id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().execute(new HibernateCallback<District>() {

			@Override
			public District doInHibernate(Session session) throws HibernateException {
				String hql = "from District where id=?";
				Query query = session.createQuery(hql);
				query.setParameter(0, id);
				List list = query.list();
				if (list != null) {
					return (District) list.get(0);
				}
				return null;
			}
		});
	}

}
