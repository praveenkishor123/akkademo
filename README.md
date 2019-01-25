# Description

This is a simple Akka project where a "Producer" creates numbers from 1 to 10, and a "Consumer" receives these numbers and just print them.
The "Producer" and "Consumer" and asynchronous.

## Benefits of using Akka

* Akka handles all the complex threading functionalities and allow us to just focus on dividing our tasks into actors
* We can distribute actors on multiple machines and thus we can spin hundreds of Akka servers to run our actors
* Akka will handle the distributions and communication of messages among the actors very easily

## Actors in Akka

* Actors in Akka is like an object but it is reactive, which means it does not do anything by itself, we have to send
a message to an actor to do something.

* Actors have a single API - mailbox

* The only way to communicate with Actors is by sending messages to actors. These messages are stored in the mailbox and akka will 
go and read the messages from there and then executes some actions.

## Concurrency in Akka

* Akka helps in concurrency by following a no shared data architecture

* Like a simple object, akka has also data and methods, but the data is not shared with anybody, which makes it concurrent
and helps to run in parallel.

