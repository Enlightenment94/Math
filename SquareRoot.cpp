#include <iostream>
#include <cmath>

class SquareRoot {
public:
    float newtonRaphson(int base) {
        float xi = 1.0f;
        int maxIterations = 1000;

        for(int i = 0; i < maxIterations; i++) {
            xi = 0.5f * (xi + base / xi);
            if(std::abs(xi) == 0){
                return xi;
            }
        }
        return xi;
    }
};    

int main(){
    SquareRoot* squareRoot = new SquareRoot();
    float result = squareRoot->newtonRaphson(24445);
    std::cout << "Result: " << result << std::endl;
    std::cout << "Check: "  << result * result << std::endl;
    delete squareRoot;
    return 0;
}