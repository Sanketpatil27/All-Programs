# a child class automatically calles the parent class constructor without object of parent class created!

class Person():
    country = "India"

    def __init__(self):
        print("Initializing Person class.....\n")

    def takeBreath(self):
        self.name = 'hrry'
        print("I'm Breathing!")
        print(f"self = {self.name}")


class Emp(Person):

    # def __init__(self):
    #     super().__init__()
    #     print("Initializing Employee class.....\n")

    def takeBreath(self):
        # super().__init__()              # function can also call constructor
        
        # self.name = 'crry'          # this name will change in fun. of person class
        # super().takeBreath()         
        print("I'm Employee, so I am also Breathing!")

    
class Programmer(Emp):

    def __init__(self):
        super().__init__()
        print("Initializing Programmer class.....\n")



p = Person()

e = Emp()           # automatically call the second constructor when no constructor is defined in this class
# e.takeBreath()              

# pr = Programmer()