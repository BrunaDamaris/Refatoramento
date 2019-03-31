package hotelManagement;

class NotAvailable extends Exception
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 2707621495907956531L;

	@Override
    public String toString()
    {
        return "Not Available !";
    }
}
