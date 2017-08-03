import java.util.List;
import java.util.Arrays;

public class Scrabble{
//declare arrays to hold the letters
List oneArray=Arrays.asList("a","e","i","o","u","l","n","r","s","t");
List twoArray=Arrays.asList("d","g");
List threeArray=Arrays.asList("b","c", "m","p");
List fourArray=Arrays.asList("f","h", "v", "w", "y");
List fiveArray=Arrays.asList("k");
List sixArray=Arrays.asList("j", "x");
List sevenArray=Arrays.asList("q", "z");

Integer counter=0;
public Integer calculateScore(String letter){
String[] word=letter.split("");
for(int i=0;i<word.length;i++){
String checkLetter=word[i];
if(twoArray.contains(checkLetter))
 //letter=="d")
 {
  counter+=2;
}else if(oneArray.contains(checkLetter)){
    counter+=1;
}
else if(threeArray.contains(checkLetter))
{
  counter+=3;
}
else if (fourArray.contains(checkLetter)){
  counter+=4;
}
else if(fiveArray.contains(checkLetter)){
  counter+=5;
}
else if(sixArray.contains(checkLetter)){
  counter+=8;
}
else if(sevenArray.contains(checkLetter)){
  counter+=10;
}
else {
  return counter=0;
}
}
return counter;
}
}
