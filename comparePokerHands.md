Compare Poker Hands
===================

You will write a piece of poker engine, that is able to tell which one of two compared poker hands is higher. __That is the assignment I've added instead of AntFarm.__

Ruleset is small at first and will get more complex in later version.

----

Version 1
---------

You are being dealt five cards and a score card. Your task is to repeatedly deal the cards and try to match the score card rules with your dealt hand.
In this version, there's only one player, and the game goes on just comparing between two hands dealt, just declaring which hand had a higher result.

If you cannot fit your result to the score card, you have a hand worth 0 points.

### Poker rules description
Poker deck contains 52 cards - each card has a suit which is one of: clubs, diamonds, hearts or spades (denoted: C, D, H and S in the input data). Each card also has a value which is one of 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King, Ace (denoted: 2, 3, 4, 5, 6, 7, 8, 9, T, J, Q, K, A). For scoring purposes, the suits are unordered while the values are ordered as given above, with 2 being the lowest and Ace the highest value.

A poker hand consists of five cards, dealt from the deck. Poker hands are ranked by the following partial order, from lowest to highest:

1. Pair: two of five cards in the hand have the same value. Hands which both contain a pair are ranked by the value of the cards forming the pair. If these values are the same, hands are ranked by the value of the cards NOT forming the pair, in decreasing order.
2. Two Pairs: the hand contains two different pairs. Hands which both contain two pairs are ranked by the value of their highest pair. Hands with same highest pair are ranked by the value of their other pair. If these values are the same, hands are ranked by the value of remaining card.
3. Three of a Kind: three of the cards in the hand have the same value. Hands which both contain three of a kind are ranked by the value of of the 3 cards.
4. Straight: hand contains 5 cards with consecutive values. Hands which both contain a straight are ranked by their highest card.
5. Flush: hand contains 5 cards of the same suit. Hands which are both flushes are ranked using he rules of for High Card. 
6. Full House: 3 cards of the same value, with the remaining 2 cards forming a pair. Ranked by the value of the 3 cards. 
7. Four of a Kind: 4 cards with the same value. Ranked by the value of the 4 cards. 
8. Straigt Flush: 5 cards of the same suit with consecutive vaues. Ranked by the hihest card in the hand.

-----------
Version 2
----------

Dealing should alternate between two players, with one having better hand being declared a winner. Each player at first is given 5 points. If there is a winner, he gains one point, while loser - looses one. You can repeat until one player has no more points. The other is the winner of the whole game. 

Also, hand not fitting in the previous scorecard is now treated differently: 

1. High Card: Hands which do not fit any higher category are ranked by the value of their highest card. If the highest cards have the same value, the hands are ranked by the next highest, and so on. 

-------------

Version 3

-----------

Each turn, player can (optionally) choose to exchange cards. If he chooses to exchange, he can exchange at minimum one card, at maximum - whole hand. Exchange may happen only once per player. 

Upon the exchange cards are "counted" and hand is evaluated. 

Upon draw of the highest ranking cards, exchange is factored into choosing the victor BEFORE the rest of the hand is calculated. Player who did not exchange the cards , or exchanged less of them, is considered victorious. 
If none exchanged cards, or both exchanged same amount ,draw remains in effect and choosing the victor proceeds as normal (by lowe ranking cards-------------

Version 3

-----------

Each turn, player can (optionally) choose to exchange cards. If he chooses to exchange, he can exchange at minimum one card, at maximum - whole hand. Exchange may happen only once per player. 

Upon the exchange cards are "counted" and hand is evaluated. 

Upon draw of the highest ranking cards, exchange is factored into choosing the victor BEFORE the rest of the hand is calculated. Player who did not exchange the cards, or exchanged less of them, is considered victorious. 
If no player exchanged cards, or both exchanged same amount, draw remains in effect and choosing the victor proceeds as normal (by lower ranking cards).





