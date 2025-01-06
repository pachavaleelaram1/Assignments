class ParentClass:
    
    __private_field = "This is a private field"
    
    
    def __private_method(self):
        print("This is a private method.")

    
    def access_private_data(self):
        print("Accessing private data from public method:")
        print(self.__private_field)  
        self.__private_method()  


class ChildClass(ParentClass):
    def __init__(self):
       
        try:
            print(self.__private_field)  
        except AttributeError:
            print("Cannot access private field in subclass.")

        try:
            self.__private_method()  
        except AttributeError:
            print("Cannot access private method in subclass.")



if __name__ == "__main__":
    parent_obj = ParentClass()
    parent_obj.access_private_data()  

    
