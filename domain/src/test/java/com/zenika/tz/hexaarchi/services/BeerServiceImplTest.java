package com.zenika.tz.hexaarchi.services;

import com.zenika.tz.hexaarchi.domain.Beer;
import com.zenika.tz.hexaarchi.domain.CreateBeer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith (MockitoExtension.class)
class BeerServiceImplTest {

    @InjectMocks
    private BeerServiceImpl beerService;

    @Mock
    private IPARule ipaRule;

    @Mock
    private BeerRepositoryPort beerRepository;

    @Test
    void shouldDetermineIPA() {
        when(beerRepository.save(any())).thenAnswer(i -> i.getArgument(0));
        CreateBeer createBeerDTO = new CreateBeer("myBeer", "myBrewery", 10.0, 12);
        Beer res = beerService.create(createBeerDTO);
        Assertions.assertThat(res.type()).isNotBlank();
    }

}