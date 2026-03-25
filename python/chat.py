import pyautogui as auto
import time
auto.pause = 1.5
auto.doubleClick(x= 500, y=1030)
for i in range (300):
    auto.write('oi')
    auto.press ('ENTER')
