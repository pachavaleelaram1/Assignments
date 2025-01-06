# 12.Print gender (Male/Female) program according to given M/F using switch (Note: Python does not have a switch statement, so we use if-else instead)

def print_gender(gender):
    if gender.upper()=="M":
        return "Male"
    elif gender.upper()=="F":
        return "Female"
    else:
        return "Invalid input"

gender="M"
print("Gender:", print_gender(gender))
