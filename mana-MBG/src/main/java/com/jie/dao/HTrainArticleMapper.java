package com.jie.dao;

import com.jie.bean.HTrainArticle;
import java.util.List;

public interface HTrainArticleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_train_article
     *
     * @mbg.generated
     */
    int insert(HTrainArticle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_train_article
     *
     * @mbg.generated
     */
    List<HTrainArticle> selectAll();
}