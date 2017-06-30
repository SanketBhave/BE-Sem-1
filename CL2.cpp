//============================================================================
// Name        : CL2.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include<iostream>
#include<stdlib.h>
using namespace std;

class DFS{
int nodes;
int graph[10][10];
int visited[10];
int vnode[10];
int stack[10],top=9;
public:
void setgraph();
void search();
};
void DFS::setgraph(){
int i,j,con;
cout<<"\nEnter the number of connections";
cin>>con;
for(int i=0;i<nodes;){
for(int j=0;j<nodes;j++){
	graph[i][j]=0;
}
}
for(int k=0;k<con;k++){
cin>>i;
cin>>j;
cin>>graph[i][j];
}
}
void DFS::search(){
int start=0,status;
visited[0]=1;

for(int i=0;i<nodes;){
for(int j=0;j<nodes;j++){
if(graph[i][j]!=0 && visited[j]!=1){
visited[j]=1;
i=j;
j=0;

vnode[start]=j;
start++;
visited[j]=1;
vnode[start]=j;
start++;
}
}
}

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
