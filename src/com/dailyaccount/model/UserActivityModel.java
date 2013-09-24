package com.dailyaccount.model;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Hibernate;
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
		String query = "Select password from user where nickname=?";
		String pwd = (String) session.createSQLQuery(query)
				.addScalar("password", Hibernate.TEXT)
				.setParameter(0, username).uniqueResult();
		if (pwd.equals(password)) {
			return true;
		} else {
			return false;
		}
	}

}

/*
 * Query queryObj = session.createQuery(query).; queryObj.setString(0,
 * username); queryObj.setString(1, password); List<user> records =
 * queryObj.list(); for (Iterator it = records.iterator(); it.hasNext(); ) {
 * user u= (user) it.next(); String pwd =(String) u.getPassword();
 */

