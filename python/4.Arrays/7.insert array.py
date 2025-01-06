# 7.Function to insert an element at a specific position in the array

def insert_element(arr, target, position):
    arr.insert(position, target)
    return arr

arr = [1, 2, 3, 4, 5]
target = 10
position = 2
print("Array after inserting", target, "at position", position, ":", insert_element(arr, target, position))
