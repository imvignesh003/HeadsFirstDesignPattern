# Duck Package

The Duck package is a collection of classes and interfaces that represent different types of ducks. This package provides a flexible and extensible framework for modeling and simulating duck behavior in various scenarios.

## Classes

- `Duck`: The base class for all ducks. It provides common properties and methods that are shared among different types of ducks.
- `MallardDuck`: A specific type of duck that represents a Mallard duck. It inherits from the `Duck` class and adds additional properties and methods specific to Mallard ducks.
- `RubberDuck`: Another specific type of duck that represents a rubber duck. It also inherits from the `Duck` class and has its own unique properties and methods.

## Interfaces

- `Quackable`: An interface that defines the behavior of ducks that can quack. It includes a `quack()` method that all implementing classes must implement.

## Usage

To use the Duck package, simply import the desired classes and interfaces into your project and create instances of the duck types as needed. You can then call the appropriate methods on these instances to simulate duck behavior.

Example:

```java
import com.example.duck.*;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.quack();
        
        Duck rubberDuck = new RubberDuck();
        rubberDuck.quack();
    }
}
```

This will output:

```
Quack! I'm a Mallard duck.
Squeak! I'm a rubber duck.
``````

That's it! You're now ready to start using the Duck package in your projects. Happy coding!


## Design Patterns Followed
 - Identify the aspects that vary and seperate them from what stays constans
 - Program to an Interface, not an Implementation
 - Favour Composition Over Inheritance


## Contributing

We welcome contributions to the Duck package! If you would like to contribute, please follow these steps:

1. Fork the repository to your own GitHub account.
2. Clone the forked repository to your local machine.
3. Create a new branch for your changes: `git checkout -b my-feature`.
4. Make your desired changes to the codebase.
5. Test your changes to ensure they work as expected.
6. Commit your changes: `git commit -m "Add my feature"`.
7. Push your changes to your forked repository: `git push origin my-feature`.
8. Open a pull request on the original repository, explaining your changes and why they should be merged.

Please make sure to follow our code style guidelines and include tests for any new functionality or bug fixes.

Thank you for your interest in contributing to the Duck package!




All Credits to Heads First Design Pattern Book By Eric Freeman, Elisabeth Robson