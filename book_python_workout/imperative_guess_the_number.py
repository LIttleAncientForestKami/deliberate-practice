#!/usr/bin/python3
"""Guessing game in Python"""

if __name__ == "__main__":
    low = 0
    high = 100
    print(f"Hello! I will ask you for a number from a range between {low} and {high} inclusive. Guessing game continues until you get it right!")
    max_nr_of_tries = None
    nr_of_tries = 0
    try:
        max_nr_of_tries = int(input("Input number of tries you want, or leave the input empty for unlimited (weird inputs will also mean unlimited tries): "))
        if max_nr_of_tries <= 0: raise ValueError
    except ValueError: max_nr_of_tries = None
    import random as r
    secret = r.randint(0,100)
    users = -1
    range_open = "<"
    range_close = ">"
    while users != secret and nr_of_tries != max_nr_of_tries:
        try:
            msg = f"Range is {range_open}{low}, {high}{range_close}. Your number? (Attempt {nr_of_tries+1}) "
            nr_of_tries += 1
            users = int(input(msg))
        except ValueError: 
            print("Numbers please. Numbers only. Or Ctrl+c to quit.")
            continue
        if users > secret: print("Too high!"); high = users; range_close = ")"
        if users < secret: print("Too low!"); low = users; range_open = "("
    if users != secret: 
        print("Ouch. A shame, but you were only allowed %d tries in total." % max_nr_of_tries)
    else: 
        print("Well done, it was indeed %d, took you %d out of %d tries! Thanks for playing!" % (secret, nr_of_tries, max_nr_of_tries))


