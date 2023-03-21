package edu.sdu.ipr.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDao {
    private JdbcTemplate jdbcTemplate;
    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private static final String CHECK_ADMIN_SQL = "";
    private static final String RESET_PASS_SQL = "";
    private static final String GET_PASS_SQL = "";

    public int getMatchCount(String username, String password){
        return jdbcTemplate.queryForObject(CHECK_ADMIN_SQL, new Object[]{ username, password},Integer.class);
    }

    public int resetPass(String username, String newPass){
        return jdbcTemplate.update(RESET_PASS_SQL, new Object[]{newPass, username});
    }

    public String getPass(String username){
        return jdbcTemplate.queryForObject(GET_PASS_SQL, new Object[]{username},String.class);
    }
}
