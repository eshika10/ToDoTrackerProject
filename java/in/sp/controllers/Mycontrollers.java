package in.sp.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.sp.beans.ToDo;
import in.sp.service.ToDoService;


@Controller
public class Mycontrollers {
   
	@GetMapping("/")
	public String openLoginPage() {
		
		return "login";
	}
	
	@Autowired
	ToDoService toDoService;
	
	@PostMapping("/addToDo")
	public String openWelcomePage(@RequestParam("userId")int userId,
			@RequestParam("password") String pass,Model model) {
       
		List<ToDo> list_std = toDoService.displayToDo(userId,pass);
		if(list_std.size() != 0)
		{
			model.addAttribute("model_name",userId);
			  return "welcome";
		}
		 return "error1";
		
	}
	
	@PostMapping("/finalAdd")
	public String processAdd(@RequestParam("userId")int userId, @RequestParam("password")String password,@RequestParam("userName") String userName,@RequestParam("description") String description, @RequestParam("targetDate")String targetDate,
			@RequestParam("isDone")String isDone,Model model){
		String page = "Error";
		int count = toDoService.addToDo(userId,password,userName,description, targetDate,
				 isDone);
		if(count>0)
		{
			page = "successAdd";
		}
		else
		{
			page = "Error";
		}
		return page;
	}
	
	@PostMapping("/finalDisplay")
	public String processDisplay(@RequestParam("userId")int userId,@RequestParam("password")String password,Model model) {
		
		String page = "Error";
		List<ToDo> list_std = toDoService.displayToDo(userId,password);
		if(list_std.size() != 0)
		{
			model.addAttribute("model_todo", list_std.get(0));
			page = "successDisplay";
		}
		else
		{
			page = "Error";
		}
		return page;
		
	}
	
	@PostMapping("/finalDelete")
	public String processDelete(@RequestParam("userId")int userId,@RequestParam("password") String password,Model model) {

		String page = "Error";
		int count= toDoService.deleteToDo(userId, password);
		if(count>0)
		{
			page = "successDelete";
		}
		else
		{
			page = "Error";
		}
		return page;
		
		
	}
	
	@PostMapping("finalUpdate")
	public String processUpdate(@RequestParam("userId")int userId, @RequestParam("password")String password,@RequestParam("userName") String userName,@RequestParam("description") String description, @RequestParam("targetDate")String targetDate,
			@RequestParam("isDone")String isDone,Model model){
		String page = "Error";
		int count= toDoService.updateToDo(userId,password,userName,description,targetDate,isDone);
		if(count>0)
		{
			page = "successUpdate";
		}
		else
		{
			page = "Error";
		}
		return page;
		
	}
	
	@GetMapping("/update")
	public String openUpdateToDo() {
		return "updateToDo";
	}
	
	@GetMapping("/add")
	public String openAddToDo() {
		return "addToDo";
	}
	
	@GetMapping("/delete")
	public String openDeleteToDo() {
		return "deleteToDo";
	}
	
	@GetMapping("/display")
	public String openDisplayToDo() {
		return "displayToDo";
	}
}
