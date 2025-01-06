# 5.Function to remove a specific element from an array

def remove_element(arr, target):
    if target in arr:
        arr.remove(target)
    return arr

arr = [1, 2, 3, 4, 5]
target = 3
print("Array after removing", target, ":", remove_element(arr, target))
