package model.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idSubscription;
    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @Enumerated(EnumType.STRING)
    private SubscriptionType subscriptionType;

    private LocalDate startDate;

    private LocalDate endDate;

    @Enumerated(EnumType.STRING)
    private SubscriptionStatus status;


}
enum SubscriptionType {
    MONTHLY, ANNUALLY
}
enum SubscriptionStatus {
    ACTIVE, EXPIRED
}
