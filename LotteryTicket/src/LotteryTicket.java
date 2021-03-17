
public class LotteryTicket {

	public static void main(String[] args) {
		int[][] lotteryCard = { 
				{ 20, 15, 7 }, 
				{ 8, 7, 19 },
				{ 7, 13, 47 } };

		int[][] lotteryCard2 = new int[3][3];
		lotteryCard2[0][0] = 20;
		lotteryCard2[0][1] = 15;
		lotteryCard2[0][2] = 7;
		lotteryCard2[1][0] = 8;
		lotteryCard2[1][1] = 7;
		lotteryCard2[1][2] = 19;
		lotteryCard2[2][0] = 7;
		lotteryCard2[2][1] = 13;
		lotteryCard2[2][2] = 47;
		// [row][column]
		int lastItem = lotteryCard[lotteryCard.length - 1][lotteryCard.length - 1];
		
		System.out.println(lotteryCard[0][0]);

		System.out.println("------------------------");

		for (int i = 0; i < lotteryCard.length; i++) {
			System.out.println(lotteryCard[i][i]);
		}

		System.out.println("------------------------");

		System.out.print("{ ");
		for (int row = 0; row < lotteryCard.length; row++) {
			for (int colunm = 0; colunm < lotteryCard.length; colunm++) {
				System.out.print(lotteryCard[row][colunm]);
				if (lotteryCard[row][colunm] != lastItem) {
					System.out.print(", ");
				}
			}
		}
		System.out.print(" }");
	}

}
