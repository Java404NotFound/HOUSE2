package com.rjxy.dao.impl;

import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.rjxy.bean.Picture;
import com.rjxy.dao.PictureDao;

public class PictureDaoImpl extends HibernateDaoSupport implements PictureDao {

	@Override
	public List<Picture> findPictureByHId(final String hid) {

		return getHibernateTemplate().execute(new HibernateCallback<List<Picture>>() {

			@Override
			public List<Picture> doInHibernate(Session session) throws HibernateException {
				String hql = "select * from House_Picture where house_id=?";
				SQLQuery sqlQuery = session.createSQLQuery(hql);
				sqlQuery.addEntity(Picture.class);
				Query query = sqlQuery.setParameter(0, Integer.parseInt(hid));
				return query.list();
			}
		});
	}

}
