package jogoDaVelha;

import java.util.Scanner;

public class jogoDaVelha {

	public static void main ( String [] args ) {
		char jogo [][] = new char [3][3];
		int ganhador = 0 , linha , coluna, erro;
		Scanner sc = new Scanner ( System.in );
		System.out.println (  "JOGO DA VELHA\n Jogador 1 | ✗ |\n Jogador 2 | ○ |\nJogador 1 começa!\n" );
		erro = -1;
		do {	
			while ( erro != 0 ) {
				for ( int mostrar = 0 ; mostrar < jogo.length ; mostrar++ ) {
					if ( mostrar == 0 ) {
						System.out.println ( "    1     2     3 " );
					} else {
						System.out.println ();
					}
					System.out.print ( ( mostrar + 1 ) + " " );
					for ( int mostrarColuna = 0 ; mostrarColuna < jogo.length ; mostrarColuna++ ) {
						System.out.print ( "| " + jogo [ mostrar ][ mostrarColuna ] + " | " );
					}
				}
				System.out.println ( "\nInsira a linha onde gostaria de colocar o ✗ " );
				linha = sc.nextInt() - 1;
				System.out.println ( "Insira a coluna onde gostaria de colocar o ✗ " );
				coluna = sc.nextInt() - 1;
				
				if ( linha < 0 || coluna < 0 || linha > 2 || coluna > 2 ) {
					System.out.println ( "ERRO. Valor para linha e/ou coluna inválido. Tente novamente." );
					
				} else if ( jogo [ linha ][ coluna ] == '✗' || jogo [ linha ][ coluna ] == '○' ) {
					System.out.println ( "ERRO. Linha ocupada. Tente novamente." );
					
				} else {
					jogo [ linha ][ coluna ] = '✗';
					erro = 0;
				}
			}
			erro = -1;
			while ( erro != 0 ) {
				for ( int mostrar = 0 ; mostrar < jogo.length ; mostrar++ ) {
					if ( mostrar == 0 ) {
						System.out.println ( "    1     2     3 " );
					} else {
						System.out.println ();
					}
					System.out.print ( ( mostrar + 1 ) + " " );
					for ( int mostrarColuna = 0 ; mostrarColuna < jogo.length ; mostrarColuna++ ) {
						System.out.print ( "| " + jogo [ mostrar ][ mostrarColuna ] + " | " );
					}
				}
				System.out.println ( "\nInsira a linha onde gostaria de colocar a ○ " );
				linha = sc.nextInt() - 1;
				System.out.println ( "Insira a coluna onde gostaria de colocar a ○ " );
				coluna = sc.nextInt() - 1;
				if ( jogo [ linha ][ coluna ] == '✗' || jogo [ linha ][ coluna ] == '○' ) {
					System.out.println ( "ERRO. Linha ocupada. Tente novamente." );
				} else {
					jogo [ linha ][ coluna ] = '○';
					erro = 0;
				}
			}
			erro = -1;
		} while ( ganhador != -1 && ganhador != -2 );
		sc.close();
	}

}
