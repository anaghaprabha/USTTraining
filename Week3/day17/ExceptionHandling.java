
package com.learning.day17;

public class ExceptionHandling {

	public static void main(String[] args) {

		try {
			int arr[] = { 1, 2, 3, 4, 5 };
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			} // ArrayIndexOutofBound Exception

			String str = "abcd";
			String substr = str.substring(2, 2); // StringIndexOutOfBoundsException

			met();
		}

		catch (NumberFormatException e) {

			System.out.println("NumberFormatException Occurred.\n" +e);
			//e.printStackTrace();
		}

		catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("ArrayIndexOutOfBoundsException Occurred.\n"+e);
			//e.printStackTrace();
		}

		catch (StringIndexOutOfBoundsException e) {

			System.out.println("StringIndexOutOfBoundsException Occurred\n"+e);
			//e.printStackTrace();
		}

		catch (Exception e) {

			System.out.println("Exception Occurred, please enter a valid value.\n");
			e.printStackTrace();
		}
		
		finally{
			System.out.println("This is finally block");
		}


	}

	static void met() throws Exception {// allows callers of this method to handle Exception

		String str = "derr";
		int val = Integer.parseInt(str);
		val *= 1.1;
		System.out.println(val);
	} 
}
