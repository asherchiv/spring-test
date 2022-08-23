package inara.vodstreaming.domain.vod

import inara.vodstreaming.domain.consumer.Consumer
import java.time.LocalTime
import javax.persistence.*

@Entity
class WatchRecord(
    var recordTime: LocalTime,
    @ManyToOne(fetch = FetchType.LAZY)
    val vodContents: VodContents,
    @ManyToOne(fetch = FetchType.LAZY)
    val consumer: Consumer,
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "watch_record_id")
    val id: Long? = null
}
