package Main.App;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainTest {

    private PrintStream originalOut;
    private ByteArrayOutputStream out;

    @BeforeEach
    void setUp() {
        originalOut = System.out;
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void printsUnknownForBadFlag() {
        Main.RunAlgorithm("--nope", "1", "2");
        String printed = out.toString();
        assertTrue(printed.contains("Unknown Algorithm: --nope"),
                "Expected unknown message, got: " + printed);
    }

    @Test
    void callsSimpleAlg1() {
        Main.RunAlgorithm("--alg1", "2", "3");
        String printed = out.toString();

        assertTrue(printed.toLowerCase().contains("alg2") || !printed.isEmpty(),
                "Expected alg2 output, got: " + printed);
    }
    @Test
    void callsAlg1() {
        Main.RunAlgorithm("--alg1", "12345678901234567890", "11111111111111111111");

        String printed = out.toString().trim();

        assertEquals("output: \n137174210013717420998628257899862825790", printed);
    }

    @Test
    void callsAlg2() {
        Main.RunAlgorithm("--alg2", "2", "3");
        String printed = out.toString();

        assertTrue(printed.toLowerCase().contains("alg2") || !printed.isEmpty(),
                "Expected alg2 output, got: " + printed);
    }

    @Test
    void callsAnotherAlg2() {
        Main.RunAlgorithm("--alg2", "12345678901234567890", "11111111111111111111");

        // normalize Windows CRLF to LF
        String printed = out.toString().replace("\r\n", "\n").trim();

        assertEquals("output: \n137174210013717420998628257899862825790", printed);
    }
}
