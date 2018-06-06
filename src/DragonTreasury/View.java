package DragonTreasury;
/**Класс служит для организации общения с драконом
 * @version 1.0
 * @author Xolyspirit */
public class View {
    /**Размер запрашиваемых у дракона сокровищ*/
    public static final double AMOUNT = 500.5;
    /**Строки, необходимые для общения с драконом*/
    private static final String GREETING = "Welcome to Dragon lair!";
    private static final String SHOWMEMAX = "Show me your biggest treasure please.";
    private static final String SHOWMETREASURELISTFORAMOUNT = "Show me your treasures for this amount";
    private static final String SHOWMEALL = " Show me all your treasures please.";
    private static final String SEEMYBIGGESTTREASURE = "My biggest treasure is: ";
    private static final String SEEMYTRASURESLISTFORAMOUNT = "It's my treasure list for you:";
    private static final String SEEMYALLTREASURES = "it's all my treasures";
    /**Создает экземпляр {@link StorageKeeper}
     * и выполняет запросы к дракону
     * также, выводит ответы дракона на экран*/
    public void start(){
        StorageKeeper storageKeeper = new StorageKeeper();
        System.out.println(GREETING);
        System.out.println(SHOWMEMAX);
        System.out.println(SEEMYBIGGESTTREASURE + storageKeeper.getMaxCost());
        System.out.println(SHOWMETREASURELISTFORAMOUNT);
        System.out.println(SEEMYTRASURESLISTFORAMOUNT + storageKeeper.getForAmount(AMOUNT));
        System.out.println(SHOWMEALL);
        System.out.println(SEEMYALLTREASURES + storageKeeper.getAll());
    }
}
