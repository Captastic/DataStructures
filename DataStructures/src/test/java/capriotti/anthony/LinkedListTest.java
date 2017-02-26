package capriotti.anthony;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import javax.management.DescriptorKey;

/**
 * Created by anthonycapriotti on 2/24/17.
 */
public class LinkedListTest {

    LinkedList<String> linkedList;

    @Before
    public void setup(){
        linkedList = new LinkedList<>();
        linkedList.addFirstLink("Steve Rodgers");
    }

    @Test
    public void getTest(){
        String expected = "Steve Rodgers";
        String actual = linkedList.get(0);
        assertEquals("Cap returns", expected, actual);

    }

    @Test
    public void addTest(){
        linkedList.add("Tony Stark");
        String expected = "Tony Stark";
        String actual = linkedList.get(1);
        assertEquals("Iron man returns", expected, actual);
    }

    @Test
    public void isEmptyTest(){
        boolean expected = false;
        boolean actual = linkedList.isEmpty();
        assertEquals("returns false list is contains entry", expected, actual);
    }

    @Test
    public void isEntryTrueTest(){
        boolean expected = false;
        boolean actual = linkedList.isEmpty();
        assertEquals("returns false contains entry", expected, actual);
    }

    @Test
    public void clearTest(){
        linkedList.clear();
        boolean exoected = true;
        boolean actual = linkedList.isEmpty();
        assertEquals("returns true list is empty after clearing", exoected, actual);
    }

    @Test
    public void sizeTest(){
        int expected = 1;
        int actual = linkedList.size();
        assertEquals("size returns", expected, actual);
    }


    //null pointer??????
    @Test
    public void removeTest(){
        linkedList.add("Bruce Banner");
        linkedList.remove(new Link<>("Bruce Banner"));
        String expected = null;
        String actual = linkedList.get(1);
        assertEquals("null hulk removed", expected, actual);
    }

    @Test
    public void containsTest(){
        linkedList.add("Stephen Strange");
        boolean expected = true;
        boolean actual = linkedList.contains("Stephen Strange");
        assertEquals("true dr strange", expected, actual);
    }

    @Test
    public void containsFalseTest(){
        boolean expected = false;
        boolean actual = linkedList.contains("Sam Wilson");
        assertEquals("False, falcon no here", expected, actual);
    }

    @Test
    public void copyTest(){
        linkedList.add("T'Challa");
        LinkedList<String> linkedList2 = linkedList.copy();
        assertEquals("Steve Rodgers",linkedList2.get(0) );
        assertEquals("T'Challa", linkedList2.get(1));
    }





}
