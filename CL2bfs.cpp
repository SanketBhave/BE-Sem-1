#include<iostream>
using namespace std;
int cost[10][10],i,j,k,n,qu[10],front,rare,v,visit[10],visited[10],tcost=0,l;

int main()
{
int m;
cout <<"enter no of vertices";
cin >> n;
cout <<"enter no of edges";
cin >> m;
cout <<"\nEDGES \n";
for(k=1;k<=m;k++)
{
cin >>i>>j;
cin>>cost[i][j];
}
for(int e=0;e<n;e++){
	for(int y=0;y<n;y++){
		cout<<cost[e][y];
		cout<<"";
	}
	cout<<"\n";
}
cout <<"enter initial vertex";
cin >>v;
cout <<"Visitied vertices\n";
cout << v<<"";
visited[v]=1;
k=1;
while(k<n)
{
for(j=1;j<=n;j++)
if(cost[v][j]!=0 && visited[j]!=1 && visit[j]!=1)
{
visit[j]=1;
qu[rare++]=j;
tcost+=cost[v][j];
}
v=qu[front++];
cout<<v << " ";
k++;
visit[v]=0; visited[v]=1;
}
cout<<"\n"<<tcost;
return 0;
}
