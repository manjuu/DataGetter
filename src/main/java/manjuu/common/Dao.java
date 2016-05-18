package manjuu.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class Dao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertMachineData(MachineData md) {

        StringBuilder buf = new StringBuilder();

        buf.append("INSERT INTO MACHINE_DATA ");
        buf.append("( SYUTOKUBI, MACHINE_NO, MACHINE_NAME, GAMES, PAYOUT ) ");
        buf.append("VALUES ");
        buf.append("( ?, ?, ?, ?, ? );");

        String sql = buf.toString();
        jdbcTemplate.update(sql, md.getDate(), md.getMachineNo(), md.getMachineName(), md.getGames(), md.getSamai());
    }
}
