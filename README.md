# CSV Query Language

A simple project to read, filter and write csv files.

## Usage
The language mimics basic query language syntax. Output can be reordered
or duplicated into any combination.  Columns are referenced by their 
order (1 based index).

#### Build the executable

    ./gradlew clean installDist

#### Execute a single command

    ./build/install/csv-query-lang/bin/csv-query-lang '<command>'

#### Enter into a REPL

    ./build/install/csv-query-lang/bin/csv-query-lang

#### Command Syntax 
Read from a file and print to the console:

    with file <file> select *;

Read from a file and write select columns to another file:

    with file <file> select col<X>, col<Y>, col<Z> write file <file>;

## Examples

#### Selecting specific columns

    with file test.csv select col1, col2, col1, col2;
       a |  b |    a |  b
       1 |  2 |    1 |  2
       x | yy |    x | yy
    3333 |  2 | 3333 |  2

#### Selecting all columns

    with file test.csv select *;
       a |  b | cccc
       1 |  2 |    3
       x | yy |    z
    3333 |  2 |    1


# TODO
1. Error Handling
   1. Grammar Errors
   2. Processing Errors