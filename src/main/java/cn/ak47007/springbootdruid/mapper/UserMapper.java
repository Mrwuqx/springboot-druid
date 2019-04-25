package cn.ak47007.springbootdruid.mapper;

import cn.ak47007.springbootdruid.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author AK47007
 * @Date 4/25/2019 8:45 AM
 * @Description :
 */
@Mapper
public interface UserMapper {

    /**
     * 查询全部数据
     *
     * @return
     */
    List<User> findAll();
}
