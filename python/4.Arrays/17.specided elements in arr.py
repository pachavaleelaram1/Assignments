# 17. Method to verify if the array contains two specified elements (12,23)

def verify_elements(arr):
    return 12 in arr and 23 in arr

arr = [1, 2, 12, 23, 4, 5]
print("Array contains 12 and 23:", verify_elements(arr))
