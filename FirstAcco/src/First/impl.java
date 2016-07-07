/****************************************************************************

* Copyright (c) 2016 by Accolite.com. All rights reserved

*

* Created date :: Jul 7, 2016

*

*  @author :: Monika

* ***************************************************************************

*/
package First;

import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class impl.
 */
public class impl implements FirstInterface {

	/* (non-Javadoc)
	 * @see First.FirstInterface#add(java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public Integer add(Integer val1, Integer val2) {
		// TODO Auto-generated method stub
		
		return val1+val2;
	}

	/* (non-Javadoc)
	 * @see First.FirstInterface#sub(java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public Integer sub(Integer val1, Integer val2) {
		// TODO Auto-generated method stub
		return  val1-val2;
	}

	/* (non-Javadoc)
	 * @see First.FirstInterface#multiply(java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public long multiply(Integer val1, Integer val2) {
		// TODO Auto-generated method stub
		return val1*val2;
	}

	/* (non-Javadoc)
	 * @see First.FirstInterface#devide(java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public Integer devide(Integer val1, Integer val2) throws ArithmeticException {
		// TODO Auto-generated method stub
		return val1/val2;
	}




/**
 * The main method.
 *
 * @param args the arguments
 */
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