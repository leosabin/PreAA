package com.team980.thunderscout.data;

import android.provider.BaseColumns;

public final class ScoutDataContract {
    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private ScoutDataContract() {
    }

    /* Inner class that defines the table contents */
    public static abstract class ScoutDataTable implements BaseColumns {
        public static final String TABLE_NAME = "scout_data";

        // --- INIT ---
        public static final String COLUMN_NAME_TEAM_NUMBER = "team";
        public static final String COLUMN_NAME_MATCH_NUMBER = "match_number";
        public static final String COLUMN_NAME_ALLIANCE_COLOR = "alliance_color";

        public static final String COLUMN_NAME_DATE_ADDED = "date_added";
        public static final String COLUMN_NAME_DATA_SOURCE = "data_source";

        // --- AUTO ---
        public static final String COLUMN_NAME_AUTO_GEARS_DELIVERED = "auto_gears_delivered";
        public static final String COLUMN_NAME_AUTO_LOW_GOAL_DUMP_AMOUNT = "auto_low_goal_dump_amount";
        public static final String COLUMN_NAME_AUTO_HIGH_GOALS = "auto_high_goals";
        public static final String COLUMN_NAME_AUTO_MISSED_HIGH_GOALS = "auto_missed_high_goals";
        public static final String COLUMN_NAME_AUTO_CROSSED_BASELINE = "auto_crossed_baseline";

        // --- TELEOP ---
        public static final String COLUMN_NAME_TELEOP_GEARS_DELIVERED = "teleop_gears_delivered";
        public static final String COLUMN_NAME_TELEOP_COLLECT_GEARS_CHUTE = "collectgearschute";
        public static final String COLUMN_NAME_TELEOP_COLLECT_GEARS_FLOOR = "collectgearsfloor";
        public static final String COLUMN_NAME_TELEOP_GEARS_SCORED = "teleopgearsscored";
        public static final String COLUMN_NAME_COLLECT_BALLS_TIME = "collectballssw";
        public static final String COLUMN_NAME_FUEL_DUMP_1 = "fd1";
        public static final String COLUMN_NAME_FUEL_DUMP_2 = "fd2";
        public static final String COLUMN_NAME_FUEL_DUMP_3 = "fd3";
        public static final String COLUMN_NAME_FUEL_DUMP_4 = "fd4";
        public static final String COLUMN_NAME_FUEL_DUMP_5 = "fd5";
        public static final String COLUMN_NAME_ALTER_SHOT = "altshot";
        public static final String COLUMN_NAME_PREVENT_CLIMB = "preventclimb";
        public static final String COLUMN_NAME_BLOCKED_PEG = "blockedpeg";
        public static final String COLUMN_NAME_OTHER = "other";
        public static final String COLUMN_NAME_TELEOP_LOW_GOAL_DUMPS = "teleop_low_goal_dumps";
        public static final String COLUMN_NAME_TELEOP_HIGH_GOALS = "teleop_high_goals";
        public static final String COLUMN_NAME_TELEOP_MISSED_HIGH_GOALS = "teleop_missed_high_goals";
        public static final String COLUMN_NAME_CLIMBING_STATS = "climbing_stats";

        // --- SUMMARY ---
        public static final String COLUMN_NAME_TROUBLE_WITH = "trouble_with";
        public static final String COLUMN_NAME_COMMENTS = "comments";
        public static final String COLUMN_NAME_PILOT = "pilot";
    }
}

