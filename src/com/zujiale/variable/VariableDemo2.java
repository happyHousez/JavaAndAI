package com.zujiale.variable;

public class VariableDemo2 {

    public static void main(String[] args) {
     /*
     *  我方：叉子           对方：长手
     * 攻击：220             攻击：210
     * 防御：85             防御：80
     * 血量：1012.5          血量：1223.3
     * 技能加成：1.2         技能加成：1.3
     *
     * 技能造成伤害的公式：技能攻击力 * 技能加成 -对方防御力
     * 普攻造成伤害的公式：攻击力 - 对方防御力
     *
     * 计算：我方第一次进行普攻，造成多少伤害，对方还剩余多少血量；
     *       我方第二次进行技能攻击，造成多少伤害，对方还剩余多少血量；
     *
     * */

        // 定义变量
        double myAttack = 220;
        double myDefense = 85;
        double myBlood = 1012.5;
        double mySkillAdd = 1.2;
        double enemyAttack = 210;
        double enemyDefense = 80;
        double enemyBlood = 1223.3;
        double enemySkillAdd = 1.3;
        // 计算
        double mySkillAttack = myAttack * mySkillAdd - enemyDefense;
        double myNormalAttack = myAttack - enemyDefense;
        // 输出
        System.out.println("我第一次进行普攻，造成" + myNormalAttack + "伤害，对方还剩余" + (enemyBlood - myNormalAttack) + "血量");
        System.out.println("我第二次进行技能攻击，造成" + mySkillAttack + "伤害，对方还剩余" + (enemyBlood - mySkillAttack) + "血量");



    }
}
