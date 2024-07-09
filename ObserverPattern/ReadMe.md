# The Observer Pattern
## Weather - O - Rama

The weatherorama package is a collection of classes and interfaces that represent pattern structure of observer pattern. This package provides a flexible and extensible framework for modeling and simulating weather changes and updates.


# Weather-O-Rama: The Observer Pattern in Action

The `weatherorama` package is a Java-based implementation of the Observer Design Pattern, focusing on a weather monitoring system. This package demonstrates how different components within a system can remain loosely coupled yet still communicate changes to one another in real-time. It's an excellent example for understanding the Observer Pattern's practical application in software design.

## Overview

The Observer Pattern is a software design pattern where an object, known as the subject, maintains a list of its dependents, called observers, and notifies them automatically of any state changes, usually by calling one of their methods. It is mainly used to implement distributed event handling systems.

In the context of the `weatherorama` package, the pattern allows for the dynamic and real-time updating of weather conditions to all registered displays without requiring the displays to constantly check for updates.

## Components

The package consists of several key components:

- `WeatherData`: Acts as the subject that observers can subscribe to. It updates observers with the latest weather measurements.
- `CurrentConditionsDisplay`: An observer that displays the current weather conditions.
- `Observer`: An interface that defines the `update` method for observers.
- `Subject`: An interface that defines methods for registering, removing, and notifying observers.

## How It Works

1. `WeatherData` collects new weather measurements.
2. Upon receiving new measurements, `WeatherData` calls `measurementsChanged`, which in turn notifies all registered observers of the change.
3. Each observer, such as `CurrentConditionsDisplay`, then retrieves the updated data and displays it.

## Usage

To use the `weatherorama` package in your project, follow these steps:

1. Import the package into your Java project.
2. Create an instance of `WeatherData`.
3. Create instances of any displays you wish to use, such as `CurrentConditionsDisplay`, passing the `WeatherData` instance to their constructors.
4. Update the weather measurements using `WeatherData`'s `setMeasurements` method.

Example:

```java
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
```

That's it! You're now ready to start using the Duck package in your projects. Happy coding!


## Design Patterns Followed
 - Identify the aspects that vary and seperate them from what stays constans
 - Program to an Interface, not an Implementation
 - Favour Composition Over Inheritance
 - Strive for loosely coupled designs between objects that interact


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