package com.rplbo.projectrekeninginheritance;

public class RekeningBisnis extends Rekening {

    public final double BUNGA_SETOR = 0.001;

    public RekeningBisnis(Nasabah nasabah) {
        super(nasabah);
    }

    public RekeningBisnis(Nasabah nasabah, int saldo) {
        super(nasabah, saldo);
    }

    public void penyetoran(int jumlah) {
        if (jumlah > 0) {
            double totalSetoran = jumlah + bunga(jumlah);
            super.penyetoran((int) totalSetoran);
        }
    }

    private double bunga(int jumlah) {
        return BUNGA_SETOR * jumlah;
    }
}

