#include <string>
#pragma once

class Professor
{
private:
    std::string professorName;

public:
    std::string getName() { return professorName; }
    Professor(std::string name);
};