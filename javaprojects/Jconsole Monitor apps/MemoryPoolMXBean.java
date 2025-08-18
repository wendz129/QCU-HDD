import java.lang.management.ManagementFactory;
import java.lang.management.MemoryPoolMXBean;
import java.util.List;

public interface MemoryPoolMXBean {
    public static void main(String[] args) {
        List<MemoryPoolMXBean> pools = ManagementFactory.getMemoryPoolMXBeans();

        for (MemoryPoolMXBean pool : pools) {
            
            System.out.println("Memory Pool Name: " + pool.getName());

            System.out.println("Usage Threshold: " + pool.getUsageThreshold());
            System.out.println("Is Usage Threshold Supported: " + pool.isUsageThresholdSupported());
                    // Add other method calls as needed

                    System.out.println("-----------------------------------");
        }
    }
}



// public interface MemoryPoolMXBean {

//     // Usage threshold
//     public long getUsageThreshold();

//     public void setUsageThresholdExceeded();

//     public boolean isUsageThresholdSupported();

//     // Collection usage threshold 

//     public long getCollectionUsageThreshold();

//     public void setCollectionUsageThreshold(long threshold);

//     public boolean isCollectionUsageThresholdSupported();

//     public boolean isCollectionUsageThresholdExceeded();
// }

// public interface MemoryPoolMXBean {

//     // Get the usage threshold
//     long getUsageThreshold();

//     // Set the usage threshold exceeded status (may not be necessary)
//     void resetUsageThresholdExceeded();

//     // Check if usage threshold is supported
//     boolean isUsageThresholdSupported();

//     // Get the collection usage threshold
//     long getCollectionUsageThreshold();

//     // Set the collection usage threshold
//     void setCollectionUsageThreshold(long threshold);

//     // Check if collection usage threshold is supported
//     boolean isCollectionUsageThresholdSupported();

//     // Check if collection usage threshold is exceeded
//     boolean isCollectionUsageThresholdExceeded();
// }