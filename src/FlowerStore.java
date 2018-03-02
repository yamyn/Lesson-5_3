class FlowerStore extends Flowers {

    FlowerStore() {
        super();
    }

    public int getPurse() {
        return purse;
    }


    private int purse = 0;

    private int purse() {
        for (int i = 0; i < getBouquet().length; i++) {
            purse += getBouquet()[i].getPrice();
        }
        return purse;
    }

    public Flowers[] getBouquet() {
        return bouquet;
    }

    public void setBouquet(Flowers[] bouquet) {
        this.bouquet = bouquet;
    }

    private static Flowers[] bouquet;

    Flowers[] sell(int rose, int chamomile, int tulip) {
        int size = rose + chamomile + tulip;
        bouquet = new Flowers[size];
        for (int i = 0; i < size; i++) {
            if (rose != 0) {
                bouquet[i] = new Rose_Flow();
                rose--;
                continue;
            }
            if (chamomile != 0) {
                bouquet[i] = new Chamomile_Flow();
                chamomile--;
                continue;
            }
            if (tulip != 0) {
                bouquet[i] = new Tulip_Flow();
                tulip--;
            }
        }
        purse();
        return getBouquet();

    }

    Flowers[] sellSequence(int rose, int chamomile, int tulip) {
        int size = rose + chamomile + tulip;
        bouquet = new Flowers[size];
        for (int i = 0; i < size; ) {
            if (rose != 0) {
                bouquet[i] = new Rose_Flow();
                rose--;
                i++;
            }
            if (chamomile != 0) {
                bouquet[i] = new Chamomile_Flow();
                chamomile--;
                i++;
            }
            if (tulip != 0) {
                bouquet[i] = new Tulip_Flow();
                tulip--;
                i++;
            }
        }
        purse();
        return getBouquet();
    }

    void show() {
        for (int i = 0; i < getBouquet().length; i++) {
            System.out.print(getBouquet()[i].getName() + ", ");
        }
        System.out.println();
    }

}

