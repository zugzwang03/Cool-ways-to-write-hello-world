#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main()
{
    vector<char> str;
    int i;
    string s = "Hello World";
    for (i = 0; i < s.length(); i++)
    {
        str.push_back(s[i]);
    }
    for (auto it : str)
    {
        cout << it;
    }
    cout << " ";
    reverse(str.begin(), str.end());
    for (auto it : str)
        cout << it;
    cout << endl;
}