package BY.BELHARD.BH24.HW.HW04.TASK4;

/*4. Опишите (то есть создайте класс, описывающий…)
сущность Здание. Здание можно охарактеризовать
назначением (например, жилой дом, офисное здание, промышленный объект, хоз. постройка и т.д.),
адресом, количеством этажей,
наличием(или отсутствием) лифта,
 материалом, из которого оно построено,
 годом постройки.
 Адрес состоит из улицы и номера дома.
*/
public class Solution4Building {

    private String purpose;
    private String addressStreet;
    private int addressBuildingNumber;
    private int floorsQuantity;
    private boolean elevator;
    private String rawMaterials;


    public Solution4Building(String purpose, String addressStreet,
                             int addressBuildingNumber, int floorsQuantity,
                             boolean elevator, String rawMaterials) {
        this.purpose = purpose;
        this.addressStreet = addressStreet;
        this.addressBuildingNumber = addressBuildingNumber;
        this.floorsQuantity = floorsQuantity;
        this.elevator = elevator;
        this.rawMaterials = rawMaterials;
    }
}
