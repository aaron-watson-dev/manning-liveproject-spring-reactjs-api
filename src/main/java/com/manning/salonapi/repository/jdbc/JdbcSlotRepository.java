package com.manning.salonapi.repository.jdbc;

import com.manning.salonapi.Slot;
import com.manning.salonapi.repository.SlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class JdbcSlotRepository implements SlotRepository {

    private JdbcTemplate jdbc;

    @Autowired
    public JdbcSlotRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public Iterable<Slot> findAll() {
        return jdbc.query("SELECT * FROM Slot", this::mapRowToSlot);
    }

    private Slot mapRowToSlot(ResultSet rs, int rowNum) throws SQLException {
        Slot returnSlot = new Slot();
        returnSlot.setId(rs.getLong("id"));
        returnSlot.setId(rs.getLong("id"));
        returnSlot.setCreatedAt(rs.getDate("createdAt"));
        return returnSlot;
    }
}

