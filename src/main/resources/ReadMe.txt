

                                                                     <<<<< scope annotation >>

  default -> singleton one object per application is mean the spring create just one per application.

  @RequestScope -> spring will create just one in the first and then will create more per request.
                  e3ne aza kan 3ndak 2 Coach hne el tnen nfs el object bs bt3'ayar el ktovet 3la kol request.

  @SessionScope -> spring will create object per session , its mean when perform request from postman 3 times you will get same object ,
        when create another request from chrome you will get another request because its another section.
              e3ne aza kan 3ndak 2 Coach hne el tnen nfs el object bs bt3'ayar el ktovet 3la kol session (postman session & chrome session).


  @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) -> will create objects per container if you have 3 object you will get 3 object with different index in memory
            Coach Jameel - > memory is 123
            Coach Bhaa   - > memory is 569




LIFE CYCLE OF Spring:
        1. start container
        2. create beans @components , etc ..
        3. create dependencies between the beans.
        4. will destroy the objects when tien of the container.