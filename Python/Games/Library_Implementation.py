books = ['Think And Grow Rich', 'The One Thing', 'You Can You Will', 'Power of Habit']
flag = 0

def show():
    print("Available books are:", books)


def add():
    ad = int(input('How many books do you want to add: '))
    print('Enter the name of book/s which you want to add: ')
    while ad > 0 :
        ad -= 1
        books.append(input())

    print('Books are added to library')


def issue():
    show()
    print(books[int(input("Enter the number of book which you want to issue: "))-1], end="")    # to not get index
    print(' ,Book Issued...')
    print('If you want to issue another book, you have to return last book first...')




while True:
    ch = int(input("\nEnter your choice \n1.Show Available Books \n2.Add Books \n3.Issue Book  \n4.Return Book \n5.Exit\n"))
    
    if ch == 1:
        show()

    elif ch == 2:
        add()

    elif ch == 3:
        issue()

    elif ch == 4:
        pass
    
    elif ch == 5:
        flag = 1
        break