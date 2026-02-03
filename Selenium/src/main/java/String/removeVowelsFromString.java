package String;

public class removeVowelsFromString {

    public static void main(String[] args) {
        String name="programming is must";

        String fname="";

        for(int i=0; i<name.length(); i++)
        {
            if(name.charAt(i)!='a'&& name.charAt(i)!='e'&&name.charAt(i)!='i'&&name.charAt(i)!='o'&&name.charAt(i)!='u'
            )
            {
                fname=fname+name.charAt(i);

            }


        }
        System.out.println(fname);
    }
}
