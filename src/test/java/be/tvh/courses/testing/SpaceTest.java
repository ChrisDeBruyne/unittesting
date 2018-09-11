package be.tvh.courses.testing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.BDDMockito.then;
import static org.mockito.BDDMockito.willThrow;

/**
 * https://github.com/szpak/code-examples-and-poc/tree/master/mockito2-junit5
 */
@ExtendWith(MockitoExtension.class)
class SpaceTest {

    @Mock
    private TacticalStation tacticalStation;

    @Mock
    private OperationsStation operationsStation;

    @InjectMocks
    private SpaceShip spaceShip;

    @Test
    void shouldInjectMocks() {
        assertThat(spaceShip).isNotNull();
        assertThat(tacticalStation).isNotNull();
        assertThat(operationsStation).isNotNull();
        assertThat(spaceShip.getTacticalStation()).isSameAs(tacticalStation);
        assertThat(spaceShip.getOperationsStation()).isSameAs(operationsStation);
    }

    @Test
    void shouldVerifySomeBehavior() {
        //when
        spaceShip.doSelfCheck();
        //then
        then(tacticalStation).should().doSelfCheck();
        then(operationsStation).should().doSelfCheck();
    }

    @Test
    void shouldMockSomething() {
        //given
        willThrow(SelfCheckException.class).given(tacticalStation).doSelfCheck();
        //when
        Executable e = () -> spaceShip.doSelfCheck();
        //then
        assertThrows(SelfCheckException.class, e);
    }
}