package imu.memoryManage.model;

/**
 * Created by Administrator on 2016/11/24.
 */
public class UnAllocatedMemory {
   private int length;
   private int startAddress;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getStartAddress() {
        return startAddress;
    }

    public void setStartAddress(int startAddress) {
        this.startAddress = startAddress;
    }
}
