package om.mvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import om.mvc.entity.User;

@Repository
public class UserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int saveUser(User user) {
		String sql = "insert into user(name, email, password, image) values (?,?,?,?)";
		int i = jdbcTemplate.update(sql, user.getFname(), user.getEmail(), user.getPassword(), user.getImage());
		return i;
	}
	
}
