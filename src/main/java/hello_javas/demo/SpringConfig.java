package hello_javas.demo;

import hello_javas.demo.repository.MemberRepository;
import hello_javas.demo.repository.MemoryMemberRepository;
import hello_javas.demo.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
