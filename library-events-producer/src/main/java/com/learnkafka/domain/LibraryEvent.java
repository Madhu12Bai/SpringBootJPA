package com.learnkafka.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class LibraryEvent {
	private int libraryEventId;
	private LibraryEventType LibraryEventType;
	private Book book;
	

}
