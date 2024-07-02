# Vehicle Factory Challenge

Welcome to the Vehicle Factory Coding Challenge! In this challenge, you will be implementing the **Factory Method Design Pattern** by creating a concrete factory class to produce different types of vehicles.

## Objective

Your task is to create a `ConcreteVehicleFactory` class that will implement the `VehicleFactory` abstract class and override the `createVehicle(String type)` method to produce instances of `Car`, `Truck`, or `Motorcycle`.

* All your vehicles have been provided.
* Unit tests have been provided to help you verify your implementation.

Can you get all the tests to pass? Psssst... Don't worry about the Open Close Principle for now.

To run the tests you can either open VehicleFactoryTest.java and click the play button in the top right corner of the editor or run the following command in the terminal:

```bash
gradle test
``` 

You can see the simple factory solution by checking out the branch `solution`.

BONUS: Can you refactor this challenge to NOT violate the Open Close Principle?
