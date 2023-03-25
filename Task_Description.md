# Java_Task
This is the description of the process in which I did my Java Task .  
My Java Progam consists of four files named:  
1.Student  
2.GraduateStudent  
3.Main  
4.Main1  
1.**Student**: This class consists of three attributes - name(String) , id(integer) , courses(Array of Strings)  
This class consists of a constructor called Student which takes in name and id as inputs and initializes the values.  
Since the attributes are addressed 'private' , Get and Set methods are used to obtain the values in other classes and so , the respective code lines are written.  
The addcourse method enables to add couses to the student profile   
The printinfo method prints the name, id and the courses enrolled by the student  

2.**GraduateStudent**: This class extends from the student class  
This class has it's own variable called researcharea which gives the research area of the student.  
Get and Set methods are used to obtain it on other classes.  
The method graduatestudent takes name,id from student class and research area and initializes the attributes  
The printinfo method has been adopted fro the student class and is used to print the research area of the student  

3.**Main**: This class lets the user do three functions which are - to add a new curse , to print the details of the student , quit form the code.  
This happens by allowing to user to choose an option and perform the function based on it using the switch method.  

4.**Main1**: This class depicts the basic functions that can be done through student and graduatestudent classes by using getter and setter methods.  
It also shows a set of functions that can be performed when the class. is typed.  
Main and Main1 are two entirely different classes and the variables in them are completely independent of each other.  
