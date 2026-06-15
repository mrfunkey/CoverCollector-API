package com.example.covercollector;

public record AlbumCover(
        String artistName,
        String albumName,
        String releaseDate,
        String lowResCover,
        String highResCover
) {}
