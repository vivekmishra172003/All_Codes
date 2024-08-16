public  class SplitExample{
    public static void main(String[] args){
        System.out.println("");
        String str = "apple,banana,cherry,blossom";
        String[] s = str.split(",");
        for(String ss : s){
            System.out.print(ss+" ");
        }
    }
}