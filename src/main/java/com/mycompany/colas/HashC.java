/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colas;

import java.util.Iterator;
import java.util.ArrayList;

public class HashC<E extends Comparable<E>> {

    protected ArrayList<HashC.Element> table;
    protected int m;
    protected int r;

    public HashC(final int j) {
        this.m = j;
        this.table = new ArrayList<HashC.Element>(this.m);
        for (int i = 0; i < this.m; ++i) {
            this.table.add(new HashC.Element(0, (Register) null));
        }
        this.r = 0;
    }

    private int functionHash(final int key) {
        return key % this.m;
    }

    private int linearProbing(int dressHash, final int key) {
        final int posInit = dressHash;
        while (this.table.get(dressHash).mark != 0) {
            if (this.table.get(dressHash).mark == 1 && this.table.get(dressHash).reg.getKey() == key) {
                return -1;
            }
            dressHash = (dressHash + 1) % this.m;
            if (dressHash == posInit) {
                return -2;
            }
        }
        return dressHash;
    }

    public void insert(final int key, final E reg) {
        int dressHash = this.functionHash(key);
        dressHash = this.linearProbing(dressHash, key);
        if (dressHash == -1) {
            System.out.println("Key duplicada");
        } else if (dressHash == -2) {
            System.out.println("Registro con clave" + key + " ya fue insertado antes.....");
        } else {
            this.table.set(dressHash, new HashC.Element( 1, new Register(key, (E) reg)));
        }
    }

    public E search(final int key) {
        final int posInit;
        int dressHash = posInit = this.functionHash(key);
        int count = 1;
        while (this.table.get(dressHash).mark != 1 || this.table.get(dressHash).reg.getKey() != key) {
            dressHash += count * count;
            ++count;
            if (dressHash == posInit) {
                return null;
            }
        }
        return (E) this.table.get(dressHash).reg.getValue();
    }

    public void delete(final int element) {
        for (final HashC.Element item : this.table) {
            if (item.mark == 1 && item.reg.key == element) {
                item.mark = 0;
            }
        }
    }

    @Override
    public String toString() {
        String s = "dir.real       dir.base    Long. de busqueda Registro\n";
        int i = 0;
        for (final HashC.Element item : this.table) {
            s = String.valueOf(s) + i++ + "-->\t\t";
            if (item.mark == 1) {
                s = String.valueOf(s) + this.functionHash(item.reg.key) + "\t\t" + item.reg + "\n";
            } else {
                s = String.valueOf(s) + "empty\n";
            }
        }
        return "\t" + s;
    }

    public int position(final int key) {
        final int posInit;
        int dressHash = posInit = this.functionHash(key);
        int count = 1;
        while (this.table.get(dressHash).mark != 1 || this.table.get(dressHash).reg.getKey() != key) {
            dressHash = (dressHash + count * count) % this.m;
            ++count;
            if (dressHash == posInit) {
                return -1;
            }
        }
        return dressHash;
    }

    private class Element {

        int mark;
        Register<E> reg;

        public Element(int mark, Register<E> reg) {
            this.mark = mark;
            this.reg = reg;
        }
    }
}
