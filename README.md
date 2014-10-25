CorrettoUML
===========

_CorrettoUML_ is a prototype research tool developed at Politecnico di Milano to translate UML models into the <a href="http://risorse.dei.polimi.it/TRIO/">TRIO<a/> temporal logic formalism which is suitable to be formally verified using the _Zot_ bounded model/satisfiability checker https://code.google.com/p/zot/. 

This picture presents an overview of the tool:
<img src="https://raw.githubusercontent.com/mottalrd/CorrettoUML/master/docs/images/mvf_overview.png"/>

The user creates a UML models using <a href="http://www.eclipse.org/papyrus/">Papyrus</a>. Corretto supports both static and behavioral diagrams of different types. The different views communicates by means of a shared set of events enabling the possibility to define complex behaviors. Also, dedicated time concepts borrowed from <a href="http://www.omgmarte.org/">UML/MARTE</a> have been included to predicate on the time dimension of the system.  

Once the UML model is completed the user can use _Corretto_ to formally verify its correctness with two types of checks:

* Model consistency: A UML model is consistent if the different views do not contradict each other. Formally this is translated into the fact that the underlying formal model has at least one execution trace. 

* User defined properties. The user can define a property that must be true for the model using Time Property Diagrams (TPDs) included in the MADES UML profile. Time properties usually refer to the relation of different events in the system with some time constraint. A simple example is if messsage _x_ occurs now, then within 10 time instants object _y_ will be inside state _z_. TPDs are an extesion of CDs used to build temporal logic formulae in UML. 

