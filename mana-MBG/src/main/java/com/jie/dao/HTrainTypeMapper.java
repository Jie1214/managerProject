package com.jie.dao;

import com.jie.bean.HTrainType;
import java.util.List;

public interface HTrainTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_train_type
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_train_type
     *
     * @mbg.generated
     */
    int insert(HTrainType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_train_type
     *
     * @mbg.generated
     */
    HTrainType selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_train_type
     *
     * @mbg.generated
     */
    List<HTrainType> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_train_type
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(HTrainType record);
}