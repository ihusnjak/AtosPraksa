cmake_minimum_required(VERSION 3.10)
project(projectStudent)

add_library(${PROJECT_NAME} SHARED src/Student.cpp)
target_include_directories(${PROJECT_NAME} PUBLIC include)