package String;

public class findStringWordsAvailableAreMadeFromGivenWord
{
    public static void main(String[] args) {
        String [] allWords={"i","am","the","name","my","know","java"};

        String input="iscriptknowpythonand";

        boolean isAllWordsAvailable=false;

        for(String word:allWords)
        {
            if(input.contains(word))
            {
                input=input.replace(word,"");
            }
        }

        if(input.isEmpty())
        {
            isAllWordsAvailable=true;
        }
        else
        {
            System.out.println("String words not available in array is :    "+input);
        }
        System.out.println(isAllWordsAvailable);

    }
}
