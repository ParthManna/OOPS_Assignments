public class p2 {
    public static void main(String[] args) {
        String text = null;
        try{
            System.out.println(text.length());
        }catch(NullPointerException e){
            System.out.println("NullPointerException caught: "+e.getMessage());
        }
    }
}
