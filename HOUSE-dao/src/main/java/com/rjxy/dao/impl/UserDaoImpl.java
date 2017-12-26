package com.rjxy.dao.impl;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.rjxy.Utils.HibernateUtils;
import com.rjxy.bean.User;
import com.rjxy.dao.UserDao;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@Override
	public User login(User user) {
		// Criteria
		DetachedCriteria dc = DetachedCriteria.forClass(User.class);
		dc.add(Restrictions.eq("username", user.getUsername()));
		dc.add(Restrictions.eq("password", user.getPassword()));
		@SuppressWarnings("unchecked")
		List<User> list = (List<User>) getHibernateTemplate().findByCriteria(dc);
		if (list != null && list.size() > 0) {
			return list.get(0);
		} else {
			return null;
		}

	}

	public void addUser(User user) {
		getHibernateTemplate().save(user);
	}

}
