def solution(n):
    i = 1
    fact = 1

    while fact * (i + 1) <= n:
        i += 1
        fact *= i

    return i
