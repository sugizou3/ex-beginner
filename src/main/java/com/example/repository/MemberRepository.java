package com.example.repository;

import com.example.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class MemberRepository {
    private static final RowMapper<Member> MEMBER_ROW_MAPPER =
            new BeanPropertyRowMapper<>(Member.class);

    @Autowired
    NamedParameterJdbcTemplate template;

    public List<Member> searchFromName(String word) {

        String sql = """
                SELECT id, name, age, dep_id FROM members
                WHERE name LIKE :word
                ORDER BY name;
                """;

        // Java側で "%" を文字に結合してパラメータにセットする
        MapSqlParameterSource param = new MapSqlParameterSource()
                .addValue("word", "%" + word + "%");
        return template.query(sql, param, MEMBER_ROW_MAPPER);
    }
}
