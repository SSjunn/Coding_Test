def solution(n):
    pizza = 6 #pizza를 6조각으로 나눠
    while pizza % n !=0: # 6조각을 사람으로 나눴을때 아니면 출력
        pizza+= 6
    return pizza // 6 # pizza조각을 다시판으로 반환