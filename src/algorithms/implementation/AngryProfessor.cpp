#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    
    int n;
    cin >> n;
    
    for (int i = 0; i < n; i++) {
        int a, b, c = 0, d;
        cin >> a >> b;
        
        for (int j = 0; j < a; j++) {
            cin >> d;
            if (d <= 0) {
                c++;
            }
        }
        cout << (c >= b ? "NO" : "YES") << "\n";
    }
    
    return 0;
}

