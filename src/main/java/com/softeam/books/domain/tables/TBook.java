/*
 * This file is generated by jOOQ.
*/
package com.softeam.books.domain.tables;


import com.softeam.books.domain.Public;
import com.softeam.books.domain.tables.records.TBookRecord;
import com.softeam.books.domain.Keys;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBook extends TableImpl<TBookRecord> {

    private static final long serialVersionUID = -17802313;

    /**
     * The reference instance of <code>public.t_book</code>
     */
    public static final TBook T_BOOK = new TBook();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TBookRecord> getRecordType() {
        return TBookRecord.class;
    }

    /**
     * The column <code>public.t_book.bok_id</code>.
     */
    public final TableField<TBookRecord, Integer> BOK_ID = createField("bok_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.t_book.bok_title</code>.
     */
    public final TableField<TBookRecord, String> BOK_TITLE = createField("bok_title", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * Create a <code>public.t_book</code> table reference
     */
    public TBook() {
        this("t_book", null);
    }

    /**
     * Create an aliased <code>public.t_book</code> table reference
     */
    public TBook(String alias) {
        this(alias, T_BOOK);
    }

    private TBook(String alias, Table<TBookRecord> aliased) {
        this(alias, aliased, null);
    }

    private TBook(String alias, Table<TBookRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TBookRecord, Integer> getIdentity() {
        return Keys.IDENTITY_T_BOOK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TBookRecord> getPrimaryKey() {
        return Keys.T_BOOK_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TBookRecord>> getKeys() {
        return Arrays.<UniqueKey<TBookRecord>>asList(Keys.T_BOOK_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TBook as(String alias) {
        return new TBook(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TBook rename(String name) {
        return new TBook(name, null);
    }
}
