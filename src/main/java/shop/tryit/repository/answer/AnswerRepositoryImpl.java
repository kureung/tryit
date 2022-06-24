package shop.tryit.repository.answer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import shop.tryit.domain.answer.Answer;
import shop.tryit.domain.answer.AnswerRepository;

@Repository
@RequiredArgsConstructor
public class AnswerRepositoryImpl implements AnswerRepository {

    private final AnswerJpaRepository jpaRepository;

    @Override
    public Long save(Answer answer) {
        return jpaRepository.save(answer).getId();
    }

}