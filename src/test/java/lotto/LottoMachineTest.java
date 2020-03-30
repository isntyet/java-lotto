package lotto;

import lotto.domain.LottoMachine;
import lotto.domain.Money;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class LottoMachineTest {

    @Test
    @DisplayName("로또기계 생성 테스트")
    void createLottoMachineTest() {
        assertThat(
                new LottoMachine().purchaseLottos(new Money(1000))
        );
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 5, 6, 9})
    @DisplayName("로또기계로 돈만큼 로또 생성 테스트")
    void generateLottosTest(int input) {
        assertThat(
                new LottoMachine().purchaseLottos(new Money(input * 1000)).size()
        ).isEqualTo(input);
    }
}
