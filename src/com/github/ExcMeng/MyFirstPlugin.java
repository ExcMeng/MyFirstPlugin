package com.github.ExcMeng;

//下面是导入的包

import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.command.Command;
import org.bukkit.plugin.java.JavaPlugin;

//主代码
public class MyFirstPlugin extends JavaPlugin implements Listener {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("test")) {
//记得这里的指令不需要带上 "/" , 比如说游戏里输入"/test" 这里就是 "test"
            sender.sendMessage("Hello World!");
//向指令发送者发送 HAYO! ,这里可以用§输入彩色代码
            return true;
//返回 "真" 说明这个指令顺利通过了， 如果返回 "假"(false) 那么服务器就会提示
//在plugin.yml里面写的 usage 的文字提醒玩家如何使用
        }
        return false;
    }
}