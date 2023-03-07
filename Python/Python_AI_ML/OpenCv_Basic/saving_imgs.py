import cv2

img = cv2.imread('bg.jpg', 1)

# save img
status = cv2.imwrite('F:\programs\Python_AI_ML\OpenCv_Basic\1bg.jpg', 0, img)
print('image written to file system:', status)