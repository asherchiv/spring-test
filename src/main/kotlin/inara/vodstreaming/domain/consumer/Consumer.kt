package inara.vodstreaming.domain.consumer

import inara.vodstreaming.util.failInit
import javax.persistence.*

@Entity
class Consumer(
    var consumerName: String,
    var consumerAge: Int? = null,
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "consumer_id")
    val id: Long? = null
    init {
        if (consumerName.isBlank()) {
            failInit()
        }
    }
}
