package clone;

/**
 * Created by  伍运星  on   2016/3/1.
 */

public class Apple implements Cloneable{
    private String name;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public Object clone(){
        Apple apple = null;
        try {
            apple = (Apple)super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return apple;
    }

    public static void main(String[] args) {
        Apple apple = new Apple();
        Address address = new Address();
        address.setName("广西");
        apple.setName("红富士");
        apple.setAddress(address);
        Apple apple1 = (Apple)apple.clone();
        apple1.setName("黑天鹅");
        Apple apple2 = apple1;
        System.out.println("apple:"+apple.getName()+" address:"+apple.getAddress().getName());
        System.out.println("apple1:"+apple1.getName()+" address:"+apple1.getAddress().getName());
        System.out.println("apple2:"+apple2.getName()+" address:"+apple2.getAddress().getName());
        address.setName("广东");
        System.out.println("apple:"+apple.getName()+" address:"+apple.getAddress().getName());
        System.out.println("apple1:"+apple1.getName()+" address:"+apple1.getAddress().getName());
        System.out.println("apple2:"+apple2.getName()+" address:"+apple2.getAddress().getName());

    }
}
