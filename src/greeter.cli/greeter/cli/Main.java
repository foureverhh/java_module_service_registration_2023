package greeter.cli;

import java.util.ServiceLoader;

import greeter.api.MessageService;
import greeter.hello.service.HelloMessageService;
//import greeter.hello.service.HelloMessageService;

public class Main {
    public static void main(String ...args) {
        /* 
        HelloMessageService messageService = new HelloMessageService("hello world");
        System.out.println("message from HelloMessageService is: " + messageService.getMessage());
        System.out.println("message from HelloMessageService is: " + "Hello");
        */
        Iterable<MessageService> messageServices = ServiceLoader.load(MessageService.class);
        for(MessageService messageService : messageServices){
            String message = messageService.getMessage();
            System.out.println(message + " from a module");
        }
        /* 
        messageServices.stream().filter(provider -> provider.type() == HelloMessageService.class)
        .map(ServiceLoader.Provider::get)
        .forEach(messageService -> System.out.println(messageService.getMessage() + " from a module"));
        */
    }
}
