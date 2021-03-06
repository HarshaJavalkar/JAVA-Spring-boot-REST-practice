package com.example.demo.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	private static int usersCount = 3;

	private static List<User> users = new ArrayList<>();
	static {
		users.add(new User(1, "Adam", new Date()));
		users.add(new User(2, "Harsh", new Date()));
		users.add(new User(3, "joy", new Date()));
	}

	public List<User> findAll() {
		System.out.println("Harsha" + users);
		return users;
	}

	public User save(User user) {
		if (user.getId() == null) {
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}

	public User findOne(int id) {
		User found =null;
		for (User user : users) {
			if (user.getId() == id) {
				found= user;
				break;
			}
		}
		return found;
	}
}
