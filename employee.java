public class employee{
  String name;
  int id;
  double salary;
  String addr;
  public employee(String name,int id,double salary,String addr){
    this.name=name;
    this.id=id;
    this.salary=salary;
    this.addr=addr;
  }
  public void displayInfo(){
    System.out.println("employee id:" + id);
    System.out.println("employee name:" + name);
    System.out.println("salary:" + salary);
    System.out.println("addresss: "+addr);

  }
  public static void main(String[] args) {
    employee e=new employee("abc",101,50000,"Dharwad");
    e.displayInfo();
  }
}