def solution(numbers, k):
    idx = 0 #  시작 인덱스(1 번 사람)
    
    # 공을 k번째로 던질 때까지 반복(k-1번 이동)
    for _ in range(k-1):
        idx = (idx + 2) % len(numbers)
        # 오른쪽으로 한 명 건너뛰고 + 원형 처리
    
    return numbers[idx]