#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin >> n;

    int itr = 1;
    for (int i = 0; i < n; i++)
    {
        if (i % 2 == 0)
        {
            for (int j = 0; j < 4; j++)
            {
                if(j == 3){
                    itr++;
                    cout << itr;
                }
                else{
                    cout << itr;
                }
            }
            cout << endl;
        }else{
            for(int j = 0; j < 4; j++){
                if(j == 0){
                    cout << itr+1;
                }else{
                    cout <<itr;
                }
            }
            itr++;
            cout <<endl;
        }
    }
    return 0;
}