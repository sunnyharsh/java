package com.BrainMentors.reflection;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class Calc
{
	 //String name;
	 private String name1;
	Calc()
	{
		System.out.println("hello this is constructor...");
	}
	public int add(int x ,int y)
	{
		return x + y;
	}
	public int subtract(int x , int y)
	{
		return x-y;
	}
	
}
class AdvCalc
{
	AdvCalc()
	{
		System.out.println("AdvCalc constructor call...");
	}
	private int power(int x, int y)
	{
		return (int)(Math.pow(x, y));
	}
}
public class CalcDemo 
{
	public static void main(String ar[]) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException 
	{
		System.out.println("class name is AdvCalc and Calc");
		String className=new Scanner(System.in).next();
		System.out.println("class name comes");
		//class name access through package name dot class name
		Object object=Class.forName(className).newInstance();
		System.out.println("Object is "+object);
		System.out.println("enter  method name");
		String methodname=new Scanner(System.in).next();
		Method method=object.getClass().getDeclaredMethod(methodname, int.class, int.class);
		System.out.println("method is " +method);
		method.setAccessible(true);
		Object result=method.invoke(object, 10,20);
		System.out.println("result is " +result);
		String fieldName=new Scanner(System.in).next();
		Field field=object.getClass().getDeclaredField(fieldName);
		field.set(object, "sunny");
		System.out.println("field access here...");
		System.out.println(field.get(object));
	}
}
