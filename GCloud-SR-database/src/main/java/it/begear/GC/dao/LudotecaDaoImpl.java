package it.begear.GC.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import it.begear.GC.entity.Ludoteca;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class LudotecaDaoImpl implements LudotecaDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Ludoteca> findAll() {
        return jdbcTemplate.query("select * from ludoteca", new LudotecaRowMapper());
    }

}

class LudotecaRowMapper implements RowMapper<Ludoteca> {
    @Override
    public Ludoteca mapRow(ResultSet rs, int rowNum) throws SQLException {
        Ludoteca ludo = new Ludoteca();

        ludo.setId(rs.getLong("ID"));
        ludo.setTitolo(rs.getString("TITLE"));

        return ludo;
    }
}
