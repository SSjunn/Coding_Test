def solution(land):
    for i in range(1, len(land)):         # 두 번째 행부터 시작
        for j in range(4):                # 각 열(0~3)을 반복
            # 현재 위치 land[i][j]에, 이전 행에서 j열을 제외한 나머지 중 최대값을 더함
            land[i][j] += max(land[i - 1][k] for k in range(4) if k != j)

    return max(land[-1])  # 마지막 줄에서 최대값이 정답
