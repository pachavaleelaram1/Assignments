# 3. Define a static variable and change within the instance

class MyClass:
    static_variable = "I am a static variable"

obj = MyClass()
obj.static_variable = "Changed within instance"
print(MyClass.static_variable)  # prints the original value
print(obj.static_variable)  # prints the changed value
