#include<bits/stdc++.h>
using namespace std;

int main() {
    int n = 5;
    int tmp = 1;
    for(int i = 0; i < n; i++){
        if(i%2 == 0){
            for(int j = 0; j < i+1; j++){
                cout<<tmp;
                if(j != i){
                    cout << "*";
                }
                tmp++;
            }
            cout <<endl;
        }else{
            int idx = tmp + i ;
            for(int j = 0; j < i+1; j++){
                cout << idx;
                if(j != i){
                    cout<<"*";
                }
                idx--;
                tmp++;
            }
            cout <<endl;
        }
    }
    return 0;
}