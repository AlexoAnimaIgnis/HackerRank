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

SortedSet and NavigableSet
- collections that are DISTINCT and have an order

SortedSet Methods
- E first();
- E last();
- SortedSet<E> tailSet(E fromElement); returns element for example
you define tailset(4) you will get elements 4, 5, 6...
- SortedSet<E> headSet(E toElement); returns exclusive element
for example headSet(4) you will get elements 1, 2, 3...
- SortedSet<E> subSet(E fromElement, E toElement)

NavigableSet extends SortedSet further

Navigable set provides ways to move through the order (implemented by TreeSet)
- E lower(E e);
- E higher(E e);
- E floor(E e);
- E ceiling(E e);
- E pollFirst(E e);
- E pollLast(E e);

# Queues

Queues are FIRST IN FIRST OUT data structures. That means that the first element that goes into the queue is the element that comes 
out first.

i.e 2, 3, 1, 4 --> 2, 3, 1, 4

PriorityQueue
- queues in which the order of the elements that come out is defined by the priority
- "priority" just really means ordering - meaning the order you specify

# Stacks

- implements concept of LIFO meaning Last element inserted is the FIRST element OUT ex. inserted 1, 2, 3 --> 3, 2, 1
- java.util.Stack is deprecated
- java introduced DEQUE where you can add/remove on the tail or the head

# Deque Methods

- boolean offerFirst(E e); * returns false if queue is full
- boolean offerLast(E e);
- void addFirst(E e); * throws excception when queue is full
- void addLast(E e);

- E removeFirst(); * throws Exception when queue is empty
- E removeLast();
- E pollFirst(); * returns null when queue is empty
- E pollLast();

- E getFirst(); * throws Exception when queue is empty
- E getLast();
- E peekFirst(); * returns null if queue is empty
- E peekLast();

- void push(E e); - ADDING for STACK LIFO SEMANTICS
- E pop(); - REMOVING for STACK LIFO SEMANTICS

Implementations of Queue

ArrayDeque
- ringBuffer based implementation
- has constant time in ADDITION/REMOVAL O(1)
- less memory consumption and faster
- but no random access 

LinkedList
- seldom used as a queue
- has random access but its O(n)
- allows null elements




Operations:
- boolean offer(E e) returns FALSE if the QUEUE is already FULL
- boolean add(E e) returns EXCEPTIONS if the queue is already FULL (will return false if the element is alreadyy present)
- E remove() returns EXCECPTIONS if the QUEUE is EMPTY
- E poll() returns null if the queue is empty
- E element() viewing element without removing. throws exception when QUEUE is EMPTY
- E peek() viewing element without removing. returns null when quueue is empty

# Map

- is a collection of pairs of values. Think of a dictionary
- each key -> value
- maps have unique key (determined by hashcode equals or comparator equal)
- DOES NOT IMPLEMENT THE COLLECTION INTERFACE

Map API
- V put(K key, V value); used for single value
- void putAll(Map<? extends K, ? extends V> values); used for putting another map
- nulls key/values are not supported (or depends on the implementation)
- V get(Object key)
- boolean containsKey(Object key)
- boolean containsValue(Object value)
- V remove(Object key)
- void clear()
- int size()
- boolean isEmpty()

Views Over Maps
- keySet() returns unique set of KEYS
- values() returns a collection of values; not guranteed to be unique
- entrySet() use it if you want to iterate over a map. it is a set of key value tree of elements

Sorted and Navigable Maps
- traversal in key ASCENDING order

SortedMap 
- defines an interface for a map with ordering
- its subviews are based upon KEY

Methods
- K firstKey();
- K lastKey();
- SortedMap<K, V> tailMap(E fromKey);
- SortedMap<K, V> headMap(E toKey);
- SortedMap<K fromKey, K toKey);

NavigableMap

Methods
- Map.Entry<K, V> firstEntry();
- Map.Entry<K, V> lastEntry();
- Map.Entry<K, V> pollFirstEntry(); removes element as well as returning it
- Map.Entry<K, V> pollLastEntry; removes element as well as returning it
- Map.Entry<K, V> lowerEntry(K key); provides greatest element less than the key
- Map.Entry<K, V> higherEntry(K key); provides lowest element greater than the kkey
- K lowerKey(K key); 
- K higherKey(K key);
- Map.Entry<K, V> floorEntry(K key);
- Map.Entry<K, V> ceilingEntry(K key);
- K floorEntry(K key);
- K higherKey(K key);

# General Purpose Map

HashMap, LinkedHashMap and TreeMap