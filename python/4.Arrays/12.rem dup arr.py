# 12. Method to remove duplicate elements from an array

def remove_duplicates(arr):
    return list(set(arr))

arr = [1, 2, 2, 3, 4, 4, 5]
print("Array after removing duplicates:", remove_duplicates(arr))
