import java.util.*;

public class Test{
	public static void main(String[] args){
		String hello = "Hello World";
		char[] temp = new char[hello.length];
		for(int i = 0; i < hello.length; ++i){
			temp[i] = hello.charAt(i) ^ 0xffff;
			
		}
		System.out.println(temp);
	}
}