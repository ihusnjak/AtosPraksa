cmake_minimum_required(VERSION 3.10)
project(projectProfessor)

add_library(${PROJECT_NAME} SHARED src/Professor.cpp)
target_include_directories(${PROJECT_NAME} PUBLIC include)