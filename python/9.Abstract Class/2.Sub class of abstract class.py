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
    
    
    def abstract_method(self):
        print("Abstract method implemented in ChildClass.")
        
    
    def create_instance_and_call_abstract_method(self):
        
        child_instance = ChildClass()
        
        
        child_instance.abstract_method()


if __name__ == "__main__":
    
    child_obj = ChildClass()
    
    
    child_obj.create_instance_and_call_abstract_method()
