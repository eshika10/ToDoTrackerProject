package in.sp.beans;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class ToDo {

	@NotNull(message = "userId should be positive integer")
	private int userId;

	@NotNull(message = "password should be not null")
	private String password;

	
	@NonNull
	@NotBlank(message = "username is mandatory")
	private String userName;
	
	@NotNull(message="description should not be null")
	private String description;
	
	@NotNull(message = "Date cannot be empty")
	//@Past(message = "DOB is not valid")
	@FutureOrPresent(message = "Invalid")
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private String targetDate;
	
	@NotNull(message="value should not be empty")
	private String isDone;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(String targetDate) {
		this.targetDate = targetDate;
	}

	public String getIsDone() {
		return isDone;
	}

	public void setIsDone(String isDone) {
		this.isDone = isDone;
	}

}
