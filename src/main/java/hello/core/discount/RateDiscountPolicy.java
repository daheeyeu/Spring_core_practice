package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    private int disountPercent = 10;

    @Override
    public int disount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * disountPercent / 100;
        } else {
            return 0;
        }
    }
}
