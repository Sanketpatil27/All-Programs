class Emp:
    @staticmethod               # constructor can also static
    def __init__():             
        print('this is under class, first constructor!')


    def __init__(self,name,salary,unit):        # this is overriding the first constructor
        self.nm = name
        self .sal = salary
        self.ut = unit
        print('Employee is created')

    def getInfo(self):
        print(f'Name of emp: {self.nm}')
        print(f'Salary of emp: {self.sal}')
        print(f'Unit of emp: {self.ut}')

    

# obj = Emp()       # Emp.__init__()    --> without self    

obj = Emp('harry', 100, 'YouTube')        # Emp.__init__(obj)  --> with self
obj.getInfo()

marry = Emp('carry', 200, 'Maps')        
marry.getInfo()