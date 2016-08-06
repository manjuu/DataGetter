package manjuu.mbg.mapper;

import java.util.List;
import manjuu.mbg.entity.TUserInfo;
import manjuu.mbg.entity.TUserInfoExample;
import manjuu.mbg.entity.TUserInfoKey;
import org.apache.ibatis.annotations.Param;

public interface TUserInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_USER_INFO
     *
     * @mbggenerated Sun Aug 07 01:05:47 JST 2016
     */
    int countByExample(TUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_USER_INFO
     *
     * @mbggenerated Sun Aug 07 01:05:47 JST 2016
     */
    int deleteByExample(TUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_USER_INFO
     *
     * @mbggenerated Sun Aug 07 01:05:47 JST 2016
     */
    int deleteByPrimaryKey(TUserInfoKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_USER_INFO
     *
     * @mbggenerated Sun Aug 07 01:05:47 JST 2016
     */
    int insert(TUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_USER_INFO
     *
     * @mbggenerated Sun Aug 07 01:05:47 JST 2016
     */
    int insertSelective(TUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_USER_INFO
     *
     * @mbggenerated Sun Aug 07 01:05:47 JST 2016
     */
    List<TUserInfo> selectByExample(TUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_USER_INFO
     *
     * @mbggenerated Sun Aug 07 01:05:47 JST 2016
     */
    TUserInfo selectByPrimaryKey(TUserInfoKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_USER_INFO
     *
     * @mbggenerated Sun Aug 07 01:05:47 JST 2016
     */
    int updateByExampleSelective(@Param("record") TUserInfo record, @Param("example") TUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_USER_INFO
     *
     * @mbggenerated Sun Aug 07 01:05:47 JST 2016
     */
    int updateByExample(@Param("record") TUserInfo record, @Param("example") TUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_USER_INFO
     *
     * @mbggenerated Sun Aug 07 01:05:47 JST 2016
     */
    int updateByPrimaryKeySelective(TUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_USER_INFO
     *
     * @mbggenerated Sun Aug 07 01:05:47 JST 2016
     */
    int updateByPrimaryKey(TUserInfo record);
}