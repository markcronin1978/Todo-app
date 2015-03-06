package ie.cit.adf.dao;

import ie.cit.adf.domain.Todo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;


@Component
public class JdbcTodoRepository implements TodoRepository {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JdbcTodoRepository(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
		
	}

	public void insert(Todo todo) {
		jdbcTemplate.update("insert into todo(id, done, text) values(?,?,?)",
				todo.getId(), todo.getDone(), todo.getText());
		
	}

	public List<Todo> getAll() {
		return jdbcTemplate.query("select id, done, text from todo",
				new TodoRowMapper());
	}

}

class TodoRowMapper implements RowMapper<Todo>{

	public Todo mapRow(ResultSet rs, int rowNum) throws SQLException {
		String id = rs.getString("id");
		boolean done = rs.getBoolean("done");
		String text = rs.getString("text");
		
		Todo todo = new Todo();
		todo.setId(id);
		todo.setDone(done);
		todo.setText(text);
		
		return todo;
	}
	
}
