class Solution {
        public int solution(String s) {
            StringBuffer sb = new StringBuffer();
            String temp = "";

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                // 숫자
                if (c >= '0' && c <= '9') {
                    sb.append(c);
                    continue;
                }

                // 영어 조립
                temp += c;
                
                // 영어 case 문
                switch (temp) {
                    case "zero":
                        sb.append("0");
                        temp = "";
                        break;
                    case "one":
                        sb.append("1");
                        temp = "";
                        break;
                    case "two":
                        sb.append("2");
                        temp = "";
                        break;
                    case "three":
                        sb.append("3");
                        temp = "";
                        break;
                    case "four":
                        sb.append("4");
                        temp = "";
                        break;
                    case "five":
                        sb.append("5");
                        temp = "";
                        break;
                    case "six":
                        sb.append("6");
                        temp = "";
                        break;
                    case "seven":
                        sb.append("7");
                        temp = "";
                        break;
                    case "eight":
                        sb.append("8");
                        temp = "";
                        break;
                    case "nine":
                        sb.append("9");
                        temp = "";
                        break;
                }
            }

            return Integer.parseInt(sb.toString());
        }
    }