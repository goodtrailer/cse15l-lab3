import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.*;

public class LinkedListTests
{
    private LinkedList llist;

    @Before
    public void setup()
    {
        llist = new LinkedList();
    }

    @Test
    public void testPrepend()
    {
        final int n_count = 5;

        for (int i = 0; i < n_count; i++)
            llist.prepend(i);

        int n = n_count - 1;
        for (Node node = llist.root; node != null; node = node.next, n--)
            assertEquals(n, node.value);
    }

    @Test
    public void testAppend()
    {
        final int n_count = 5;
        
        for (int i = 0; i < n_count; i++)
            llist.append(i);

        int n = 0;
        for (Node node = llist.root; node != null; node = node.next, n++)
            assertEquals(n, node.value);
    }

    @Test
    public void testFirst()
    {
        assertThrows(NoSuchElementException.class, () -> llist.first());
        
        llist.append(0);
        assertEquals(0, llist.first());

        llist.append(1);
        llist.prepend(-1);
        assertEquals(-1, llist.first());
    }

    @Test
    public void testLast()
    {
        assertThrows(NoSuchElementException.class, () -> llist.last());
        
        llist.append(0);
        assertEquals(0, llist.last());

        llist.append(1);
        llist.prepend(-1);
        assertEquals(1, llist.last());
    }

    @Test
    public void testLength()
    {
        final int n_count = 5;
        
        for (int i = 0; i < n_count; i++)
            llist.append(i);

        assertEquals(n_count, llist.length());
    }

    @Test
    public void testToString()
    {
        final int n_count = 5;
        
        for (int i = 0; i < n_count; i++)
            llist.append(i);

        String expected = "";
        for (int i = 0; i < n_count; i++)
            expected += Integer.toString(i) + " ";

        assertEquals(expected, llist.toString());
    }
}
