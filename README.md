This is my first repo!
My name is Moriya Taron Kagan

In this project we made a base convertion calculator
that calculator can show results of summing and multiplying two numbers (of any base from 2 to 16) in any basis the user wants (between 2 to 16)

every number is represented by the following pattern: <number>b<base> , like 2b5 = 2 in base 5, 12bA = 12 in base 10.
the bases 10-16 are represented by the letter A-G, such that A=10,B=11,C=13 etc...
some of the main functions i built and used are:
#"isNumber: The function receives a string and checks whether it is valid according to the format we defined.
#number2Int: The function receives a string that represents a number in the format we defined or in a decimal base and returns its value in a decimal base as an Integer/
#int2Number:The function receives a base and a decimal number which are represented by Integer, and returns as a string the number in the base it received

lets look on some example:

Ex1 class solution:
Enter a string as number#1 (or "quit" to end the program): 
25bG
num1=25bG is number: true value: 37
Enter a string as number#2 (or "quit" to end the program)
113b4
num2=113b4 is number: true value: 23
Enter a base for output: number between 2 to 16
9
25bG + 113b4 = 66b9
25bG * 113b4 = 1145b9
Max number over[25bG, 113b4, 66b9, 1145b9]is: 1145b9

Ex1 class solution:
Enter a string as number#1 (or "quit" to end the program): 
quit
quiting now...

