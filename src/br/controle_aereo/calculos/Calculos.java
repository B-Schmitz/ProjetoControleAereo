package br.controle_aereo.calculos;


public class Calculos {

    double[] resultado = new double[2];

    public double[] calculaPolar(double x, double y) {
        double var1 = Math.pow(x, 2);
        double var2 = Math.pow(y, 2);
        resultado[0] = Math.sqrt(var1 + var2);

        resultado[1] = Math.toDegrees((Math.atan2(y, x)));
        return resultado;
    }

    public double[] calculaCartesiano(double r, double ang) {
        resultado[0] = r*Math.cos(Math.toRadians(ang));
        resultado[1] = r*Math.sin(Math.toRadians(ang));
        
        return resultado;
    }
    
    public double[] calculaRotacao(double x, double y, double ang){
        resultado[0] = x * Math.cos(Math.toRadians(ang)) - y * Math.sin(Math.toRadians(ang));
        resultado[1] = y * Math.cos(Math.toRadians(ang)) + x * Math.sin(Math.toRadians(ang));
        return resultado;
    }
    
    public double[] calculaEscala(double x, double y, double Sx, double Sy){
        resultado[0] = x * (Sx/100);
        resultado[1] = y * (Sy/100);
        return resultado;
    }  
    
    public double[] calculaTranslacao(double x, double y, double Tx, double Ty){
        resultado[0] = x + Tx;
        resultado[1] = y + Ty;
        return resultado;
    }
    
    public double calculaDistanciaPontos(double x1, double y1, double x2, double y2){
        double dist, dx, dy;
        dx = x2-x1;
        dx = Math.pow(dx, 2);
        dy = y2-y1;
        dy = Math.pow(dy, 2);
        dist = Math.sqrt(dx+dy);
        return dist;
    }
    
    public double[] calculaIntersecacao(double x1, double y1, double ang1, double x2, double y2, double ang2){
        double x,y,m,m1;
        
        m = Math.tan(Math.toRadians(ang1));
        m1 = Math.tan(Math.toRadians(ang2));
        
        if(m==m1){
            return null;
        }else{
            x = ((m*x1+y1-y2)+(m1*x2))/(m1-m);
            y = ((m*x)-(m*x1))+y1;
            resultado[0] = x;
            resultado[1] = y;
            return resultado;
        }
    }
    
    public double calculaTempo(double x1, double y1, double vel, double x2, double y2){
        double distancia = calculaDistanciaPontos(x1, y1, x2, y2);
        return (distancia/vel)*3600;
    }
}
