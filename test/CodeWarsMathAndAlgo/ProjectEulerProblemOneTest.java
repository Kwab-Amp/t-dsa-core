package CodeWarsMathAndAlgo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjectEulerProblemOneTest {

    static final int n = 10;
    @BeforeEach
    void setUp() {
    }

    @Test
    void solution() {
        var result = ProjectEulerProblemOne.Solution(200);
        assertEquals(9168, result, "Results");
    }

    @Test
    void shouldReturnZeroWhenNumberIsLessThanZero() {
        assertEquals(0, ProjectEulerProblemOne.Solution(-1));
    }

    @Test
    void solutionOptimized() {
        int result = ProjectEulerProblemOne.SolutionOptimized(-200);
        assertEquals(0, result, "Error");
    }

    @Test
    void strangerSoln() {
        int result = ProjectEulerProblemOne.StrangerSolun(-200);
        assertEquals(0, result, "Error");
    }
}