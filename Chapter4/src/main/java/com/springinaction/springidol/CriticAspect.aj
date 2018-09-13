package com.springinaction.springidol;

public aspect CriticAspect {
    private CriticismEngine criticismEngine;

    public CriticAspect() {}

    pointcut performance() : execution(* perform(..));

    after() : performance() {
        System.out.println(criticismEngine.getCriticism());
    }

    public void setCriticismEngine(CriticismEngine criticismEngine) {
        this.criticismEngine = criticismEngine;
    }
}
