package greeter.hello.service;

import greeter.api.MessageService;

public class HelloMessageService implements MessageService{
    /* 
    private String message;

    public HelloMessageService(String message) {
        this.message = message;
    }
*/
    public String getMessage() {
        return "Hello messages";
    }
}
