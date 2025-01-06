class MyClass:
    
    def __init__(self, name="Unknown", age=None):
        self.name = name
        self.age = age if age is not None else "Age not provided"
        print(f"Constructor called. Name: {self.name}, Age: {self.age}")


person1 = MyClass("Alice", 30)


person2 = MyClass("Bob")


person3 = MyClass()
