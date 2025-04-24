class Televisor {
    private int canal;
    private int volume;
    private boolean ligado;

    public Televisor() {
        this.canal = 1;
        this.volume = 50;
        this.ligado = false;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public void aumentarVolume() {
        if (this.ligado) {
            if (this.volume < 100) {
                this.volume++;
            }
        }
    }

    public void diminuirVolume() {
        if (this.ligado) {
            if (this.volume > 0) {
                this.volume--;
            }
        }
    }

    public void trocarCanal(int novoCanal) {
        if (this.ligado) {
            if (novoCanal >= 1) {
                if (novoCanal <= 100) {
                    this.canal = novoCanal;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Televisor{" +"canal =" + canal +", volume =" + volume +", ligado =" + ligado +'}';
    }
}
