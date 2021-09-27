#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
struct Array
{
    int capacity;
    int lastIndex;
    int *ptr;
};
struct Array* createArray(int);
void append(struct Array*,int);
void insert(struct Array*,int, int);
void del(struct Array*,int);
void edit(struct Array*,int,int);
int count(struct Array *);
int search(struct Array*, int);
void doubleArray(struct Array *);
void halfArray(struct Array*);
void halfArray(struct Array*arr)
{
    int *n,i;
    if(arr->capacity>1)
    {
        n=(int*)malloc(sizeof(int)*(arr->capacity/2));
        for(i=0;i<=arr->lastIndex;i++)
            n[i]=arr->ptr[i];
        free(arr->ptr);
        arr->ptr=n;
        arr->capacity/=2;
    }
}
void doubleArray(struct Array *arr)
{
    int *n,i;
    n=(int*)malloc(sizeof(int)*arr->capacity*2);
    for(i=0;i<=arr->lastIndex;i++)
        n[i]=arr->ptr[i];
    free(arr->ptr);
    arr->ptr=n;
    arr->capacity*=2;
}
void view(struct Array*arr)
{
    int i;
    if(arr->lastIndex==-1)
        printf("Array is empty");
    else
        for(i=0;i<=arr->lastIndex;i++)
            printf("%d ",arr->ptr[i]);
}
int search(struct Array*arr, int data)
{
    int i;
    for(i=0;i<=arr->lastIndex;i++)
        if(arr->ptr[i]==data)
            return i;
    return -1;
}
int count(struct Array*arr)
{
    return (arr->lastIndex+1);
}
void edit(struct Array* arr,int index,int newData)
{
    if(index<0 || index>arr->lastIndex)
        printf("\nInvalid Index");
    else
        arr->ptr[index]=newData;
}
void del(struct Array* arr,int index)
{
    int i;
    if(index<0 || index>arr->lastIndex)
        printf("\nInvalid Index or underflow");
    else{
        for(i=index;i<arr->lastIndex;i++ )
            arr->ptr[i]=arr->ptr[i+1];
        arr->lastIndex-=1;
        if(count(arr)<=arr->capacity/2)
            halfArray(arr);
    }
}
void insert(struct Array *arr,int index, int data)
{
    int i;
    if(index<0 || index>arr->lastIndex+1)
        printf("\nInvalid Index");
    else {
        if(arr->lastIndex+1==arr->capacity)
            doubleArray(arr);
        if(index<=arr->lastIndex){
            for(i=arr->lastIndex;i>=index;i--)
                arr->ptr[i+1]=arr->ptr[i];
            arr->ptr[index]=data;
            arr->lastIndex+=1;
        }
        else{
            append(arr,data);
        }
    }
}
void append(struct Array *arr,int data)
{
    if(arr->lastIndex+1==arr->capacity)
        doubleArray(arr);
    arr->lastIndex+=1;
    arr->ptr[arr->lastIndex]=data;
}
struct Array* createArray(int cap)
{
    struct Array *arr;
    arr=(struct Array*)malloc(sizeof(struct Array));
    arr->capacity=cap;
    arr->lastIndex=-1;
    arr->ptr=(int*)malloc(sizeof(int)*cap);
    return arr;
}
int menu()
{
    int choice;

    printf("\n1. Insert New Element");
    printf("\n2. Append New Element");
    printf("\n3. Delete Element");
    printf("\n4. Search Element");
    printf("\n5. Count total elements");
    printf("\n6. Edit an element");
    printf("\n7. View array elements");
    printf("\n8. Exit");
    printf("\n\nEnter your choice");
    scanf("%d",&choice);
    return(choice);
}
main()
{
    struct Array *arr;
    int data,index,c;
    arr=createArray(5);
    while(1){
        system("cls");
        printf("Capacity is %d",arr->capacity);
        switch(menu())
        {
        case 1:
            printf("\nEnter a number to insert");
            scanf("%d",&data);
            printf("\nEnter index to insert data");
            scanf("%d",&index);
            insert(arr,index,data);
            break;
        case 2:
            printf("\nEnter a number to append");
            scanf("%d",&data);
            append(arr,data);
            break;
        case 3:
            printf("\nEnter index to delete data");
            scanf("%d",&index);
            del(arr,index);
            break;
        case 4:
            printf("\nEnter a number to search");
            scanf("%d",&data);
            index=search(arr,data);
            if(index==-1)
                printf("%d is not found in the array",data);
            else
                printf("%d is found at index %d",data,index);
            break;

        case 5:
            printf("Total elements in the array: %d",count(arr));
            break;
        case 6:
            printf("\nEnter new data to store");
            scanf("%d",&data);
            printf("\nEnter index to edit data");
            scanf("%d",&index);
            edit(arr,index,data);
            break;
        case 7:
            printf("\n");
            view(arr);
            break;
        case 8:
            printf("Thank You. Press any key to exit");
            getch();
            exit(0);
        default:
            printf("\nInvalid choice, please retry");
        }
        getch();
    }



}
