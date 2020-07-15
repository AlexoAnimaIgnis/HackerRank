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

# List Implementations

ArrayList 
- array backed with a list. this resizes the backing array
by doubling the size (meaning that resizing is less frequent)
- good general purpose implementation if you dont know the characteristics of your
list
- it is more CPU Cache sympathetic. Arraylist is linearly laid out in the memory meaning its
behavior is predictable.

LinkedList
- is a doubly linked list (in java) meaning each node/element has a reference/pointer
to the next node and a pointer to it's previous node. It also hold reference to
its tail and its head.
- it is good if you want to repeatedly add or remove an element in your list because all you
have to do is to break the link of pointers between them and add the element in between whereas
in arraylist, if you want to add an elemment in the middle, you have to copy the elements
to shuffle them all over.
- however, it is slow to iterate over since you have to traverse all through the
links
- worse performance for many operations
- recommended to use when adding elements at start
- or when adding/removing elements A LOT.

Performance operation
(todo)

# SET
Sets are collections with DISTINCT elements. There are NO duplicates.

Set Implementations:

HashSet 
- set based upon HashMap.
- calls hashCode() on element and looks up location
- good general purpose implementation (resizes when it runs out
of space)

The equals hashcode contract

object.equals(other) means that object.hashCode() == other.hashCode()

How do we implement correct HashCodes?
- combine hashCode information from EACH FIELD
- value based equality sample formula (
result = 31 * result + obj.hashCode()
) or you can let your IDE do the heavy lifting.
- or built in JDK Objects.hashCode()
- ALWAYS use the same fields as equals()

TreeSet
- based upon TreeMap which uses BinaryTree with a required sort order
- keeps elements in the given order (SortedSet and NavigableSet)

EnumSet
- specialized data structure
- only allows ENUM as elements

