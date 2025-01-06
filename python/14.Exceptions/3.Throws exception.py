def risky_method():
    raise ZeroDivisionError("ArithmeticException thrown from risky_method")


risky_method()  # This will raise an unhandled exception

