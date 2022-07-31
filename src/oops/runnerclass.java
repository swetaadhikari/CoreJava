package oops;

public class runnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee E1=new Employee();
		E1.name="Mike";
		E1.empid=12;
		E1.display();
		Employee E2=new Employee("Jack", 11,"ec");
E2.display();


Bank B=new Bank();
int Bal=B.GetBalance();
System.out.println(Bal);

//overrrloading ex


OverloadingEx obj= new OverloadingEx();
obj.GetArea(2, 4);


//overrriding ex

Browser br= new Chrome();
br.CloseBrowser();
br.OpenBrowser();

Chrome ch= new Chrome();
ch.CloseBrowser();
ch.OpenBrowser();
ch.show();


HondaCar car1=new HondaCar();
CarInterface car2=new HondaCar();


//encapsulation

Encapsulation en=new Encapsulation();
en.setBalance(100);
System.out.println(en.getBalance());
en.getBalance();
	}

}
