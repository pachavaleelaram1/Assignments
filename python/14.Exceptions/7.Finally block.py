try:
    result = 10 / 0  # Will cause ZeroDivisionError
except ZeroDivisionError as e:
    print("Caught exception:", e)
finally:
    print("Finally block always executes.")
