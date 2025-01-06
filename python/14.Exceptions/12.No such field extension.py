
try:
    obj = "Hello"
    print(obj.non_existent_field)  # Trying to access an attribute that doesn't exist
except AttributeError as e:
    print("NoSuchFieldException equivalent caught:", e)
