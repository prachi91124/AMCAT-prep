#include <bits/stdc++.h>
using namespace std;

int main()
{
    int s;
    cin >> s;

    int itr = s;
    for (int i = 0; i < s+1 ; i++)
    {
            for (int j = 0; j < i + 1; j++)
            {
                cout << itr;
            }
            cout << endl;
            itr++;
    }
    itr = 2*s;
    for(int i = s+1 ; i >= 1; i--){
        itr--;
        for(int j = 1; j < i; j++){
            cout<<itr;
        }
        cout<<endl;
    }

    return 0;
}