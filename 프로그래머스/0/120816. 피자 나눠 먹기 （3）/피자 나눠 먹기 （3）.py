def solution(slice, n):
    answer = n // slice # n명을 slice로 나눈 몫을 answer에 저장 
    
    if n%slice!=0: #정확히 나누어지지 않아
        answer +=1
    return answer