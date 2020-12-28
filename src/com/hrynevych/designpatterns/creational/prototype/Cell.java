package com.hrynevych.designpatterns.creational.prototype;

public class Cell implements Cloneable{
    private int size;
    private String name;

    public Cell(String name, int size) {
        this.size = size;
        this.name = name;
    }

    private Cell(Cell cell){
        this.name = cell.name;
        this.size = cell.size;
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone(){
        return new Cell(this);
    }

    @Override
    public String toString() {
        return "Cell{" +
                "size=" + size +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cell cell = (Cell) o;

        if (size != cell.size) return false;
        return name != null ? name.equals(cell.name) : cell.name == null;
    }

    @Override
    public int hashCode() {
        int result = size;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
