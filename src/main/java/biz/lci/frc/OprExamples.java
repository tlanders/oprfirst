package biz.lci.frc;

import org.ejml.simple.SimpleMatrix;

/**
 * Hello world!
 *
 */
public class OprExamples
{
    public static void main( String[] args )
    {
        double [][] teams1 = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 1, 1}
        };
        double [][] scores1 = {
                {10},
                {13},
                {7}
        };

        System.out.println( "oprfirst starting..." );

        exactSolution();
        overDetermined1();

        System.out.println( "oprfirst done." );
    }

    public static void exactSolution()
    {
        double [][] teams1 = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 1, 1}
        };
        double [][] scores1 = {
                {10},
                {13},
                {7}
        };

        SimpleMatrix teamsMatrix1 = new SimpleMatrix(teams1);
        SimpleMatrix scoresMatrix1 = new SimpleMatrix(scores1);
        SimpleMatrix tm1Transposed = teamsMatrix1.transpose();

        System.out.println( "teams=" + teamsMatrix1);
        System.out.println( "xposed=" + tm1Transposed);
        System.out.println( "scores=" + scoresMatrix1);

        SimpleMatrix solution1 = tm1Transposed.mult(teamsMatrix1).invert().mult(tm1Transposed.mult(scoresMatrix1));

        System.out.println( "exact solution=" + solution1);
    }

    public static void overDetermined1()
    {
        double [][] teams1 = {
                {1, 1, 0, 0},
                {1, 0, 1, 0},
                {0, 1, 1, 0},
                {1, 0, 0, 1},
                {0, 1, 0, 1}
        };
        double [][] scores1 = {
                {10},
                {13},
                {7},
                {15},
                {10}
        };

        SimpleMatrix teamsMatrix1 = new SimpleMatrix(teams1);
        SimpleMatrix scoresMatrix1 = new SimpleMatrix(scores1);
        SimpleMatrix tm1Transposed = teamsMatrix1.transpose();

        System.out.println( "teams=" + teamsMatrix1);
        System.out.println( "xposed=" + tm1Transposed);
        System.out.println( "scores=" + scoresMatrix1);

        SimpleMatrix solution1 = tm1Transposed.mult(teamsMatrix1).invert().mult(tm1Transposed.mult(scoresMatrix1));

        System.out.println( "overdetermined1 solution=" + solution1);
    }
}

