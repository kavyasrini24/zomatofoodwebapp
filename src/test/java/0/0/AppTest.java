package zomato;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

public class AppTest {

    @Test
    public void testGetMenu() {
        App app = new App();
        List<FoodItem> menu = app.getMenu();

        assertEquals(3, menu.size(), "Menu should contain 3 items.");
        assertEquals("Pizza", menu.get(0).getName());
        assertEquals(8.99, menu.get(0).getPrice());
    }
}
