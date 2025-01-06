
file_path = "C:/Users/sande/OneDrive/Pictures/sample.txt"


with open(file_path, 'r') as file:
    file.seek(15) 
    data = file.read(10)  
    print("Data read after seeking to index 15:", data)
