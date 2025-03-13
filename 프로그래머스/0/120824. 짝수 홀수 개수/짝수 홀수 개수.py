def solution(num_list):
    even_number, ght_number = 0,0  #홀수 변수 생성
    for n in num_list: # 숫자 num_list count
        if n%2==0:  # 짝수
            even_number+=1
        else: # 홀수
            ght_number+=1
    return [even_number, ght_number]