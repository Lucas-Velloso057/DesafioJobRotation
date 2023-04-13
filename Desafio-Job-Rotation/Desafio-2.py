fibo = [0,1]                                          #Inicializa a lista do fibonacci
consulta = input("Insira o número a consultar: ")     #Recebe um valor para comparar

while(int(consulta) > fibo[-1]):
  fibo.append(fibo[-1] + fibo[-2])                    #Incrementa a lista com a sequência do fibonacci até o valor de entrada

if(int(consulta) in fibo):                            #Compara se o valor de entrada pertence a lista de fibonacci
  print(f"O número {consulta} pertence a sequência de Fibonacci")
else:
  print(f"O número {consulta} não pertence a sequência de Fibonacci")