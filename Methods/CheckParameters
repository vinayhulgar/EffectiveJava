import java.math.BigInteger;

/*
	Check Parameters For validity
	* Clearly document all restrictions for parameters and enforce them with checks at
	  the beginning of the method body.
	* Helps detect errors as soon as possible after they occur.
	* If an invalid parameter value is passed to a method and the method checks its 
	  parameters before execution, it will fail quickly and cleanly with an appropriate exception.
    * 
*/
public class  CheckParameters{
	public static void main(String[] args) {
		BigInteger n = mod(new BigInteger("-22"));
		System.out.println(n);
	}

	/**
	 * Returns a BigInteger whose value is (this mod m)
	 * 
	 * @param m
	 * @return
	 * @throws ArithmeticException if m is less than or equal to 0
	 */
	public static BigInteger mod (BigInteger m) {
		if(m.signum() < 0) {
			throw new ArithmeticException("Modulus <=0: "+m);
		}
		// Do computation
		return m;
	}
}
