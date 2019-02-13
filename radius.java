class radius
{
    public static void main (String[] args)
    {
        double p, r;
        java.util.Scanner in;

        in = new java.util.Scanner(System.in);
        System.out.print("Enter the radius: ");
        p = in.nextDouble();

        r = p / (2 * Math.PI);
        System.out.println("radius = " + r);

	System.out.print("Enter another radius: ");
	p = in.nextDouble();

	r = p / (2 * Math.PI);
	System.out.println("radius = " + r);
    }
}