package Core.Enums;


public enum TransactionType {
    CHECKOUT, // Book is checked out by a member
    RETURN,  // Book is returned by a member
    FINE_PAYMENT, // Payment of a fine for overdue books
    MEMBERSHIP_FEE // Payment of membership fee
}