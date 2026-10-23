package in.umasuraj.springboot.web.todo;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {

	private TodoRepository todoRepository;

	public TodoService(TodoRepository todoRepository) {
		super();
		this.todoRepository = todoRepository;
	}

	public List<Todo> findByUsername(String username) {
		List<Todo> todos = this.todoRepository.findByUsername(username);
		return todos;
	}

	public void addTodo(@Valid Todo todo) {
		this.todoRepository.save(todo);
	}

	public void deleteById(int id) {
		this.todoRepository.deleteById(id);
	}

	public Todo findById(int id) {
		Todo todo = this.todoRepository.findById(id).get();
		return todo;
	}

	public void updateTodo(@Valid Todo todo) {
		this.todoRepository.save(todo);
	}

}
