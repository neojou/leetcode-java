package answers.Q1800_1899.Q1870_Minimum_Speed_to_Arrive_on_Time;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1870Test {
    Solution1870 sol = new Solution1870();
    @BeforeEach
    void setUp() {
    }

    void example1() {
        int[] dist = {1,3,2};
        double hour = 6.0;
        int expect = 1;

        int output = sol.minSpeedOnTime(dist, hour);
        //System.out.println("output=" + output);
        assertEquals(expect, output);
    }

    void example2() {
        int[] dist = {1,3,2};
        double hour = 2.7;
        int expect = 3;

        int output = sol.minSpeedOnTime(dist, hour);
        //System.out.println("output=" + output);
        assertEquals(expect, output);
    }

    void example3() {
        int[] dist = {1,3,2};
        double hour = 1.9;
        int expect = -1;

        int output = sol.minSpeedOnTime(dist, hour);
        //System.out.println("output=" + output);
        assertEquals(expect, output);
    }

    void example4() {
        int[] dist = {1,1,100000};
        double hour = 2.01;
        int expect = 10000000;

        int output = sol.minSpeedOnTime(dist, hour);
        System.out.println("output=" + output);
        assertEquals(expect, output);
    }

    void example5() {
        int[] dist = {5, 3, 4, 6, 2, 2, 7};
        double hour = 10.92;
        int expect = 4;

        int output = sol.minSpeedOnTime(dist, hour);
        System.out.println("output=" + output);
        assertEquals(expect, output);
    }

    void example6() {
        int[] dist = {92,41,28,84,64,51,83,59,19,34,18,32,96,72,69,34,96,75,55,75,52,47,29,18,66,64,12,97,7,15,20,81,21,88,55,77,9,50,49,77,60,68,33,71,2,88,93,15,88,69,97,35,99,83,44,15,38,56,21,59,1,93,93,34,65,98,23,65,14,81,39,82,65,78,26,20,48,98,21,70,100,68,1,77,42,63};
        double hour = 107.52;
        int expect = 78;

        int output = sol.minSpeedOnTime(dist, hour);
        System.out.println("output=" + output);
        assertEquals(expect, output);
    }

    void example7() {
        int[] dist = {128,292,86,782,165,280,461,928,526,151,851,448,94,970,933,228,837,462,906,358,953,28,425,55,406,515,383,242,396,84,384,230,29,327,954,102,860,732,666,344,811,150,141,40,294,940,850,484,713,852,143,778,723,481,460,631,6,928,82,20,263,221,856,154,562,963,745,624,541,434,114,795,296,244,309,125,49,245,430,655,813,638,469,65,114,857,927,512,612,549,17,648,528,589,248,736,148,299,440,2,630,362,247,585,427,192,681,685,88,537,999,370,70,977,539,558,520,806,520,568,21,400,895,482,45,651,397,383,260,766,17,366,808,70,354,247,751,673,644,107,791,596,753,775,341,137,46,361,560,347,834,659,180,851,798,702,476,713,491,647,187,831,139,65,734,795,967,469,38,301,207,45,811,205,908,43,324,956,318,528,408,835,557,485,260,38,772,663,196,293,366,883,800,49,887,672,340,280,128,819,377,448,911,410,762,451,917,980,396,348,998,192,509,709,510,377,947,817,532,274,821,85,745,435,81,441,617,843,185,559,301,329,106,82,336,677,303,314,457,618,735,437,171,707,455,360,458,44,745,891,934,362,630,446,282,655,811,971,59,77,688,653,416,373,526,821,768,696,164,976,32,147,870,623,695,801,449,36,130,69,242,798,661,376,371,393,973,581,34,620,158,696,461,972,380,381,455,782,79,588,141,543,376,408,322,666,286,256,984,117,27,754,191,512,531,397,936,576,121,269,794,267,721,457,220,627,293,711,939,503,205,126,139,874,76,463,177,921,731,456,90,830,699,991,866,328,684,356,727,67,564,556,298,913,308,872,162,729,727,950,718,654,179,813,371,521,230,125,206,812,143,243,810,506,27,370,568,587,378,479,823,565,133,627,906,89,68,317,408,735,737,491,539,421,788,420,844,589,76,129,996,325,658,76,461,478,697,530,353,132,900,849,799,565,656,602,187,787,990,133,444,515,933,890,57,852,128,531,157,312,169,166,331,958,727,231,355,971,964,532,917,291,867,81,257,202,651,980,565,282,129,641,311,630,547,96,515,657,173,607,965,595,158,176,675,640,738,924,620,346,863,947,578,43,846,885,30,84,47,972,657,790,591,272,667,216,786,586,427,633,655,32,510,911,643,559,297,658,980,310,495,251,825,827,702,416,305,465,75,706,62,162,451,426,496,476,209,349,622,148,321,883,736,327,752,882,354,999,409,134,779,380,528,576,109,327,248,478,126,274,461,254,145,100,52,298,969,394,885,631,429,255,986,887,924,164,834,336,957,592,739,321,195,782,164,511,528,479,511,901,316,510,24,93,968,403,518,469,990,247,221,598,362,50,52,289,507,612,904,864,670,689,482,293,550,9,868,111,442,138,904,271,745,375,783,413,375,47,411,53,584,576,200,372,567,296,76,396,517,462,783,564,287,846,639,697,626,122,132,999,100,404,383,814,348,572,962,375,774,148,204,617,522,412,513,42,47,40,141,731,342,824,486,532,468,153,621,915,528,144,336,954,628,327,167,403,632,758,863,307,608,345,520,849,522,546,502,726,577,307,487,836,18,378,340,690,113,427,598,316,816,921,743,894,705,645,28,612,486,272,991,672,802,996,795,593,592,234,739,53,598,492,175,537,645,739,635,794,862,390,152,842,698,249,33,587,971,718,113,196,20,452,322,429,156,423,708,209,421,514,794,627,943,483,894,869,754,745,64,723,142,532,213,575,333,679,490,539,386,322,980,178,471,935,546,351,560,363,693,791,889,739,698,659,823,710,271,625,496,197,981,253,286,572,306,231,965,997,305,790,296,722,213,707,722,501,325,492,358,574,957,957,815,739,281,295,125,588,693,557,389,918,405,839,354,978,792,824,150,298,44,295,979,732,81,355,947,453,672,263,766,491,220,207,848,552,278,956,576,713,279,141,112,631,759,601,246,249,52,686,927,544,232,654,239,54,103,424,339,735,484,103,698,790,141,6,988,564,952,162,417,669,958,902,900,488,489,667,205,775,988,295,329,293,662,61,930,788,92,668,588,238,548,757,741,871,960,39,936,944,180,428,904,858,181,957,942,38,857,407,807,508,191,960,767,986,894,949,297,898,39,10,306,582,618,110,951,344,292,466,657,557,537,506,911,962,138,872,517,480,280,198,829,116,339,167,749,470,664,264,736,191,15,755,346,810,303,582,691,776,198,180,626,877,655,919,416,847,438,528,336,89,411,686,98,190,144,489,332,959,255,7,268,393,242,458,772,274,977,338,310,597,741,587,12,268,670,369,710,242,64,684,122,477,315,164,416,703,515,946,917,910,721,789,319,707,121,655,939,964,303,377,630,227,225,981,137,490,157,466,766,621,383,426,719,563,935,483,776,551,822,681,846,224,781,254,697,773,611,895,807,84,539,458,541,721,371,80,940,578,115,64,849,561,925,518,208,587,550,154,169,336,875,533,453,120,697,211,735,598,501,94,921,523,457,829,57,465,136,526,426,468,578,60,573,474,689,827,316,741,23,406,261,837,4,764,224,593,75,47,434,353,718,66,555,62,958,916,71,957,484,33,294,419,185,788,139,785,657,747,662,987,431,384,913,392,460,891,940,929,387,385,83,700,988,678,896,553,137,670,881,357,122,183,551,403,542,131,746,229,855,4,775,24,306,475,690,737,558,435,545,389,844,236,254,472,355,159,283,194,960,897,743,784,116,33,829,677,430,630,785,959,905,911,17,247,212,69,104,609,35,458,613,689,721,894,50,251,759,46,412,450,240,553,223,773,885,795,58,144,516,297,240,836,939,750,590,327,592,613,792,689,839,329,243,310,898,147,677,534,227,424,308,282,63,571,972,606,901,753,934,180,642,696,438,570,508,49,996,353,965,659,688,391,805,538,327,714,427,419,153,308,386,189,773,551,485,247,870,231,308,879,725,148,826,475,937,60,576,423,992,427,571,543,138,398,249,262,209,339,663,81,945,461,868,380,95,549,742,850,196,53,275,387,690,620,618,41,895,75,193,824,780,602,742,688,573,223,491,214,891,929,341,311,980,931,16,217,960,195,986,760,121,765,773,491,937,249,713,619,721,210,407,938,246,566,330,795,290,390,478,547,665,368,316,268,369,526,904,510,478,101,823,740,481,780,860,328,937,209,380,321,424,47,577,885,227,760,150,17,268,567,958,599,594,738,428,303,157,201,338,236,389,584,854,252,512,564,671,967,702,346,264,782,842,501,990,741,658,758,503,472,173,751,815,361,174,144,738,560,501,189,939,911,556,658,981,61,537,35,860,868,77,968,838,685,50,783,7,423,141,863,646,237,70,725,155,10,224,518,467,383,62,633,654,683,957,632,935,495,676,500,17,7,545,565,422,13,18,543,740,282,549,294,18,515,833,715,691,441,826,963,932,184,110,941,99,537,153,247,197,635,540,259,835,363,274,815,407,81,383,983,416,471,579,250,714,232,308,701,848,869,83,670,879,666,778,33,96,416,389,387,566,488,58,653,10,720,176,85,512,866,445,661,804,340,580,879,998,98,917,541,942,44,236,217,923,889,709,909,581,487,278,48,947,77,701,948,288,921,557,578,674,34,184,952,871,323,17,985,213,602,148,771,841,730,841,408,952,79,307,167,578,247,581,855,870,399,694,919,554,340,394,774,758,144,810,706,742,81,513,764,998,355,55,101,448,238,859,78,349,620,788,629,978,610,407,993,793,335,31,650,280,803,462,503,234,365,567,964,385,443,191,697,600,677,390,88,791,634,303,818,253,731,76,85,275,158,390,729,803,650,158,758,399,325,370,110,94,6,966,316,456,369,780,277,105,136,90,192,442,460,571,569,525,418,106,27,92,363,568,96,612,613,804,333,885,395,13,299,424,398,798,87,743,923,573,927,249,586,534,174,702,390,174,143,276,309,275,505,150,65,172,446,283,432,307,496,802,79,370,258,967,253,739,641,508,609,632,201,469,110,139,312,7,972,406,341,862,636,390,824,883,338,451,343,441,836,844,881,667,998,609,140,308,329,618,971,712,206,491,322,182,988,408,992,327,299,753,712,649,503,991,590,801,249,334,386,288,837,805,403,374,117,955,578,205,607,559,185,699,787,564,28,976,745,473,966,726,215,449,817,299,852,710,71,839,869,815,815,419,690,512,143,649,311,248,259,675,158,733,434,809,387,76,460,613,491,597,411,548,519,946,943,891,709,429,557,38,810,992,369,719,917,832,550,609,654,937,88,112,788,255,674,681,364,171,663,628,46,577};
        double hour = 15394.28;
        int expect = 65;

        int output = sol.minSpeedOnTime(dist, hour);
        System.out.println("output=" + output);
        assertEquals(expect, output);
    }

    @Test
    void minSpeedOnTime() {
        example1();
        example2();
        example3();
        example4();
        example5();
        example6();
        example7();
    }
}