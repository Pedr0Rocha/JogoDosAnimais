package animais;

/**
 *
 * @author pedrodesktop
 */
public class NoArvore {
    
    private NoArvore filhoDir;
    private NoArvore filhoEsq;
    private String dado;
    
    public NoArvore(String dado) {
        this.dado = dado;
    }

    public NoArvore getFilhoDir() {
        return filhoDir;
    }

    public void setFilhoDir(NoArvore filhoDir) {
        this.filhoDir = filhoDir;
    }

    public NoArvore getFilhoEsq() {
        return filhoEsq;
    }

    public void setFilhoEsq(NoArvore filhoEsq) {
        this.filhoEsq = filhoEsq;
    }

    public String getDado() {
        return dado;
    }

    public void setDado(String dado) {
        this.dado = dado;
    }
    
    public boolean ehFolha() {
        if (this == null) 
            return false;
        else
            return this.filhoDir == null && this.filhoEsq == null;
    }
}
