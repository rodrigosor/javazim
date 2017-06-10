/* The following code was generated by JFlex 1.6.1 */

package javazim;

import static javazim.Token.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>D:/Rodrigo/Javazim/Javazim/src/javazim/Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\4\1\14\1\14\1\13\22\0\1\36\1\44\1\11"+
    "\3\0\1\41\3\0\1\45\1\45\1\35\1\45\1\10\1\45\12\6"+
    "\1\0\1\37\1\42\1\43\1\42\2\0\1\2\1\5\1\2\1\5"+
    "\1\2\11\5\2\2\2\5\1\25\7\5\1\33\1\12\1\34\1\0"+
    "\1\7\1\0\1\21\1\15\1\5\1\32\1\20\1\30\1\27\1\5"+
    "\1\23\2\5\1\17\1\5\1\22\1\16\2\5\1\26\1\5\1\24"+
    "\1\5\1\31\4\5\1\0\1\40\10\0\1\14\32\0\1\1\u15df\0"+
    "\1\1\u097f\0\13\1\35\0\1\14\1\14\5\0\1\1\57\0\1\1"+
    "\u0fa0\0\1\1\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\ud00f\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\1\4\1\5\1\1\2\4"+
    "\1\2\2\4\1\6\2\1\1\7\1\1\1\10\1\7"+
    "\2\0\1\11\1\0\5\4\1\12\6\4\2\0\2\4"+
    "\1\13\1\14\2\4\1\0\5\13\2\0\5\13\5\0"+
    "\5\13\5\0\1\13\3\0\1\13\5\0\2\13\1\0"+
    "\6\13\3\0\6\13\2\0\5\13\1\0\1\13\1\0"+
    "\4\13";

  private static int [] zzUnpackAction() {
    int [] result = new int[114];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\46\0\114\0\46\0\46\0\114\0\162\0\230"+
    "\0\276\0\344\0\u010a\0\u0130\0\u0156\0\46\0\u017c\0\u01a2"+
    "\0\u01c8\0\u01c8\0\u01c8\0\46\0\u01ee\0\230\0\46\0\u0214"+
    "\0\u023a\0\u0260\0\u0286\0\u02ac\0\u02d2\0\u01ee\0\u02f8\0\u031e"+
    "\0\u0344\0\u036a\0\u0390\0\u03b6\0\u03dc\0\u0402\0\u0428\0\u044e"+
    "\0\u0474\0\u049a\0\u04c0\0\u04e6\0\u050c\0\u0532\0\u0558\0\u057e"+
    "\0\u05a4\0\u05ca\0\u05f0\0\u0616\0\u063c\0\u0662\0\u0688\0\u06ae"+
    "\0\u06d4\0\u06fa\0\u0720\0\u0746\0\u076c\0\u0792\0\u07b8\0\u07de"+
    "\0\u0804\0\u082a\0\u0850\0\u0876\0\u089c\0\u08c2\0\u08e8\0\u090e"+
    "\0\u0934\0\u095a\0\u0980\0\u09a6\0\u09cc\0\u09f2\0\u0a18\0\u0a3e"+
    "\0\u0a64\0\u0a8a\0\u0ab0\0\u0ad6\0\u0afc\0\u0b22\0\u0b48\0\u0b6e"+
    "\0\u0b94\0\u0bba\0\u0be0\0\u0c06\0\u0c2c\0\u0c52\0\u0c78\0\u0c9e"+
    "\0\u0cc4\0\u0cea\0\u0d10\0\u0d36\0\u0d5c\0\u0d82\0\u0da8\0\u0dce"+
    "\0\u0df4\0\u0e1a\0\u0e40\0\u0e66\0\u0e8c\0\u0eb2\0\u0ed8\0\u0efe"+
    "\0\u0f24\0\u0f4a";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[114];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\2\2\1\3\1\4\1\5\1\6\1\7\2\2\1\10"+
    "\1\2\1\4\1\0\1\11\5\6\1\12\1\6\1\13"+
    "\2\6\1\14\1\15\1\6\4\2\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\50\0\1\6\2\0\3\6"+
    "\5\0\16\6\21\0\1\7\1\0\1\25\35\0\11\26"+
    "\1\27\1\30\33\26\2\0\1\6\2\0\3\6\5\0"+
    "\1\6\1\31\14\6\15\0\1\6\2\0\3\6\5\0"+
    "\5\6\1\32\10\6\15\0\1\6\2\0\3\6\5\0"+
    "\7\6\1\33\6\6\15\0\1\6\2\0\3\6\5\0"+
    "\2\6\1\34\13\6\15\0\1\6\2\0\3\6\5\0"+
    "\1\6\1\35\14\6\53\0\1\24\46\0\1\24\47\0"+
    "\1\24\10\0\1\36\37\0\4\26\1\0\6\26\2\0"+
    "\31\26\2\0\1\6\2\0\3\6\5\0\1\6\1\37"+
    "\14\6\15\0\1\6\2\0\3\6\5\0\7\6\1\40"+
    "\6\6\15\0\1\6\2\0\3\6\5\0\11\6\1\41"+
    "\4\6\15\0\1\6\2\0\3\6\5\0\1\6\1\42"+
    "\14\6\15\0\1\6\2\0\3\6\5\0\6\6\1\43"+
    "\7\6\15\0\1\6\2\0\3\6\5\0\2\6\1\44"+
    "\13\6\14\0\1\45\1\6\2\45\3\6\3\0\2\45"+
    "\16\6\1\46\2\0\1\45\11\0\1\6\2\0\3\6"+
    "\5\0\6\6\1\47\7\6\15\0\1\6\2\0\3\6"+
    "\5\0\4\6\1\32\11\6\15\0\1\6\2\0\3\6"+
    "\5\0\15\6\1\40\15\0\1\6\2\0\3\6\5\0"+
    "\3\6\1\50\12\6\14\0\1\45\1\51\2\45\1\51"+
    "\5\0\2\45\16\51\3\0\1\45\43\0\1\52\13\0"+
    "\1\6\2\0\3\6\5\0\5\6\1\53\10\6\15\0"+
    "\1\6\2\0\3\6\5\0\4\6\1\54\11\6\14\0"+
    "\1\55\1\51\2\55\3\51\3\0\2\55\1\56\5\51"+
    "\1\57\1\51\1\60\2\51\1\61\1\62\1\51\2\0"+
    "\1\63\1\64\1\16\7\0\1\45\1\0\2\45\6\0"+
    "\2\45\21\0\1\45\11\0\1\6\2\0\3\6\5\0"+
    "\12\6\1\40\3\6\15\0\1\6\2\0\3\6\5\0"+
    "\5\6\1\40\10\6\14\0\1\55\1\0\2\55\6\0"+
    "\2\55\21\0\1\55\1\16\7\0\1\55\1\51\2\55"+
    "\3\51\3\0\2\55\1\56\1\65\4\51\1\57\1\51"+
    "\1\60\2\51\1\61\1\62\1\51\2\0\1\63\1\64"+
    "\1\16\7\0\1\55\1\51\2\55\3\51\3\0\2\55"+
    "\1\56\4\51\1\66\1\57\1\51\1\60\2\51\1\61"+
    "\1\62\1\51\2\0\1\63\1\64\1\16\7\0\1\55"+
    "\1\51\2\55\3\51\3\0\2\55\1\56\5\51\1\57"+
    "\1\67\1\60\2\51\1\61\1\62\1\51\2\0\1\63"+
    "\1\64\1\16\7\0\1\55\1\51\2\55\3\51\3\0"+
    "\2\55\1\56\1\51\1\70\3\51\1\57\1\51\1\60"+
    "\2\51\1\61\1\62\1\51\2\0\1\63\1\64\1\16"+
    "\7\0\1\55\1\51\2\55\3\51\3\0\2\55\1\56"+
    "\1\71\4\51\1\57\1\51\1\60\2\51\1\61\1\62"+
    "\1\51\2\0\1\63\1\64\1\16\23\0\1\72\5\0"+
    "\1\73\1\0\1\74\2\0\1\75\1\76\3\0\2\63"+
    "\10\0\1\55\1\0\2\55\6\0\2\55\1\72\5\0"+
    "\1\73\1\0\1\74\2\0\1\75\1\76\3\0\1\63"+
    "\1\64\1\16\7\0\1\55\1\51\2\55\3\51\3\0"+
    "\2\55\1\56\1\77\4\51\1\57\1\51\1\60\2\51"+
    "\1\61\1\62\1\51\2\0\1\63\1\64\1\16\7\0"+
    "\1\55\1\51\2\55\3\51\3\0\2\55\1\56\5\51"+
    "\1\57\1\100\1\60\2\51\1\61\1\62\1\51\2\0"+
    "\1\63\1\64\1\16\7\0\1\55\1\51\2\55\3\51"+
    "\3\0\2\55\1\56\5\51\1\57\1\51\1\60\1\101"+
    "\1\51\1\61\1\62\1\51\2\0\1\63\1\64\1\16"+
    "\7\0\1\55\1\51\2\55\3\51\3\0\2\55\1\56"+
    "\1\102\4\51\1\57\1\51\1\60\2\51\1\61\1\62"+
    "\1\51\2\0\1\63\1\64\1\16\7\0\1\55\1\51"+
    "\2\55\3\51\3\0\2\55\1\56\5\51\1\103\1\51"+
    "\1\60\2\51\1\61\1\62\1\51\2\0\1\63\1\64"+
    "\1\16\24\0\1\104\51\0\1\105\47\0\1\106\40\0"+
    "\1\107\44\0\1\110\30\0\1\55\1\51\2\55\3\51"+
    "\3\0\2\55\1\56\1\51\1\111\3\51\1\57\1\51"+
    "\1\60\2\51\1\61\1\62\1\51\2\0\1\63\1\64"+
    "\1\16\7\0\1\112\1\51\2\112\3\51\3\0\2\112"+
    "\1\56\5\51\1\57\1\51\1\60\2\51\1\61\1\62"+
    "\1\51\1\113\1\0\1\63\1\114\1\16\7\0\1\55"+
    "\1\51\2\55\3\51\3\0\2\55\1\56\5\51\1\115"+
    "\1\51\1\60\2\51\1\61\1\62\1\51\2\0\1\63"+
    "\1\64\1\16\7\0\1\55\1\51\2\55\3\51\3\0"+
    "\2\55\1\56\3\51\1\66\1\51\1\57\1\51\1\60"+
    "\2\51\1\61\1\62\1\51\2\0\1\63\1\64\1\16"+
    "\7\0\1\55\1\51\2\55\3\51\3\0\2\55\1\56"+
    "\4\51\1\66\1\57\1\51\1\60\2\51\1\61\1\62"+
    "\1\100\2\0\1\63\1\64\1\16\24\0\1\116\53\0"+
    "\1\117\47\0\1\120\35\0\1\121\52\0\1\122\23\0"+
    "\1\55\1\51\2\55\3\51\3\0\2\55\1\56\2\51"+
    "\1\123\2\51\1\57\1\51\1\60\2\51\1\61\1\62"+
    "\1\51\2\0\1\63\1\64\1\16\7\0\1\112\1\124"+
    "\2\112\1\124\5\0\2\112\16\124\3\0\1\112\1\16"+
    "\42\0\1\125\12\0\1\112\1\124\2\112\1\124\5\0"+
    "\2\112\1\126\5\124\1\127\1\124\1\130\2\124\1\131"+
    "\1\132\1\124\2\0\1\63\1\114\1\16\7\0\1\55"+
    "\1\51\2\55\3\51\3\0\2\55\1\56\4\51\1\133"+
    "\1\57\1\51\1\60\2\51\1\61\1\62\1\51\2\0"+
    "\1\63\1\64\1\16\25\0\1\134\27\0\1\135\1\0"+
    "\2\135\6\0\2\135\16\0\1\113\2\0\1\135\32\0"+
    "\1\136\43\0\1\105\56\0\1\117\14\0\1\55\1\51"+
    "\2\55\3\51\3\0\2\55\1\56\3\51\1\137\1\51"+
    "\1\57\1\51\1\60\2\51\1\61\1\62\1\51\2\0"+
    "\1\63\1\64\1\16\10\0\1\124\2\0\3\124\5\0"+
    "\1\126\5\124\1\127\1\124\1\130\2\124\1\131\1\132"+
    "\1\124\2\0\2\63\10\0\1\135\1\0\2\135\6\0"+
    "\2\135\21\0\1\135\11\0\1\124\2\0\3\124\5\0"+
    "\1\126\1\140\4\124\1\127\1\124\1\130\2\124\1\131"+
    "\1\132\1\124\2\0\2\63\11\0\1\124\2\0\3\124"+
    "\5\0\1\126\4\124\1\141\1\127\1\124\1\130\2\124"+
    "\1\131\1\132\1\124\2\0\2\63\11\0\1\124\2\0"+
    "\3\124\5\0\1\126\5\124\1\127\1\142\1\130\2\124"+
    "\1\131\1\132\1\124\2\0\2\63\11\0\1\124\2\0"+
    "\3\124\5\0\1\126\1\124\1\143\3\124\1\127\1\124"+
    "\1\130\2\124\1\131\1\132\1\124\2\0\2\63\11\0"+
    "\1\124\2\0\3\124\5\0\1\126\1\144\4\124\1\127"+
    "\1\124\1\130\2\124\1\131\1\132\1\124\2\0\2\63"+
    "\10\0\1\55\1\51\2\55\3\51\3\0\2\55\1\56"+
    "\5\51\1\57\1\100\1\60\1\51\1\100\1\61\1\62"+
    "\1\51\2\0\1\63\1\64\1\16\26\0\1\145\26\0"+
    "\1\135\1\124\2\135\1\124\5\0\2\135\16\124\3\0"+
    "\1\135\31\0\1\146\24\0\1\55\1\51\2\55\3\51"+
    "\3\0\2\55\1\56\4\51\1\100\1\57\1\51\1\60"+
    "\2\51\1\61\1\62\1\51\2\0\1\63\1\64\1\16"+
    "\10\0\1\124\2\0\3\124\5\0\1\126\1\147\4\124"+
    "\1\127\1\124\1\130\2\124\1\131\1\132\1\124\2\0"+
    "\2\63\11\0\1\124\2\0\3\124\5\0\1\126\5\124"+
    "\1\127\1\150\1\130\2\124\1\131\1\132\1\124\2\0"+
    "\2\63\11\0\1\124\2\0\3\124\5\0\1\126\5\124"+
    "\1\127\1\124\1\130\1\151\1\124\1\131\1\132\1\124"+
    "\2\0\2\63\11\0\1\124\2\0\3\124\5\0\1\126"+
    "\1\152\4\124\1\127\1\124\1\130\2\124\1\131\1\132"+
    "\1\124\2\0\2\63\11\0\1\124\2\0\3\124\5\0"+
    "\1\126\5\124\1\153\1\124\1\130\2\124\1\131\1\132"+
    "\1\124\2\0\2\63\30\0\1\154\53\0\1\117\20\0"+
    "\1\124\2\0\3\124\5\0\1\126\1\124\1\155\3\124"+
    "\1\127\1\124\1\130\2\124\1\131\1\132\1\124\2\0"+
    "\2\63\10\0\1\135\1\124\2\135\3\124\3\0\2\135"+
    "\1\126\5\124\1\127\1\124\1\130\2\124\1\131\1\132"+
    "\1\124\1\113\1\0\1\63\1\156\11\0\1\124\2\0"+
    "\3\124\5\0\1\126\5\124\1\157\1\124\1\130\2\124"+
    "\1\131\1\132\1\124\2\0\2\63\11\0\1\124\2\0"+
    "\3\124\5\0\1\126\3\124\1\141\1\124\1\127\1\124"+
    "\1\130\2\124\1\131\1\132\1\124\2\0\2\63\11\0"+
    "\1\124\2\0\3\124\5\0\1\126\4\124\1\141\1\127"+
    "\1\124\1\130\2\124\1\131\1\132\1\150\2\0\2\63"+
    "\31\0\1\117\25\0\1\124\2\0\3\124\5\0\1\126"+
    "\2\124\1\160\2\124\1\127\1\124\1\130\2\124\1\131"+
    "\1\132\1\124\2\0\2\63\10\0\1\135\1\124\2\135"+
    "\1\124\5\0\2\135\1\126\5\124\1\127\1\124\1\130"+
    "\2\124\1\131\1\132\1\124\2\0\1\63\1\156\11\0"+
    "\1\124\2\0\3\124\5\0\1\126\4\124\1\161\1\127"+
    "\1\124\1\130\2\124\1\131\1\132\1\124\2\0\2\63"+
    "\11\0\1\124\2\0\3\124\5\0\1\126\3\124\1\162"+
    "\1\124\1\127\1\124\1\130\2\124\1\131\1\132\1\124"+
    "\2\0\2\63\11\0\1\124\2\0\3\124\5\0\1\126"+
    "\5\124\1\127\1\150\1\130\1\124\1\150\1\131\1\132"+
    "\1\124\2\0\2\63\11\0\1\124\2\0\3\124\5\0"+
    "\1\126\4\124\1\150\1\127\1\124\1\130\2\124\1\131"+
    "\1\132\1\124\2\0\2\63\7\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3952];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\2\11\10\1\1\11\5\1\1\11"+
    "\2\0\1\11\1\0\14\1\2\0\6\1\1\0\5\1"+
    "\2\0\5\1\5\0\5\1\5\0\1\1\3\0\1\1"+
    "\5\0\2\1\1\0\6\1\3\0\6\1\2\0\5\1"+
    "\1\0\1\1\1\0\4\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[114];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
public String lexema;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 198) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { lexema=yytext(); return NaoReconhecido;
            }
          case 13: break;
          case 2: 
            { /* ignora espaço em branco, tabulação e quebra de linha*/
            }
          case 14: break;
          case 3: 
            { lexema=yytext(); return NovaLinha;
            }
          case 15: break;
          case 4: 
            { lexema=yytext(); return ID;
            }
          case 16: break;
          case 5: 
            { lexema=yytext(); return ConstInteira;
            }
          case 17: break;
          case 6: 
            { lexema=yytext(); return DeclaracaoVar;
            }
          case 18: break;
          case 7: 
            { lexema=yytext(); return Op;
            }
          case 19: break;
          case 8: 
            { lexema=yytext(); return OpUnario;
            }
          case 20: break;
          case 9: 
            { lexema=yytext(); return ConstString;
            }
          case 21: break;
          case 10: 
            { lexema=yytext(); return ConstReal;
            }
          case 22: break;
          case 11: 
            { lexema=yytext(); return ListaParam;
            }
          case 23: break;
          case 12: 
            { lexema=yytext(); return Tipo;
            }
          case 24: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
