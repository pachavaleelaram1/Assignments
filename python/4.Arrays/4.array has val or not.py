# 4.Function to test if array contains a specific value

def contains_value(arr, target):
    return target in arr

arr = [1, 2, 3, 4, 5]
target = 3
print("Does array contain", target, ":", contains_value(arr, target))
