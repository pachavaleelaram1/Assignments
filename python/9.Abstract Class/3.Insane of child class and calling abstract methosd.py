
from abstract_class import AbstractClass

class AnotherChildClass(AbstractClass):
    
    def abstract_method(self):
        print("Abstract method implemented in AnotherChildClass.")

    def call_abstract_method(self):
        self.abstract_method()


if __name__ == "__main__":
    another_child_obj = AnotherChildClass()
    another_child_obj.call_abstract_method()  
