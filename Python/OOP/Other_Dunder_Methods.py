# dunder methods  

class Number:
    def __init__(self, num):
        self.num = num

    def __add__(self, num2):
        print('Lets add: ')
        return self.num + num2.num
    
    def __str__(self):                      # called automatically when object is printed
        return f"decimal number: {self.num}"
    
    def __len__(self):          
        return 1



n1 = Number(4)
s = n1 + n1
print(s) 
print(n1)       # it will return value under n1 function after __str__ method
print(len(n1))