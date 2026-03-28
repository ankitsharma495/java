abstract class Employee{
    private String name;
    private int id;

    public Employee(String name , int id){

        this.name = name;
        this.id = id;

    }

    public int get_Id(){
        return id;

    }
    public String get_name(){
        return name;
    }

    public abstract double calculateSalary();
    @override
    public String toString(){
        return "Employee[name = "+name", id="+id", salary ="+calculateSalary()"]"
    }

}

class FullTimeEmployee extends Employee{
    private double monthlySalary;

    public FullTImeEmployee(String name , int id , double monthlySalary){
        super(name , id);  
        this.monthlySalary = monthlySalary;
    }
    @Override
    public double calculateSalary(){
        return monthlySalary;
    }

}

class PartTime extends Employee{

    public int hourlyRate;
    public int hours;

    public PartTime(String name , int id , int hourlyRate , int hours){
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hours = hours;

    }

    @Override
    public double calculateSalary(){
        return hourlyRate*hours;


    }


}



class Main{
    public static void main(String[] args) {
        
    }
}