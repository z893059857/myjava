import java.io.*;
import java.lang.reflect.*;
import java.util.*;
/*
通过反射绕过编译时期泛型的检查
*/
public class ReflectUse2{
	public static void main(String[] args)throws Exception {
		ArrayList<String> al=new ArrayList<String>();
		al.add("a");

		Class<?> clazz=al.getClass();
		Method m=clazz.getMethod("add",Object.class);
		m.invoke(al,1);
		System.out.println(al);
	}
}