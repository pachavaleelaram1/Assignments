# 11.Program to check whether a number is EVEN or ODD using switch (Note: Python does not have a switch statement, so we use if-else instead)

def even_odd(num):
    if num%2==0:
        return "EVEN"
    else:
        return "ODD"
num=10
print(num, "is", even_odd(num))
