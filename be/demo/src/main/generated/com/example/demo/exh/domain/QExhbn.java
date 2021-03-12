package com.example.demo.exh.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QExhbn is a Querydsl query type for Exhbn
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QExhbn extends EntityPathBase<Exhbn> {

    private static final long serialVersionUID = -1004153334L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QExhbn exhbn = new QExhbn("exhbn");

    public final ListPath<com.example.demo.anl.domain.Analysis, com.example.demo.anl.domain.QAnalysis> analysisList = this.<com.example.demo.anl.domain.Analysis, com.example.demo.anl.domain.QAnalysis>createList("analysisList", com.example.demo.anl.domain.Analysis.class, com.example.demo.anl.domain.QAnalysis.class, PathInits.DIRECT2);

    public final ListPath<com.example.demo.bkg.domain.Booking, com.example.demo.bkg.domain.QBooking> bookingList = this.<com.example.demo.bkg.domain.Booking, com.example.demo.bkg.domain.QBooking>createList("bookingList", com.example.demo.bkg.domain.Booking.class, com.example.demo.bkg.domain.QBooking.class, PathInits.DIRECT2);

    public final StringPath endDate = createString("endDate");

    public final StringPath exhbnArtist = createString("exhbnArtist");

    public final StringPath exhbnContent = createString("exhbnContent");

    public final StringPath exhbnGenre = createString("exhbnGenre");

    public final StringPath exhbnImage = createString("exhbnImage");

    public final NumberPath<Long> exhbnNum = createNumber("exhbnNum", Long.class);

    public final StringPath exhbnPrice = createString("exhbnPrice");

    public final StringPath exhbnTitle = createString("exhbnTitle");

    public final com.example.demo.hal.domain.QHall hall;

    public final ListPath<com.example.demo.rev.domain.Review, com.example.demo.rev.domain.QReview> reviewList = this.<com.example.demo.rev.domain.Review, com.example.demo.rev.domain.QReview>createList("reviewList", com.example.demo.rev.domain.Review.class, com.example.demo.rev.domain.QReview.class, PathInits.DIRECT2);

    public final StringPath startDate = createString("startDate");

    public QExhbn(String variable) {
        this(Exhbn.class, forVariable(variable), INITS);
    }

    public QExhbn(Path<? extends Exhbn> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QExhbn(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QExhbn(PathMetadata metadata, PathInits inits) {
        this(Exhbn.class, metadata, inits);
    }

    public QExhbn(Class<? extends Exhbn> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.hall = inits.isInitialized("hall") ? new com.example.demo.hal.domain.QHall(forProperty("hall")) : null;
    }

}

