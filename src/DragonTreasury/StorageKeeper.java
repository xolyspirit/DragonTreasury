package DragonTreasury;

import java.util.ArrayList;
import java.util.Random;
/**Класс для организации пополнения сокровищницы и хранения сокровищ
 * @version 1.0
 * @author Xolyspirit */
public class StorageKeeper {
    /**Массив для хранения сокровищ*/
    private ArrayList<Double> storage;
    /**Конструктор класса, при запуске создает {@link StorageKeeper#storage}
     * и заполняет его случайными сокровищами
     * на заданную в классе {@link Main} величину {@link View#AMOUNT}*/
    public StorageKeeper(){
        double min  = 0.1;
        double max = 100.0;
        Random random = new Random();
        storage = new ArrayList<Double>();
        for (int i = 0; i < 100; i++) {
            storage.add(new Double(Math.rint(((min + (max - min)*random.nextDouble()))*100.00)/100.00));
        }
        sortTreasures();
    }
    /**Выдает самое большое сокровище из отсортированного заранее массива*/
    public Double getMaxCost(){
        return storage.get(99);
    }
    /**Сортировка массива с сокровищами по размеру*/
    private void sortTreasures(){
        for (int i = storage.size()-1; i > 0; i--) {
            for (int j = 0; j <i; j++) {
                if (storage.get(j)>storage.get(j+1)){
                    Double t = storage.get(j);
                    storage.set(j,storage.get(j+1));
                    storage.set(j+1,t);
                }

            }
        }
    }
    /**Принимает @param amount и выдает массив сокровищ, на эту сумму*/
    public ArrayList<Double> getForAmount(double amount){
        ArrayList<Double> treasureList = new ArrayList<Double>();
        double temp;
        for (int i = storage.size()-1; i >= 0; i--) {
            temp = storage.get(i);

            if((amount-temp)<=0){
                continue;
            }
            else{
                treasureList.add(storage.get(i));
                amount -= temp;
            }
    }
    return treasureList;
    }
    /**Показывает все скоровища из хранилища*/
    public ArrayList<Double> getAll(){
        return storage;
    }
}
