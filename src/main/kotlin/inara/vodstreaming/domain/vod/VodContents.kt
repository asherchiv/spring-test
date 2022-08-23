package inara.vodstreaming.domain.vod

import inara.vodstreaming.util.failInit
import java.time.LocalTime
import javax.persistence.*

@Entity
class VodContents(
    var vodName: String,
    var vodExplain: String?,
    var vodThumbnailUrl: String,
    var vodUrl: String,
    var vodPlayTime: LocalTime,
    @ManyToOne(fetch = FetchType.LAZY)
    var vodCategory: VodCategory,
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vod_contents_id")
    val id: Long? = null
    init {
        if (inputException()) {
            failInit()
        }
    }
    private fun inputException() =
        vodName.isBlank().or(vodThumbnailUrl.isBlank()).or(vodUrl.isBlank())
}
