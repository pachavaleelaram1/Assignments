# 4. Define a static variable and change within the class

class MyClass:
    static_variable = "I am a static variable"

MyClass.static_variable = "Changed within class"
print(MyClass.static_variable)
obj = MyClass()
print(obj.static_variable)
