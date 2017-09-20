package com.tek.springdata.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

import com.mysql.cj.api.mysqla.result.Resultset;
import com.tek.springdata.model.Circle;
@Component
public class ConnectionDao {
	
	private DataSource ds;
	
	private JdbcTemplate jt;
	private NamedParameterJdbcTemplate npjt;
	
	public DataSource getDs() {
		return ds;
	}
	@Autowired
	public void setDs(DataSource ds) {
		this.jt =new JdbcTemplate(ds);
		this.npjt=new NamedParameterJdbcTemplate(ds);
	}
	public Circle getcircle(int id) throws ClassNotFoundException, SQLException
	{
		
		Connection c = ds.getConnection();
		String sql2="select * from details where id=?";
		PreparedStatement myst=c.prepareStatement(sql2);
		 myst.setInt(1,id);
		 ResultSet myrs=myst.executeQuery();
		 Circle ci = null;
		 while(myrs.next())
		 {
			 
			  ci=new Circle(id,myrs.getString("name"));
		 }
			c.close();	
		return ci;
	}
	public int getcount()
	{
		String sql="select COUNT(*) from details";
	return jt.queryForObject(sql, Integer.class);
	}

	
	public Circle getallcircles()
	{
		String sql="select * from details where Id='1'";
		
		return jt.queryForObject(sql, new circleMapper());
				
		
	} 
	
	public void insertcircle(Circle c)
	{
		/*String sql="insert into details (id,name) values(?,?)";
		jt.update(sql,new Object[] {c.getId(),c.getName() });
		*/
		String sql="insert into details (id,name) values(:Id,:Name)";
		SqlParameterSource sps=new MapSqlParameterSource("Id",c.getId()).addValue("Name", c.getName());
		npjt.update(sql, sps);
		
	}	
	
	public static final class circleMapper implements RowMapper<Circle>
	{

		public Circle mapRow(ResultSet RS, int arg1) throws SQLException {
			Circle c=new Circle(RS.getInt("id"),RS.getString("name"));
			
			return c;
		}
		
	
	
	}
	
}
