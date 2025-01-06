
class ParentClass:
    
    _protected_field = "This is a protected field"
    
    
    def _protected_method(self):
        print("This is a protected method.")
        
   
    def access_protected_data(self):
        print("Accessing protected field from ParentClass:", self._protected_field)
        self._protected_method()


class ChildClass(ParentClass):
    def __init__(self):
        
        print("Accessing protected field from ChildClass:", self._protected_field)
        self._protected_method() 
        
   
    def access_child_protected_data(self):
        print("Accessing protected data from ChildClass:")
        print(self._protected_field)  
        self._protected_method()  



if __name__ == "__main__":
    print("---- Access from ParentClass ----")
    parent_obj = ParentClass()
    parent_obj.access_protected_data()  
    
    print("\n---- Access from ChildClass (Same Package) ----")
    child_obj = ChildClass()
    child_obj.access_child_protected_data()  

    print("\n---- Access from Main (Different Package) ----")
 
    print(f"Accessing protected field directly from main: {child_obj._protected_field}")
    child_obj._protected_method() 
