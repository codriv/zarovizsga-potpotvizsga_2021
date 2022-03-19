package hu.nive.ujratervezes.zarovizsga.housecup;

import org.mariadb.jdbc.MariaDbDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class HouseCup {

    JdbcTemplate jdbcTemplate;

    public HouseCup(MariaDbDataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public int getPointsOfHouse(String house) {
        return jdbcTemplate.query("SELECT SUM(points_earned) AS sum_of_points FROM house_points WHERE house_name = ?",
                (rs, rowNum) -> rs.getInt("sum_of_points"), house).get(0);
    }
}
