# Description

This is a simple Akka project where a "Producer" creates numbers from 1 to 10, and a "Consumer" receives these numbers and just print them.
The "Producer" and "Consumer" and asynchronous.

## Benefits of using Akka

* Akka handles all the complex threading functionalities and allow us to just focus on dividing our tasks into actors
* We can distribute actors on multiple machines and thus we can spin hundreds of Akka servers to run our actors
* Akka will handle the distributions and communication of messages among the actors very easily
