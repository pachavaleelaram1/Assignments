class MyClass:
    def __init__(self, name, age):
        self.name = name   
        self.age = age     
        print(f"Name: {self.name}, Age: {self.age}")

    def display(self):
        print(f"Name: {self.name}, Age: {self.age}")

# Instantiating the class
person = MyClass("Alice", 30)
person.display()
