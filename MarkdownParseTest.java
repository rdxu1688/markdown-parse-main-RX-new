import static org.junit.Assert.*;
import org.junit.*;

import java.beans.Transient;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest {

    @Test
    public void testFile1() throws IOException { //failed
        String contents= Files.readString(Path.of("./test-file.md"));
        List<String> expect = List.of("https://something.com", "some-page.html");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testGetLinks() throws IOException { //failed
        Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> realLinks = List.of("https://something.com", "some-page.html");
        assertEquals(realLinks, links);
    }

    @Test
    public void testGetLinksBreaking() throws IOException { //failed
        Path fileName = Path.of("breaking_tests.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> realLinks = List.of("https://google.com/(())a()shd", "https://something()test()");
        assertEquals(realLinks, links);
    }

    @Test
    public void testGetLinks2() throws IOException {
        Path fileName = Path.of("test-file2.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> realLinks = List.of("https://something.com", "some-page.html");
        assertEquals(realLinks, links);
    }

    @Test
    public void testGetLinks3() throws IOException {
        Path fileName = Path.of("test-file3.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> realLinks = List.of();
        assertEquals(realLinks, links);
    }

    @Test
    public void testGetLinks4() throws IOException {
        Path fileName = Path.of("test-file4.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> realLinks = List.of();
        assertEquals(realLinks, links);
    }

    @Test
    public void testGetLinks5() throws IOException {
        Path fileName = Path.of("test-file5.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> realLinks = List.of();
        assertEquals(realLinks, links);
    }

    @Test
    public void testGetLinks6() throws IOException {
        Path fileName = Path.of("test-file6.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> realLinks = List.of();
        assertEquals(realLinks, links);
    }

    @Test
    public void testGetLinks7() throws IOException {
        Path fileName = Path.of("test-file7.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> realLinks = List.of();
        assertEquals(realLinks, links);
    }

    @Test
    public void testGetLinks8() throws IOException {
        Path fileName = Path.of("test-file8.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> realLinks = List.of("a link on the first line");
        assertEquals(realLinks, links);  
    }

    @Test
    public void testFail() throws IOException {
        Path fileName = Path.of("test-file9.md");
        String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        List<String> realLinks = List.of();
        assertEquals(realLinks, links);
    }
    
}
