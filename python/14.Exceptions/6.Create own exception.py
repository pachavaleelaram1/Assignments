class MyCustomException(Exception):
    def __init__(self, message):
        super().__init__(message)


try:
    raise MyCustomException("This is my custom exception.")
except MyCustomException as e:
    print("Caught custom exception:", e)
