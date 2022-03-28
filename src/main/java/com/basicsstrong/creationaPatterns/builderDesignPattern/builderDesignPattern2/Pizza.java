package com.basicsstrong.creationaPatterns.builderDesignPattern.builderDesignPattern2;

/** "Producto" */
class Pizza {
    private String masa;
    private String salsa;
    private String relleno;

    public void setMasa(String masa)     { this.masa = masa; }
    public void setSalsa(String salsa)     { this.salsa = salsa; }
    public void setRelleno(String relleno) { this.relleno = relleno; }

    @Override
    public String toString() {
        return "Pizza{" +
                "masa='" + masa + '\'' +
                ", salsa='" + salsa + '\'' +
                ", relleno='" + relleno + '\'' +
                '}';
    }
}