package com.example.demo.anl.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAnalysis is a Querydsl query type for Analysis
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAnalysis extends EntityPathBase<Analysis> {

    private static final long serialVersionUID = -1854879459L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAnalysis analysis = new QAnalysis("analysis");

    public final NumberPath<Long> analNum = createNumber("analNum", Long.class);

    public final com.example.demo.exh.domain.QExhbn exhbn;

    public final ListPath<com.example.demo.rec.domain.Recommend, com.example.demo.rec.domain.QRecommend> recommendList = this.<com.example.demo.rec.domain.Recommend, com.example.demo.rec.domain.QRecommend>createList("recommendList", com.example.demo.rec.domain.Recommend.class, com.example.demo.rec.domain.QRecommend.class, PathInits.DIRECT2);

    public final com.example.demo.uss.domain.QUser user;

    public QAnalysis(String variable) {
        this(Analysis.class, forVariable(variable), INITS);
    }

    public QAnalysis(Path<? extends Analysis> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAnalysis(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAnalysis(PathMetadata metadata, PathInits inits) {
        this(Analysis.class, metadata, inits);
    }

    public QAnalysis(Class<? extends Analysis> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.exhbn = inits.isInitialized("exhbn") ? new com.example.demo.exh.domain.QExhbn(forProperty("exhbn"), inits.get("exhbn")) : null;
        this.user = inits.isInitialized("user") ? new com.example.demo.uss.domain.QUser(forProperty("user")) : null;
    }

}

