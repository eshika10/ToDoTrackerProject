package in.sp.service;

import java.util.Date;
import java.util.List;

import in.sp.beans.ToDo;

public interface ToDoService {
   
	public int addToDo(int userId,String password,String userName,String description,String targetDate,String isDone);
	
	public int deleteToDo(int userId,String password);
	
	public int updateToDo(int userId, String password,String userName, String description, String targetDate, String isDone);
	
	public List<ToDo> displayToDo(int userId,String password);
}
