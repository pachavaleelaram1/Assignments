from abc import ABC, abstractmethod


class Shape(ABC):
    
    
    @abstractmethod
    def area(self):
        pass
    
    
    def display_shape(self):
        print("This is a shape.")


class Circle(Shape):
    
    def __init__(self, radius):
        self.radius = radius

    
    def area(self):
        return 3.14159 * (self.radius ** 2)
    
    
    def call_display_shape(self):
        self.display_shape()


class Square(Shape):
    
    def __init__(self, side):
        self.side = side

    
    def area(self):
        return self.side * self.side
    
    
    def call_display_shape(self):
        self.display_shape()


if __name__ == "__main__":
    
    circle = Circle(5)
    circle.call_display_shape()  
    print(f"Area of Circle: {circle.area()}")  
    
    
    square = Square(4)
    square.call_display_shape()  
    print(f"Area of Square: {square.area()}")  

