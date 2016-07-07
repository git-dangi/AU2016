/****************************************************************************

* Copyright (c) 2016 by Accolite.com. All rights reserved

*

* Created date :: Jul 7, 2016

*

*  @author :: Monika

* ***************************************************************************

*/
package First;

// TODO: Auto-generated Javadoc
/**
 * The Interface FirstInterface.
 */
public interface FirstInterface {
	
	/**
	 * Adds the.
	 *
	 * @param val1 the val 1
	 * @param Val2 the val 2
	 * @return the integer
	 */
	public Integer add(Integer val1, Integer Val2);
	
	/**
	 * Sub.
	 *
	 * @param val1 the val 1
	 * @param Val2 the val 2
	 * @return the integer
	 */
	public Integer sub(Integer val1, Integer Val2);
	
	/**
	 * Multiply.
	 *
	 * @param val1 the val 1
	 * @param Val2 the val 2
	 * @return the long
	 */
	public long multiply(Integer val1, Integer Val2);
	
	/**
	 * Devide.
	 *
	 * @param val1 the val 1
	 * @param Val2 the val 2
	 * @return the integer
	 * @throws ArithmeticException the arithmetic exception
	 */
	public Integer devide(Integer val1, Integer Val2) throws ArithmeticException;
}
