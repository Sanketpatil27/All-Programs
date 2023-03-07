class Programer:
    company = 'Microsoft'
    
    def __init__(self,name,salary):
        self.nm = name
        self.sal = salary

    def getInfo(self):
        print(f'\nWorking company of programer: {self.company}')
        print(f'Name of programer: {self.nm}')
        print(f'Salary of programer: {self.sal}')


harry = Programer('harry', 100)
Carry = Programer('carry', 200)
Larry = Programer('larry', 300)

harry.getInfo()
Carry.getInfo()
Larry.getInfo()