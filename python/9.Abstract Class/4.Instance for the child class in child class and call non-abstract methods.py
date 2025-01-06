from abc import ABC, abstractmethod


class AbstractClass(ABC):
    
    @abstractmethod
    def abstract_method(self):
        pass

    
    def non_abstract_method(self):
        print("This is a non-abstract method in the abstract class.")


class ChildClass(AbstractClass):
    
    def __init__(self):
        print("ChildClass object created.")
        
        
        self.create_and_call_non_abstract_method()
    
    
    def abstract_method(self):
        print("Abstract method implemented in ChildClass.")
    
    
    def create_and_call_non_abstract_method(self):
        
        child_instance = ChildClass()
        
        
        child_instance.non_abstract_method()


if __name__ == "__main__":
    
    child_obj = ChildClass()
