package spring.boot.todolist.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.boot.todolist.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
