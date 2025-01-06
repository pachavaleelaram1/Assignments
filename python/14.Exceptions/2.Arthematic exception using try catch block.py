try:
    result = 10 / 0  # Causes ZeroDivisionError
except ZeroDivisionError as e:
    print("Caught Arithmetic Exception:", e)
