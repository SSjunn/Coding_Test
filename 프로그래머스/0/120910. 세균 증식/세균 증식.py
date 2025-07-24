def solution(n, t):
    answer = n*(2**t)
    return answer
# 2**t : 1시간마다 2배씩 증가, t시간 후 증가 비율
# n*(2**t) : 처음 개체 n이 2**t배 만큼 불어나 최종 마릿
