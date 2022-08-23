package inara.vodstreaming.domain.vod

import javax.persistence.*

@Entity
class VodCategory(
    var vodCategoryName: String,
    var vodCategoryUrl: String,
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vod_category_id")
    val id: Long? = null
}
