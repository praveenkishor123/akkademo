package com.akkademo;

import akka.actor.UntypedActor;

class Consumer extends UntypedActor {

    @Override
    public void onReceive(Object msg) throws Exception {
        if (msg instanceof Integer) {
            System.out.println("<<< Receiving & Printing " + msg);
        }
    }

}
