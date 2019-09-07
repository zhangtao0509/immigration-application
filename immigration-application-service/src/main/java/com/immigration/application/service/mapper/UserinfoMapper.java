package com.immigration.application.service.mapper;

import com.immigration.application.api.model.Userinfo;
import com.immigration.application.api.model.UserinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface UserinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userInfo
     *
     * @mbg.generated Sat Sep 07 22:07:27 CST 2019
     */
    long countByExample(UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userInfo
     *
     * @mbg.generated Sat Sep 07 22:07:27 CST 2019
     */
    int deleteByExample(UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userInfo
     *
     * @mbg.generated Sat Sep 07 22:07:27 CST 2019
     */
    int insert(Userinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userInfo
     *
     * @mbg.generated Sat Sep 07 22:07:27 CST 2019
     */
    int insertSelective(Userinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userInfo
     *
     * @mbg.generated Sat Sep 07 22:07:27 CST 2019
     */
    List<Userinfo> selectByExampleWithRowbounds(UserinfoExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userInfo
     *
     * @mbg.generated Sat Sep 07 22:07:27 CST 2019
     */
    List<Userinfo> selectByExample(UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userInfo
     *
     * @mbg.generated Sat Sep 07 22:07:27 CST 2019
     */
    int updateByExampleSelective(@Param("record") Userinfo record, @Param("example") UserinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table userInfo
     *
     * @mbg.generated Sat Sep 07 22:07:27 CST 2019
     */
    int updateByExample(@Param("record") Userinfo record, @Param("example") UserinfoExample example);
}