
file_path = "output.txt"


text_to_write = input("Enter the text to write to the file: ")


with open(file_path, 'w') as file:
    file.write(text_to_write)

print(f"Text written to {file_path}")
