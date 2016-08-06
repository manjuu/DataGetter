package manjuu.mbg.mapper;

import java.util.List;
import manjuu.mbg.entity.MMachineList;
import manjuu.mbg.entity.MMachineListExample;
import manjuu.mbg.entity.MMachineListKey;
import org.apache.ibatis.annotations.Param;

public interface MMachineListMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_MACHINE_LIST
     *
     * @mbggenerated Sun Aug 07 01:05:47 JST 2016
     */
    int countByExample(MMachineListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_MACHINE_LIST
     *
     * @mbggenerated Sun Aug 07 01:05:47 JST 2016
     */
    int deleteByExample(MMachineListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_MACHINE_LIST
     *
     * @mbggenerated Sun Aug 07 01:05:47 JST 2016
     */
    int deleteByPrimaryKey(MMachineListKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_MACHINE_LIST
     *
     * @mbggenerated Sun Aug 07 01:05:47 JST 2016
     */
    int insert(MMachineList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_MACHINE_LIST
     *
     * @mbggenerated Sun Aug 07 01:05:47 JST 2016
     */
    int insertSelective(MMachineList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_MACHINE_LIST
     *
     * @mbggenerated Sun Aug 07 01:05:47 JST 2016
     */
    List<MMachineList> selectByExample(MMachineListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_MACHINE_LIST
     *
     * @mbggenerated Sun Aug 07 01:05:47 JST 2016
     */
    MMachineList selectByPrimaryKey(MMachineListKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_MACHINE_LIST
     *
     * @mbggenerated Sun Aug 07 01:05:47 JST 2016
     */
    int updateByExampleSelective(@Param("record") MMachineList record, @Param("example") MMachineListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_MACHINE_LIST
     *
     * @mbggenerated Sun Aug 07 01:05:47 JST 2016
     */
    int updateByExample(@Param("record") MMachineList record, @Param("example") MMachineListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_MACHINE_LIST
     *
     * @mbggenerated Sun Aug 07 01:05:47 JST 2016
     */
    int updateByPrimaryKeySelective(MMachineList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_MACHINE_LIST
     *
     * @mbggenerated Sun Aug 07 01:05:47 JST 2016
     */
    int updateByPrimaryKey(MMachineList record);
}