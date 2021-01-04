package ����4;
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
        
    BankCard a=new BankCard("����","��",10000,88888);
    System.out.println("���������Ϊ:"+" "+a.getName()+"\n"+"������Ա�Ϊ:"+" "+a.getSex()+"\n"+"����˵����Ϊ:"+" "+a.getAccount());
    while(true) {
    System.out.println("�����Խ������²���:"+"\n"+"1.���"+"\n"+"2.ȡ��"+"\n"+"3.�˳�"+"\n");
    int n=scanner.nextInt();
    switch(n)
    {case 1:
    
    
   System.out.println("������������:"+"\n");
   int str=scanner.nextInt();
   if(str==a.getNumber()) {
	   System.out.println("��������Ҫ��Ľ��:"+"\n");
	  double m=scanner.nextDouble();
	  a.saveMoney(m);
	  System.out.println("�˻����Ϊ:"+a.getAccount()+"\n");}
   else System.out.println("���������������"+"\n");
   break;
   case 2:
	   System.out.println("������������:"+"\n");
	   int str1=scanner.nextInt();
	   if(str1==a.getNumber()) {
		   System.out.println("����ȡ��Ҫ��Ľ��:"+"\n");
		  double m=scanner.nextDouble();
		  a.getMoney(m);
		  System.out.println("�˻����Ϊ:"+a.getAccount()+"\n");}
	   else  System.out.println("���������������"+"\n");
	   break;
   case 3:
	   System.out.println("���Ѿ��˳�"+"\n");  
	   break;
	   
  }
    if (n==3) break;
    }
 
} 
	 
   
}