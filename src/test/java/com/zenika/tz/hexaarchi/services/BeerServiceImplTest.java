package com.zenika.tz.hexaarchi.services;

import com.zenika.tz.hexaarchi.dao.BeerRepository;
import com.zenika.tz.hexaarchi.dto.CreateBeerDTO;
import com.zenika.tz.hexaarchi.dto.ResponseBeerDTO;

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
    private BeerRepository beerRepository;

    @Test
    public void shouldDetermineIPA() {
        when(ipaRule.determineIPA(10.0, 12)).thenReturn("IPA");
        when(beerRepository.save(any())).thenAnswer(i -> i.getArgument(0));
        CreateBeerDTO createBeerDTO = new CreateBeerDTO("myBeer", "myBrewery", 10.0, 12);
        ResponseBeerDTO res = beerService.create(createBeerDTO);
        Assertions.assertThat(res.type()).isEqualTo("IPA");
    }

}