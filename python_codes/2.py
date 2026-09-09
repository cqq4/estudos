hora_inicio = int(input())
hora_final = int(input())
calc = hora_inicio - hora_final
if hora_inicio >= hora_final:
    calc = (24 - hora_inicio)+ hora_final
print(f"O JOGO DUROU {calc} HORA(S)")
