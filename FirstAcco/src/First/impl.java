package First;

import java.util.Scanner;

public class impl implements FirstInterface {

	@Override
	public Integer add(Integer val1, Integer val2) {
		// TODO Auto-generated method stub
		
		return val1+val2;
	}

	@Override
	public Integer sub(Integer val1, Integer val2) {
		// TODO Auto-generated method stub
		return  val1-val2;
	}

	@Override
	public long multiply(Integer val1, Integer val2) {
		// TODO Auto-generated method stub
		return val1*val2;
	}

	@Override
	public Integer devide(Integer val1, Integer val2) throws ArithmeticException {
		// TODO Auto-generated method stub
		return val1/val2;
	}




public static void main(String[] args)
{	impl obj= new impl();
	Integer val1, val2, choice;
	Scanner input =new Scanner (System.in);
	System.out.println("This is my first java project");
	
	System.out.println("Enter your val1");
	val1=input.nextInt();
	System.out.println("Enter your val2");
	val2=input.nextInt();
	System.out.println("Enter your choice 1 for add, 2 for sub, 3 for multiply, 4 for devide");
	choice =input.nextInt();
	switch(choice)
	{	case 1:
			System.out.println(obj.add(val1,val2));
			break;
		case 2:
			System.out.println(obj.sub(val1,val2));
			break;
		case 3:
			System.out.println(obj.multiply(val1,val2));
			break;
		case 4:
			try{
				System.out.println(obj.devide(val1,val2));
			}catch (ArithmeticException e) {
				System.out.println("devide exception");
			}
				break;
		}		
	
	
}
}