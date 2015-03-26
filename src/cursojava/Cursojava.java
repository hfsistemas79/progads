 Scanner miScanner = new Scanner( System. in) ;
        int numIntentos = 0;
        int numAleatorio = new Random() . nextInt( 10) + 1;
        out. println("       ******* *****         " ) ;
        out. println(" Bienvenido al juego \"Â¡Â¡Acierta el NÃºmero!!\"" ) ;
        out. println("       ******* *****         " ) ;
        out. println() ;
        out. print( "Escribe un nÃºmero del 1 al 10: " ) ;
        int numeroEscrito = miScanner. nextInt() ;
        numIntentos++;
        while (numeroEscrito != numAleatorio) {
            out. println( ) ;
            out. println( " IntÃ©ntalo de nuevo. . . ") ;
            out. print(" Escribe un nÃºmero del 1 al 10: " ) ;
            numeroEscrito = miScanner. nextInt() ;
            numIntentos++;
        }
        out. print( "Has Ganado despuÃ©s de " ) ;
        out. println(numIntentos + " intentos. " ) ;