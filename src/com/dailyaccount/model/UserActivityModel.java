package com.dailyaccount.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dailyaccount.beans.user;

public class UserActivityModel {

	public boolean loginCheck(String username, String password) {
		SessionFactory factory = new Configuration().configure()
				.buildSessionFactory();
		Session session = factory.openSession();
		String query = "from user where nickname=? and password=?";
		Query queryObj = session.createQuery(query);
		queryObj.setString(0, username);
		queryObj.setString(1, password);
		List<user> records = queryObj.list();
		
		if (records.size() > 0)
			return true;
		else
			return false;
	}

}
