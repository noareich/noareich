
/**
 * Write a description of class מבחן_2017_86 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class מבחן_2017_86
{
    public class Str 
    { 
        private String _s; 

        public  Str(String s)  { 
            _s = s; 
        } 

        public void what (Str other)  { 
            int b =0, p = 0; 
            for (int i=0; i< _s.length (); i++) 
            { 
                int ind = other._s.indexOf(_s.charAt(i)); 
                if (ind == i) 
                    b++; 
                else if (ind != -1) 
                    p++; 
            } 
            System.out.println ("b = " + b + " p = " + p); 
        }  
        
    
    } 

    public static void main(String [] args)
        {
            String s1="abcdef";
            String s2="cgedafb";
            System.out.println(what(s1) );
        }
}
