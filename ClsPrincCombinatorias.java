package Combinatorio;
import javax.swing.JOptionPane;
public class ClsPrincCombinatorias 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Funciones_Combinatorias ObjOptionPane = new Funciones_Combinatorias();
		
		
		int opciones = 0;
		
		
		do
		{
			opciones = Integer.parseInt(JOptionPane.showInputDialog(null, "...MENU DE COMBINATORIAS / PROYECTO EDC...\n\n"
					+"1. PERMUTACIONES SIN REPETICIONES\n"
					+"2. PERMUTACIONES CON REPETICION\n"
					+"3. VARIACIONES SIN REPETICION\n"
					+"4. VARIACIONES CON REPETICION\n"
					+"5. EMPAREJAMIENTOS\n"
					+"6. COMBINACIONES SIN REPETICION\n"
					+"7. COMBINACIONES CON REPETICION\n"
					+"8. FORMULA DE STIRLING\n"
					+"9. SALIR"));
			
			switch (opciones)
			{
				case 1: 
					{
						int numP = Integer.parseInt(JOptionPane.showInputDialog("ESCRIBE UN NUMERO: "));
						ObjOptionPane.Fn_Permutacion(numP);
					}break;
				
				case 2:
				
					{
						int n = Integer.parseInt(JOptionPane.showInputDialog("ESCRIBE EL VALOR DE [ n ]: "));
						int r = Integer.parseInt(JOptionPane.showInputDialog("ESCRIBE EL NUMERO DE REPETICIONES QUE EXISTEN: "));
						ObjOptionPane.fn_Permutacion_NoRep(n, r);
					}break;
					
				case 3: 
					{
						int n = Integer.parseInt(JOptionPane.showInputDialog("ESCRIBE EL VALOR DE [ n ]: "));
						int r = Integer.parseInt(JOptionPane.showInputDialog("ESCRIBE EL VALOR DE [ R ]: "));
						ObjOptionPane.fnVariacionSinRep(n, r);
					}break;
					
				case 4:
				{
					int n = Integer.parseInt(JOptionPane.showInputDialog("ESCRIBE EL VALOR DE [ n ]: "));
					int r = Integer.parseInt(JOptionPane.showInputDialog("ESCRIBE EL VALOR DE [ R ]: "));
					ObjOptionPane.fnVariacionRep(n, r);
				}break;
				
				case 5: 
				{
					int m = Integer.parseInt(JOptionPane.showInputDialog("ESCRIBE EL VALOR DE [ m ]: "));
					int n = Integer.parseInt(JOptionPane.showInputDialog("ESCRIBE EL VALOR DE [ n ]: "));
					ObjOptionPane.fnEmparejamiento(m, n);
				}break;
				
				case 6: 
				{
					int n = Integer.parseInt(JOptionPane.showInputDialog("ESCRIBE EL VALOR DE [ n ]: "));
					int r = Integer.parseInt(JOptionPane.showInputDialog("ESCRIBE EL VALOR DE [ r ]: "));
					ObjOptionPane.fnCombinacionSinRep(n,r);
				}
				
				case 7:
				{
					int n = Integer.parseInt(JOptionPane.showInputDialog("ESCRIBE EL VALOR DE [ n ]: "));
					int r = Integer.parseInt(JOptionPane.showInputDialog("ESCRIBE EL VALOR DE [ r ]: "));
					ObjOptionPane.fnCombinacionRep(n, r);
				}break;
				
				case 8:
				{
					int n = Integer.parseInt(JOptionPane.showInputDialog("ESCRIBE EL VALOR DE [ n ]: "));
					ObjOptionPane.stirling(n);
				}break;
			
				case 9: opciones = 9;
				break;
			
				default: 
					{
						JOptionPane.showMessageDialog(null, "ESCRIBISTE UNA OPCION INCORRECTA. INTENTA NUEVAMENTE...");
					}
			}
			
		}while(opciones != 9);

	}
}
