import cv2

# paramaters - path, 0 denotes read img as grayscale img, 1 for colorful
img = cv2.imread('bg.jpg',1)

# this is using for displaying image
cv2.imshow('image', img)

# this is necessary so that the image doesn't close immediately
cv2.waitKey(8183)        # show for that time(in millisecond)

# it will run continuously until any key is pressed
cv2.destroyAllWindows()