import org.example.UserValidation;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class UserTest {

    @Test
    public void testValidFirstNamehappy() {
        assertTrue(UserValidation.isValidInput("Shubhasri", "^[A-Z][a-zA-Z]{2,}$"));
    }

    @Test
    public void testinValidFirstNamesad() {
        assertFalse(UserValidation.isValidInput("subha", "^[A-Z][a-zA-Z]{2,}$"));
    }

    @Test
    public void testValidLastNamehappy() {
        assertTrue(UserValidation.isValidInput("Tadepalli", "^[A-Z][a-zA-Z]{2,}$"));
    }

     @Test
    public void testinValidLastNamesad() {
        assertFalse(UserValidation.isValidInput("tadepalli", "^[A-Z][a-zA-Z]{2,}$"));
    }


    @Test
    public void testValidEmailhappy() {
        assertTrue(UserValidation.isValidInput("shubha@example.com", "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"));
    }

    @Test
    public void testinValidEmailsad() {
        assertFalse(UserValidation.isValidInput("shubhaexample.com", "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"));
    }

    @Test
    public void testValidMobileNumberhappy() {
        assertTrue(UserValidation.isValidInput("91 9919819801", "^\\d{2} \\d{10}$"));
    }
    @Test
    public void testinValidMobileNumbersad() {
        assertFalse(UserValidation.isValidInput("9919819801", "^\\d{2} \\d{10}$"));
    }

    @Test
    public void testValidPasswordhappy() {
        assertTrue(UserValidation.isValidPassword("Shubha@1234"));
    }

    @Test
    public void testinValidPasswordsad() {
        assertFalse(UserValidation.isValidPassword("shubha"));
    }

    @ParameterizedTest
    @ValueSource(strings ={
        "abc@yahoo.com",
        "abc.100@yahoo.com",
        "abc111@abc.com"
    })

    public void ParameterizedTest(String validEmail){
        assertTrue(UserValidation.isValidInput(validEmail, "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"));
    }

}
