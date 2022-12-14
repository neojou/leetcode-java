package com.nj.algo.search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Stackoverflow20221214Test {

        /*
    public void main(String[] args) {

        }


        Myclass mc = new Myclass();

    }

     */

    Stackoverflow20221214 s14 = new Stackoverflow20221214();


    @BeforeEach
    void setUp() {
        s14.setup();
    }

    @Test
    void mergeList() {
        s14.mergeTwoList();
    }
}