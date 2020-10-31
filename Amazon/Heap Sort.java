
class GfG
{
    void buildHeap(int arr[], int n)
    {
        for(int i=n/2-1;i>=0;i--)
        {
            heapify(arr,n,i);
        }
    }
 
    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int n, int i)
    {
        int parent=i;
        int min=parent;
        if(parent*2+1<n&&arr[parent*2+1]>arr[min])
        {
            min=parent*2+1;
        }
        if(parent*2+2<n&&arr[parent*2+2]>arr[min])
        {
            min=parent*2+2;
        }
        if(min!=parent)
        {
            swap(arr,min,parent);
            heapify(arr,n,min);
        }
    }
    void swap(int ar[],int i,int j)
    {
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }
 }
 