# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.16

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /usr/bin/cmake

# The command to remove a file.
RM = /usr/bin/cmake -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /home/hus/Desktop/zadatak4

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /home/hus/Desktop/zadatak4/build

# Include any dependencies generated for this target.
include CMakeFiles/zadatak4.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/zadatak4.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/zadatak4.dir/flags.make

CMakeFiles/zadatak4.dir/main.cpp.o: CMakeFiles/zadatak4.dir/flags.make
CMakeFiles/zadatak4.dir/main.cpp.o: ../main.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/home/hus/Desktop/zadatak4/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/zadatak4.dir/main.cpp.o"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/zadatak4.dir/main.cpp.o -c /home/hus/Desktop/zadatak4/main.cpp

CMakeFiles/zadatak4.dir/main.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/zadatak4.dir/main.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E /home/hus/Desktop/zadatak4/main.cpp > CMakeFiles/zadatak4.dir/main.cpp.i

CMakeFiles/zadatak4.dir/main.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/zadatak4.dir/main.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S /home/hus/Desktop/zadatak4/main.cpp -o CMakeFiles/zadatak4.dir/main.cpp.s

# Object files for target zadatak4
zadatak4_OBJECTS = \
"CMakeFiles/zadatak4.dir/main.cpp.o"

# External object files for target zadatak4
zadatak4_EXTERNAL_OBJECTS =

zadatak4: CMakeFiles/zadatak4.dir/main.cpp.o
zadatak4: CMakeFiles/zadatak4.dir/build.make
zadatak4: CMakeFiles/zadatak4.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/home/hus/Desktop/zadatak4/build/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable zadatak4"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/zadatak4.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/zadatak4.dir/build: zadatak4

.PHONY : CMakeFiles/zadatak4.dir/build

CMakeFiles/zadatak4.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/zadatak4.dir/cmake_clean.cmake
.PHONY : CMakeFiles/zadatak4.dir/clean

CMakeFiles/zadatak4.dir/depend:
	cd /home/hus/Desktop/zadatak4/build && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /home/hus/Desktop/zadatak4 /home/hus/Desktop/zadatak4 /home/hus/Desktop/zadatak4/build /home/hus/Desktop/zadatak4/build /home/hus/Desktop/zadatak4/build/CMakeFiles/zadatak4.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/zadatak4.dir/depend

