package com.xjh;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import javax.lang.model.element.VariableElement;
import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 * Unit test for simple App.
 */
public class AppTest implements Serializable{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


//    //选择排序
//    public static void main(String[] args) {
//        int[] arr = {2,1,3,5,4,6};
//        for(int i = 0; i< arr.length -1; i++){
//            for(int j = i +1;j < arr.length; j++){
//                if(arr[i] > arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        for(int i : arr){
//            System.out.println(i);
//        }
//    }

    //冒泡排序
//    public static void main(String[] args) {
//        int[] arr = {2,1,3,5,4,6};
//        for(int i = 0; i < arr.length-1; i++){
//            for(int j = 0; j < arr.length -1 -i; j++){
//                if(arr[j] > arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j + 1] = temp;
//
//                }
//            }
//        }
//        for(int i : arr){
//            System.out.println(i);
//        }
//    }


//    /**返回角标*/
//    public static <T> int search(T[] arr, T key, Comparator<T> com){
//        int low = 0;
//        int high = arr.length -1;
//        while(low <= high){
//            int middle = (low + high) >>> 1;
//            int compare = com.compare(arr[middle], key);
//            if(compare < 0){
//                low = middle + 1;
//            }else if(compare > 0){
//                high = middle -1;
//            }else{
//                return middle;
//            }
//        }
//        return -1;
//    }


    public static void main(String[] args) throws Exception {
        Object obj =  new AppTest();

//        ByteArrayOutputStream  baos = new ByteArrayOutputStream();
//        ObjectOutputStream oos = new ObjectOutputStream(baos);
//        oos.writeObject(obj);
//
//        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
//        ObjectInputStream ois  = new ObjectInputStream(bais);
//        Object obj2 = ois.readObject();
//        Object obj2 = obj;
//        System.out.println(obj);
//        System.out.println(obj2);


//        List<Integer> list = Collections.singletonList(1);
//        System.out.println(list.size());
//        System.out.println(list);

        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        threadLocal.set("xjh");
        threadLocal.get();

        ThreadLocal<String> threadLocal2 = new ThreadLocal<>();
        threadLocal2.set("xjh2");
        Thread main = Thread.currentThread();
        System.out.println(threadLocal.get());
        System.out.println(threadLocal2.get());


    }
}
