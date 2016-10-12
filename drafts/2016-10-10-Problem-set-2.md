---
layout: post
title: Problem set 2
date: 16/10/10
---

# Problem set 2
## Playing with variables and loops

## Variables

In Lecture 2, we talked about the different types of variables you can use and how to create variables, through _declaration_ and _initialization_, to store and use data. We also saw that we can use _arithmetic operators_ to add, subtract, multiply and divide numbers together, and the _concatenation operator_ (+) to 'paste' Strings and other variables together into bigger Strings. Let's explore this further!

To get used to Eclipse, I recommend that you create a __new Java project__ for this problem set, and a __new Class file__ for each problem is contains. This will ensure that you repeat and learn the basic program canvas that we discussed in Lecture 1, as we'll be using it throughout the semester. If you aren't sure of how to do this, revisit Lecture 1, where we described how to get set up and run _Hello, world_.

### Warm-up exercises

__Before we jump into larger exercises, let's warm up a bit and use the concepts we've learned in [Variables and arrays](http://www.marccataford.xyz/IntroToProgramming-Fall2016/Lecture-2/) and [Loops and conditional statements](http://www.marccataford.xyz/IntroToProgramming-Fall2016/Lecture-3/). If you are unsure of how to solve one of these small problems, go back to the material to make sure you have a fair understanding of the building blocks at your disposal.__

_Note: Feel free to complete these exercises in a single Class file._

First, let's play with variable and array declaration:

1. Declare and initialize one `int`, one `double`, one `char`, one `boolean` and one `String`. The initial value of those variables should be appropriate to the type. Once they are all initialized, print each variable using `System.out.println`.
2. Try assigning an integer to a `double` variable using '='. If you print the variable, what do you notice? (Is it still an integer?)
3. Try the inverse: assigning a fractional number such as 0.5 to an `int` variable. Is your program allowed to run? What is the error that comes up, if any?
4. Declare an `int` array of length 10 and initialize it using an _array literal_. Print the elements of your array one at a time using _indices_. Remember, you can access the elements of an array _myArray_ by writing _myArray[i]_ where i is a value between 0 and the length of the array minus one.
5. Reinitialize the array as an empty array (using _new type[length]_ as we've seen in class): what happens if you print out the elements of the array again?

### Short exercises

__To better practice the nitty-gritty repetitive structural elements of Java files, try doing each of the following exercises in a different Class file.__

### Temperature conversion

Our first exercise will be to put together a small snippet of code to convert temperatures given in degrees Celsius to degrees Fahrenheit. The general process follows a well-known algorithm that goes as follows:

1. Multiply the value in degrees Celsius by 9;
2. Divide the result by 5;
3. Add 32 – The result is now in degrees Fahrenheit.

Read more about the conversion process [here](https://www.mathsisfun.com/temperature-conversion.html).

1. Before we begin anything, start by creating a new Class file and set up the class / main method structure we have seen in class. If you aren't certain of how to do this, revisit the [Introduction](http://www.marccataford.xyz/IntroToProgramming-Fall2016/Lecture-1/).
2. In programming, documentation is paramount. Use comments (either using // or /* ... */) to outline the steps or sections of your program. It can reflect the algorithm defined above, as well as any details that will be useful to you in planning the code (variable types, for example).
3. What type of variable is appropriate to contain a temperature? Think of the difference between `int` and `double`.
4. The program should take a variable named `degreesCelsius`, and the output should be stored in a variable named `degreesFahrenheit`.
5. Once your program is done running, it should print _neatly_ the initial Celsius value as well as the Fahrenheit value it converted to. _By neatly, I mean that you should mix words and variables using concatenation. If you don't remember how to do this, take a look at [Variables and arrays](http://www.marccataford.xyz/IntroToProgramming-Fall2016/Lecture-2/)._

_If you are stuck starting the problem, use the model [available here](http://www.marccataford.xyz/IntroToProgramming-Fall2016/get-started/TemperatureConversionModel.java)._

### 

