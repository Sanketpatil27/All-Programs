class Animal:
    def __init__(self):
        print("Animal is created!")

class Pets(Animal):
    def __init__(self):
        super().__init__()
        print('Pets are created!!')

class Dog(Pets):
    @staticmethod   # coz we don't need self object
    def bark():
        # super().__init__()            # doesn't need it automatically calls parent constructor
        print("Dog is barking!")
    pass

d = Dog()
d.bark()
