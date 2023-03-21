package codewars_carmelCasing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarmelCasingTest {
    carmelCasing casing;
    @BeforeEach
    void setup() {
        casing = new carmelCasing();
    }

    @Test
    @DisplayName("Split camel case names to individual words")
    void shouldSplitCamelCaseToIndividualWord() {
        var input = "shouldSplitCamelCaseToIndividualWord";
        var out = casing.camelCase(input);
        System.out.println(out);
        assertEquals("should Split Camel Case To Individual Word",  casing.camelCaseRegex(input));
    }

    @Test
    @DisplayName("Should Return non-camel case word")
    void shouldReturnNonCamelCaseWord() {
        var input = "shouldreturnnoncamelcaseword";
        assertEquals("shouldreturnnoncamelcaseword",  casing.camelCaseRegex(input));
    }

    @Test
    @DisplayName("Should return empty string")
    void shouldReturnEmptyString() {
        var input = "";
        assertEquals("", casing.camelCase(input));
    }
}