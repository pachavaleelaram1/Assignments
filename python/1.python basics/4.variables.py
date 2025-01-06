#Local and Global Variables

'''In Python, variables can be local or global.

•⁠  ⁠Local variables are defined inside a function and can only be used within that function.
•⁠  ⁠Global variables are defined outside a function and can be used anywhere in the program.'''

# Here's an example:


x=15  # global variable
def my_func():
    x =9  # local variable
    print("Inside function:", x)
my_func()
print("Outside function:", x)
