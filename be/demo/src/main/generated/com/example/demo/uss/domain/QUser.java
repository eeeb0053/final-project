package com.example.demo.uss.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = 390411586L;

    public static final QUser user = new QUser("user");

    public final ListPath<com.example.demo.anl.domain.Analysis, com.example.demo.anl.domain.QAnalysis> analysisList = this.<com.example.demo.anl.domain.Analysis, com.example.demo.anl.domain.QAnalysis>createList("analysisList", com.example.demo.anl.domain.Analysis.class, com.example.demo.anl.domain.QAnalysis.class, PathInits.DIRECT2);

    public final StringPath birthday = createString("birthday");

    public final ListPath<com.example.demo.bkg.domain.Booking, com.example.demo.bkg.domain.QBooking> bookingList = this.<com.example.demo.bkg.domain.Booking, com.example.demo.bkg.domain.QBooking>createList("bookingList", com.example.demo.bkg.domain.Booking.class, com.example.demo.bkg.domain.QBooking.class, PathInits.DIRECT2);

    public final StringPath email = createString("email");

    public final StringPath gender = createString("gender");

    public final StringPath password = createString("password");

    public final StringPath phoneNumber = createString("phoneNumber");

    public final StringPath preferGenre = createString("preferGenre");

    public final ListPath<com.example.demo.rev.domain.Review, com.example.demo.rev.domain.QReview> reviewList = this.<com.example.demo.rev.domain.Review, com.example.demo.rev.domain.QReview>createList("reviewList", com.example.demo.rev.domain.Review.class, com.example.demo.rev.domain.QReview.class, PathInits.DIRECT2);

    public final SetPath<Role, QRole> roles = this.<Role, QRole>createSet("roles", Role.class, QRole.class, PathInits.DIRECT2);

    public final StringPath userid = createString("userid");

    public final StringPath username = createString("username");

    public final NumberPath<Long> userNum = createNumber("userNum", Long.class);

    public QUser(String variable) {
        super(User.class, forVariable(variable));
    }

    public QUser(Path<? extends User> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUser(PathMetadata metadata) {
        super(User.class, metadata);
    }

}

