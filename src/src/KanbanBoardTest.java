import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class KanbanBoardTest {
    private KanbanBoard board;

    @BeforeEach
    public void setUp() {
        board = new KanbanBoard();
    }

    @Test
    public void testAddDeveloper() {
        board.addDeveloper("Alice", 0);
        assertEquals("Alice", board.getDevelopers()[0]);
    }

    @Test
    public void testAddTask() {
        board.addTask("Implement login", 1, 0);
        assertEquals("Implement login", board.getTaskNames()[0]);
        assertEquals(1, board.getTaskIDs()[0]);
    }

    @Test
    public void testDisplayTaskReport() {
        board.addDeveloper("Bob", 1);
        board.addTask("Implement signup", 2, 1);
        board.displayTaskReport(); // This should display the report correctly
    }
}
