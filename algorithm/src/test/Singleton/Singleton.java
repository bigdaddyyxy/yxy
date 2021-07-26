package test.Singleton;

/**
 * @author yexiangyu
 * @description 单例模式枚举方式
 * @apiNote
 */
public class Singleton {
    private Singleton(){}


    public static enum SingletonEnum{
        /**
         * singleton
         */
        SINGLETON;
        private Singleton instance = null;
        private SingletonEnum(){
            instance = new Singleton();
        }
        public Singleton getInstance(){
            return instance;
        }

    }

    public static void main(String[] args) {
        Singleton s1 = SingletonEnum.SINGLETON.getInstance();
        Singleton s2 = SingletonEnum.SINGLETON.getInstance();
        System.out.println(s1==s2);

    }


}
