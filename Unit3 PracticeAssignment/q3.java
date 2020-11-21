public class q3{

    public static void main(String[]args){
    }

    public static String convertToBin(int decimal){

        String result = "";

        if(decimal == 0){
            return "0";
        }

        int index = 0;
        while(decimal > 0){    
            result = Integer.toString(decimal%2) + result;    
            decimal = decimal/2;    
        }    

        return result;

    }
}