import java.util.*;
public class garbagecollector
{
    public static void main(String args[])
    {
        Runtime r=Runtime.getRuntime();
        long mem1,mem2;
        Integer someints[]=new Integer[1000];
        System.out.println("Initial total memory:"+r.totalMemory());
        mem1=r.freeMemory();
        System.out.println("Initial free memory:"+mem1);
        r.gc();
        mem1=r.freeMemory();
        System.out.println("Free memory after garbage collection:"+mem1);
        for(int i=0;i<1000;i++)
           someints[i]=newInteger(i);
        mem2=r.freeMemory();
        System.out.println("Free memorry after allocation:"+mem2);
        System.out.println("Memory used by allocation:"+(mem1-mem2));
        for(int i=0;i<1000;i++)
            someints[i]=null;
        r.gc();
        mem2=r.freeMemory();
        System.out.println("Free memory after collecting discarded integers:"+mem2);
    }

    private static Integer newInteger(int i) {
        return null;
    }
}