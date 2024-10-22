package om.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import om.mvc.dao.UserDao;
import om.mvc.entity.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	@Override
	public int registerUser(User user) {
		int i = userDao.saveUser(user);
		return i;
	}

}
