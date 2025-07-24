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
# 다른 방법( 실무에서 거의 쓰지 않아. 가독성이 안좋아)
def solution(dot):
    quad = [(3,2),(4,1)]  # 사분면을 저장한 리스트
    return quad[dot[0]>0][dot[1] > 0] # 조건에 따라 사분면 번호 선택!!
    
    # quad[a][b]의 의미
    # a = dot[0] > 0 → x가 양수면 1, 음수면 0 (리스트의 행 선택)
    # b = dot[1] > 0 → y가 양수면 1, 음수면 0 (튜플의 열 선택)

    # quad[0][0] → x<0, y<0 (3사분면)
    # quad[0][1] → x<0, y>0 (2사분면)    
    # quad[1][0] → x>0, y<0 (4사분면)    
    # quad[1][1] → x>0, y>0 (1사분면)
    
'''
