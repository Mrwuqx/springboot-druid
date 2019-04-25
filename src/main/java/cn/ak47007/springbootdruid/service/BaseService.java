package cn.ak47007.springbootdruid.service;

import java.util.List;

/**
 * @Author AK47007
 * @Date 4/25/2019 8:48 AM
 * @Description :
 */
public interface BaseService<T> {

    /**
     * 查询全部数据
     *
     * @return
     */
    List<T> findAll();

}
