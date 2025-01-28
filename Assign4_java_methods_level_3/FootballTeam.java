import java.util.Random;
public class FootballTeam{
    public static int[] makeArray(int numPlayers){
	    Random rand=new Random();
		int[] heights=new int[numPlayers];
		for(int i=0;i<numPlayers;i++)heights[i]=rand.nextInt(101)+150;
		return heights;
	}
	public static int calculateSum(int[] heights){
	    int sum=0;
		for(int height:heights)sum+=height;
		return sum;
	}
	public static double calculateMean(int[] heights,int sum){
	    return (double)sum/heights.length;
	}
	public static int calculateShortestHeight(int[] heights){
	    int shortest=heights[0];
		for(int height:heights)shortest=Math.min(shortest,height);
		return shortest;
	}
	public static int calculateTallestHeight(int[] heights){ 
	    int tallest=heights[0];
		for(int height:heights)tallest=Math.max(tallest,height);
		return tallest;
	}
    public static void main(String[] args){
        int[] array=makeArray(11);
        int sum=calculateSum(array);
		double meanHeight=calculateMean(array,sum);
		int shortestHeight=calculateShortestHeight(array);
		int tallestHeight=calculateTallestHeight(array);
		System.out.println("Shortest height "+shortestHeight+" cm");
		System.out.println("Tallest height "+tallestHeight+" cm");
		System.out.println("Mean height "+meanHeight+" cm");
	}
}