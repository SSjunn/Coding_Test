def solution(n, k):
    n_m = 12000
    k_m = 2000
    free = n//10
    result = (n*n_m) +((k-free)*k_m)
    return result

'''
    #최적화를 시킨다면
    def solution(n, k):
    return (n * 12000) + ((k - n // 10) * 2000)
'''
