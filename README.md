**Songr**

This is a Spring MVC app with the following that features several asks: 

--The app can be run with the following run: 

./gradlew run

**Create a hello world route at /hello, and ensure that you can visit that route in your browser and see a rendered template come back.**

--Go to a webbrowser and go to following addresses: 

http://localhost:8080/hello

http://localhost:8080/hello?name=Cesar

**Create a route that turns words into UPPER CASE. For instance, I should be able to visit /capitalize/hello and get back an HTML page containing the response HELLO, or I could visit /capitalize/this is Kinda Capitalized and get an HTML page containing the response THIS IS KINDA CAPITALIZED.**

--go to a webbrowser and go to the following address:

http://localhost:8080/capitalize/yourtexthere

**Create a basic splash page for the Songr app, available at the root route, and style it appropriately with CSS.**

--Go to a webbrowser and go to the following address:

http://localhost:8080

**Create an Album class to act as a model in our app: An Album has a title, an artist, a songCount, a length (in seconds), and an imageUrl that is a link to that album’s art. Create a route at /albums that shows three album instances. (These will be hardcoded for today’s lab; create an array that contains three albums, and then display those three on the page.)**
--Go to a webbrowser and go to the following address: 

http://localhost:8080/albums

1 pt for hello route
1 pt for capitalize route
1 pt for splash page
1 pt for Album class
1 pt for albums page
