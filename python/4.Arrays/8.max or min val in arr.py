# 8. Function to find the minimum and maximum value of an array

def find_min_max(arr):
    return min(arr), max(arr)

arr = [1, 2, 3, 4, 5]
min_val, max_val = find_min_max(arr)
print("Minimum value:", min_val)
print("Maximum value:", max_val)

