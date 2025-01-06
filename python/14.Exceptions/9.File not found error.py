try:
    with open("nonexistent_file.txt", "r") as file:
        content = file.read()
except FileNotFoundError as e:
    print("File not found:", e)
