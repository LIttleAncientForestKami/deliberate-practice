Knubbel rules
==============

Your task will be to develop a computer game simulating a dice game with specific rules. The ruleset is small at first and will get more complex in later versions.

----

Version 1:
----------
You are given five normal dice (W6) and a scorecard. Your task is to repeadetly roll the dice and try to match the scorecard rules with your dice roll result. You can repeat until every field on the scorecard is filled. The sum of your points is the result of your game. The player with the highest score wins. In this version, there is only one player.

Each turn, you can roll your dice up to three times, each time leaving a number of dice out of the roll. After at most three rolls, you have to enter your result in the scorecard.

If you cannot fit your result in the scorecard, you have to cross out one possibility, giving it a value of 0 points.

Your current ruleset is:
- [C1] Three-of-a-kind: If you have three (or more) dice showing the same face, you can enter the total eye sum of your roll in this field.
Example: 3 3 3 5 6 --> three-of-a-kind (20)
- [C2] Four-of-a-kind: If you have four (or more) dice showing the same face, you can enter the total eye sum of your roll in this field.
Example: 3 3 3 3 6 --> four-of-a-kind (18)
- [C3] Full house: If you have a three-of-a-kind and a pair in your roll result, you can enter 25 points in this field. The points are not variable.
Example: 3 3 3 2 2 --> full house (25)
- [C4] Small straight: If you have four sequential dice, you can enter 30 points in this field. The points are not variable.
Example: 2 3 4 5 5 --> small straight (30)
- [C5] Large straight: If you have five sequential dice, you can enter 40 points in this field. The points are not variable.
Example: 2 3 4 5 6 --> large straight (40)
- [C6] Knubbel: If you have five dice showing the same face, you can enter 50 points in this field. The points are not variable.
Example: 1 1 1 1 1 --> knubbel (50)
- [C7] Chance: Whenever you see fit, you can enter the total eye sum of your roll in this field.
Example: 1 1 3 3 5 --> chance (13)

Version 2:
----------

Your scorecard is expanded by six additional possibilities. Your game duration increases by six rolls.

Your new rules are:
- [A1] Only ones: Only the dice showing one eye in your roll are taken into account. The sum of them are the points for this field.
Example: 1 1 2 3 4 --> only ones (2)
- [A2] Only twos: Only the dice showing two eyes in your roll are taken into account. The sum of them are the points for this field.
Example: 1 2 2 3 4 --> only twos (4)
- [A3] Only threes: Only the dice showing three eyes in your roll are taken into account. The sum of them are the points for this field.
Example: 1 3 3 3 4 --> only threes (9)
- [A4] Only fours: Only the dice showing four eyes in your roll are taken into account. The sum of them are the points for this field.
Example: 1 2 4 4 4 --> only fours (12)
- [A5] Only fives: Only the dice showing five eyes in your roll are taken into account. The sum of them are the points for this field.
Example: 1 2 5 5 6 --> only fives (10)
- [A6] Only sixes: Only the dice showing six eyes in your roll are taken into account. The sum of them are the points for this field.
 Example: 1 2 6 6 6 --> only sixes (18)

Version 3:
----------

Your scorecard is expanded by an additional bonus effect that doesn't need an additional dice roll. If you gain a sum of 63 points or more with the six additional rules of version 2, you'll get a bonus of 35 points on your total game score. This rule is called [B1].

Your total score is now the combination of the first seven rules (C1-7) and the six additional rules (A1-6) plus the conditional bonus (B1):
game score = (A1+A2+A3+A4+A5+A6) + (B1) + (C1+C2+C3+C4+C5+C6+C7)

------------------------
Version 4:

Instead of a user making the choices which dice to roll again and what scorecard field to use, your task is now to develop a Knubbel-bot that plays automatically. Your bot should make sophisticated decisions what field to aim at with a given initial or second dice roll.

