package com.crud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.entity.User;
import com.crud.exception.UserNotFoundException;
import com.crud.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User getUserById(long id) throws UserNotFoundException {
		Optional<User> opt=userRepository.findById(id);
		if(opt.isEmpty()) {
			throw new UserNotFoundException("User with the given id "+id+" is not present in db");
		}else {
			return opt.get();
		}
		
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public String deleteUserById(long id) {
		// TODO Auto-generated method stub
		String out="";
		if(getUserById(id)!=null) {
		 userRepository.deleteById(id);
		 out="Deleted SuccessFully!!!";
		}else {
			out="User with id "+id+" is not present in db!!!";
		}
		return out;
	}

	@Override
	public User updateUser(User user) {
		User dbUser=getUserById(user.getId());
		if(dbUser!=null) {
		dbUser.setName(user.getName());
		dbUser.setAge(user.getAge());
		dbUser.setAddress(user.getAddress());
		return userRepository.save(dbUser);
		}
		return null;
		
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		Random rnd=new Random();
		user.setId(rnd.nextLong(10000, 99999));
		return userRepository.save(user);
	}

	@Override
	public List<User> addAllUser(List<User> users) {
		List<User> lusers=new ArrayList<>();
		for(User us:users) {
			lusers.add(addUser(us));
		}
		return lusers;
	}

	
	
	
}
