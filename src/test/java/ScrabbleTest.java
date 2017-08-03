import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class ScrabbleTest{

  @Test
  public void calculateScore_returnsScoreForSingleLetter_1(){
    Scrabble testScrabble=new Scrabble();
    Integer expected=1;
    assertEquals(expected, testScrabble.calculateScore("a"));
  }
  //test to return 2 for letter D
@Test
  public void calculateScore_returnsTwoForLetterD_2(){
    Scrabble testScrabble=new Scrabble();
    Integer expected=2;
  //  List<String> two=newArrayList<String>("d","g")
  //  String two []= {"d","g"};
    assertEquals(expected, testScrabble.calculateScore("d"));
  }

  //test to return 3 for letter B
  @Test
  public void calculateScore_returnsTwoForLetterB_3(){
    Scrabble testScrabble=new Scrabble();
    Integer expected=3;
    assertEquals(expected, testScrabble.calculateScore("b"));
  }

  //test to return 4 for letter F
  @Test
  public void calculateScore_returnsTwoForLetterF_4(){
    Scrabble testScrabble=new Scrabble();
    Integer expected=4;
    assertEquals(expected, testScrabble.calculateScore("f"));
  }
  //test to return 5 for letter K
  @Test
  public void calculateScore_returnsFiveForLetterK_5(){
    Scrabble testScrabble=new Scrabble();
    Integer expected=5;
    assertEquals(expected, testScrabble.calculateScore("k"));
  }
@Test
public void calculateScore_returnsEightForLetterJ_8(){
  Scrabble testScrabble=new Scrabble();
  Integer expected=8;
  assertEquals(expected, testScrabble.calculateScore("j"));
}
@Test
public void calculateScore_returnsTenIfLetterIsQ_10(){
  Scrabble testScrabble=new Scrabble();
  Integer expected=10;
  assertEquals(expected, testScrabble.calculateScore("q"));
}
@Test
public void calculateScoreForActualWord_33(){
  Scrabble testScrabble=new Scrabble();
  Integer expected=33;
  assertEquals(expected, testScrabble.calculateScore("adbfkjq"));
}
@Test
public void calculateScore_aeiou_5(){
  Scrabble testScrabble=new Scrabble();
  Integer expected=5;
  assertEquals(expected, testScrabble.calculateScore("eeeaa"));
}
@Test
public void calculateScore_alphabet_9(){
  Scrabble testScrabble=new Scrabble();
  Integer expected=87;
  assertEquals(expected, testScrabble.calculateScore("qwertyiopasdfghjklzxcvbnmu"));
}
}
