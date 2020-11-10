public class Droid {
    int batteryLevel;
    String name;
    
    public Droid(String droidName){
        name = droidName;
        batteryLevel = 100;
    }

    public void performTask(String task){
        batteryLevel = batteryLevel - 10;
        System.out.println(name + " is performing task: " + task);
    }

    public void energyReport(){
        System.out.println("batteryLevel = " + batteryLevel);

    }

    public String toString(){
        return "Hello, I an a droid named " + name;
    }


    public static void main(String[] args){
        Droid sam = new Droid("Sam");
        System.out.println(sam);
        sam.performTask("dancing");
        sam.performTask("working");
        System.out.println(sam);
        sam.energyReport();

    }


}
