nested_dict = {
    201: {"name": "Alice", "grade": "A"},
    202: {"name": "Bob", "grade": "B"},
    203: {"name": "Charlie", "grade": "A"},
}

print("Details for Student ID 201:", nested_dict[201])
print("Name of Student ID 202:", nested_dict[202]["name"])
print("Grade of Student ID 203:", nested_dict[203]["grade"])
