

/**
 * super用法
 */
public class SuperUsage{
    class Country{
        String name;
        void value() {
            name = "China";
        }
    }
    class City extends Country {
        String name;
        void value() {
            name = "Hefei";
            super.value();
            System.out.println(name);
            System.out.println(super.name);
        }
    }
    public static void main(String[] args) {
        City c = new SuperUsage().new City();
        c.value();
    }
}

