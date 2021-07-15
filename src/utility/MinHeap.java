package utility;

public class MinHeap {

    int[] heapArray;
    int heapSize;
    int maxCapacity;

    private static final int FRONT = 1;

    MinHeap(int maxCapacity)
    {
        this.maxCapacity = maxCapacity;
        heapArray = new int[maxCapacity+1];
        heapSize = 0;
        heapArray[0] = Integer.MIN_VALUE;
    }

    int getParentPosition(int currentNodePosition)
    {
        return currentNodePosition/2;
    }

    int getLeftChildPosition(int currentNodePosition)
    {
        return (2*currentNodePosition);
    }

    int getRightChildPosition(int currentNodePosition)
    {
        return (2*currentNodePosition)+1;
    }

    private void swap(int positionOne, int positionTwo)
    {
        int temp;
        temp = heapArray[positionOne];
        heapArray[positionOne] = heapArray[positionTwo];
        heapArray[positionTwo] = temp;
    }

    public void insert(int element)
    {
        if(heapSize<maxCapacity)
        {
            heapArray[++heapSize] = element;
            int currentPosition = heapSize;

            while(heapArray[currentPosition] < heapArray[getParentPosition(currentPosition)])
            {
                swap(currentPosition,getParentPosition(currentPosition));
                currentPosition = getParentPosition(currentPosition);
            }
        }
        else
            return;
    }

    private boolean isLeaf(int position)
    {
        if((position >= heapSize/2) && (position <= heapSize))
            return true;
        return false;
    }

    private void minHeapify(int position) //position=where new element was added and need to be heapified
    {
        if(!isLeaf(position))
        {
            if((heapArray[position] > heapArray[getLeftChildPosition(position)]) || (heapArray[position] > heapArray[getRightChildPosition(position)]))
            {
                if(heapArray[getLeftChildPosition(position)] < heapArray[getRightChildPosition(position)])
                {
                    swap(position, getLeftChildPosition(position));
                    minHeapify(getLeftChildPosition(position));
                }
                else
                {
                    swap(position, getRightChildPosition(position));
                    minHeapify(getRightChildPosition(position));
                }
            }
        }
    }

    public int findMin()
    {
        int min = heapArray[FRONT];
        heapArray[FRONT] = heapArray[heapSize--];
        minHeapify(FRONT);
        return min;
    }

    public void print()
    {
        for(int i=1; i<=heapSize/2; i++)
        {
            System.out.print("PARENT: " +heapArray[i] + " LEFT CHILD: " +heapArray[(2*i)] + " RIGHT CHILD: " +heapArray[(2*i)+1]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(15);

        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(17);
        minHeap.insert(10);
        minHeap.insert(84);
        minHeap.insert(19);
        minHeap.insert(6);
        minHeap.insert(22);
        minHeap.insert(9);

        minHeap.print();
        System.out.println("The minimum element is: " +minHeap.findMin());

    }










}
