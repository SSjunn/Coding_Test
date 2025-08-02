def solution(emergency):
    n = len(emergency)
    rank = [1] * n  # 모든 사람의 초기 등수는 1등으로 설정

    # 자기보다 높은 숫자가 몇개인지
    for i in range(n):
        for j in range(n):
            if emergency[i] < emergency[j]:
                rank[i] += 1

    return rank
