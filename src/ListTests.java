import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.util.ArrayList;

public class ListTests
{
    @Test
    public void testFilter()
    {
        List<String> input = new ArrayList<String>();
        String[] strings = new String[] { "", "foo", "", "bar", "", };
        for (String s : strings)
            input.add(s);
        String[] expected = new String[] { "foo", "bar", };

        assertArrayEquals(expected, ListExamples.filter(input, (String s) -> !s.equals("")).toArray());
    }

    @Test
    public void testMerge()
    {

        String[] strings0 = new String[] { "a", "c", "e" };
        String[] strings1 = new String[] { "b", "d", "f" };

        String[] expected = new String[] { "a", "b", "c", "d", "e", "f", };

        List<String> input0 = new ArrayList<String>();
        List<String> input1 = new ArrayList<String>();
        for (String s : strings0)
            input0.add(s);
        for (String s : strings1)
            input1.add(s);

        assertArrayEquals(expected, ListExamples.merge(input0, input1).toArray());
    }
}
