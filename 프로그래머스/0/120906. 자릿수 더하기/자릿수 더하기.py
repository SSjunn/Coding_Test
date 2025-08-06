def solution(n):
    answer = 0
    line = list(map(int,str(n)))
    for i in line:
        answer+=i
    return answer