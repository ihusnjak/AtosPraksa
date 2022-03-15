#include <string>
#pragma once

class Student
{
private:
    std::string studentName;

public:
    std::string getName() { return studentName; }
    Student(std::string name);
};