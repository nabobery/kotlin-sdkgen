package io.github.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/commit-search-result-item/properties/parents/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/commit-search-result-item/properties/parents/items
 */
@Serializable(with = InlineCommitSearchResultItemParentsItemX3af33651.Serializer::class)
public class InlineCommitSearchResultItemParentsItemX3af33651(
  public val htmlUrl: String? = null,
  public val sha: String? = null,
  public val url: String? = null,
) {
  public class Builder {
    public var htmlUrl: String? = null

    public var sha: String? = null

    public var url: String? = null

    public fun build(): InlineCommitSearchResultItemParentsItemX3af33651 = InlineCommitSearchResultItemParentsItemX3af33651(
      htmlUrl = htmlUrl,
      sha = sha,
      url = url,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCommitSearchResultItemParentsItemX3af33651 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineCommitSearchResultItemParentsItemX3af33651> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCommitSearchResultItemParentsItemX3af33651 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCommitSearchResultItemParentsItemX3af33651")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCommitSearchResultItemParentsItemX3af33651 must be a JSON object")
      return InlineCommitSearchResultItemParentsItemX3af33651(
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        sha = rawObject["sha"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCommitSearchResultItemParentsItemX3af33651) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCommitSearchResultItemParentsItemX3af33651")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.htmlUrl?.let { put("html_url", it) }
        value.sha?.let { put("sha", it) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCommitSearchResultItemParentsItemX3af33651(block: InlineCommitSearchResultItemParentsItemX3af33651.Builder.() -> Unit): InlineCommitSearchResultItemParentsItemX3af33651 = InlineCommitSearchResultItemParentsItemX3af33651.build(block)
