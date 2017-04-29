package design;

/**
 * Created by mdislam on 4/25/17.
 */
public abstract class UnEmployee implements Employee{

    private String name;
    private String address;
    private int number;

    public abstract double computePay();
    public void unEmployeeName(){
        //this.name = name;
        this.name="Mithu";
        System.out.println(this.name);

    }
    public void unMethod(){
        System.out.println("This method come from unemployee class");
    }
}
