# 6.Function to copy an array to another array

def copy_array(arr):
    return arr.copy()

arr = [1, 2, 3, 4, 5]
copied_arr = copy_array(arr)
print("Copied array:", copied_arr)
