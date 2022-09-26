import java.util.Scanner;
import java.util.regex.*;
public class RegexForPassWord {

     public static void main(String[] args) {
        //password should contain atleast one upper-case, atleast one number, exactly one special character and minimum 8 characters
	Pattern pattern = Pattern.compile("^[A-Z]+[0-9]+[@$&#]{1}\\w{5,}");
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the password");
	String input= sc.next();
	Matcher matcher = pattern.matcher(input);
	boolean matchFound = matcher.find();
	if(matchFound)
	   System.out.println("Valid entry");
	else
	   System.out.println("Invalid entry");
 }
}
