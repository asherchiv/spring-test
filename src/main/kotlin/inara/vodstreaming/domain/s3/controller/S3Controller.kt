package inara.vodstreaming.domain.s3.controller

import inara.vodstreaming.domain.s3.service.FileUploadService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile

@RestController
class S3Controller(
    val fileUploadService: FileUploadService,
) {
    @PostMapping("/vodContents")
    fun inputVod(@RequestParam("vod") multipartFile: MultipartFile): String {
        return fileUploadService.upload(multipartFile)
    }
}
