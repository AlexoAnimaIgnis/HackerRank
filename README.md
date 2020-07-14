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

# Collections Behavior
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

# List Interface
What is a list?
- collection with iteration order, Meaning it may or may not
be sorted. Elements can be accessed through index that usually
starts with 0, 1, n+
- index is an int that represents the position on the list

Methods:
- void add(int index, E e);
- E get(int index);
- E remove(int index);
- E set(int index, E element);
- boolean addAll(int index, Collection<? extends E> c);
- int indexOf(Object o);
- int lastIndexOf(Object o);

Sublist is a view over ranges of Lists. If you modified the
view (sublist), you also modify the LIST.
- List<E> subList(int fromIndex, int toIndex);



