#include <iostream>
using namespace std;

// Number of lines for the alphabet's pattern
int height = 5;

// Number of character width in each line
int width = (2 * height) - 1;

// Function to find the absolute value
// of a number D
int abs(int d)
{
    return d < 0 ? -1 * d : d;
}



// Function to print the pattern of 'E'
void E()
{
    int i, j;
    for (i = 0; i < height; i++)
    {
        cout << ("*");
        for (j = 0; j < height; j++)
        {
            if ((i == 0 || i == height - 1) || (i == height / 2 && j <= height / 2))
                cout << ("*");
            else
                continue;
        }
        cout << ("\n");
    }
    cout<<endl; 
}

// Function to print the pattern of 'H'
void H()
{
    int i, j;
    for (i = 0; i < height; i++)
    {
        cout << ("*");
        for (j = 0; j < height; j++)
        {
            if ((j == height - 1) || (i == height / 2))
                cout << ("*");
            else
                cout << (" ");
        }
        cout << ("\n");
    }
    cout<<endl; 
}

// Function to print the pattern of 'L'
void L()
{
    int i, j;
    for (i = 0; i < height; i++)
    {
        cout << ("*");
        for (j = 0; j <= height; j++)
        {
            if (i == height - 1)
                cout << ("*");
            else
                cout << (" ");
        }
        cout << ("\n");
    }
    cout<<endl; 
}

// Function to print the pattern of 'O'
void O()
{
    int i, j, space = (height / 3);
    int width = height / 2 + height / 5 + space + space;
    for (i = 0; i < height; i++)
    {
        for (j = 0; j <= width; j++)
        {
            if (j == width - abs(space) || j == abs(space))
                cout << ("*");
            else if ((i == 0 || i == height - 1) && j > abs(space) && j < width - abs(space))
                cout << ("*");
            else
                cout << (" ");
        }
        if (space != 0 && i < height / 2)
        {
            space--;
        }
        else if (i >= (height / 2 + height / 5))
            space--;
        cout << ("\n");
    }
    cout<<endl; 
}

// Function to print the pattern of 'W'
void W()
{
    int i, j, counter = height / 2;
    for (i = 0; i < height; i++)
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
        cout << "\n";
    }
}
// Function to print the pattern of 'R'
void R()
{
    int i, j, half = (height / 2);
    for (i = 0; i < height; i++)
    {
        cout << ("*");
        for (j = 0; j < width; j++)
        {
            if ((i == 0 || i == half) && j < (width - 2))
                cout << ("*");
            else if (j == (width - 2) && !(i == 0 || i == half))
                cout << ("*");
            else
                cout << (" ");
        }
        cout << ("\n");
    }
    cout << endl;
}

// Function to print the pattern of 'D'
void D()
{
    int i, j;
    for (i = 0; i < height; i++)
    {
        cout << ("*");
        for (j = 0; j < height; j++)
        {
            if ((i == 0 || i == height - 1) && j < height - 1)
            {
                cout << ("*");
            }
            else if (j == height - 1 && i != 0 && i != height - 1)
            {
                cout << ("*");
            }
            else
            {
                cout << (" ");
            }
        }
        cout << ("\n");
    }
    cout << endl;
}

// Function to print ","
void Comma()
{
    cout<<endl; 
    for (int i = 0; i < 2; i++)
    {
        cout << (" **  ") << endl;
    }
    cout << (" *   ") << endl;
    cout << ("*    ");
    cout<<endl; 
}

int main()
{
    H();
    E();
    L();
    L();
    O();
    Comma();
    W();
    O();
    R();
    L();
    D();

    return 0;
}

// code contributed by Dibwarjeet https://github.com/git-dibwar