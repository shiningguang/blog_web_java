
package com.chen.common.db.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.chen.common.db.model.EntityModel;
import com.googlecode.genericdao.dao.hibernate.GenericDAO;


public interface BaseDAO<T extends EntityModel<ID>, ID extends Serializable> extends GenericDAO<T, ID>{

	T get(ID id);

	ID insert(T entity);

	void update(T entity);

	boolean deleteById(ID id);

	boolean delete(T entity);

	List<T> list();

	int execute(String hql, Map<String, Object> params);

	int execute(String hql, List<Object> params);

	
	
}
