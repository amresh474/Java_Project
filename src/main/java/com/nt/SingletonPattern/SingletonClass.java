package com.nt.SingletonPattern;

public class SingletonClass {
	
/*	

What is Singleton class? Have you used Singleton before?
========================================================

Singleton is a class which has only one instance in whole application and provides a 
getInstance() method to access the singleton instance. There are many classes in JDK 
which is implemented using Singleton pattern like java.lang.Runtime which provides getRuntime()
method to get access of it and used to get free memory and total memory in Java.



Which classes are candidates of Singleton? Which kind of class do you make Singleton in Java?
==============================================================================================
Answer : Any class which you want to be available to whole application and whole only one instance
 is viable is candidate of becoming Singleton. One example of this is Runtime class , 
 since on whole java application only one runtime environment can be possible making Runtime 
 Singleton is right decision. Another example is a utility classes like Popup in GUI application, 
 if you want to show popup with message you can have one PopUp class on whole GUI application and 
 anytime just get its instance, and call show() with message.
 
1.)	Java.lang.Runtime with getRuntime() method 
2.)	Java.awt.Toolkit with getDefaultToolkit() 
3.)	Java.awt.Desktop with getDesktop()

	
	How do you prevent for creating another instance of Singleton using clone() method?
	=====================================================================================
			This type of questions generally comes some time by asking how to break singleton
			or when Singleton is not Singleton in Java.

			Answer : Preferred way is not to implement Cloneable interface as why should one
			wants to create clone() of Singleton and if you do just throw Exception from clone() method
			as “Can not create clone of Singleton class”.
			
			
	How do you prevent for creating another instance of Singleton using reflection?
	=================================================================================
Open to all. In my opinion throwing exception from constructor is an option.
Answer: This is similar to previous interview question. Since constructor of Singleton class 
is supposed to be private it prevents creating instance of Singleton from outside but Reflection 
can access private fields and methods, which opens a threat of another instance. 
This can be avoided by throwing Exception from constructor as “Singleton already initialized”

*/
}
