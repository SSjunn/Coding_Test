def solution(n):
    answer = 0
    for i in range(1, n + 1):      # i를 1부터 n까지 반복
        j = n % i                  # n을 i로 나눈 나머지를 구함
        if j == 0:                 # 나머지가 0이면, i는 n의 약수
            answer += 1           # 약수 하나당 (i, n//i) 쌍이 만들어지므로 1개 카운트
        else:
            continue               # 나누어떨어지지 않으면 패스
    return answer
