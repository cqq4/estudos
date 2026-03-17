import pyautogui as auto
import time
auto.PAUSE = 1.5
auto.press('win')
auto.write('edge')
auto.press('ENTER')
auto.write('x.com/home')
auto.press('ENTER')
auto.PAUSE = 2.9
auto.FAILSAFE = True
for i in range (5):
    auto.doubleClick(x=680, y=286) #coordenadas variaveis da tela
    auto.write('@ oi')
    auto.press('ENTER')
    auto.doubleClick(x= 715, y=390)
    time.sleep(1)
    auto.doubleClick(x=680, y=286)
    auto.write('@ oiii')
    auto.press('ENTER')
    auto.doubleClick(x= 715, y=390)