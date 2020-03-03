import java.util.*;
/**
 * 浅克隆
 */
public class ShallowCopy implements Cloneable {


    private Date date;

    public Date getDate(){
        return this.date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public Object clone() {
        Object obj = null;

        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }

    public static void main(String[] args) {
        ShallowCopy shallowCopy = new ShallowCopy();
        shallowCopy.setDate(new Date());

        ShallowCopy obj  = (ShallowCopy)shallowCopy.clone();
        System.out.println(shallowCopy.hashCode() + ": " + obj.hashCode());
        System.out.println(shallowCopy.getClass() + ": " + obj.getClass());
        System.out.println(shallowCopy.getDate() + ": " + obj.getDate());
        System.out.println(shallowCopy.getDate().hashCode() + ": " + obj.getDate().hashCode());
    }


}