
import java.util.*;

public class DeepCopy implements Cloneable{
    private Date date;

    public Date getDate(){
        return this.date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public Object clone() {
        DeepCopy obj = null;

        try {
            obj = (DeepCopy)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        obj.setDate((Date)obj.getDate().clone());
        return obj;
    }

    public static void main(String[] args) {
        DeepCopy deepCopy = new DeepCopy();
        deepCopy.setDate(new Date());

        DeepCopy obj  = (DeepCopy)deepCopy.clone();
        System.out.println(deepCopy.hashCode() + ": " + obj.hashCode());
        System.out.println(deepCopy.getClass() + ": " + obj.getClass());
        System.out.println(deepCopy.getDate() + ": " + obj.getDate());
        System.out.println(deepCopy.getDate().hashCode() + ": " + obj.getDate().hashCode());
    }

}

