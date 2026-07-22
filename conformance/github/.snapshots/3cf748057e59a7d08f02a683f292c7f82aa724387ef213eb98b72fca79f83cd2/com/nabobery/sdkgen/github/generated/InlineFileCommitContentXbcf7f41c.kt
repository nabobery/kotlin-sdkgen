package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/file-commit/properties/content.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/file-commit/properties/content
 */
@Serializable(with = InlineFileCommitContentXbcf7f41c.Serializer::class)
public class InlineFileCommitContentXbcf7f41c(
  public val links: InlineFileCommitContentLinksXbc27b88b? = null,
  public val downloadUrl: String? = null,
  public val gitUrl: String? = null,
  public val htmlUrl: String? = null,
  public val name: String? = null,
  public val path: String? = null,
  public val sha: String? = null,
  public val size: Int? = null,
  public val type: String? = null,
  public val url: String? = null,
) {
  public class Builder {
    public var links: InlineFileCommitContentLinksXbc27b88b? = null

    public var downloadUrl: String? = null

    public var gitUrl: String? = null

    public var htmlUrl: String? = null

    public var name: String? = null

    public var path: String? = null

    public var sha: String? = null

    public var size: Int? = null

    public var type: String? = null

    public var url: String? = null

    public fun build(): InlineFileCommitContentXbcf7f41c = InlineFileCommitContentXbcf7f41c(
      links = links,
      downloadUrl = downloadUrl,
      gitUrl = gitUrl,
      htmlUrl = htmlUrl,
      name = name,
      path = path,
      sha = sha,
      size = size,
      type = type,
      url = url,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineFileCommitContentXbcf7f41c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineFileCommitContentXbcf7f41c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFileCommitContentXbcf7f41c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFileCommitContentXbcf7f41c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineFileCommitContentXbcf7f41c must be a JSON object")
      return InlineFileCommitContentXbcf7f41c(
        links = rawObject["_links"]?.let { json.decodeFromJsonElement<InlineFileCommitContentLinksXbc27b88b>(it) },
        downloadUrl = rawObject["download_url"]?.let { json.decodeFromJsonElement<String>(it) },
        gitUrl = rawObject["git_url"]?.let { json.decodeFromJsonElement<String>(it) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        path = rawObject["path"]?.let { json.decodeFromJsonElement<String>(it) },
        sha = rawObject["sha"]?.let { json.decodeFromJsonElement<String>(it) },
        size = rawObject["size"]?.let { json.decodeFromJsonElement<Int>(it) },
        type = rawObject["type"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineFileCommitContentXbcf7f41c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineFileCommitContentXbcf7f41c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.links?.let { put("_links", json.encodeToJsonElement(it)) }
        value.downloadUrl?.let { put("download_url", it) }
        value.gitUrl?.let { put("git_url", it) }
        value.htmlUrl?.let { put("html_url", it) }
        value.name?.let { put("name", it) }
        value.path?.let { put("path", it) }
        value.sha?.let { put("sha", it) }
        value.size?.let { put("size", json.encodeToJsonElement(it)) }
        value.type?.let { put("type", it) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineFileCommitContentXbcf7f41c(block: InlineFileCommitContentXbcf7f41c.Builder.() -> Unit): InlineFileCommitContentXbcf7f41c = InlineFileCommitContentXbcf7f41c.build(block)
