# 1 : 예각, 2 : 직각, 3 : 둔각, 4 : 평각
def solution(angle):
    if 0<angle<90:
        return 1
    elif angle == 90:
        return 2
    elif 90 < angle < 180:
        return 3
    else:
        return 4