
file_path = "C:/Users/sande/OneDrive/Pictures/sample.txt"

with open(file_path, 'r') as file:
    content = file.read()
    print("File Content:")
    print(content)
