package com.qmy.qmybdata.mapper;

import com.qmy.qmybdata.entity.PastureInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PastureInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table breed_famer
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table breed_famer
     *
     * @mbg.generated
     */
    int insert(PastureInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table breed_famer
     *
     * @mbg.generated
     */
    int insertSelective(PastureInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table breed_famer
     *
     * @mbg.generated
     */
    PastureInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table breed_famer
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(PastureInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table breed_famer
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(PastureInfo record);

    /**
     * 按照条件选择牧场管理信息
     * @param pastureInfo
     * @return
     */
    List<PastureInfo> selectPastureInfoByCondition(PastureInfo pastureInfo);
}