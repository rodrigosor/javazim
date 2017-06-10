package javazim;

import java.io.File;

/**
 *
 * @author rodrigo.reis
 */
public class Main 
{
    public static void main(String[] args) 
    {
        jflex.Main.generate(new File("D:\\Rodrigo\\Javazim\\Javazim\\src\\javazim\\Lexer.flex"));
        //Analisador.main(null);
    }
}
