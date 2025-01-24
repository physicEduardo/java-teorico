package org.example.designpatterns;

public final class Singleton {

    private static volatile Singleton instance;
    public String value;

    private Singleton (String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        /*Singleton result = instance;
        if (result != null) {
            return result;
        }*/

        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }

            return instance;
        }
    }
}

class started {
    public static void main(String[] args) {
        var s = Singleton.getInstance("aaaaa");
        var s2 = Singleton.getInstance("bbb");
        var s3 = Singleton.getInstance("cccc");
        System.out.println(s.value + s2.value + s3.value);
    }
}

class startedMulti {

    public static void main(String[] args) throws InterruptedException {
        var thread1 = Thread.startVirtualThread(new t1());
        thread1.join();
        var thread2 = Thread.startVirtualThread(new t2());
        thread2.join();
    }

    static class t1 implements Runnable {
        @Override
        public void run() {
            var s = Singleton.getInstance("aaaa");
            System.out.println(s.value);
        }
    }

    static class t2 implements Runnable {
        @Override
        public void run() {
            var s2 = Singleton.getInstance("bbbb");
            System.out.println(s2.value);
        }
    }
}