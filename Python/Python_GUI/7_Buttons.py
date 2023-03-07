from tkinter import *

root = Tk()

def hello():
    print("hello tkinter!")


root.geometry("544x433")
root.title("This is my GUI")


# f1 = Frame(root, borderwidth=6, )
# f1.pack(side='left')

# btn = Button(f1, text='Submit', fg='red', command=hello)
btn = Button(text='Submit', fg='red', command=hello, activebackground = 'red', activeforeground = 'yellow')        # command get the function name
btn.pack(anchor='nw')

root.mainloop()