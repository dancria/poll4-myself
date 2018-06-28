package com.briup.apps.poll.dao;

import com.briup.apps.poll.bean.Options;
import com.briup.apps.poll.bean.OptionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OptionsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_options
     *
     * @mbg.generated Wed Jun 27 20:05:24 CST 2018
     */
    long countByExample(OptionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_options
     *
     * @mbg.generated Wed Jun 27 20:05:24 CST 2018
     */
    int deleteByExample(OptionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_options
     *
     * @mbg.generated Wed Jun 27 20:05:24 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_options
     *
     * @mbg.generated Wed Jun 27 20:05:24 CST 2018
     */
    int insert(Options record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_options
     *
     * @mbg.generated Wed Jun 27 20:05:24 CST 2018
     */
    int insertSelective(Options record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_options
     *
     * @mbg.generated Wed Jun 27 20:05:24 CST 2018
     */
    List<Options> selectByExampleWithBLOBs(OptionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_options
     *
     * @mbg.generated Wed Jun 27 20:05:24 CST 2018
     */
    List<Options> selectByExample(OptionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_options
     *
     * @mbg.generated Wed Jun 27 20:05:24 CST 2018
     */
    Options selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_options
     *
     * @mbg.generated Wed Jun 27 20:05:24 CST 2018
     */
    int updateByExampleSelective(@Param("record") Options record, @Param("example") OptionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_options
     *
     * @mbg.generated Wed Jun 27 20:05:24 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") Options record, @Param("example") OptionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_options
     *
     * @mbg.generated Wed Jun 27 20:05:24 CST 2018
     */
    int updateByExample(@Param("record") Options record, @Param("example") OptionsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_options
     *
     * @mbg.generated Wed Jun 27 20:05:24 CST 2018
     */
    int updateByPrimaryKeySelective(Options record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_options
     *
     * @mbg.generated Wed Jun 27 20:05:24 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(Options record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_options
     *
     * @mbg.generated Wed Jun 27 20:05:24 CST 2018
     */
    int updateByPrimaryKey(Options record);
}