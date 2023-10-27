package jogoDaVelha;

public class testes {
	public static void main ( String [] args ) {
		char jogo [][] = new char [ 3 ][ 3 ];
		
		for ( int mostrar = 0 ; mostrar < jogo.length ; mostrar++ ) {
			if ( mostrar == 0 ) {
				System.out.println ( "     1     2     3 " );
				System.out.println ( "  ╔═════╦═════╦═════╗" );
			} else if ( mostrar == 1 || mostrar == 2 )  {
				System.out.println ( "\n  ╠═════╬═════╬═════╣" );
			}
			System.out.print ( ( mostrar + 1 ) + " " );
			for ( int mostrarColuna = 0 ; mostrarColuna < jogo.length ; mostrarColuna++ ) {
				System.out.print ( "║  " + jogo [ mostrar ][ mostrarColuna ] + "  " );
				if ( mostrarColuna + 1 == jogo.length ) {
					System.out.print ( "║" );
				}
			}
		}
		System.out.println ( "\n  ╚═════╩═════╩═════╝" );

	}
}
