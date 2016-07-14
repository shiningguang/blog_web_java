
package com.chen.common.db.dao;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.Query;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.chen.common.db.model.EntityModel;
import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;



public class BaseDAOImpl<T extends EntityModel<ID>, ID extends Serializable> extends GenericDAOImpl<T, ID> implements
		BaseDAO<T, ID> {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	@Override
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	public int execute(String hql, Map<String, Object> params) {
		if (StringUtils.isBlank(hql)) {
			throw new IllegalArgumentException("arg hql is empty due to fail.");
		}
		Query query = getSession().createQuery(hql);

		if (null != params) {
			Iterator<Entry<String, Object>> iter = params.entrySet().iterator();
			while (iter.hasNext()) {
				Entry<String, Object> param = iter.next();
				query.setParameter(param.getKey(), param.getValue());
			}
		}
		return query.executeUpdate();
	}

	public int execute(String hql, List<Object> params) {
		if (StringUtils.isBlank(hql)) {
			throw new IllegalArgumentException("arg hql is empty due to fail.");
		}
		Query query = getSession().createQuery(hql);

		if (null != params) {
			int position = 0;
			for (Object param : params) {
				query.setParameter(position, param);
				position++;
			}
		}
		return query.executeUpdate();
	}



	public T get(ID id) {
		return find(id);
	}

	public ID insert(T entity) {
		save(entity);
		return entity.getId();
	}

	public void update(T entity) {
		save(entity);
	}

	public boolean deleteById(ID id) {
		return removeById(id);
	}

	public boolean delete(T entity) {
		return remove(entity);
	}

	public List<T> list() {
		return findAll();
	}

	 
}
