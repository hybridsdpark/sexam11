package webapp;

import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        CharacterEncodingFilter c =null;
        c.setEncoding("UTF-8");
        
    }
}
