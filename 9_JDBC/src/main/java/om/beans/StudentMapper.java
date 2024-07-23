package om.beans;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student std = new Student();

		std.setName(rs.getString("sname"));
		std.setMarks(rs.getInt("smarks"));
		std.setRollno(rs.getInt("sroll"));

		return std;
	}

}
