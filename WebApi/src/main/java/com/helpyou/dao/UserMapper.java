package com.helpyou.dao;

import com.helpyou.model.User;
import com.helpyou.model.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository("UserDao")
public interface UserMapper {

    User findByUsernameAndPwd(@Param("username") String username,@Param("password") String password );

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table User
     *
     * @mbg.generated Sat Nov 11 22:18:23 CST 2017
     */
    long countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table User
     *
     * @mbg.generated Sat Nov 11 22:18:23 CST 2017
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table User
     *
     * @mbg.generated Sat Nov 11 22:18:23 CST 2017
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table User
     *
     * @mbg.generated Sat Nov 11 22:18:23 CST 2017
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table User
     *
     * @mbg.generated Sat Nov 11 22:18:23 CST 2017
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table User
     *
     * @mbg.generated Sat Nov 11 22:18:23 CST 2017
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table User
     *
     * @mbg.generated Sat Nov 11 22:18:23 CST 2017
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);
}