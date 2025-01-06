
file_path = "C:/Users/sande/OneDrive/Pictures/sample.txt"


with open(file_path, 'rb') as file:
    byte = file.read(1)  
    while byte:
        print(byte.decode('utf-8', errors='ignore'), end='')
        byte = file.read(1)
