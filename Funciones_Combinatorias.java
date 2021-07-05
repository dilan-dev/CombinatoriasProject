package Combinatorio;
import javax.swing.JOptionPane;

public class Funciones_Combinatorias 
{
	
	
	
	public void Fn_Permutacion(int numP)
	{
		int x, factorial = 1;
		
			for (x = 1; x <= numP; x++)
			{
				factorial *= x;
			}
		JOptionPane.showMessageDialog(null, "PERMUTACION SIN REPETICION:  "+ factorial , " [ PERMUTACIONES n! ]", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public int Fn_PerNo(int num)
	{
		int x, factorial = 1;
		
			for (x = 1; x <= num; x++)
			{
				factorial *= x;
			}
			return factorial;
	}
	
	public void fn_Permutacion_NoRep(int numPn, int cantEleRep)
	{
		long denominador = 1;
		long numerador;

		numerador = Fn_PerNo(numPn);
		
		for (int x = 1; x <= cantEleRep; x++)
		{	
			
			int elemento = Integer.parseInt(JOptionPane.showInputDialog("ESCRIBE LA REPETICION "+ x));
			
			denominador = denominador * Fn_PerNo(elemento);
			
		}
		
		JOptionPane.showMessageDialog(null, "PERMUTACION CON REPETICION:  "+ numerador / denominador, "[PERMUTACIONES n!/a!b!c!]", JOptionPane.INFORMATION_MESSAGE);

	}
	
	
	public void fnVariacionSinRep(int n, int r)
	{
		long valorn;
		long valord;
		int d;
		
		valorn = Fn_PerNo(n);
		
		d = n - r;
		
		valord = Fn_PerNo(d);
		
		JOptionPane.showMessageDialog(null, "VARIACION SIN REPETICION:  "+valorn / valord, "[VARIACIONES n!/(n - r)!]", JOptionPane.INFORMATION_MESSAGE);

	}
	
	public void fnVariacionRep(int n, int r)
	{
		int potencia = 1;
		int x = 1;
		
		while(x <= r)
		{
			x++;
			potencia *= n;
		}
		
		JOptionPane.showMessageDialog(null, "NUMERO DE VARIACIONES: " +potencia, "CANTIDAD DE VARIACIONES [ n ^ r ]", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	public void fnEmparejamiento(int m, int n)
	{
		long valn = 1;
		long vald;
		long result;
		
		valn *= Fn_PerNo(m*n);
		vald = (long) Math.pow(Fn_PerNo(m),n) * Fn_PerNo(n);
		
		result = valn/vald;
		JOptionPane.showMessageDialog(null, "EMPAREJAMIENTO: " +result, "RESULTADO DE EMPAREJAMIENTO [ (mn)/((m!)^ n n!) ]", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	public void fnCombinacionSinRep (int n, int r)
	{
		long den;
		long num;
		
		num = Fn_PerNo(n);
		den = Fn_PerNo(r) * Fn_PerNo(n-r);
		
		JOptionPane.showMessageDialog(null, "COMBINACIONES: " +num/den, "RESULTADO DE COMBINACIONES SIN REP [ n! / r! (n - r)! ]", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	public void fnCombinacionRep (int n, int r)
	{
		long den;
		long num;
		
		num = Fn_PerNo(n+r-1);
		den = Fn_PerNo(r) * Fn_PerNo(n-1);
		
		JOptionPane.showMessageDialog(null, "COMBINACIONES: " +num/den, "RESULTADO DE COMBINACIONES CON REP [ (n + r - 1)! / r! (n - r)! ]", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void stirling(int n)
	{
		float result1;
		int result2;
		
		result1 = (float) ((float) Math.sqrt(2*Math.PI*n) * Math.pow((n/Math.E), n) * Math.pow(Math.E, (1 / (12*(n+1) ))));
		result2 = Fn_PerNo(n);
		JOptionPane.showMessageDialog(null, "STIRLING MINIMO: " +result1 + " STIRLING MAXIMO: "+result2, 
				"RESULTADO DE STIRLING  [ n! ≅ RAIZ(2*PI()*𝑛)*(𝑛/EXP(1))^𝑛*EXP(1/(12*(𝑛+1))) ]", JOptionPane.INFORMATION_MESSAGE);
	}
	
		
}
