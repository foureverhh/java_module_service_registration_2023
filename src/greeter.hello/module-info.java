module greeter.hello {
    // exports greeter.hello.service; 

    // expose HelloMessageService via greeter.api MessageService instead
    requires greeter.api;
    provides greeter.api.MessageService
        with greeter.hello.service.HelloMessageService;
}
