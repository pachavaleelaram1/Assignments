# 16. Function to get the difference of largest and smallest value

def difference_largest_smallest(arr):
    return max(arr) - min(arr)

arr = [1, 2, 3, 4, 5]
print("Difference of largest and smallest value:", difference_largest_smallest(arr))
