
file_path = "C:/Users/sande/OneDrive/Pictures/sample.txt"

with open(file_path, 'rb') as file:
    file.seek(10)  
    data = file.read(5)  
    print("Random access read data:", data.decode('utf-8', errors='ignore'))
