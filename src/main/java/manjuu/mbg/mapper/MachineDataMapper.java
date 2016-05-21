package manjuu.mbg.mapper;

import java.util.List;
import manjuu.mbg.entity.MachineData;
import manjuu.mbg.entity.MachineDataExample;
import org.apache.ibatis.annotations.Param;

public interface MachineDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MACHINE_DATA
     *
     * @mbggenerated Sat May 21 15:42:04 JST 2016
     */
    int countByExample(MachineDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MACHINE_DATA
     *
     * @mbggenerated Sat May 21 15:42:04 JST 2016
     */
    int deleteByExample(MachineDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MACHINE_DATA
     *
     * @mbggenerated Sat May 21 15:42:04 JST 2016
     */
    int insert(MachineData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MACHINE_DATA
     *
     * @mbggenerated Sat May 21 15:42:04 JST 2016
     */
    int insertSelective(MachineData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MACHINE_DATA
     *
     * @mbggenerated Sat May 21 15:42:04 JST 2016
     */
    List<MachineData> selectByExample(MachineDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MACHINE_DATA
     *
     * @mbggenerated Sat May 21 15:42:04 JST 2016
     */
    int updateByExampleSelective(@Param("record") MachineData record, @Param("example") MachineDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MACHINE_DATA
     *
     * @mbggenerated Sat May 21 15:42:04 JST 2016
     */
    int updateByExample(@Param("record") MachineData record, @Param("example") MachineDataExample example);
}