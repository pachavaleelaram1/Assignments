# 14. Method to find the second largest number in an array

def find_second_largest(arr):
    if len(arr) < 2:
        return None
    max_val = second_max = float('-inf')
    for x in arr:
        if x > max_val:
            second_max = max_val
            max_val = x
        elif x > second_max and x != max_val:
            second_max = x
    return second_max

arr = [1, 2, 3, 4, 5]
print("Second largest number:", find_second_largest(arr))
