# Null Object Pattern

It is a pattern where we create a Class or type for those objects which is going to be null.
This way we treate a null object like a object which has a value, but we set a default value for the null object. 
It helps us to have less conditionals for checking if a object is null or not and then handling a NullPointerException.

In the code example i have a situation where a user does not have a profile picture, in this case we create a Null object which has a default image.
