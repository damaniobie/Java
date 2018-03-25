Scanner stdIn = new Scanner(System.in);
		/* Name some constants used in the program */
		int rows = 6;				// Number of rows in the matrix
		int cols = 6;				// Number of columns in the matrix
		int minValueInArray = -9;	// Minimum value of an element in the matrix
		int elementsInHourGlass = 7;// Number of elements in an hourglass
		// Set max to the minimum hourglass sum possible
		int maxHourGlassSum = minValueInArray * elementsInHourGlass;
		// Declare the matrix of numbers
		int matrix[][] = new int[rows][cols];
		int hourGlassSum;	// Sum of the elements in the hourglass
		
		/* Read the values for the matrix looping thru the rows */
        for(int i=0; i < rows; i++){
        	/* Loop thru the columns for each row, reading the matrix */
            for(int j=0; j < cols; j++){
            	/* Read the next value from standard input */
                matrix[i][j] = stdIn.nextInt();
            }
        }
        /* For debugging, print out the matrix */
        for(int i=0; i < rows; i++){
            for(int j=0; j < cols; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
