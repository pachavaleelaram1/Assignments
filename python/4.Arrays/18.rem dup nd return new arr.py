# 18. Program to remove the duplicate elements and return the new array

def remove_duplicates(arr):
    return list(set(arr))

arr = [1, 2, 2, 3, 4, 4, 5]
print("Array after removing duplicates:", remove_duplicates(arr))
