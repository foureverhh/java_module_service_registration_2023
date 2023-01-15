module greeter.cli {
    // requires greeter.hello;

    // requires greeter.api as Service 
    // and use implict Service class
    requires greeter.api;
    uses greeter.api.MessageService;
  }
