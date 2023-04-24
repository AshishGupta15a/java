public class M {
    public static void main(String args[])
    {
        try{
            throw new NullPointerException("tushar out of bounds");
        }
        catch(Exception e){
            System.out.println("Got an exception"+e);
        }
    }
}
