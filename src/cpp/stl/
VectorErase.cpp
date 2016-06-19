#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n, x, a, b, c;
    vector<int> v;
    
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> c;
        v.push_back(c);
    }
    cin >> x >> a >> b;
    v.erase(v.begin() + (x-1) );
    v.erase(v.begin() + (a-1), v.begin() + (b-1));
    cout << v.size() << endl;
    for (int i : v) {
        cout << i << ' ';
    }
    
    return 0;
}

