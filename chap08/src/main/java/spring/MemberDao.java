package spring;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class MemberDao {

	/*
	 * private static long nextId = 0;
	 * 
	 * private Map<String, Member> map = new HashMap<String, Member>();
	 */

	// jdbc 객체 생성
	private JdbcTemplate jdbcTemplate;

	public MemberDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		// jdbctemplate 객체를 생성하려면 datasource 를 전달해주어야 함.

	}

	public Member selectByEmail(String email) {

		List<Member> results = jdbcTemplate.query("select*from MEMBER where EMAIL =?",

				new RowMapper<Member>() {
					@Override
					public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
						Member member = new Member(rs.getString("EMAIL"), rs.getString("PASSWORD"),
								rs.getString("NAME"), rs.getTimestamp("REGDATE"));
						member.setId(rs.getLong("ID"));

						return member;
					}
				}, email);

		return results.isEmpty() ? null : results.get(0);
	}


	public List<Member> selectAll() {
		List<Member> results = jdbcTemplate.query("select*from MEMBER",
				new RowMapper<Member>() {//rowMapper임의 클래스 구현
			@Override
			public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
				Member member = new Member(rs.getString("EMAIL"), rs.getString("PASSWORD"), rs.getString("NAME"),
						rs.getTimestamp("REGDATE"));
				member.setId(rs.getLong("ID"));
				return member;
			}
		}
		);
		return results;
	}

	
	
	public int count() {
		//결과 행이 한 개의 칼럼만 가진 경우를 위한 메서드
		Integer count = jdbcTemplate.queryForObject(
				"select count(*) from MEMBER", Integer.class);
		return count;
	}
	
	
	
	public void update(Member member) {
		jdbcTemplate.update(
				//쿼리 실행 결과로 변경된 행의 개수를 리턴함.
			"update MEMBER set NAME =?, PASSWORD = ? where EMAIL = ?",
			member.getName(), member.getPassword(), member.getEmail());
	}
	
	
	
	
	
}
