package org.zjluoyue.base;

import java.util.List;

/**
 * Created by zjluoyue on 2016/8/17.
 */
public interface DaoBase<T> {

    /**
     * 保存实体
     * （增）
     * @param entity
     */
    void save(T entity);

    /**
     * 删除实体
     * （删）
     * @param id
     */
    void delete(Integer id);

    /**
     * 更新实体
     * （改）
     * @param entity
     */
    void update(T entity);

    /**
     * 查找所有
     *
     * @return
     */
    List<T> findAll();

    /**
     * 按id查找
     * （查）
     * @param id
     * @return
     */
    T getById(Integer id);


}
