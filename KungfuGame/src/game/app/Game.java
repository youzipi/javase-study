package game.app;

import game.logic.KungfuMaster;
import game.roles.Linghuchong;
import game.roles.Ouyangfeng;

import java.util.Scanner;

/**
 * project_name:test
 * package_name:game.app
 * user: Administrator
 * date: 14-4-9
 */
public class Game {

    public static Scanner in = new Scanner(System.in);
    public static int choice;

    public static KungfuMaster player = new Linghuchong("令狐冲");
    public static KungfuMaster robot = new Ouyangfeng("欧阳锋");
    public static KungfuMaster tt;
    public static boolean isFirst = true;

    public static void init(){
        switch(choice){
            case 2:
                tt = player;
                player = robot;
                robot = tt;
                break;
        }
    }


    public static void Menu(){  //菜单显示
        System.out.println("*******Welcome!***********");
        System.out.println("1.令狐冲   2.欧阳锋");
        System.out.println("请选择：");
        choice = in.nextInt();
    }
    //战斗
    public static void beginCombat(KungfuMaster player,KungfuMaster robot){

        int temp = (int)(Math.random() * 10) % 3;
        temp++;
        Game.isFirst = !isFirst;
        switch (temp){
            case 1:
                if (Game.isFirst)
                    robot.commonSkill(player);
                else
                    player.commonSkill(robot);

                break;
            case 2:
                if (Game.isFirst)
                    robot.bestSkill(player);
                else
                    player.bestSkill(robot);

                break;
            case 3:
                if (Game.isFirst)
                    robot.secrets(player);
                else
                    player.secrets(robot);
                break;
        }
    }

    public static boolean isOver(){
        return (Game.player.getBlood() <= 0) || (Game.robot.getBlood() <= 0);
    }

    public static void showResult(){
        if(Game.player.getBlood() <= 0)
            System.out.println("You Lose...");
        else
            System.out.println("You Win!");
    }


    public static void main(String[] args) {
        Game.Menu();    //显示菜单
        Game.init();    //初始化游戏
        do{
            Game.beginCombat(player,robot);
            System.out.println("player:" + Game.player.getBlood() + "robot:" + Game.robot.getBlood());
        }while (!Game.isOver());

        Game.showResult();
    }
}
