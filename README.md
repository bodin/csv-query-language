# CSV Query Language

A simple project to read, filter and write csv files.

## Usage
The language mimics basic query language syntax. Output can be reordered
or duplicated into any combination.  Columns are referenced by their 
order (1 based index).

    > ./gradlew run

    csv> open <file> select *
    csv> open <file> select col<X>, col<Y>, col<Z>

## Examples

Selecting specific columns

    csv> open test.csv select col1, col2, col1, col2
       a |  b |    a |  b
       1 |  2 |    1 |  2
       x | yy |    x | yy
    3333 |  2 | 3333 |  2

Selecting all columns

    csv> open test.csv select *
       a |  b | cccc
       1 |  2 |    3
       x | yy |    z
    3333 |  2 |    1


# TODO
1. Error Handling
   1. Grammar Errors
   2. Processing Errors