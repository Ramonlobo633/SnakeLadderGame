# SnakeLadderGame
Implementation contains graphical interface and the use of design patterns such as factory, SINGLETON and ITERATOR, in java

The Game “Snake & Ladder ”is a road game, usually of 100 houses,
crossed by snakes and stairs. If the player falls on the snake's head, he will descend
to the house corresponding to the snake's tail and, if it falls into the house where it has the lower part
of a ladder, it will advance to the initial part of the ladder, that is, it will skip some houses.
In the case of this work, they were also added to the SPECIAL HOUSES, where
correspond to squares that have special effects, which can make the player
move forward or backward by a few spaces.

●The project is divided into the following packages:

1. CONTROLLERS: Controllers for cards, dice, players and
game.

2. DAOs: Two were created, one for players, one for home and one for cards.

3. FACTORIES: A house factory and a letter factory have been created.

4. MODELS: Which is divided into the subfolders: model.cartas, model.casa, model.dado,
model.interfaces and model.player.

5. RESOURCES: Containing the images of the board, the pins of the players and the dice.

6. VIEWS: A “Main” to run the game. A class “PovoarCartasTabuleiro”, for
add the cards. And “PovoarCasasTabuleiro”, to map the houses on the board.

7. INTERFACES: An interface has been created with the game's behavior, one with the
action effects, two factory interfaces, one for Card Factory and one for
one for Factory of Houses and one for Player interactor and another iterator for
Cards.

●The standards used for the development of the game were:
1. SINGLETON: Singleton was used in controllers and DAOs. The reason for
use of this pattern was due to the need to create only one instance of each
class, because its use ensures that several calls from the same class do not
interfere with performance. It also allows global access to each object.

2. FACTORY: The Factory pattern was used to delegate the creation of instances in
a single class. Thus, it removes the strong coupling. Within this work the use
the Factory standard was important because it takes the responsibility of several classes
create the same type of object, decrease duplication of object code and join
these responsibilities in a single class. ITERATOR: The Iterator standard was used because it allows sequential access to
elements of a set without exposing its implementation. In this work, the use of
iterator went to find the cards and to know the player of the time.

3. ITERATOR: The Iterator standard was used because it allows sequential access to
elements of a set without exposing its implementation. In this work, the use of
iterator went to find the cards and to know the player of the time.
