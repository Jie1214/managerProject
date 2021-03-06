package com.czj.dao;

import com.czj.pojo.MyFriends;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MyFriendsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_friends
     *
     * @mbg.generated Fri Jun 14 15:37:38 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_friends
     *
     * @mbg.generated Fri Jun 14 15:37:38 CST 2019
     */
    int insert(MyFriends record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_friends
     *
     * @mbg.generated Fri Jun 14 15:37:38 CST 2019
     */
    MyFriends selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_friends
     *
     * @mbg.generated Fri Jun 14 15:37:38 CST 2019
     */
    List<MyFriends> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table my_friends
     *
     * @mbg.generated Fri Jun 14 15:37:38 CST 2019
     */
    int updateByPrimaryKey(MyFriends record);
}