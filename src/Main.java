import java.lang.System;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args)
    {
        Queue<Integer> integerQueue = new Queue<Integer>();
        for (int i = 1; i <= 10; ++i)
            integerQueue.enqueue(i);

        Object object;
        while ((object = integerQueue.dequeue()) != null)
            out.print(object + " ");
        out.println();

        Queue<Vehicle> vehicleQueue = new Queue<Vehicle>();
        for (int i = 1; i <= 4; ++i)
            vehicleQueue.enqueue(new Vehicle(i));

        while ((object = vehicleQueue.dequeue()) != null)
            out.println(((Vehicle) object).getPassengers());
    }

    public static void arraySort(int array[])
    {
        int length = array.length;

        for (int i = 0; i < length-1; ++i)
        {
            for (int j = i+1; j < length; ++j)
            {
                if (array[i] > array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}

class Calculator
{
    public static boolean isEven(int x)
    {
        return (x % 2) == 0 ? true : false;
    }

    public static int addition(int x, int y)
    {
        return x + y;
    }
}

class Counter
{
    public Counter()
    {
        ++count;
    }

    public static int count = 0;
}
