import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

public class ParenthesesChecker {
    //original method passes all the tests at once, but not the required method
   // public static void main(String[] args) {
       // Stack<String> checkParentheses = new Stack<String>();
      //  checkParentheses.push("(nested {mixture)}");
   // }

   // public boolean checkParentheses(String testString) {
       // return true;
   private Stack<Character> testData;

    public ParenthesesChecker(){
        testData = new Stack<>();
    }

    public boolean checkParentheses(String testString) {

        List<Character> openingCharacters = Arrays.asList('(', '{', '[', '<');
        List<Character> closingCharacters = Arrays.asList(')', '}', ']', '>');

        char[] brokenString = testString.toCharArray();

        for (Character character : brokenString){
            if (openingCharacters.contains(character)){
                testData.push(character);
            }
            else if (closingCharacters.contains(character)){

                int indexToCheck = closingCharacters.indexOf(character);

                char correspondingOpeningCharacter = openingCharacters.get(indexToCheck);

                if (testData.isEmpty() || !testData.peek().equals(correspondingOpeningCharacter)) {
                    return false;
                }
                else {
                    testData.pop();
                }
            }
        }

        return testData.isEmpty();
    }





}


    //Stack checker = new Stack();

    //Stack<String> checkParentheses = new Stack<String>();



//}

