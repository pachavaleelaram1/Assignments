try:
    raise Exception("This is a custom exception message.")
except Exception as e:
    print("Caught custom exception:", e)

