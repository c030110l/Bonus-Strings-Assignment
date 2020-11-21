public class q2{
    public static void main(String[]args){

    }
    public static boolean checkpalindrome(String a){
        /*
        Amy,	must	I	jujitsu	my	ma?

         */

        if(a.equals("")){
            return false;
        }

        String letterOnly = "";
        String achar = "";
        for (int i=0; i < a.length(); i++){

            if(Character.isLetter(a.charAt(i))){

                achar = a.substring(i, i+1);
                letterOnly += achar.toLowerCase();

            }
        }
        System.out.println(letterOnly);

        for(int i=0; i < letterOnly.length()/2; i++){

            if(letterOnly.charAt(i)!=letterOnly.charAt(letterOnly.length()-i-1)){
                return false;

            }
        }
        return true;

    }
}

