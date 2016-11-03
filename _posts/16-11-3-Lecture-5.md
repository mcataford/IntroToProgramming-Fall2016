---
layout: post
title: Topic 5 - Objects
date: 16/11/03
---

Organizing our code as _methods_ is efficient, but we can go one step furthers and start thinking in terms of _objects_.

## Object-oriented programming

In programming, the term _object_ is used to refer to a _data structure_ that we can define ourselves to better manage data and abstract tangible things into code. In practical terms, an object is a _class_ that contains variables (called _instance variables_) and methods (called _instance methods_). A simple object representing a person could look like this:

```java
public class Person {
  public String name;
  public int age;
  
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
  
  public sayHello() {
    System.out.println("Hello! My name is " + this.name + " and I'm " + this.age + " years old.");
  }
}
```

This _object_ would define a new _variable type_ called `Person`, we see that it contains two _instance variables_, a name and age, and one _instance method_, `sayHello()`. You may also notice a method named after the class, `Person(String name, int age)`: this method is special and is called a _constructor_. The constructor is the method that _instantiates_ (or initializes) the variable, and will set some basic values for the _instance variables_.

When using our object, we would do something like this:

```java
Person myPerson = new Person("Bob",22);
myPerson.sayHello();
```

In this case, we would _declare and instantiate_ a new `Person` object with the values "Bob" and 22 for the two instance variables, and then we call the `sayHello()` on our object, which would print `Hello! My name is Bob and I'm 22 years old.`


