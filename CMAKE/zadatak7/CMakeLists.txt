cmake_minimum_required(VERSION 3.10)
project(zadatak7)

add_subdirectory(Student)
add_subdirectory(Professor)
add_executable(${PROJECT_NAME} src/main.cpp)
target_link_libraries(${PROJECT_NAME} projectProfessor projectStudent)