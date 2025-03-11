def solution(array):
    count = [0] * (max(array) + 1)
    
    for i in array:
        count[i] += 1

    max_count = max(count)  # 최댓값을 한 번만 계산
    if count.count(max_count) > 1:  # 최빈값이 여러 개면 -1 반환
        return -1
    else:
        return count.index(max_count)  # 최빈값 숫자 반환
