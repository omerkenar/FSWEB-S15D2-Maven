package org.example;

import org.example.entity.*;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Task> annsTasks = new HashSet<>();
        Task taskAnn = new Task("akdas-1", "arge-1", "ann", Status.ASSIGNED, Priority.HIGH);
        Task taskAnn2 = new Task("akdas-2", "arge-2", "ann", Status.IN_PROGRESS, Priority.MED);
        annsTasks.add(taskAnn);
        annsTasks.add(taskAnn2);


        Set<Task> bobsTasks = new HashSet<>();

        Task taskBobs = new Task("akdas-3", "arge-3", "bob", Status.ASSIGNED, Priority.HIGH);
        Task taskBobs2 = new Task("akdas-4", "arge-4", "bob", Status.IN_PROGRESS, Priority.MED);
        bobsTasks.add(taskBobs);
        bobsTasks.add(taskBobs2);

        Set<Task> carolsTasks = new HashSet<>();
        Task taskCarol = new Task("akdas-5", "arge-5", "carol", Status.ASSIGNED, Priority.HIGH);
        Task taskCarol2 = new Task("akdas-6", "arge-6", "carol", Status.IN_PROGRESS, Priority.MED);
        carolsTasks.add(taskCarol);
        carolsTasks.add(taskCarol2);


        Set<Task> unassignedTasks = new HashSet<>();
        Task unassignedTask = new Task("akdas-7", "arge-7", null, Status.IN_PROGRESS, Priority.MED);
        unassignedTasks.add(unassignedTask);


        TaskData taskData = new TaskData(annsTasks, bobsTasks, carolsTasks, unassignedTasks);

        System.out.println("bobsTasks: " + taskData.getTasks("bob"));
        System.out.println("annsTasks: " + taskData.getTasks("ann"));
        System.out.println("alls: " + taskData.getTasks("all"));
        System.out.println("unassigned:" + taskData.getDifferences(unassignedTasks, taskData.getTasks("all")));


        StringSet.findUniqueWords();
    }
}