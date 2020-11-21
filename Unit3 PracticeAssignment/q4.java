public class q4{

    public static void main(String[]args){

    }
    public static String toAy(String input){
        String result = "";
        if(input.length() <= 2){
            return input;
        }
        else{

            return input.substring(1,input.length()) + input.substring(0,1)+"ay";

        }

    }
}