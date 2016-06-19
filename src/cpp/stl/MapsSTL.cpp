#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <set>
#include <map>
#include <algorithm>
using namespace std;


int main() {
    int n, t, y, z;
    string x;
    map<string, int> m;
    cin >> n;
    while (n--) {
        cin >> t >> x;
        if (t == 1) {
            cin >> y;
            map<string,int>::iterator itr = m.find(x);
            if (itr != m.end()) {
                z = m[x];
                y += z;
                m.erase(x);
            }
            m.insert(make_pair(x, y));
        } else if (t == 2) {
            m.erase(x);
        } else if (t == 3) {
            map<string,int>::iterator itr = m.find(x);
            cout << (itr == m.end() ? 0 : m[x]) << endl;
        }
    }
    return 0;
}

