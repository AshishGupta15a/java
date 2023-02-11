class box
{
    private int length,breadth,height;
    public void setDimension(int l,int b, int h)
    {
        length=l;
        breadth=b;
        height=h;
    }
    public void showDimension()
    {
        System.out.println("L=" +length);
        System.out.println("B=" +breadth);
        System.out.println("H=" +height);
    }
}
class Example
{
    public static void main()
    {
        box smallbox=new box();
        smallbox.setDimension(12,10,5);
        smallbox.showDimension();
        smallbox=new box();
        smallbox.showDimension();
    }
}