# 3.Program to find the index of an array element

def find_index(arr, target):
    try:
        return arr.index(target)
    except ValueError:
        return "Element not found in array"

arr = [1, 2, 3, 4, 5]
target = 3
print("Index of", target, "in array:", find_index(arr, target))
