public class employee{
  String name;
  int id;
  double salary;
  public employee(String name,int id,double salary){
    this.name=name;
    this.id=id;
    this.salary=salary;
  }
  public void displayInfo(){
    System.out.println("employee id:" + id);
    System.out.println("employee name:" + name);
    System.out.println("salary:" + salary);

  }
  public static void main(String[] args) {
    employee e=new employee("abc",101,50000);
    e.displayInfo();
  }
}