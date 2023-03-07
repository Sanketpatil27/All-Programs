from tkinter import *
from PIL import Image, ImageTk

root = Tk()

root.geometry("288x512")


# only for png file
photo = PhotoImage(file="4_img.png")


# # for jpg images
# image = Image.open("4_img_.jpg")
# photo = ImageTk.PhotoImage(image)


photo_label = Label(image= photo)
photo_label.pack()

root.mainloop()