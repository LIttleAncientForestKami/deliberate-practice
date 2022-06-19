#!/usr/bin/python3
"""Guessing game in Python"""

if __name__ == "__main__":
    low = 0
    high = 100
    print(f"Hello! I will ask you for a number from a range between {low} and {high} inclusive. Guessing game continues until you get it right!")
    import random as r
    secret = r.randint(0,100)
    users = -1
    range_open = "<"
    range_close = ">"
    while users != secret:
        try:
            msg = f"Range is {range_open}{low}, {high}{range_close}. Your number? "
            users = int(input(msg))
        except ValueError: 
            print("Numbers please. Numbers only. Or Ctrl+c to quit.")
            continue
        if users > secret: print("Too high!"); high = users; range_close = ")"
        if users < secret: print("Too low!"); low = users; range_open = "("
    print("Well done, it was indeed %d, thanks for playing!" % secret)


