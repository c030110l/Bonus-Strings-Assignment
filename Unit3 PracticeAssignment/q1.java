public class q1{
    public static void main(String[]args){
        ppap("I have a pen, I have a apple.");
        ppap("I have a car, I have a toy.");
        ppap("I have a phone, I have a flip.");
    }

    public static String ppap(String str){
        int comma= str.indexOf(","); //end index of the first object
        int lastSpace=str.lastIndexOf(" ");// beginning index of the second object
        String object1= str.substring(9,str.indexOf(","));
        String object2= str.substring(lastSpace+1, str.length()-1);
        return "Uh! " + object2.substring(0,1).toUpperCase()+object2.substring(1)+ " " + object1.substring(0,1).toUpperCase()+object1.substring(1);
    }
}

