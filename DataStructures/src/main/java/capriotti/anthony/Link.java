package capriotti.anthony;

import java.util.List;

/**
 * Created by anthonycapriotti on 2/24/17.
 */
public class Link<T> {

     T names;
     Link<T> next;
     Link<T> previous;

     Link(T names){
         this.names = names;
     }



}
