package manjuu.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class InsertData implements Dao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert(String date, String machineNo, String machineName, int games, int samai) {

        StringBuilder buf = new StringBuilder();

        buf.append("INSERT INTO MACHINE_DATA ");
        buf.append("( SYUTOKUBI, MACHINE_NO, MACHINE_NAME, GAMES, PAYOUT ) ");
        buf.append("VALUES ");
        buf.append("( ?, ?, ?, ?, ? );");

        String sql = buf.toString();
        jdbcTemplate.update(sql, date, machineNo, machineName, games, samai);
    }
}
