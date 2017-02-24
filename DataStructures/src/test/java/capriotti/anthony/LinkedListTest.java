package capriotti.anthony;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by anthonycapriotti on 2/24/17.
 */
public class LinkedListTest {

    LinkedList linkedList;

    @Before
    public void setup(){
        linkedList = new LinkedList();
    }

    @Test
    public void isEmptyTest(){
        boolean expected = true;
        boolean actual = linkedList.isEmpty();
        assertEquals("returns true list is empty", expected, actual);
    }

    @Test
    public void insertFirstLinkTest(){
        linkedList.clear();

    }

    @Test
    public void addLinkTest(){

    }

    @Test
    public void removeLink(){

    }
 /*
    @Test
    public void findTest(){
        String expected = "stuff";
        String actual = linkedList.find("things");
        assertEquals("Stuff", expected, actual);
    }
 */

    @Test
    public void sizeTest(){
        int expected = 0;
        int actual = linkedList.size();
        assertEquals("size returns", expected, actual);
    }

    @Test
    public void containsTest(){
        boolean expected = true;
        boolean actual = linkedList.contains("stuff");
        assertEquals("contains", expected, actual);
    }

    @Test
    public void getTest(){}

    @Test
    public void copyTest(){}

    @Test
    public void sortTest(){}
}
