Antfarm rules
=============

Your task will be to develop a simulation of a little anthill and its surrounding. Ants will rummage the area for food and bring it back to the nest. In later versions, multiple additional game objects will be added.

----

Version 1:
---------
You have a rectangular game field with multiple areas (or map cells). Each area is surrounded by eight neighbour areas, except the border areas. Each area is initially empty.

### Game Field
All creatures on the game field get to act once (like make a step forward, turn one bearing, etc.) each turn/round. The order in which they can act is important, but random for each turn.

### Anthill
In one area, there is the entrance to the anthill/nest. All ants start in this area, heading in a random direction.
### Food
Randomly on the game field, there are stacks of food in areas. Each area can hold up to 16 units of food. If a food unit gets swooped, the stack shrivels until there is no more food. The amount of food on the game field is specified at the beginning. For each five food units placed into the anthill, a new ant is born immediately.
### Ants
An ant moves in a straight line in search for food. The ant only moves if the next area is not occupied by another ant/creature. The ant can only look ahead one area at a time, but sees also the area directly to the left and to the right of its heading. Lets assume your ant (*) walks straight up, these areas (!) are seen by the ant and these (.) are not:
!!!
.*.
...
Whenever the ant reaches an obstacle (like the game field border), it turns in the direction of an empty area (the turning is alike a step). If no empty area can be seen or both turn directions appear empty, it turns arbitrarily. An ant will not wobble while turning, if it picked a turn direction, it will keep it until it moves forward again.

On rare occassions, based on randomness, the ant will change its direction one bearing to the right or left.
If an ant senses food in an area it can see, it will try to enter the area (unless occupied by other ants/creatures) and take an unit of food. If the ant carries food, it will try to return to the nest in the shortest manner. To be able to do so, ants utilize a path integration device in their brain, counting the steps in each direction and reversing their effects if needed. Refer also to: http://www.ted.com/talks/marcus_byrne_the_dance_of_the_dung_beetle.html (playtime 12:40ff)

If the ant reaches the nest, it drops the food and returns to foraging duty again.

### Pheromone trails
During the way home to the nest, the ant emits a pheromone-based trail line on the ground. This smell and its direction can be "seen" by all ants if they inspect the area. If an ant perceives a trail line during its exploration, it will follow it to the food supply. If the trail ends without food being found, it will return to normal exploration mode. Each ant returning with food lays their own trail line, possibly reinforcing the already existing line. The pheromones wear out over time until they are gone. This fading follows the laws of exponential decay with a specified half-life constant (T):
N(t) = N(0)*(0,5^(t/T))

Refer also to http://en.wikipedia.org/wiki/Half-life and http://en.wikipedia.org/wiki/Exponential_decay

Ants cannot sense pheromone trails below one percent of the single initial strength.

Version 2:
----------
Your world will now contain pebbles. A defined amount of pebbles lays around the game field, occupying areas so no ant/creature or food can enter the area. Each pebble is only one area in size, but there are many of them, sometimes blocking a straight moving line. Your ants should already be able to handle them.
Also new to your world are mealworms. These insect larvaes appear seldom and randomly at the game field border and try to cross it in the most direct manner. They are basically moving food depots. If an ant "catches" a mealworm, it will kill it instantly and transform it to a food stack on the area. A mealworm will always try to perpetuate its original direction if forced to evade an obstacle and leaves the game field if it reaches a border.

Version 3:
----------
Your world now simulates weather. Basically, there are two kinds of weather: Sunshine and rain. Until now, there was only sunshine. Rain sets in randomly and has a random "density" that defines how many areas are hit by waterdrops each round. If a waterdrop hits an area, the pheromone trail lines on it will be diminished by a substantial amount (also defineable). A creature hit by a waterdrop loses orientation for a short time, leading to a random new bearing. Rain will eventually stop, leading to a period of sunshine.

Also new to your world are jumping spiders. Jumping spiders are arachnids that feed on live insects or other spiders. They will occasionally enter the game field and leave it again without preference to stay. Jumping spiders have excellent eyes, granting them vision two areas in advance. Lets assume your spider (#) looks straight up, these areas (!) are seen by the spider and these (.) are not:
!!!!!
.!!!.
..#..
.....
.....
Another example of a spider looking in the top-right corner:
..!!!
..!!!
..#!!
.....
.....
Pebbles (O) and food obstruct their field of vision, though:
..!!!
.O!!.
..#..
.....
.....
Spiders prefer to turn and wait/look over running around. Only after some turns to each side, they will steps forward in their original direction. On rare occassions, based on randomness, the spider will change its movement direction one bearing to the right or left. If a spider discovers a live prey, it will follow it with normal speed until it can kill it, essentially taking it from the game field instantly (despite its name, these jumping spiders will not jump). Once a spider has eaten, it tries to leave the game field in the same manner as the mealworm. Well-fed spiders won't hunt/kill anything.

Version 4:
----------
Your world now contains multiple ant nests in different locations. The ant populations are hostile, basically reacting to each other like to mealworms. The food stacks of killed ants are only small.
