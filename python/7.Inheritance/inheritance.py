# Super class A
class A:
    def __init__(self):
        self.a = 10

    def methodA1(self):
        print("Method A1 in class A")

    def methodA2(self):
        print("Method A2 in class A")

    def overrideMethod(self):
        print("Override method in class A")

# Sub class B of A
class B(A):
    def __init__(self):
        super().__init__()
        self.b = 20

    def methodB1(self):
        print("Method B1 in class B")

    def methodB2(self):
        print("Method B2 in class B")

    def overrideMethod(self):
        print("Override method in class B")

# Sub class C of B
class C(B):
    def __init__(self):
        super().__init__()
        self.c = 30

    def methodC1(self):
        print("Method C1 in class C")

    def methodC2(self):
        print("Method C2 in class C")

    def overrideMethod(self):
        print("Override method in class C")

def main():
    a = A()
    b = B()
    c = C()

    print("Class A methods:")
    a.methodA1()
    a.methodA2()
    a.overrideMethod()

    print("\nClass B methods:")
    b.methodA1()
    b.methodA2()
    b.methodB1()
    b.methodB2()
    b.overrideMethod()

    print("\nClass C methods:")
    c.methodA1()
    c.methodA2()
    c.methodB1()
    c.methodB2()
    c.methodC1()
    c.methodC2()
    c.overrideMethod()

    print("\nRuntime Polymorphism:")
    a_ref = c
    a_ref.overrideMethod()

    print("\nData Members:")
    print("Class A data member:", a.a)
    print("Class B data member:", b.b)
    print("Class C data member:", c.c)

    print("\nRuntime Polymorphism with Data Members:")
    a_ref = c
    print("Class C data member accessed through a_ref:", a_ref.c)

if __name__ == "__main__":
    main()
