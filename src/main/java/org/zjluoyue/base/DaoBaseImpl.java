package org.zjluoyue.base;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.lang.reflect.ParameterizedType;
import java.util.List;

@SuppressWarnings("unchecked")
@Transactional
public class DaoBaseImpl<T> implements DaoBase<T> {

    @Resource
    private SessionFactory sessionFactory;

    private Class<T> tClass;

    public DaoBaseImpl() {
        // 获取父类的泛型参数
        ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
        // 获取泛型参数类型
        this.tClass = (Class<T>) pt.getActualTypeArguments()[0];
        System.out.println("DAO	layer loadBean ---------->" + tClass);
    }


    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void save(T entity) {
        getSession().save(entity);
    }

    @Override
    public void delete(Integer id) {
        Object obj = getById(id);
        if (obj != null) {
            getSession().delete(obj);
        }
    }

    @Override
    public void update(T entity) {
        getSession().update(entity);
    }

    @Override
    public List<T> findAll() {
        return getSession()
                .createQuery("FROM" + tClass.getSimpleName())
                .list();
    }

    @Override
    public T getById(Integer id) {
        if (id == null) {
            return null;
        }
        return (T) getSession().get(tClass, id);
    }
}
