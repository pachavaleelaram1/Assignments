
class PublicClass:
    
    public_field = "This is a public field"
    
    
    def public_method(self):
        print("This is a public method.")



class ChildClass(PublicClass):
    def __init__(self):
        
        print("Accessing public field from ChildClass:", self.public_field)
        self.public_method()  




if __name__ == "__main__":
    
    print("---- Access from PublicClass ----")
    public_obj = PublicClass()
    print("Accessing public field from PublicClass:", public_obj.public_field)
    public_obj.public_method()

    
    print("\n---- Access from ChildClass (Inheriting PublicClass) ----")
    child_obj = ChildClass()
    child_obj.public_method()  

   
    print("\n---- Accessing Public Members Directly in Main ----")
    print("Accessing public field directly from main:", child_obj.public_field)
    child_obj.public_method()  
