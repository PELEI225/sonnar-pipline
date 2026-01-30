package com.example.todo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TodoAppTest {

    @Test
    void testAddTask() {
        TodoApp app = new TodoApp();
        app.addTask("Tâche 1");
        assertEquals(1, app.getTasks().size());
        assertEquals("Tâche 1", app.getTasks().get(0).getTitle());
    }

    @Test
    void testCompleteTask() {
        Task task = new Task("Tâche 2");
        task.complete();
        assertTrue(task.isCompleted());
    }
}
