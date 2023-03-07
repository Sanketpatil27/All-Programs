from tkinter import * 

root = Tk()
root.geometry('544x343')


def getInfo():
    print(f'fname: {fnm.get()} \nmname: {mnm.get()} \nlname: {lnm.get()} \nAge: {age.get()}')
    print(f'Class: {cls.get()} \nRoll: {roll.get()}')


Label(text="Enter FName: ", font= 'bold', fg = 'brown').grid()
Label(text="Enter mName: ", font= 'bold', fg = 'brown').grid()
Label(text="Enter LName: ", font= 'bold', fg = 'brown').grid()
Label(text="Enter Roll No.: ", font= 'bold', fg = 'brown').grid()
Label(text="Enter Age: ", font= 'bold', fg = 'brown').grid()
Label(text="Enter Class: ", font= 'bold', fg = 'brown').grid()

fnm = StringVar()
mnm = StringVar()
lnm = StringVar()
age = StringVar()
cls = StringVar()
roll = StringVar()


entry1 = Entry(root, textvariable = fnm).grid(row='0', column='1')
entry2 = Entry(root, textvariable = mnm).grid(row='1', column='1')
entry3 = Entry(root, textvariable = lnm).grid(row='2', column='1')
entry4 = Entry(root, textvariable = age).grid(row='3', column='1')
entry5 = Entry(root, textvariable = cls).grid(row='4', column='1')
entry6 = Entry(root, textvariable = roll).grid(row='5', column='1')



Button(root, text='submit', command=getInfo, bg = 'blue', fg = 'white').grid()

root.mainloop()