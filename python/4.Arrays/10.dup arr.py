# 10. Function to find the duplicate values of an array

def find_duplicates(arr):
    return [x for x in arr if arr.count(x) > 1]

arr = [1, 2, 2, 3, 4, 4, 5]
print("Duplicate values:", find_duplicates(arr))

