// DO NOT EDIT
// Generated by JFlex 1.9.1 http://jflex.de/
// source: src/Analizadores/lexer.jflex

package Analizadores;
import java_cup.runtime.Symbol;
import java_cup.runtime.*;


@SuppressWarnings("fallthrough")
public class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
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
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\36\u0200\1\u0300\267\u0200\10\u0400\u1020\u0200";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\4\22\0\1\5\1\6"+
    "\1\7\4\0\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\12\21\1\0\1\22\1\23\1\24"+
    "\1\25\2\0\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\2\37\1\40\1\37\1\41\1\42"+
    "\2\37\1\43\1\44\1\45\1\46\5\37\1\47\1\50"+
    "\1\51\1\0\1\37\1\0\1\26\1\52\1\30\1\31"+
    "\1\32\1\53\1\34\1\35\1\36\2\37\1\40\1\37"+
    "\1\54\1\42\2\37\1\55\1\44\1\56\1\46\5\37"+
    "\1\57\1\60\1\61\7\0\1\3\252\0\2\62\115\0"+
    "\1\63\u01a8\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1280];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\3\1\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\10\20\1\21\1\22\1\23\1\24\2\1\1\25"+
    "\1\0\1\26\2\0\1\27\2\0\1\30\1\0\1\31"+
    "\1\32\1\33\7\20\3\0\1\34\4\20\1\35\2\20"+
    "\1\35\1\0\1\36\1\37\1\40\2\20\1\0\1\20"+
    "\1\0\1\41\1\20\2\42\1\20\1\0\1\43\2\44";

  private static int [] zzUnpackAction() {
    int [] result = new int[83];
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
    "\0\0\0\64\0\150\0\64\0\234\0\320\0\u0104\0\64"+
    "\0\64\0\64\0\64\0\64\0\64\0\u0138\0\u016c\0\64"+
    "\0\u01a0\0\u01d4\0\u0208\0\u023c\0\u0270\0\u02a4\0\u02d8\0\u030c"+
    "\0\u0340\0\u0374\0\u03a8\0\64\0\64\0\64\0\64\0\u03dc"+
    "\0\u0410\0\64\0\320\0\64\0\u0444\0\u0104\0\64\0\u0478"+
    "\0\u04ac\0\u04e0\0\u0514\0\64\0\64\0\64\0\u0548\0\u057c"+
    "\0\u05b0\0\u05e4\0\u0618\0\u064c\0\u0680\0\u06b4\0\u06e8\0\u071c"+
    "\0\u0514\0\u0750\0\u0784\0\u07b8\0\u07ec\0\u023c\0\u0820\0\u0854"+
    "\0\64\0\u0888\0\64\0\u023c\0\u023c\0\u08bc\0\u08f0\0\u0924"+
    "\0\u0958\0\u098c\0\u023c\0\u09c0\0\u023c\0\64\0\u09f4\0\u0a28"+
    "\0\u023c\0\u023c\0\64";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[83];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\0\2\3\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\2\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\24\1\30\2\24\1\31\5\24\1\32\1\33"+
    "\1\24\1\34\1\2\1\35\1\25\1\30\2\24\1\33"+
    "\1\36\1\2\1\37\1\40\1\41\65\0\1\3\2\0"+
    "\2\3\102\0\1\42\37\0\7\43\1\44\40\43\1\45"+
    "\13\43\10\46\1\47\37\46\1\50\13\46\13\0\1\51"+
    "\4\0\1\52\62\0\1\53\1\0\1\17\66\0\1\54"+
    "\63\0\1\55\63\0\1\56\60\0\1\24\4\0\21\24"+
    "\3\0\5\24\26\0\1\24\4\0\14\24\1\57\4\24"+
    "\3\0\5\24\26\0\1\24\4\0\7\24\1\60\11\24"+
    "\3\0\5\24\26\0\1\24\4\0\14\24\1\61\4\24"+
    "\3\0\5\24\26\0\1\24\4\0\1\62\20\24\3\0"+
    "\5\24\26\0\1\24\4\0\13\24\1\63\5\24\3\0"+
    "\2\24\1\63\2\24\26\0\1\24\4\0\17\24\1\64"+
    "\1\24\3\0\4\24\1\64\26\0\1\24\4\0\15\24"+
    "\1\65\3\24\3\0\3\24\1\65\1\24\46\0\1\66"+
    "\12\0\1\66\54\0\1\67\10\0\1\67\14\0\2\43"+
    "\37\0\1\43\1\0\5\43\14\0\2\46\37\0\1\46"+
    "\1\0\5\46\5\0\13\51\1\70\50\51\2\52\3\0"+
    "\57\52\5\0\1\71\13\0\1\71\36\0\1\71\24\0"+
    "\1\24\4\0\14\24\1\72\4\24\3\0\5\24\26\0"+
    "\1\24\4\0\1\73\20\24\3\0\5\24\26\0\1\24"+
    "\4\0\20\24\1\74\3\0\5\24\26\0\1\24\4\0"+
    "\12\24\1\75\6\24\3\0\5\24\26\0\1\24\4\0"+
    "\17\24\1\76\1\24\3\0\4\24\1\76\26\0\1\24"+
    "\4\0\15\24\1\77\3\24\3\0\3\24\1\77\1\24"+
    "\26\0\1\24\4\0\20\24\1\100\3\0\5\24\52\0"+
    "\1\101\10\0\1\101\50\0\1\102\11\0\1\102\6\0"+
    "\20\51\1\103\43\51\21\0\1\24\4\0\12\24\1\104"+
    "\6\24\3\0\5\24\26\0\1\24\4\0\15\24\1\105"+
    "\3\24\3\0\3\24\1\105\1\24\26\0\1\24\4\0"+
    "\1\24\1\106\17\24\3\0\1\106\4\24\26\0\1\24"+
    "\4\0\16\24\1\107\2\24\3\0\5\24\4\0\1\110"+
    "\21\0\1\24\4\0\10\24\1\111\10\24\3\0\5\24"+
    "\3\0\1\112\22\0\1\24\4\0\4\24\1\113\14\24"+
    "\3\0\5\24\43\0\1\112\23\0\1\112\22\0\1\24"+
    "\4\0\12\24\1\114\6\24\3\0\5\24\26\0\1\24"+
    "\4\0\4\24\1\115\14\24\3\0\5\24\37\0\1\116"+
    "\52\0\1\24\4\0\13\24\1\117\5\24\3\0\2\24"+
    "\1\117\2\24\46\0\1\120\12\0\1\120\30\0\1\24"+
    "\4\0\4\24\1\121\14\24\3\0\5\24\26\0\1\24"+
    "\4\0\6\24\1\122\12\24\3\0\5\24\41\0\1\123"+
    "\27\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[2652];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\3\1\6\11\2\1\1\11"+
    "\13\1\4\11\2\1\1\11\1\0\1\11\2\0\1\11"+
    "\2\0\1\1\1\0\3\11\7\1\3\0\10\1\1\11"+
    "\1\0\1\11\4\1\1\0\1\1\1\0\3\1\1\11"+
    "\1\1\1\0\2\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[83];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
      yyline = 1; 
    yychar = 1; 
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
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
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
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
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
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
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { System.out.println("Error léxico: " + yytext() + ", línea: " + yyline + ", columna: " + yychar);
            }
          // fall through
          case 37: break;
          case 2:
            { 
            }
          // fall through
          case 38: break;
          case 3:
            { yyline++; yychar = 1;
            }
          // fall through
          case 39: break;
          case 4:
            { return new Symbol(sym.PARL,yyline,yychar, yytext());
            }
          // fall through
          case 40: break;
          case 5:
            { return new Symbol(sym.PARD,yyline,yychar, yytext());
            }
          // fall through
          case 41: break;
          case 6:
            { return new Symbol(sym.MULTIPLICACION, yyline, yychar, yytext());
            }
          // fall through
          case 42: break;
          case 7:
            { return new Symbol(sym.SUMA, yyline, yychar, yytext());
            }
          // fall through
          case 43: break;
          case 8:
            { return new Symbol(sym.COMA,yyline,yychar, yytext());
            }
          // fall through
          case 44: break;
          case 9:
            { return new Symbol(sym.RESTA, yyline, yychar, yytext());
            }
          // fall through
          case 45: break;
          case 10:
            { return new Symbol(sym.DIVISION, yyline, yychar, yytext());
            }
          // fall through
          case 46: break;
          case 11:
            { return new Symbol(sym.ENTERO,yyline,yychar, yytext());
            }
          // fall through
          case 47: break;
          case 12:
            { return new Symbol(sym.PTCOMA,yyline,yychar, yytext());
            }
          // fall through
          case 48: break;
          case 13:
            { return new Symbol(sym.MENOR, yyline, yychar, yytext());
            }
          // fall through
          case 49: break;
          case 14:
            { return new Symbol(sym.ASIGNACION, yyline, yychar, yytext());
            }
          // fall through
          case 50: break;
          case 15:
            { return new Symbol(sym.MAYOR, yyline, yychar, yytext());
            }
          // fall through
          case 51: break;
          case 16:
            { return new Symbol(sym.ID,yyline,yychar, yytext());
            }
          // fall through
          case 52: break;
          case 17:
            { return new Symbol(sym.CORL,yyline,yychar, yytext());
            }
          // fall through
          case 53: break;
          case 18:
            { return new Symbol(sym.CORD,yyline,yychar, yytext());
            }
          // fall through
          case 54: break;
          case 19:
            { return new Symbol(sym.LLAVL,yyline,yychar, yytext());
            }
          // fall through
          case 55: break;
          case 20:
            { return new Symbol(sym.LLAVD,yyline,yychar, yytext());
            }
          // fall through
          case 56: break;
          case 21:
            { return new Symbol(sym.DIFERENTE, yyline, yychar, yytext());
            }
          // fall through
          case 57: break;
          case 22:
            { return new Symbol(sym.CADENA,yyline,yychar, yytext());
            }
          // fall through
          case 58: break;
          case 23:
            { return new Symbol(sym.CARACTER,yyline,yychar, yytext());
            }
          // fall through
          case 59: break;
          case 24:
            { /* Ignorar comentarios de una línea */
            }
          // fall through
          case 60: break;
          case 25:
            { return new Symbol(sym.MENOR_IGUAL, yyline, yychar, yytext());
            }
          // fall through
          case 61: break;
          case 26:
            { return new Symbol(sym.IGUALDAD, yyline, yychar, yytext());
            }
          // fall through
          case 62: break;
          case 27:
            { return new Symbol(sym.MAYOR_IGUAL, yyline, yychar, yytext());
            }
          // fall through
          case 63: break;
          case 28:
            { return new Symbol(sym.DECIMAL,yyline,yychar, yytext());
            }
          // fall through
          case 64: break;
          case 29:
            { return new Symbol(sym.INT, yyline, yychar, yytext());
            }
          // fall through
          case 65: break;
          case 30:
            { /* Ignorar comentarios multilínea */
            }
          // fall through
          case 66: break;
          case 31:
            { return new Symbol(sym.BOOL, yyline, yychar, yytext());
            }
          // fall through
          case 67: break;
          case 32:
            { return new Symbol(sym.CHAR, yyline, yychar, yytext());
            }
          // fall through
          case 68: break;
          case 33:
            { return new Symbol(sym.TRUE, yyline, yychar, yytext());
            }
          // fall through
          case 69: break;
          case 34:
            { return new Symbol(sym.FALSE, yyline, yychar, yytext());
            }
          // fall through
          case 70: break;
          case 35:
            { return new Symbol(sym.DOUBLE, yyline, yychar, yytext());
            }
          // fall through
          case 71: break;
          case 36:
            { return new Symbol(sym.STRING, yyline, yychar, yytext());
            }
          // fall through
          case 72: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}