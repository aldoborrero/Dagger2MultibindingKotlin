Dagger 2 Activities Multibinding (Kotlin version)
=================================================

Originally, Miroslaw Stanek, prepared in his magnificient blog a post explaining how you can use the new features that Dagger 2.7 (and now 2.8) has
 introduced.

> Using Multibinding we can inject Activity Subcomponents builders without passign instance of AppComponent to Activities what means that finally we can test Activities decoupled from the whole Application. We are able to provide mock objects to our activity without using tools like [DaggerMock](https://github.com/fabioCollini/DaggerMock).
 
The original project is itself written in Java. So I decided to convert it to Kotlin (Keep in mind that this conversion was done quickly using the 
Intellij tool, so is not the most idiomatic way of doing things for sure).

Go to the original blog post: [Activities Multibinding in Dagger 2](http://frogermcs.github.io/activities-multibinding-in-dagger-2/) for more details.

And [here is the original Java repository](https://github.com/frogermcs/Dagger2Recipes-ActivitiesMultibinding) sample project. 

