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

### Shorter exercises

__Before we jump into larger exercises, let's warm up a bit and use the concepts we've learned in [Variables and arrays](http://www.marccataford.xyz/IntroToProgramming-Fall2016/Lecture-2/) and [Loops and conditional statements](http://www.marccataford.xyz/IntroToProgramming-Fall2016/Lecture-3/). If you are unsure of how to solve one of these small problems, go back to the material to make sure you have a fair understanding of the building blocks at your disposal.__

_Note: Feel free to complete these exercises in a single Class file._

First, let's play with variable and array declaration:

1. Declare and initialize one `int`, one `double`, one `char`, one `boolean` and one `String`. The initial value of those variables should be appropriate to the type. Once they are all initialized, print each variable using `System.out.println`.
2. Try assigning an integer to a `double` variable using '='. If you print the variable, what do you notice? (Is it still an integer?)
3. Try the inverse: assigning a fractional number such as 0.5 to an `int` variable. Is your program allowed to run? What is the error that comes up, if any?
4. Declare an `int` array of length 10 and initialize it using an _array literal_. Print the elements of your array one at a time using _indices_. Remember, you can access the elements of an array _myArray_ by writing _myArray[i]_ where i is a value between 0 and the length of the array minus one.
5. Reinitialize the array as an empty array (using _new type[length]_ as we've seen in class): what happens if you print out the elements of the array again?

### Longer exercises

__To better practice the nitty-gritty repetitive structural elements of Java files, try doing each of the following exercises in a different Class file.__

### Temperature conversion

Our first exercise will be to put together a small snippet of code to convert temperatures given in degrees Celsius to degrees Fahrenheit. The general process follows a well-known algorithm that goes as follows:

1. Multiply the value in degrees Celsius by 9;
2. Divide the result by 5;
3. Add 32 – The result is now in degrees Fahrenheit.

Read more about the conversion process [here](https://www.mathsisfun.com/temperature-conversion.html).

1. Before we begin anything, start by creating a new Class file and set up the class / main method structure we have seen in class. If you aren't certain of how to do this, revisit the [Introduction](http://www.marccataford.xyz/IntroToProgramming-Fall2016/Lecture-1/);
2. In programming, documentation is paramount. Use comments (either using // or /* ... */) to outline the steps or sections of your program. It can reflect the algorithm defined above, as well as any details that will be useful to you in planning the code (variable types, for example);
3. What type of variable is appropriate to contain a temperature? Think of the difference between `int` and `double`;
4. The program should take a variable named `degreesCelsius`, and the output should be stored in a variable named `degreesFahrenheit`;
5. Once your program is done running, it should print _neatly_ the initial Celsius value as well as the Fahrenheit value it converted to. _By neatly, I mean that you should mix words and variables using concatenation. If you don't remember how to do this, take a look at [Variables and arrays](http://www.marccataford.xyz/IntroToProgramming-Fall2016/Lecture-2/)._

_If you are stuck starting the problem, use the model [available here](http://www.marccataford.xyz/IntroToProgramming-Fall2016/get-started/TemperatureConversionModel.java)._

### Recipe scaler

Now that we can do some arithmetic using variables, let's try to apply our understanding of arrays to put together a tool that will allow us to calculate how much of each ingredients we need to cook certain dishes.

Let a recipe be defined by two arrays: one for ingredients' names and the other for quantities like this: 

```java
String[] ingredients = {"Flour (cups)", "Butter (cups)", "Brown sugar (cups)", "White sugar (cups)", "Eggs"};
double[] quantities = {2.25, 1.0, 0.75, 0.75, 2.0};
```

We would like to know how many of each ingredients we would actually need to have if we wanted to make a double recipe, or a triple, if we're extra-hungry. Of course, we could do some math on a napkin to find this out, but why bother when we know how to ask our computer to compute it for us?

1. Create a new Class file, as before, and set up the class/main method structure;
2. The __multiple__ of the recipe your program needs to calculate should be in a variable of type `int` called 'recipeMultiple.' For testing purposes, give it a value for which you can easily do the calculations on paper to validate your program's output;
3. Your program should print out the quantity of each ingredient required for the recipe as well as the ingredient's name. You will have to use _array indices_ as well as _concatenation_ to print the result neatly. Keep in mind that you'll be printing a _multiple_ of the recipe, so you should be multiplying somewhere!

_Note: `System.out.println(firstArray[i] + " is at the same index as " + secondArray[i])` would print the elements of each array at the same index, for example, it would bring the first element of each array together if i = 0._

_If you are stuck starting the problem, use the model [available here](http://www.marccataford.xyz/IntroToProgramming-Fall2016/get-started/RecipeScalerModel.java)._

## Loops

### Shorter exercises

Now that we have practiced using variables and arrays without loops, and that we had to write a lot of redundant code to do things like printing each element of an array, let's throw in some loops to automate repetitive tasks:

1. In the previous __Shorter exercises__, we printed all the elements of an array using indices. Repeat the exercise, but this time, instead of repeating a `System.out.println` instruction over and over again, use a loop to print all elements of the array. You can copy the code you had written before and modify it, or start from scratch. In the latter case, make sure that you _declare_ an array and _initialize_ it using an _array literal_.
2. Given an array of numerical grades such as `double[] grades = {60.5, 89.7, 97.5, 99.9, 100.0, 60.9, 56.8, 45.0, 35.0, 75.6};` representing the grades that each student in a class you are T.Aing got for the latest midterm:
 1. Using a loop, calculate the _average_ of the class;
 2. For each student (i.e. for each grade), print "GOOD" if the student's grade is _greater or equal_ than the average calculated in 1., or "NEEDS REVIEW" if their grade was lesser than the average.  
 3. __Challenge:__ If an A is given for any grade greater or equal than 85, a B for any grade between 75 and 85, and a C for anything lesser than 75, use a loop to print the letter grade corresponding to each grade in the array of grades given.

### Longer exercises

### Recipe scaler pt.2

Now that we know that we can use loops to automate repetitive tasks, we can revisit our _Recipe Scaler_ to make it a bit more efficient. Either modify the code you wrote for the Recipe Scaler or start from scratch to write a recipe scaler program that will make good use of loops to print out a given multiple of a recipe described by two arrays. Refer to the original question for the test arrays as well as the general flow of the program.

### Weighted grades

It's the end of the semester and you can't quite wait until your transcript is updated to know if you'll pass a certain course. Fortunately, you wrote down each exam, quiz and assignment grade you got, and you have the course outline handy to inform you of the weight of each kind of evaluation.

Given grade arrays such as this:

```java
double[] exams = {90.0, 67,5};
double[] quizzes = {100.0, 60.5, 87.9, 63.1};
double[] assignments = {50.0, 61.1, 78.9, 63.1, 20.0};
```

... and knowing that exams count for 60% of the grade, quizzes for 30% and assignments for 10%, write a program that would calculate your 'final' grade. Since you have multiple grades in each category, you'll have to use loops to calculate averages, on which you can then use the weighting to get their final contribution to the course grade. 

For example, if you had one exam in which you had 50.0%, two quizzes in which you had 80% and 70%, and three assignments in which you had 60%, 70% and 80%, you would first calculate averages (50% for exams, 75% for quizzes and 70% for assigments), and then apply the weight of each type of evaluation on those average to get that your final course grade is 50% * 60% + 75% * 30% + 70% * 10% = 59.5%.

Once you have calculated the final grade, you can use _conditional blocks_ as we've seen in class to find out your letter grade using [McGill's general letter grade scale](https://www.mcgill.ca/study/2015-2016/university_regulations_and_resources/undergraduate/gi_grading_and_grade_point_averages).

