
package javaapplication15;


class Sum
{
    int a=10,b=20,c;
    void add()
    {
        c=a+b;
    }
    void display()
    {
        System.out.print(c);
    }
}
class Result extends Sum
{
    Result()
    {
        super();
    }
      @Override
      void add(){
          super.add();
      }
}
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Result obj=new Result();
        obj.add();
        obj.display();
    }
    
}
