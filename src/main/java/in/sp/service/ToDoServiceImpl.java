package in.sp.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.beans.ToDo;
import in.sp.dao.ToDoDao;

@Service
public class ToDoServiceImpl implements ToDoService {

	@Autowired
	ToDoDao toDoDao;
	
	@Override
	public int addToDo(int userId, String password, String userName, String description, String targetDate,
			String isDone) {
		int count=toDoDao.add(userId,password,userName,description,targetDate,isDone);
		return count;
	}

	@Override
	public int deleteToDo(int userId, String password) {
		int count=toDoDao.delete(userId,password);
		return count;
	}

	@Override
	public int updateToDo(int userId, String password,String userName, String description, String targetDate, String isDone){
		int count=toDoDao.update(userId,password,userName,description,targetDate,isDone);
		return count;
	}

	@Override
	public List<ToDo> displayToDo(int userId, String password) {
		List<ToDo> list_std=toDoDao.display(userId,password);
		return list_std;
	}

	

	
	
}
