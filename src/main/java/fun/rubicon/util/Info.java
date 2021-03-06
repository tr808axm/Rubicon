/*
 * Copyright (c) 2017 Rubicon Dev Team
 *
 * Licensed under the MIT license. The full license text is available in the LICENSE file provided with this project.
 */

package fun.rubicon.util;

import fun.rubicon.core.DiscordCore;
import fun.rubicon.core.Main;
import net.dv8tion.jda.core.entities.User;

import java.util.Date;

/**
 * General data object.
 * @author ForYaSee, DerSchlaubi, LeeDJD, tr808axm
 */
public class Info {

    static Configuration cfg = Main.getConfiguration();
    public final static String BOT_ID = "380713705073147915";
    public final static String BOT_DEFAULT_PREFIX = "rc!";
    public static int reconnectCount = 0;
    public final static String BOT_NAME = "Rubicon";
    public final static String BOT_VERSION = "0.1.0";
    public final static String BOT_WEBSITE = "https://rubicon.fun";
    public final static String BOT_GITHUB = "https://github.com/Rubicon-Bot/RubiCon";
    public final static String CONFIG_FILE = "config.json";
    public final static String EMBED_FOOTER = "© 2017 Rubicon Dev Team";
    public final static String ICON_URL = "https://images-ext-2.discordapp.net/external/Xae9oFQTIRhV7V21twWufcxtdcxhmW6NFNatN8cyxz8/https/cdn.discordapp.com/icons/380415148545802250/579ee17b8de4d027c98853606567d760.jpg?width=72&height=72";
    public final static String BITLY_TOKEN = cfg.getString("bitlytoken");
    public static Date lastRestart;

    /**
     * Bot author user instances. Does not work as these tasks are performed before JDA is instantiated.
     *
     * @deprecated use BOT_AUTHOR_IDS for identification instead.
     */
    @Deprecated
    public final static User[] BOT_AUTHORS = {
            DiscordCore.getJDA().getUserById(227817074976751616L), //ForYaSee
            DiscordCore.getJDA().getUserById(153507094933274624L), //Lee
            DiscordCore.getJDA().getUserById(318773753796624394L), //Scryptex
            DiscordCore.getJDA().getUserById(138014719582797824L), //Eiskeks
            DiscordCore.getJDA().getUserById(264048760580079616L), //Schlaubi
            DiscordCore.getJDA().getUserById(221905671296253953L), //Zekro
            DiscordCore.getJDA().getUserById(224528662710452224L), //ForMoJa
            DiscordCore.getJDA().getUserById(137263174675070976L)  //tr808axm
    };
    /**
     * Bot author long ids.
     */
    public final static long[] BOT_AUTHOR_IDS = {
            227817074976751616L, // ForYaSee
            153507094933274624L, // Lee
            318773753796624394L, // Scryptex
            138014719582797824L, // Eiskeks
            264048760580079616L, // Schlaubi
            221905671296253953L, // Zekro
            224528662710452224L, // ForMoJa
            137263174675070976L  // tr808axm
    };

    /* MySQL login */
    public final static String MYSQL_HOST = cfg.getString("mysql_host");
    public final static String MYSQL_PORT = cfg.getString("mysql_port");
    public final static String MYSQL_USER = cfg.getString("mysql_user");
    public final static String MYSQL_PASSWORD = cfg.getString("mysql_password");
    public final static String MYSQL_DATABASE = cfg.getString("mysql_database");
}