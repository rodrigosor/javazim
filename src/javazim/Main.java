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
        // Inserir aqui o caminho para o arquivo FLEX
        jflex.Main.generate(new File("D:\\GIT\\javazim\\src\\javazim\\Lexer.flex"));
    }
}
