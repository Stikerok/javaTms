package seaBattle;

public class Main {
    public static void main(String[] args) {
        Field fieldPlayer = new Field(10);
        Field fieldBot = new Field(10);
        fieldBot.creatField();
        fieldPlayer.creatField();
        RandomPlaceShip.randomPlace(fieldBot);
        RandomPlaceShip.randomPlace(fieldPlayer);
        Player player1 = new Player("Artiom", fieldPlayer);
        Bot bot = new Bot("Bot", fieldBot);
        do {
            do {
                bot.getFieldPlayer().outFieldEnemy();
            } while (player1.shot(bot.getFieldPlayer()));
            bot.getFieldPlayer().outFieldEnemy();
//            do {
//                player1.getFieldPlayer().outField();
//            } while (bot.shot(player1.getFieldPlayer()));
//            player1.getFieldPlayer().outField();
        } while (!player1.isWin(bot.getFieldPlayer()) || !bot.isWin(player1.getFieldPlayer()));
        if (player1.isWin(bot.getFieldPlayer())) {
            System.out.println("Выйигар: " + player1.getNamePlayer());
        }
        if (bot.isWin(player1.getFieldPlayer())) {
            System.out.println("Выйграл: " + bot.getNamePlayer());
        }
    }
}
