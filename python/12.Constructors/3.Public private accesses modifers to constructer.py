class MyClass:
    
    def __init__(self):
        self.name = "Alice"
        print("Public constructor called.")

    
    def _init_(self):
        self.name = "Bob"
        print("Protected constructor called.")

    
    def __init__(self):
        self.name = "Charlie"
        print("Private constructor called.")


obj = MyClass()  
