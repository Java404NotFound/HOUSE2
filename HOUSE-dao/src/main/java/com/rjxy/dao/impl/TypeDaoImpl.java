package com.rjxy.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.rjxy.bean.Type;
import com.rjxy.dao.TypeDao;

public class TypeDaoImpl extends HibernateDaoSupport implements TypeDao {

	@Override
	public List<Type> findTypeList() {
		// Criteria
		DetachedCriteria dc = DetachedCriteria.forClass(Type.class);
		@SuppressWarnings("unchecked")
		List<Type> list = (List<Type>) getHibernateTemplate().findByCriteria(dc);
		return list;

	}

	@Override
	public Type getTypeById(final Integer id) {

		return getHibernateTemplate().execute(new HibernateCallback<Type>() {

			@Override
			public Type doInHibernate(Session session) throws HibernateException {
				Query createQuery = session.createQuery("from Type where id=?");
				createQuery.setParameter(0, id);
				List list = createQuery.list();
				if (list != null) {
					return (Type) list.get(0);
				}
				return null;
			}
		});
	}

}
