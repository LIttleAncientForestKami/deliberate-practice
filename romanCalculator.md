Roman calculator
================

Roman book-keepers also needed help when adding numbers. Let's write a short program that does it for them.


Rules:
------

1. There are seven roman numerals:

I = 1
V = 5
X = 10
L = 50
C = 100
D = 500
M = 1000

2. None of the numerals can be repeated in row more than:
  - three times for I, X and C
  - once for V, L and D
3. The highest number that can be written is 3999 (it comes from rule 2)
4. Lower numerals can preceed higher ex. IV = 4 and XC = 90
5. We work with strings
6. Our only interest is addition (although we have to consider rule 4)
7. The numbers can be combined: "XX" + "II" = "XXII"
8. Our program takes two numbers and returns the result. Ex.: "XIV" + "LX" = "LXXIV"
