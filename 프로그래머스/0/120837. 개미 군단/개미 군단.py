def solution(hp):
    answer = 0
    A1 = hp // 5
    hp%= 5
    A2 = hp // 3
    hp%=3
    A3 = hp
    answer = A1 + A2 + A3
    return answer