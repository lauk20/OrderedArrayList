# OrderedArrayList

We discussed how the constructor for the NoNullArrayList would have to be. (Would it have to call the super() constructor or would it have an entirely separate one)
Something that I got confused about was if the super() constructor call would need "T" somewhere to indicate the type.

While overriding the add() method for NoNullArrayList, we discuseed how we would add elements to the list. We decided that a new list was not necessary and we could just the super class's add() with some checks before.
