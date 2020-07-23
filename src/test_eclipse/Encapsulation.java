package test_eclipse;

public class Encapsulation {

    private String name;
    public String getName() {
        return name;
    }
        public void setName(String name){
        this.name=name;
        //class Demo;
    }

public static void main(String[] args) {
    Encapsulation e=new Encapsulation();
    e.setName("Harry");
    System.out.println(e.getName());
}


}
