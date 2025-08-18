import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

public class Main {
    public static void main(String[] args) {
        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();

        MemoryUsage getHeapMemoryUsage = memoryMXBean.getHeapMemoryUsage();

        MemoryUsage nonHeapMemoryUsage = memoryMXBean.getNonHeapMemoryUsage();

        int pendingFinalizationCount = memoryMXBean.getObjectPendingFinalizationCount();
        boolean verbose = memoryMXBean.isVerbose();

        System.out.println("Heap Memory Usage: " + getHeapMemoryUsage);
        System.out.println("Non-Heap Memory Usage: " + nonHeapMemoryUsage);
        System.out.println("Objects Pending Finalization:" + pendingFinalizationCount);
        System.out.println("Verbose GC: " + verbose);

        // You can optional run Garbage collection:
        // memoryMXBean.gc(); // This is often not necessary and may not have a noticeable effect.

            // Setting verbose GC(requires appropriate permissions):

            // memoryMXBean.setVerbose(true); // Requires appropriate permissions, may not work in all environment

    }
}

// import java.lang.management.MemoryUsage;
// MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();


//     public interface Main {

//     public MemoryUsage getHeapMemoryUsage();

//     public MemoryUsage getNonHeapMemoryUsage();

//     public int getObjectPendingFinalizationCount();
// // getNonHeapMemoryUsage();
// //     public int
// // getObjectPendingFinalizationCount();
//     public boolean isVerbose();
//     public void setVerbose(boolean value);
//     public void gc();
