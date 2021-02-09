package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg za = new Zerg();
        za.name = "Vasya";
        Zerg zb = new Zerg();
        zb.name = "Petya";
        Zerg zc = new Zerg();
        zc.name = "Sergey";
        Zerg zd = new Zerg();
        zd.name = "Sasha";
        Zerg ze = new Zerg();
        ze.name = "Pasha";
        Protoss pa = new Protoss();
        pa.name = "Masha";
        Protoss pb = new Protoss();
        pb.name = "pb";
        Protoss pc = new Protoss();
        pc.name = "pc";
        Terran ta = new Terran();
        ta.name = "ta";
        Terran tb = new Terran();
        tb.name = "tb";
        Terran tc = new Terran();
        tc.name = "tc";
        Terran td = new Terran();
        td.name = "td";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
