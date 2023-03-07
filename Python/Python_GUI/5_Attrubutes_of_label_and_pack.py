from tkinter import *

root = Tk()

root.geometry("544x433")
root.title("This is my GUI")

label_text = Label(text='''Lorem Ipsum, sometimes referred to as 'lipsum', is \nthe placeholder text used in design when creating\n content. It helps designers plan out where the\n content will sit, without needing to wait for\n the content to be  and approve''', bg='red', fg='white', font='comicsansns 19 bold')


# pack options ->

# label_text.pack(side= 'left', anchor='nw', fill=Y)  # north west, fill in Y direction(must given left or right side)


label_text.pack(side='bottom', fill=X, padx=23, pady=34)        # fill in X direction

root.mainloop()
