package in.sp.dao;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import in.sp.beans.ToDo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import in.sp.mapper.Mapper;

@Repository
public class ToDoDaoImpl implements ToDoDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int add(int userId, String password, String userName, String description,String  targetDate, String isDone) {
		
        int count=0;
		try {
			String my_sql = "insert into todoinfo(userId,password,userName,description,targetDate,isDone) " +
                    "values (?, ?, ?,?,?,?)";
			count= jdbcTemplate.update(my_sql,userId,password,userName,description,targetDate,isDone);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return count;

	}

	@Override
	public int delete(int userId, String password) {

		int count=0;
		try {
			String my_sql ="delete from todoinfo where userId = ? and password=?";
			count=jdbcTemplate.update(my_sql,userId,password);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return count;
	}

	@Override
	public int update(int userId, String password,String userName, String description, String targetDate, String isDone){
		int count=0;

		try {
			String sqlQuery = "update todoinfo set " + 
                    "userName = ?, description = ?, targetDate = ?,isDone=? " +
                    "where userId = ? and password=?";
			count=jdbcTemplate.update(sqlQuery,userName,description,targetDate,isDone,userId,password);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return count;
		
	}

	@Override
	public List<ToDo> display(int userId, String password) {

		List<ToDo> list_std = null;

		try {
			String my_sql = "select * from todoinfo where userId=? AND password=?";
			list_std = jdbcTemplate.query(my_sql, new Mapper(), new Object[] { userId, password });

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list_std;

	}

}
