package 考试4;
import java.util.Scanner;
 class Account {
	 private String name;
	 private String sex;
	public Account(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
 interface BankBusiness{
	 void saveMoney(double money);
	 void getMoney(double money);
	 
 }
 class BankCard extends Account implements BankBusiness
 {
     private int number;
	 private double account;

	public BankCard(String name, String sex,double account,int number) {
		super(name, sex);
		this.account = account;
		this.number=number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getAccount() {
		return account;
	}

	public void setAccount(double account) {
		this.account = account;
	}

	public void saveMoney(double money)
	{  
		account=account+money;
		
	}
	public void getMoney(double money)
	{   account=account-money;
		
	} 
	
	 
 }
 class test{
public static void main(String args[])
	{ Scanner scanner=new Scanner(System.in);
        
    BankCard a=new BankCard("张三","男",10000,88888);
    System.out.println("存款人姓名为:"+" "+a.getName()+"\n"+"存款人性别为:"+" "+a.getSex()+"\n"+"存款人的余额为:"+" "+a.getAccount());
    while(true) {
    System.out.println("您可以进行如下操作:"+"\n"+"1.存款"+"\n"+"2.取款"+"\n"+"3.退出"+"\n");
    int n=scanner.nextInt();
    switch(n)
    {case 1:
    
    
   System.out.println("请您输入密码:"+"\n");
   int str=scanner.nextInt();
   if(str==a.getNumber()) {
	   System.out.println("请您输入要存的金额:"+"\n");
	  double m=scanner.nextDouble();
	  a.saveMoney(m);
	  System.out.println("账户余额为:"+a.getAccount()+"\n");}
   else System.out.println("您输入的密码有误"+"\n");
   break;
   case 2:
	   System.out.println("请您输入密码:"+"\n");
	   int str1=scanner.nextInt();
	   if(str1==a.getNumber()) {
		   System.out.println("请您取出要存的金额:"+"\n");
		  double m=scanner.nextDouble();
		  a.getMoney(m);
		  System.out.println("账户余额为:"+a.getAccount()+"\n");}
	   else  System.out.println("您输入的密码有误"+"\n");
	   break;
   case 3:
	   System.out.println("您已经退出"+"\n");  
	   break;
	   
  }
    if (n==3) break;
    }
 
} 
	 
   
}