## JTE List
---
### Description
In this lab we will cover how to iterate through an ArrayList of Strings using JTE.

---
### Steps

1. In src -> main -> java -> Main.java, create a String ArrayList that will contain names of sea creatures. This arraylist should be static and be created outside the main method. See the items arraylist for reference.
2. Add at least 4 sea creatures to your arraylist. This should be done in the main method like the items arraylist does.
3. In the same class, create a new route your list of sea creatures.
4. Also create a handler for the route you just created. Use ctx.render to render seaCreatures.jte. Remember to use Collections.singletonMap() to send your arraylist to the seaCreatures.jte file in ctx.render.
5. In src -> main -> jte -> seaCreatures.jte add the imports and parameters required to use an arraylist of Strings. Name the parameter the same word as the key value you used in the singletonMap.
6. In the same file add a for loop inside the body tag that will loop through the arraylist to display each sea creature.

---
### Sample Output
My favorite sea creatures are:
* Whales
* Starfish
* Clownfish
* Dolphins
---
