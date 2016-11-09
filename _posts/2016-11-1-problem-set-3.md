---
layout: post
title: Problem set 3
date: 16/11/9
---

Given our newfound knowledge of _objects_ and _object-oriented programming_, we can revisit some old problems we've worked on in the previous set and improve them. We can also build cool abstractions for real-life things. When working on problems of this set, I recommend having a piece of paper nearby to _design_ your objects and their instance variables and methods, as well as _how they interact together_ if one object contains another.

### Short exercises

Before we get into the longer coding tasks, let's jog our memory with a few short questions about terminology. If at any point you are uncertain of what a term means, you should go back to the class notes, or use Google, to make sure you understand fully what each of these words refers to. We'll be using them profusely in the longer exercises and in class.

1. What is an object?

2. What is a reference variable? How is it different from a primitive variable?

3. What is an instance variable? What is an instance method? Are they declared differently than their non-object counterparts? (Think of the _keywords_ we use to define them)

4. What is a constructor? Why is it necessary, and how is it different from other instance methods?

5. Once you have designed and implemented your object(s), how do you use them? How do you create a variable using your object?

### Longer exercises

Our first longer exercise will have us design a _phone book_, something we've already worked on in the past before knowing about objects, and in class while learning about them. Our phone book should have basic functionalities: it should be able to hold entries, it should allow us to print all entries in the book, and search for an entry based on the name of the person, and on the number they have. Moreover, we will integrate a _location_ component to our phone entries, which will be _automatically_ determined by our phone book program when creating an entry.

1. First, let's create our _phone book entry_. The entry itself should contain three things: the name of the person, their number, and their location. We should only need to specify the name and number when creating the entry, as the location should be determined automatically by our system. Moreover, our entry should have a few methods, namely a constructor and a method to print the entry (or at least to return it as a String to whoever calls it can print it). Feel free to add more functions as you see fit.

2. Second, we'll create another class acting as our phone book. Obviously, our phone book will contain a select number of entries. It will also provide methods to print its contents and search for an entry based on name or number.

3. Finally, you'll write a third class which will act as a _driver_ and will simply contain a main method that will instantiate and use the phone book class. You should _not_ interact directly with the phone entries in this main method, as we are _abstracting away_ the entries. You can implement methods in the phone book to act on the entries.

If you are uncertain of where to start, you can find an archive with skeletons of each of the classes [here](), and an example implementation [here]().
