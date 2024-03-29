package com.company;
class tree{
    int item;
    tree left;
    tree right;
}
public class BinarySeatchTree {
    tree root;
    BinarySeatchTree()
    {
        root=null;
    }
    void insert(int d)
    {
        tree n=new tree();
        n.item=d;
        n.left=null;
        n.right=null;
        if(root==null)
        {
            root=n;
        }
        else
        {
            tree t=root;
            while(true) {
                if (d > t.item) {
                    if (t.right == null) {
                        t.right = n;
                        break;
                    } else
                        t = t.right;
                } else if (d < t.item) {
                    if (t.left == null) {
                        t.left = n;
                        break;
                    } else
                        t = t.left;
                } else {
                    System.out.println("duplicate not allowed");
                    break;
                }
            }
        }

    }
    void deleteone(tree ptf,tree tf)
    {
        if(ptf.left==tf)
        {
            if(tf.left==null)
                ptf.left=tf.right;
            else
                ptf.left=tf.left;
        }
        else
        {
            if(tf.left==null)
                ptf.right=tf.right;
            else
                ptf.right=tf.left;
        }
    }
    void delete(int d)
    {
        tree t=root,pt=null;
        while(true)
        {
           if(t.item==d)
           {
               if(t.left==null && t.right==null) {
                   if (pt == null) {
                       root = null;
                       break;
                   }
                   else
                   {
                       if(t==pt.left)
                       {
                          pt.left=null;
                          break;
                       }
                       else
                       {
                           pt.right=null;
                           break;
                       }
                   }
               }
               else if(t.left ==null || t.right==null)
               {
                   if(pt==null)
                   {
                       if(t.right==null)
                           root=t.left;
                       else
                           root=t.right;
                   }
                   else {
                     deleteone(pt,t);
                   }
                   break;
               }
               else
               {
                   tree tf=t.left,ptf=t;
                   while(tf.right!=null)
                   {
                       ptf=tf;
                       tf=tf.right;
                   }
                   if(tf.right==null && tf.left==null)
                   {
                       if(ptf.left==tf)
                           ptf.left=null;
                       else
                           ptf.right=null;
                       t.item=tf.item;
                       break;
                   }
                   else {
                       t.item=tf.item;
                       deleteone(ptf,tf);
                       break;
                   }


               }
           }
           else if(d>t.item)
           {
               pt=t;
               t=t.right;
               if(t==null)
               {
                   System.out.println("not found");
                   break;
               }
           }
           else
           {
               pt=t;
               t=t.left;
               if(t==null)
               {
                   System.out.println("not found");
                   break;
               }
           }
        }
    }
    void inorder(tree r) {
        if (r != null) {
            inorder(r.left);
            System.out.println(r.item);
            inorder(r.right);
        }
    }
    void viewList()
    {
        inorder(root);
    }

}
