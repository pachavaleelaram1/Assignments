
class Class1:
    def __init__(self, name):
        self.name = name  

    def greet(self):
        print(f"Hello, {self.name}! This is Class1.")


class Class2:
    def __init__(self, name):
        self.name = name  

    def greet(self):
        print(f"Hello, {self.name}! This is Class2.")


if __name__ == "__main__":
    
    obj1 = Class1("Alice")  
    obj2 = Class2("Bob")    

    
    obj1.greet()  
    obj2.greet()  
