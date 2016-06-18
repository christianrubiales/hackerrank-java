#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n;
    long long int s, t;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> t;
        s += t;
    }
    cout << s;
    return 0;
}

