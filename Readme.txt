Group 4A (GigaFive)
Title: foot.print("Bilkent")


Description

In our navigation program, we get used to deal with Android Studio and learned some parts
of Google Maps API. In this checkpoint of our source code, we called some features of 
Google Maps by calling its objects. There is a lot of limitations happened that we came
across unexpectedly while coding. At first part, we have seen that Google API uses a 
lot of adverts in any part of its components, i.e. for any componenet that we have imported
to our project, there is always a link leading us to Google Maps app in the mobile. To
overcome such situations we decided to override the existing methods to get rid of this kind
of links. Apart from that, Google restricts us to use some features of its API such as 
navigation algorithm. Therefore we have found Dijkstra's Algorithm and it is in the processes
of implementation with the colloborate work of graph theory. For this checkpoint, in our code;
we limited the area of the maps, and we created some local points in Bilket area by holding them
with a local data as arrays, to demonstrate how far we have gone till now. In main java activity
part, we have called the objects and used some methods on our map that include listeners and map
class methods. In GUI part, we are done. The addition of some user friendly approaches are going to be considered next.
In the xml parts in the Code.txt file our basic layouts and interfaces can be seen. Another
consideration was about holding database. In the main map activity, we have instantiated the
options for GE-100. However, database is in the progress of implementation. We have created
an adjacency linked list storage that is needed to be placed in SQL Database. The time intervals
of activities in each option is implemented by a txt file which stores the information of option's
assigned places, event names and event times. Then the time inputs are binded to Push Up
Notification, which is implemented from the txt file stored in the main application. From the Push
Up Notification, drawShortestPath method, which is in the making process, will be initiated to draw
the way for the following event in the option of GE-100. Search Button's Listener for Bilkent area is implemented. 

Kayacan Kaya: Made the pseudo code for Dijkstra's Algorithm to be implemented for shortest way method.
Kemal Vatansever: Implemented AlarmManager class embedded with Notification Manager to create notifications of GE-100 events.
Selim Furkan Tekin: Implemented the database for Dijkstra's Algorithm to store adjacancy points.
Burak Sibirlioðlu: Gathered the codes and algorithms written the main project, and tested the done parts.
Ayþenur Sekban: Added points on the place on Bilkent Campus to be able to implement shortest path algorithm.