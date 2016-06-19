#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n, q, t;
    vector<int> v;
    
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> t;
        v.push_back(t);
    }
    cin >> q;
    for (int i = 0; i < q; i++) {
        cin >> t;
        vector<int>::iterator low;
        low = lower_bound (v.begin(), v.end(), t);
        cout << (v[(low - v.begin())] == t ? "Yes " : "No ");
        cout << ((low - v.begin()) + 1) << endl;
    }
    return 0;
}

