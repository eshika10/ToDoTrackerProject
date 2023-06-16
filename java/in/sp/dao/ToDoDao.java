package in.sp.dao;

import java.util.Date;
import java.util.List;

import in.sp.beans.ToDo;

public interface ToDoDao {
   
	public int add(int userId,String password,String userName,String description,String targetDate,String isDone);
	
	public int delete(int userId,String password);
	
	public int update(int userId, String password,String userName, String description,String targetDate, String isDone);
	
	public List<ToDo> display(int userId,String password);
}
