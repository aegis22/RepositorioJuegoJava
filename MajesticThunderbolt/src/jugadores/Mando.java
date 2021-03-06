package jugadores;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Mando extends KeyAdapter{
	
	Teclas teclas;
/*
 * public boolean arriba(){ return teclas.arriba;}
 * public boolean abajo();
 * public boolean izquierda();
 * public boolean derecha();
 */
	public Mando(Teclas teclado1) {
		super();
		this.teclas= teclado1;
	}

	

	public void keyPressed(KeyEvent e) {
	        processKeyEvent(e, true);
	}

	    public void keyReleased(KeyEvent e) {
	    	switch (e.getKeyCode()) {
	        case KeyEvent.VK_UP:
	            teclas.arriba= false;
	            break;
	        case KeyEvent.VK_DOWN:
	            teclas.abajo= false;
	            break;
	        case KeyEvent.VK_LEFT:
	            teclas.izquierda= false;
	            break;
	        case KeyEvent.VK_RIGHT:
	            teclas.derecha= false;
	            break;
	        case KeyEvent.VK_N:
	            teclas.disparo= false;
	            break;
	        case KeyEvent.VK_E:
            	teclas.arriba2= false;
                break;
            case KeyEvent.VK_C:
            	teclas.abajo2= false;
                break;
            case KeyEvent.VK_S:
            	teclas.izquierda2= false;
                break;
            case KeyEvent.VK_F:
            	teclas.derecha2= false;
                break;
            case KeyEvent.VK_A:
            	teclas.disparo2= false;
                break;
	        default:
	            processKeyEvent(e, false);
	        }
	    }

	    private void processKeyEvent(KeyEvent e, boolean pressed) {
	        switch (e.getKeyCode()) {
	            case KeyEvent.VK_UP:
	                teclas.arriba= true;
	                break;
	            case KeyEvent.VK_DOWN:
	                teclas.abajo= true;
	                break;
	            case KeyEvent.VK_LEFT:
	                teclas.izquierda= true;
	                break;
	            case KeyEvent.VK_RIGHT:
	                teclas.derecha= true;
	                break;
	            case KeyEvent.VK_N:
	                teclas.disparo= true;
	                break;
	            case KeyEvent.VK_E:
	            	teclas.arriba2= true;
	                break;
	            case KeyEvent.VK_C:
	            	teclas.abajo2= true;
	                break;
	            case KeyEvent.VK_S:
	            	teclas.izquierda2= true;
	                break;
	            case KeyEvent.VK_F:
	            	teclas.derecha2= true;
	                break;
	            case KeyEvent.VK_A:
	            	teclas.disparo2= true;
	                break;
	        }
	    }


		public Teclas getTeclas() {
			return teclas;
		}


		public void setTeclas(Teclas teclas) {
			this.teclas = teclas;
		}
	    
	    
}
