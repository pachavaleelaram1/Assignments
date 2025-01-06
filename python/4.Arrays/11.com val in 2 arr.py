# 11. Program to find the common values between two arrays

def find_common_values(arr1, arr2):
    return [x for x in arr1 if x in arr2]

arr1 = [1, 2, 3, 4, 5]
arr2 = [4, 5, 6, 7, 8]
print("Common values:", find_common_values(arr1, arr2))
