dist = int(input())
consumo = float(input())
temp = int(input())
calc = dist*consumo
if temp < 20:
    calc = calc *1.20
if temp > 35:
    calc = calc*1.10
print(f"{calc:.2f} mAh") 