# 15. Method to find number of even number and odd numbers in an array

def count_even_odd(arr):
    even_count = sum(1 for x in arr if x % 2 == 0)
    odd_count = len(arr) - even_count
    return even_count, odd_count

arr = [1, 2, 3, 4, 5, 6]
even_count, odd_count = count_even_odd(arr)
print("Even count:", even_count)
print("Odd count:", odd_count)
