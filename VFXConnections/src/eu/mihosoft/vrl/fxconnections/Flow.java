/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.mihosoft.vrl.fxconnections;

/**
 *
 * @author Michael Hoffer <info@michaelhoffer.de>
 */
public interface Flow<T extends FlowNode> {

    public Connection connect(T s, T r);

    public T remove(T n);
    
    public Iterable<T> getNodes();
}