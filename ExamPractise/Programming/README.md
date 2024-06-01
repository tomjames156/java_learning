# Inheritance

- When inheriting from a child class, variables declared as private cannot be called in the child class. 
- You can however use a setter or getter created in the parent class to access it.
- Protected vars are available within the same package and subclasses

- The super keyword is used in the sub class' constructor to pass arguments to the parent class' constructor.
- The super keyword used within a class method is also used to call the superclass version of an overriden method using the syntax super.methodName()


# Polymorphism

- The ability of a reference variable to behave different based on the object instance it holds. 
So something like the way when you create a list being implemented as either an array list or a linked list
NOTE: Always put data types in methods and constructors
Run with java instead of VSCODE

# Abstraction
A way of hiding the implementation details of a class or method by making it to be handles by the subclass. Usually done when the implementation details are not sufficient in the super class. They also help to define the struct w/o the implm details.
Abs classes cannot be used to create objects, must be inherited / cannot be instantiated
Abs methods do not have any body, the body is prov by the subclass which autom overrides the abs method in the super class

To have abstract methods, the class must be declared abstract.
Any class that inherits from an abstract class must implem all the abstract methods otherwise, it should be declared as abstract

Java does not support optional parameters, however with method overloading you can have that same functionality
The @Override keyword is used to show that a subclass method overrides the super class'. The subclass must also have the same number of args and type of args for the override to not return an error

Abstract classes can still be used to create reference variables to its subclasses