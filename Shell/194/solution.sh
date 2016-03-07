#!/bin/sh
declare -A array
col=1
row=1

while read line; do
    col=1
    for word in $line; do
        array[$row,$col]=$word
        ((col++))
    done
    ((row++))
done < file.txt

for ((i=1;i<col;i++)) do
    echo -n ${array[1,$i]}
    for ((j=2;j<row;j++)) do
        echo -n " ${array[$j,$i]}"
    done
    echo
done
