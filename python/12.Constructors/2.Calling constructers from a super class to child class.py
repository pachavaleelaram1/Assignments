class Parent:
    def __init__(self, name):
        self.name = name
        print(f"Parent constructor called. Name: {self.name}")

class Child(Parent):
    def __init__(self, name, age):
        
        super().__init__(name)
        self.age = age
        print(f"Child constructor called. Age: {self.age}")


child_obj = Child("Alice", 10)
