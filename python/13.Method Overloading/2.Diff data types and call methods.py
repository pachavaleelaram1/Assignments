def print_info(name, *args):
    print(f"Name: {name}")
    for arg in args:
        print(f"Additional Info: {arg}")

# Calling the method with a string and then an integer
print_info("Alice", 25)

# Calling the method with a string, an integer, and a float
print_info("Bob", 30, 5.8)
