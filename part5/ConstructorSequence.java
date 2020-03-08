
public class ConstructorSequence {
    class Base {
        int i ;
        Base() {
            add(1);
            System.out.println(i);
        }
        void add(int v) {
            i += v;
            System.out.println(i);
        }
        void print() {
            System.out.println(i);
        }
    }
    class MyBase extends Base{
        MyBase() {
            add(2);
        }
        void add(int v) {
            i += v * 2;
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        ConstructorSequence c = new ConstructorSequence();
        MyBase myBase = c.new MyBase();
        go(myBase);
        
    }
    
    static void go(Base b) {
        b.add(8);
    }





    


    // 输入结果: 2, 2, 6, 22
}