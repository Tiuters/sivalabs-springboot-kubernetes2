package com.example.bookmarkerapi;

import com.example.bookmarkerapi.domain.Bookmark;
import com.example.bookmarkerapi.domain.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final BookmarkRepository bookmarkRepository;

    @Override
    public void run(String... args) throws Exception {
        bookmarkRepository.save(new Bookmark(null, "1", "vfs", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "2", "vgewr", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "3", "yhtrv", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "4", "ad", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "5", "mhfd", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "6", "wer", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "7", "bnvxc", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "8", "ghter", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "9", "nhjty", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "10", "xzswq", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "11", ",kiu", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "12", "bheg", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "13", "ipguyjy", Instant.now()));
        bookmarkRepository.save(new Bookmark(null, "14", "ngsdfdaa", Instant.now()));
    }
}
