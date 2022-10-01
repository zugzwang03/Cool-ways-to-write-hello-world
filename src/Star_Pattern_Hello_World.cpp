#include <iostream>
using namespace std;
int height = 7;
int width = (2 * height) - 5;
int i = 0, j;
void H(int i)
{
    cout << "*";
    for (j = 0; j < height; j++)
    {
        if ((j == height - 1) || (i == height / 2))
            cout << "*";
        else
            cout << " ";
    }
}
void E(int i)
{
    cout << " *";
    for (j = 0; j < height; j++)
    {
        if ((i == 0 || i == height - 1) || (i == height / 2 && j <= height / 2))
            cout << "*";
        else
            cout << " ";
    }
}
void L(int i)
{
    cout << " *";
    for (j = 0; j <= height; j++)
    {
        if (i == height - 1)
            cout << "*";
        else
            cout << " ";
    }
}
void O(int i)
{
    cout << " ";
    for (j = 0; j < height; j++)
    {
        if (i == 0 || j == 0 || j == height - 1 || i == height - 1)
            cout << "*";
        else
            cout << " ";
    }
}
void W(int i, int &counter)
{
    cout << "*";
    for (j = 0; j <= height; j++)
    {
        if (j == height)
            cout << "*";
        else if ((i >= height / 2) && (j == counter || j == height - counter - 1))
            cout << "*";
        else
            cout << " ";
    }
    if (i >= height / 2)
    {
        counter++;
    }
}
void R(int i, int &half)
{
    cout << " *";
    for (j = 0; j < width; j++)
    {
        if ((i == 0 || i == half) && j < (width - 2))
            cout << "*";
        else if (j == (width - 2) && !(i == 0 || i == half))
            cout << "*";
        else
            cout << " ";
    }
}
void D(int i)
{
    cout << " *";
    for (j = 0; j < height; j++)
    {
        if ((i == 0 || i == height - 1) && j < height - 1)
            cout << "*";
        else if (j == height - 1 && i != 0 && i != height - 1)
            cout << "*";
        else
            cout << " ";
    }
}
int main()
{
    for (i = 0; i < height; i++)
    {
        H(i);
        E(i);
        L(i);
        L(i);
        O(i);
        cout << endl;
    }
    int counter = height / 2, half = (height / 2);
    for (i = 0; i < height; i++)
    {
        W(i, counter);
        O(i);
        R(i, half);
        L(i);
        D(i);
        cout << endl;
    }
    return 0;
}
