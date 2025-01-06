# 10.Program to palindrome or not

def is_palindrome(num):
    return str(num)==str(num)[::-1]

num=121
if is_palindrome(num):
    print(num, "is a palindrome number.")
else:
    print(num, "is not a palindrome number.")
