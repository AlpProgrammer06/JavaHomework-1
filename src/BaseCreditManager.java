

 abstract class BaseCreditManager {
    public abstract void Calculate();    // bu calculate metodunu her yerde kullanmayacaksak abstract diyip class'ın imzasını oluştururuz.

    public void Save() {
        System.out.println("kaydedildi");
    }
}
