import org.example.UserValidation;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class UserTest {

    @Test
    public void testValidFirstName() {
        assertTrue(UserValidation.isValidInput("Shubhasri", "^[A-Z][a-zA-Z]{2,}$"));
    }

    @Test
    public void testValidLastName() {
        assertTrue(UserValidation.isValidInput("Tadepalli", "^[A-Z][a-zA-Z]{2,}$"));
    }


    @Test
    public void testValidEmail() {
        assertTrue(UserValidation.isValidInput("shubha@example.com", "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"));
    }

    @Test
    public void testValidMobileNumber() {
        assertTrue(UserValidation.isValidInput("91 9919819801", "^\\d{2} \\d{10}$"));
    }

    @Test
    public void testValidPassword() {
        assertTrue(UserValidation.isValidPassword("Shubha@1234"));
    }

}
