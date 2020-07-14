# HackerRank
Repository for my HackerRank journey

All the collection interfaces in java extends the parent interface
COLLECTIONS

List 
- most commonly used collection
- order
- indexing
implementations: ArrayList/LinkedList

Set
- allows distinct elements
- not sorted
implementations: hashSet

SortedSet
- allows distinct elements
- can be sorted
implementations: TreeSet

Queue/Deque
- supports first in/first out behavior
Queue (implemens Priority Dequeue)
Deque (implements LinkedList ArrayDeque)

Map
- collection of keys and pair
- sorted map used (sortedMap)

Interface vs Implementation

Interfacce
- multiple data strucures
- functional characteristics
- prefer as variable type

Implementation
- specific data structure
- performance characteristics
- concrete and instantiable

#Collections Behavior
Collection interface extends another interface named Iterable. What this means is that,
once you extend this, you can extract an iterator that acts as a cursor that allows
you to iterate over elements

Methods
- size()
- isEmpty()
- addElement(element)
- addAll(collection)
- remove(element)
- removeAll(collection)
- retainAll(collecction)
- contains(element)
- containsAll(collection)
- clear()

