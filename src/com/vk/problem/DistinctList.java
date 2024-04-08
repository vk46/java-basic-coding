package com.vk.problem;

import com.vk.model.Notes;

import java.util.*;
import java.util.stream.Collectors;

public class DistinctList {
    public static void main(String[] args) {
        List<Notes> noteLst = new ArrayList<>();
        noteLst.add(new Notes( "note1", 11));
        noteLst.add(new Notes( "note2", 22));
        noteLst.add(new Notes( "note3", 33));
        noteLst.add(new Notes( "note4", 44));
        noteLst.add(new Notes( "note5", 55));
        noteLst.add(new Notes( "note4", 66));

        Map<String, Integer> result = noteLst.stream()
                .collect(Collectors.toMap(
                        Notes::getTagName,
                        Notes::getTagId,
                        (oldValue, newValue) -> newValue,
                        HashMap::new
                )).entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));

        System.out.println(result);

        Optional.of(noteLst).ifPresent(list -> list.forEach((notes -> System.out.println(notes.getTagName()))));
    }
}
