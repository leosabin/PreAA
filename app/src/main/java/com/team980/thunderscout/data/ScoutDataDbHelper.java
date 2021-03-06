package com.team980.thunderscout.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.team980.thunderscout.data.ScoutDataContract.ScoutDataTable;

public class ScoutDataDbHelper extends SQLiteOpenHelper {
    // If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 4;

    public static final String DATABASE_NAME = "ThunderScout_SCOUT_DATA_2017.db"; //Store year in database name but DO NOT CHANGE FORMAT

    private static final String TEXT_TYPE = " TEXT";
    private static final String FLOAT_TYPE = " REAL";
    private static final String INTEGER_TYPE = " INTEGER";
    private static final String BLOB_TYPE = " BLOB";
    private static final String COMMA_SEP = ",";
    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + ScoutDataTable.TABLE_NAME + " (" +
                    ScoutDataTable._ID + " INTEGER PRIMARY KEY," +
                    ScoutDataTable.COLUMN_NAME_TEAM_NUMBER + TEXT_TYPE + COMMA_SEP +
                    ScoutDataTable.COLUMN_NAME_MATCH_NUMBER + INTEGER_TYPE + COMMA_SEP +
                    ScoutDataTable.COLUMN_NAME_ALLIANCE_COLOR + TEXT_TYPE + COMMA_SEP +

                    ScoutDataTable.COLUMN_NAME_DATE_ADDED + INTEGER_TYPE + COMMA_SEP +
                    ScoutDataTable.COLUMN_NAME_DATA_SOURCE + TEXT_TYPE + COMMA_SEP +

                    ScoutDataTable.COLUMN_NAME_AUTO_GEARS_DELIVERED + INTEGER_TYPE + COMMA_SEP +
                    ScoutDataTable.COLUMN_NAME_TELEOP_COLLECT_GEARS_CHUTE + INTEGER_TYPE + COMMA_SEP +
                    ScoutDataTable.COLUMN_NAME_TELEOP_COLLECT_GEARS_FLOOR + INTEGER_TYPE + COMMA_SEP +



                    ScoutDataTable.COLUMN_NAME_TELEOP_GEARS_SCORED + INTEGER_TYPE + COMMA_SEP +
                    ScoutDataTable.COLUMN_NAME_COLLECT_BALLS_TIME + INTEGER_TYPE + COMMA_SEP +
                    ScoutDataTable.COLUMN_NAME_FUEL_DUMP_1 + TEXT_TYPE + COMMA_SEP +
                    ScoutDataTable.COLUMN_NAME_FUEL_DUMP_2 + TEXT_TYPE + COMMA_SEP +
                    ScoutDataTable.COLUMN_NAME_FUEL_DUMP_3 + TEXT_TYPE + COMMA_SEP +
                    ScoutDataTable.COLUMN_NAME_FUEL_DUMP_4 + TEXT_TYPE + COMMA_SEP +
                    ScoutDataTable.COLUMN_NAME_FUEL_DUMP_5 + TEXT_TYPE + COMMA_SEP +
                    ScoutDataTable.COLUMN_NAME_ALTER_SHOT + INTEGER_TYPE + COMMA_SEP +
                    ScoutDataTable.COLUMN_NAME_PREVENT_CLIMB + INTEGER_TYPE + COMMA_SEP +
                    ScoutDataTable.COLUMN_NAME_BLOCKED_PEG + INTEGER_TYPE + COMMA_SEP +
                    ScoutDataTable.COLUMN_NAME_OTHER + TEXT_TYPE + COMMA_SEP +



                    ScoutDataTable.COLUMN_NAME_AUTO_LOW_GOAL_DUMP_AMOUNT + TEXT_TYPE + COMMA_SEP +
                    ScoutDataTable.COLUMN_NAME_AUTO_HIGH_GOALS + INTEGER_TYPE + COMMA_SEP +
                    ScoutDataTable.COLUMN_NAME_AUTO_MISSED_HIGH_GOALS + INTEGER_TYPE + COMMA_SEP +
                    ScoutDataTable.COLUMN_NAME_AUTO_CROSSED_BASELINE + INTEGER_TYPE + COMMA_SEP +

                    ScoutDataTable.COLUMN_NAME_TELEOP_GEARS_DELIVERED + INTEGER_TYPE + COMMA_SEP +
                    ScoutDataTable.COLUMN_NAME_TELEOP_LOW_GOAL_DUMPS + BLOB_TYPE + COMMA_SEP +
                    ScoutDataTable.COLUMN_NAME_TELEOP_HIGH_GOALS + INTEGER_TYPE + COMMA_SEP +
                    ScoutDataTable.COLUMN_NAME_TELEOP_MISSED_HIGH_GOALS + INTEGER_TYPE + COMMA_SEP +
                    ScoutDataTable.COLUMN_NAME_CLIMBING_STATS + TEXT_TYPE + COMMA_SEP +

                    ScoutDataTable.COLUMN_NAME_TROUBLE_WITH + TEXT_TYPE + COMMA_SEP +
                    ScoutDataTable.COLUMN_NAME_COMMENTS + TEXT_TYPE + COMMA_SEP +
                    ScoutDataTable.COLUMN_NAME_PILOT + INTEGER_TYPE + ")";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + ScoutDataTable.TABLE_NAME;

    public ScoutDataDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for event data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}
