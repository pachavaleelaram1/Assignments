try:
    with open("/root/protected_file.txt", "r") as file:  # Trying to read a protected file
        content = file.read()
except IOError as e:
    print("IOError occurred:", e)
