from tkinter import *

root = Tk()

root.geometry("544x433")
root.title("This is my GUI")


f1 = Frame(root, bg='yellow', borderwidth=6, relief=SUNKEN)
f1.pack(side='left')

l = Label(f1, text='this is label under the frame').pack()
l.pack()

root.mainloop()