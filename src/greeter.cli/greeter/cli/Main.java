package greeter.cli;

import greeter.hello.service.HelloMessageService;

public class Main {
    public static void main(String ...args) {
        HelloMessageService messageService = new HelloMessageService("hello world");
        System.out.println("message from HelloMessageService is: " + messageService.getMessage());
        System.out.println("message from HelloMessageService is: " + "Hello");
    }
}
