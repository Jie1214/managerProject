package com.czj.dao;

import com.czj.bean.HMoveInfo;
import java.util.List;

public interface HMoveInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_move_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_move_info
     *
     * @mbg.generated
     */
    int insert(HMoveInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_move_info
     *
     * @mbg.generated
     */
    HMoveInfo selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_move_info
     *
     * @mbg.generated
     */
    List<HMoveInfo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_move_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(HMoveInfo record);
}