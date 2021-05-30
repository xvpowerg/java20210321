/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c10_20210530.ch10_8_Stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
/**
 *
 * @author xvpow
 */
public class Student {
    private List<Integer> scores = new ArrayList();
    
    public void add(int score){
        scores.add(score);
    }
    
    public List<Integer> getScores(){
        return scores;
    }
    
    public Stream<Integer> getScoreStream(){
        return scores.stream();
    }
}
