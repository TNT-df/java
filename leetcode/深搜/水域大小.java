����һ�����ڱ�ʾһƬ���ص���������land���þ�����ÿ�����ֵ�����Ӧ�ص�ĺ��θ߶ȡ���ֵΪ0���ʾˮ���ɴ�ֱ��ˮƽ��Խ����ӵ�ˮ��Ϊ�����������Ĵ�С��ָ�����ӵ�ˮ��ĸ�������дһ��������������������г����Ĵ�С������ֵ��Ҫ��С��������

ʾ����

���룺
[
  [0,2,1,0],
  [0,1,0,1],
  [1,1,0,1],
  [0,1,0,1]
]
����� [1,2,4]



class Solution {
    int[] dx ={-1,-1,0,1,1,1,0,-1};
    int[] dy ={0,1,1,1,0,-1,-1,-1};
    public int[] pondSizes(int[][] land) {
        List<Integer> list = new ArrayList<>();
        boolean [][] b =new boolean[land.length][land[0].length];
         int tmep=0;
     for(int i = 0;i < land.length;i++){      
         for(int j = 0;j < land[i].length;j++){
          if(land[i][j]==0&&b[i][j]==false){
             tmep=dfs(land,i,j,b);
              list.add(tmep);
          }
         }    
     }

     int [] re = new int[list.size()];
     for(int i = 0;i<re.length;i++){
         re[i] =list.get(i);
     }
      Arrays.sort(re);
      return re;
    }
    public int dfs(int land[][],int x,int y,boolean[][] b){
        int ret =1;
        b[x][y] = true;
        for(int i =0;i<8 ;i++ ){
            int a = x+dx[i];
            int m = y+dy[i];
            if(a>=0&&a<land.length &&m>=0&&m<land[0].length&&land[a][m]==0&&b[a][m]==false){
                ret+=dfs(land,a,m,b);
            }
        }
        return ret;
    }
}