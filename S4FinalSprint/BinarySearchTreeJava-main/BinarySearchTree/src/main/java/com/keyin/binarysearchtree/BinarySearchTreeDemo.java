package com.keyin.binarysearchtree;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BinarySearchTreeDemo {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        tree.inorder();

        System.out.println();

        ObjectMapper mapper = new ObjectMapper();

        try {
            String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(tree);
            System.out.println();
            System.out.println(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        System.out.println();

        tree.delete();
        tree.inorder();
    }
}