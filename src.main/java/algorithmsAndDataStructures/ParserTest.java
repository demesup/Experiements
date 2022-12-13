package algorithmsAndDataStructures;

import org.junit.jupiter.api.Test;

import static algorithmsAndDataStructures.Parser.parse;
import static org.junit.jupiter.api.Assertions.*;

class ParserTest {

    @Test
    void parsePowersOf10() {
        var ten = parse("10");
        var thousand = parse("1000");
        var one = parse("1");
        var one_hundredth = parse("0.01");
        var one_thousandth = parse("0.001");

        assertEquals("10", ten);
        assertEquals("1000", thousand);
        assertEquals("1", one);
        assertEquals("0.001", one_thousandth);
        assertEquals("0.01", one_hundredth);
    }

    @Test
    void parseFloat() {
        var res1 = parse("0.006");
        var res2 = parse("0.00000222");
        var res3 = parse("0.6");
        var res4 = parse("222.222");

        assertEquals( "0.01", res1);
        assertEquals( "0.00001", res2);
        assertEquals( "1", res3);
        assertEquals( "1000", res4);
    }

    @Test
    void parseNumber(){
        var res1 = parse("6");
        var res2 = parse("42");
        var res3 = parse("102");
        var res4 = parse("2 433");
        var res5 = parse("55 661");

        assertEquals(res1, "10");
        assertEquals(res2, "100");
        assertEquals(res3, "1000");
        assertEquals(res4, "10000");
        assertEquals(res5, "100000");
    }
}