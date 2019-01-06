package spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

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
		List<Member> results = jdbcTemplate.query(
				"select * from spring4fs.MEMBER where EMAIL = ?", 
				new RowMapper<Member>() {

					public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
						Member member = new Member(rs.getString("EMAIL"), rs.getString("PASSWORD"),
								rs.getString("NAME"), rs.getTimestamp("REGDATE"));
						member.setId(rs.getLong("ID"));
						return member;
					}
					
				},
				email);
			return results.isEmpty() ? null : results.get(0);
		
		
		
		
		
		
		
		

	/*	List<Member> results = jdbcTemplate.query("select*from spring4fs.MEMBER where EMAIL =?",

				new RowMapper<Member>() {
					public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
						Member member = new Member(rs.getString("EMAIL"), rs.getString("PASSWORD"),
								rs.getString("NAME"), rs.getTimestamp("REGDATE"));
						member.setId(rs.getLong("ID"));

						return member;
					}
				}, email);

		return results.isEmpty() ? null : results.get(0);*/
	}


	public List<Member> selectAll() {
		List<Member> results = jdbcTemplate.query("select*from spring4fs.MEMBER",
				new RowMapper<Member>() {//rowMapper임의 클래스 구현
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
				"select count(*) from spring4fs.MEMBER", Integer.class);
		return count;
	}
	
	
	
	public void update(Member member) {
		
		try {
			
			jdbcTemplate.update(
					//쿼리 실행 결과로 변경된 행의 개수를 리턴함.
					"update MEMBER set NAME =?, PASSWORD = ? where EMAIL = ?",
					member.getName(), member.getPassword(), member.getEmail());
		} catch (DataAccessException e) {
			
		}
	}
	
	
	
	public void insert(final Member member) {
		
		//자동 생성된 키 값을 보관하는 KeyHolder 객체
		KeyHolder keyHolder = new GeneratedKeyHolder();

		jdbcTemplate.update(new PreparedStatementCreator() {
			
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				//파라미터로 전달받은 Connection을 이용해서 PreparedStatement 생성
				PreparedStatement pstmt = con.prepareStatement(
				"insert into spring4fs.MEMBER(EMAIL, PASSWORD, NAME, REGDATE) values(?,?,?,?)"
						,new String[] {"ID"});
				
				//인덱스 파라미터 값 설정
				pstmt.setString(1, member.getEmail());
				pstmt.setString(2, member.getPassword());
				pstmt.setString(3, member.getName());
				pstmt.setTimestamp(4, new Timestamp(member.getRegisterDate().getTime()));
				
				
				//생성한 preparedstatement객체 리턴
				return pstmt;
			}
		}, keyHolder);
		Number keyValue = keyHolder.getKey();
		member.setId(keyValue.longValue());
		//Number 타입이었던 키값을 long 타입으로 바꿈
	}
	
	
	
	
	
}
