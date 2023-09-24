Matriculation number: 7216655

# Java-Home-tasks
Problem 1: Language Basics 
Readings: Language Basics: Variables, Operators, Expressions, Statements, and Blocks 
Look at the code below which calculates the radius of a circle in feet and inches, given that the 
circle has a given area. Download source (JAVA). 
public class MathCalc
{ 
public static void main(String[] args)
{ 
double radius = 0.0;
double circleArea = 100.0;
int feet = 0;
int inches = 0;
radius = Math.sqrt(circleArea/Math.PI);
feet = (int)Math.floor(radius);
inches = (int)Math.round(12.0*(radius - feet));
System.out.println("The radius of a circle with area" +
circleArea 
+ " square feet is\n " + feet + " feet " + inches + "
inches"); 
}
}

The diameter of the Sun is approximately 865,000 miles. The diameter of the Earth is 
approximately 7600 miles. Use the methods in the class Math to calculate, 
(a) the volume of the Earth in cubic miles 
(b) the volume of the Sun in cubic miles 
(c) the ratio of the volume of the Sun to the volume of the Earth 
and then output the three values. Treat both the earth and sun as spheres. The volume of a 
sphere is given by the formula 4 pi r^3/3 where r is the radius. 
Run the code you have written, and turn in both your code and the output of the program.
The output should say something like: 
The volume of the Earth is X cubic miles, the volume of the sun is Y cubic miles, and the ratio of the volume of the Sun to the volume of the Earth is Z. 
