public class p3 {
    public static void main(String[] args){
        String a = "abc";
        try{
            System.out.println(Integer.parseInt(a));
        }catch(NumberFormatException e){
            System.out.println("NumberFormatException caught: "+ e.getMessage());
        }
    }    
}
