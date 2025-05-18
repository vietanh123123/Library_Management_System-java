package Core.Enums;


public enum ReservationStatus { 
    WATING, //User is waiting for the book to become available
    PENDING_PICKUP, //User has been notified that the book is available and is waiting to pick it up
    COMPLETE, // Book was picked up by the user
    CANCELLED,
    EXPIRED // Book was not picked up in time
}