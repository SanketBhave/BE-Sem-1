#include<iostream>
#include<stdlib.h>
using namespace std;



class Stack{
int stack[10]={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};

public:
       int push(int);
        void top();
        int pop();

};

int Stack::push(int node){
 if(stack[0]!=-1)
        return -1;
 else{
 for(int i=9;i>=0;i--){
 if(stack[i]==-1){
        stack[i]=node;
        return 1;
 }
 }
 }
}

int Stack::pop(){
 for(int i=0;i<10;i++){
 if(stack[i]!=-1){
        return stack[i];
        stack[i]=-1;
 }
 else return 0;
 }
}

class DFS{

int nodes;
int **graph;
int *visited;
int *vnode;
Stack obj;

public:
        void setgraph();
        void search();
};

void DFS::setgraph(){
int i,j;
cout<<"Enter number of nodes of the graph";
cin>>nodes;
graph=(int**)malloc(sizeof(int)*nodes);
for(i = 0; i < nodes; i++)
		graph[i] =(int*) malloc(nodes * sizeof(int));
visited=(int*)malloc (sizeof(int)*nodes);
vnode=(int*)malloc (sizeof(int)*nodes);
cout<<"\nEnter the nodes which have connection";
for(int k=0;k<nodes;k++){
        cin>>i;
        cin>>j;
        graph[i][j]=1;
        cout<< graph[i][j];
        }
}

void DFS::search(){
       int start=0,status;
        visited[0]=1;     
        obj.push(0); 
        for(int i=0;i<nodes;){
               
                for(int j=0;j<nodes;j++){
                        
                        if(graph[i][j]==1 && visited[j]!=1){
                                visited[j]=1;
                                i=j;
                                j=0;
                                 status= obj.push(i);
                                 vnode[start]=j;
                                 start++;
                        if(status==-1){
                                cout<<"Stack full";
                                break;
                                }
                                }
                }
        }
         for(int j=0;j<nodes;j++){
        if(int node=obj.pop()){
               
               
                        
                        if(graph[node][j]==1 && visited[j]!=1){
                        visited[j]=1;
                        vnode[start]=j;
                        start++;
        }
        }
       }
       for(int k=0;k<nodes;k++){
                cout<<vnode[k];
                }
}

int main()
{

DFS obj;
obj.setgraph();
obj.search();



return 0;
}
