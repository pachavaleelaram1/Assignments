# 2. Define a static variable and access that through an instance

class MyClass:
    static_variable = "I am a static variable"

obj = MyClass()
print(obj.static_variable)
