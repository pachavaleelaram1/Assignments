def main():
    a = 10
    b = 0
    try:
        result = a / b
        print("Result:", result)
    except ZeroDivisionError:
        print("Error: Division by zero is not allowed.")

if __name__ == "__main__":
    main()
