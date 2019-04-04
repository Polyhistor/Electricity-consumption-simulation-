1. <b>Introduction</b>
The purpose of this report is to delineate the comprehensive implementation of the proposed ‘electricity consumption simulation’ system. 
Throughout this report, various facets of the developed application will be discussed and elaborated. These facets are diverse ranging from the modeling, to object oriented concepts, highlights, and further improvements. This system has been developed underlying best practices, most efficient mechanisms, and state-of-art programming techniques that addresses requirements in an efficient and effective manner. In what follows, all the aforementioned elements will be discussed, with clear identification of strengths and weaknesses.


2. <b>UML Diagrams</b>
UMLs have underpinned a diagrammatic representation for specifying the object-oriented design of the electricity consumption system. These diagrams portray modeling and architecture concepts. Therefore, they’ve provided a standard development procedure by representing an overview toward development. Diagrams chosen for this system are in respect, use case diagram, class diagram, sequence diagram, activity diagram, and state diagram.
2.1. Use Case Diagram
Use case diagram illustrated in figure 2-1, depicts graphic interaction among elements of the system. This use case has been utilized as a methodology to identify, clarify, and organize system requirements. 
 
![Alt text](https://i.imgur.com/2jSzq1o.png?raw=true "UML - Pouya Ataei")


2.1. <b>Class Diagram</b>
This class diagram has been designed to model the static view of the system. This diagram is directly mapped with object oriented concepts and thus widely used at the time of development. This diagram has been designed to describe the way in which various classes communicate with one another. This diagram has been drawn twice, once before the utilization of design patterns which is shown in figure 2-2, and one after the utilization of design patterns which is shown in figure 2-3. Class diagram has been utilized as an overall interpretation of the system. Moreover, these diagrams provides a better general perspective toward classes associations. As shown in figure 2-2, variety of classes are intercommunicating using attributes and functions. ‘Dataupdate’, as an integral class takes care of most database queries and data manipulations, whereas supervisor class feeds most of this data. Rest of the classes are mostly in passive state receiving data upon request, or altering either the received or sending data. Figure 2-3, with implementation of two design patterns such as singleton and state, portrayed a better architecture for the system. This illustration with added 4 classes, and alteration to database connection class, has provided a path for system to culminate its performance. Underlying this, database instances are limited to one, and an interface is embodied between the payment context abstract class and two concrete classes that overrides its function. The reasons behind selecting these designs patterns and how they’ve improved the system will be elaborated in further sections.

![Alt text](https://i.imgur.com/2a4EZ1h.png?raw=true "UML - Pouya Ataei")


<b>Even further?</b>

If you'd like to know more about the object oriend concepts, design patterns and considerations. Leave me an e-mail on pouya.ataei.7@gmail.com and I'll send you the full documentation. 

I hope it can be helpful. 


<b>There is a video</b>

I've made a video and went through the whole system. I've done it for the university, but I'm sure it comes to aid :)
