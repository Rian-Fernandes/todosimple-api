package com.rianfernandes.todosimple.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.rianfernandes.todosimple.models.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{
    
    //List<Task> findByUser_Id(Long id);

    @Query(value = "SELECT * FROM task t WHERE t.user_id", nativeQuery = true)
    List<Task> findByUser(@Param("id") Long id);
    
}
