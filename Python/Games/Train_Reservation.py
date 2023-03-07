class Train:

    def __init__(self, name, fare):
        self.nm = name
        self.sits = sitsareSet          # this is acceptable
        self.fare = fare

    def getStatus(self):    
        print(f'\n\t\t\t\tThis is {self.nm}')
        print('\t\t\t\t--------------------------------')

    def getInfo(self):
        print(f'\navailable seats are: {len(sitsareSet)}')
        print(f'Price of the ticket is: Rs.{self.fare}\n')

    def bookTicket(self):
        print(f'Your seat no. is: {len(sitsareSet)}')
        self.sits.remove(len(sitsareSet))
    
    def cancelTicket(self):
        no = int(input('\nEnter your seat no.: '))
        sitsareSet.add(no)
        # print(self.sits)       # print(sitsareSet)  both are runable




sitsareSet = {1,2,3,4,5,6,7,8,9,10}

Rajadhani = Train('Rajadhani Express: 39400', 80)
Rajadhani.getStatus()
Rajadhani.getInfo()
Rajadhani.bookTicket()
Rajadhani.bookTicket()
Rajadhani.cancelTicket()
Rajadhani.getInfo()