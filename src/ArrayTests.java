import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests
{
    @Test
    public void testReverseInPlace()
    {
        int[] input1 = { 3 };
        ArrayExamples.reverseInPlace(input1);
        assertArrayEquals(new int[] { 3 }, input1);

        int[] input2 = { 0, 1, 2, 3, 4, 5, 6, 7, };
        ArrayExamples.reverseInPlace(input2);
        assertArrayEquals(new int[] { 7, 6, 5, 4, 3, 2, 1, 0, }, input2);
    }

    @Test
    public void testReversed()
    {
        int[] input1 = {};
        assertArrayEquals(new int[] {}, ArrayExamples.reversed(input1));

        int[] input2 = { 0, 1, 2, 3, 4, 5, 6, 7, };
        assertArrayEquals(new int[] { 7, 6, 5, 4, 3, 2, 1, 0, }, ArrayExamples.reversed(input2));
    }

    @Test
    public void testAverageWithoutLowest()
    {
        double[] input0 = { 1.0, 1.0, 1.0, };
        assertEquals(1.0, ArrayExamples.averageWithoutLowest(input0), 1e-9);

        double[] input1 = { 1.0, 2.0, 4.0, };
        assertEquals(3.0, ArrayExamples.averageWithoutLowest(input1), 1e-9);
    }
}
