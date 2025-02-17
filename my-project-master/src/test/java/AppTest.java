import org.junit.jupiter.api.Test;
import com.example.App;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void testAppStatus() {
        App app = new App();
        String result = app.getStatus();
        assertEquals("OK", result);
    }
}