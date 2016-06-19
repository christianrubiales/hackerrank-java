#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <set>
#include <algorithm>
using namespace std;


int main() {
    int n, a, b;
    set<int> s;
    
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> a >> b;
        if (a == 1) {
            s.insert(b);
        } else if (a == 2) {
            s.erase(b);
        } else if (a == 3) {
            set<int>::iterator itr = s.find(b);
            cout << (itr == s.end() ? "No" : "Yes") << endl;
        }
    }
    
    return 0;
}

