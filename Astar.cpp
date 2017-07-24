//============================================================================
// Name        : Astar.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include<cmath>
using namespace std;

void element(int t)
{
if()
}
void heuristic1(int mat[][],int mat1[][])
{
	int p,q,temp,mat2[3][3],mat3[3][3],mat4[3][3];
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			mat2[i][j]=mat[i][j];
			if(mat[i][j]==0){p=i;q=j;}
		}
	}
				int j=q-1;
				if(j>=0 and j<3)
				{
					int temp;
					temp=mat2[p][q];
					mat2[p][q]=mat2[i][j];
					mat2[i][j]=temp;

				}
				for(int i=0;i<3 ;i++)
					{
						for(int j=0;j<3;j++)
						{
							for(int k=0;k<3 ;k++)
								{
									for(int r=0;r<3;r++)
									{
										if(mat1[k][r]==mat2[i][j])
										{
											int h=0;
											h=h+abs(k-i)+abs(r-j);
										}

						}

					}

			}

		}
}

int main() {
	int mat[3][3],mat1[3][3];
	mat[0][0]=1;
	mat[0][1]=2;
	mat[0][2]=3;
	mat[1][0]=8;
	mat[1][1]=6;
	mat[1][2]=0;
	mat[2][0]=7;
	mat[2][1]=5;
	mat[2][2]=6;

	mat1[0][0]=1;
		mat1[0][1]=2;
		mat1[0][2]=3;
		mat1[1][0]=8;
		mat1[1][1]=0;
		mat1[1][2]=4;
		mat1[2][0]=7;
		mat1[2][1]=6;
		mat[2][2]=5;

		void heuristic1(mat,mat1);
	return 0;
}
