package demo2;


import sun.reflect.generics.tree.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;

public class BinaryTree<T> {
    /*
    先序创建二叉树
    * */
    public TreeNode_<T> createBinaryPre(LinkedList<T> treeData){
        TreeNode_<T> root = null;
        if(!treeData.isEmpty()){
            T data = treeData.removeFirst();
            root = new TreeNode_<T>(data, null, null);
            root.left = createBinaryPre(treeData);
            root.right = createBinaryPre(treeData);
        }
        return root;
    }
//    public TreeNode_<T> createBinaryLevel(LinkedList<T> treeData){
//        TreeNode_<T> root = null;
//        if(!treeData.isEmpty()){
//            T data = treeData.removeFirst();
//            root = new TreeNode_<T>(data, null, null);
//            root.left = createBinaryPre(treeData);
//            root.right = createBinaryPre(treeData);
//        }
//        return root;
//    }

    // 先序遍历 递归
    public void preOrderRecur(TreeNode_<T> root){
        if(root != null){
            System.out.print(root.data);
            preOrderRecur(root.left);
            preOrderRecur(root.right);
        }
    }

    // 中序遍历 递归
    public void inOrderRecur(TreeNode_<T> root){
        if(root != null){
            inOrderRecur(root.left);
            System.out.print(root.data);
            inOrderRecur(root.right);
        }
    }

    // 后序遍历 递归
    public void postOrderRecur(TreeNode_<T> root){
        if(root != null){
            postOrderRecur(root.left);
            postOrderRecur(root.right);
            System.out.print(root.data);
        }
    }

    // 先序遍历 非递归实现 对任意节点T 访问这个节点并压入栈中 然后访问节点的左子树 遍历完左子树后 去除栈顶的节点T 在先序遍历T的右子树
    public void preOrder(TreeNode_<T> root){
        Stack<TreeNode_<T>> stack = new Stack<>();
        while(true){
            while(root != null){
                System.out.print(root.data);
                stack.push(root);
                root = root.left;
            }
            if(stack.isEmpty()){
                break;
            }
            root = stack.pop();
            root = root.right;

        }
    }

    // 中序遍历非递归实现
    public void inOrder(TreeNode_<T> root){
        Stack<TreeNode_<T>> stack = new Stack<>();
        while(true){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            if(stack.isEmpty())
                break;
            root = stack.pop();
            System.out.print(root.data);
            root = root.right;
        }
    }

    public void postOrder(TreeNode_<T> root){
        Stack<TreeNode_<T>> stack = new Stack<>();
        Stack<Boolean> stack_2 = new Stack<>();
        while(true){
            // 将当前节点指向最左节点的左孩子 栈顶元素为最左节点
            while(root != null){
                stack.push(root);
                stack_2.push(false);
                root = root.left;
            }
            // 从左子树过来  现在要 遍历右子树或者打印根节点
            while(!stack.isEmpty() && stack_2.peek()){
                root = stack.pop();
                stack_2.pop();
                System.out.print(root.data);
            }
            // 否则没有访问右子树 先访问右子树
            if(!stack.isEmpty()){
                stack_2.pop();
                stack_2.push(true);
                root = stack.peek();
                root = root.right;
            }
            else  // stack为空 说明已经遍历完成了
                break;

        }
    }

    public void main(String args[]) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(reader.readLine());
    }
}

class TreeNode_<T>
{
    public T data;
    public TreeNode_<T> left;
    public TreeNode_<T> right;
    public TreeNode_(T data, TreeNode_<T> left, TreeNode_<T> right)
    {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}