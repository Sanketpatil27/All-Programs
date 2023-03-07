import cv2
import mediapipe as mp

cap = cv2.VideoCapture(0)
hand_detector = mp.solutions.hands.Hands()
drawing_utils = mp.solutions.drawing_utils

while True:
    _, frame = cap.read()
    frame = cv2.flip(frame, 1)          # flip frame on the y axis(means here 1), to get the real video not the mirror video
    rgb_frame = cv2.cvtColor(frame, cv2.COLOR_BGR2RGB)
    output = hand_detector.process(rgb_frame)
    hands = output.multi_hand_landmarks
    if hands:
        for hand in hands:
            # on the frame, landarkms are the points on the hands(there are 21 landmarks)
            drawing_utils.draw_landmarks(frame, hand)  
            landmarks = hand.landmark
            for id, landmark in enumerate(landmarks):
                x = landmark.x
                y = landmark.y
                # print(x, y)
                if id == 8:     # id is pointing to landmarks as index number
                    # cv2.circle(img=frame, center=(x, y), radius = 10, color = (0, 255, 255))
                    pass


    cv2.imshow('virtual mouse', frame)
    cv2.waitKey(1)