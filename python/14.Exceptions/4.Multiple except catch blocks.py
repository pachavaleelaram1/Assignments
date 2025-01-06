try:
    num = int("abc")  # This will raise a ValueError
except ZeroDivisionError as e:
    print("Caught a ZeroDivisionError:", e)
except ValueError as e:
    print("Caught a ValueError:", e)
except Exception as e:
    print("Caught a general exception:", e)
