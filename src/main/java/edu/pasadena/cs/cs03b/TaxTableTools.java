package edu.pasadena.cs.cs03b;

public class TaxTableTools{

    private int[] salaryTable;
    private double[] rateTable;

    public void setTaxTable(int[] salaryBounds, double[] taxRates){
        salaryTable = salaryBounds;
        rateTable = taxRates;
    }

    public double getTaxRate(int salary){
        double taxRate = 0.0;

        for (int i = 0; i < salaryTable.length; i++) {

            if (salary >= salaryTable[i]){
                taxRate = rateTable[i];
            }
        }
        return taxRate;
    }


}