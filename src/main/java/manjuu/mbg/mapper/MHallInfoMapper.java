package manjuu.mbg.mapper;

import java.util.List;
import manjuu.mbg.entity.MHallInfo;
import manjuu.mbg.entity.MHallInfoExample;
import manjuu.mbg.entity.MHallInfoKey;
import org.apache.ibatis.annotations.Param;

public interface MHallInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_HALL_INFO
     *
     * @mbggenerated Sun Aug 07 01:05:47 JST 2016
     */
    int countByExample(MHallInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_HALL_INFO
     *
     * @mbggenerated Sun Aug 07 01:05:47 JST 2016
     */
    int deleteByExample(MHallInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_HALL_INFO
     *
     * @mbggenerated Sun Aug 07 01:05:47 JST 2016
     */
    int deleteByPrimaryKey(MHallInfoKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_HALL_INFO
     *
     * @mbggenerated Sun Aug 07 01:05:47 JST 2016
     */
    int insert(MHallInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_HALL_INFO
     *
     * @mbggenerated Sun Aug 07 01:05:47 JST 2016
     */
    int insertSelective(MHallInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_HALL_INFO
     *
     * @mbggenerated Sun Aug 07 01:05:47 JST 2016
     */
    List<MHallInfo> selectByExample(MHallInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_HALL_INFO
     *
     * @mbggenerated Sun Aug 07 01:05:47 JST 2016
     */
    MHallInfo selectByPrimaryKey(MHallInfoKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_HALL_INFO
     *
     * @mbggenerated Sun Aug 07 01:05:47 JST 2016
     */
    int updateByExampleSelective(@Param("record") MHallInfo record, @Param("example") MHallInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_HALL_INFO
     *
     * @mbggenerated Sun Aug 07 01:05:47 JST 2016
     */
    int updateByExample(@Param("record") MHallInfo record, @Param("example") MHallInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_HALL_INFO
     *
     * @mbggenerated Sun Aug 07 01:05:47 JST 2016
     */
    int updateByPrimaryKeySelective(MHallInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_HALL_INFO
     *
     * @mbggenerated Sun Aug 07 01:05:47 JST 2016
     */
    int updateByPrimaryKey(MHallInfo record);
}