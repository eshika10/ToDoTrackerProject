package in.sp.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.sp.beans.ToDo;

public class Mapper implements RowMapper<ToDo>{

	@Override
	public ToDo mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		ToDo obj=new ToDo();
		obj.setUserId(rs.getInt("userId"));
		obj.setPassword(rs.getString("password"));
		obj.setUserName(rs.getString("userName"));
		obj.setDescription(rs.getString("description"));
		obj.setTargetDate(rs.getString("targetDate"));
		obj.setIsDone(rs.getString("isDone"));
		
		
		return obj;
	}

	
}
