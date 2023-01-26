import static org.junit.Assert.*;
import org.junit.*;

import java.io.File;
import java.io.IOException;

public class FileTests
{
    @Test
    public void testGetFiles() throws IOException
    {
        File input0 = new File("some-files");
        int expected0 = 5;
        assertEquals(expected0, FileExample.getFiles(input0).size());

        File input1 = new File("some-files/more-files");
        int expected1 = 2;
        assertEquals(expected1, FileExample.getFiles(input1).size());

        File input2 = new File("some-files/a.txt");
        int expected2 = 1;
        assertEquals(expected2, FileExample.getFiles(input2).size());
    }
}
