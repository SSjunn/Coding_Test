def solution(dot):
    x,y = dot
    
    if x > 0 and y>0:
        return 1
    if x < 0 and y>0:
        return 2
    if x < 0 and y<0:
        return 3
    if x > 0 and y<0:
        return 4

'''
# 이게 더 빠른 방법이야.
def solution(dot):
    quad = [(3,2),(4,1)]  # 사분면을 저장한 리스트
    return quad[dot[0] > 0][dot[1] > 0] # 조건에 따라 사분면 번호 선택!!
'''
