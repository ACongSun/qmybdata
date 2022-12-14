package com.qmy.qmybdata.mapper;

import com.qmy.qmybdata.entity.TradeInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TradeInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transport
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transport
     *
     * @mbg.generated
     */
    int insert(TradeInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transport
     *
     * @mbg.generated
     */
    int insertSelective(TradeInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transport
     *
     * @mbg.generated
     */
    TradeInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transport
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TradeInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transport
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TradeInfo record);

    /**
     * 通过条件查询交易信息
     * @param tradeInfo
     * @return
     */
    List<TradeInfo> selectByCondition(TradeInfo tradeInfo);
}