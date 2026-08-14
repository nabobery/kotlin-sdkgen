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
 * sdkgen://source/openapi.yaml#/components/schemas/file-commit/properties/commit/properties/parents/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/file-commit/properties/commit/properties/parents/items
 */
@Serializable(with = InlineFileCommitCommitParentsItemX52e88524.Serializer::class)
public class InlineFileCommitCommitParentsItemX52e88524(
  public val htmlUrl: String? = null,
  public val sha: String? = null,
  public val url: String? = null,
) {
  public class Builder {
    public var htmlUrl: String? = null

    public var sha: String? = null

    public var url: String? = null

    public fun build(): InlineFileCommitCommitParentsItemX52e88524 = InlineFileCommitCommitParentsItemX52e88524(
      htmlUrl = htmlUrl,
      sha = sha,
      url = url,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineFileCommitCommitParentsItemX52e88524 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineFileCommitCommitParentsItemX52e88524> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineFileCommitCommitParentsItemX52e88524 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineFileCommitCommitParentsItemX52e88524")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineFileCommitCommitParentsItemX52e88524 must be a JSON object")
      return InlineFileCommitCommitParentsItemX52e88524(
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        sha = rawObject["sha"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineFileCommitCommitParentsItemX52e88524) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineFileCommitCommitParentsItemX52e88524")
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

public fun inlineFileCommitCommitParentsItemX52e88524(block: InlineFileCommitCommitParentsItemX52e88524.Builder.() -> Unit): InlineFileCommitCommitParentsItemX52e88524 = InlineFileCommitCommitParentsItemX52e88524.build(block)
