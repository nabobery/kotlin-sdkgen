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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/responses/forbidden_gist/content/application~1json/schema/properties/block.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/responses/forbidden_gist/content/application~1json/schema/properties/block
 */
@Serializable(with = InlineForbiddenGistResponseJsonBlockX5df303c2.Serializer::class)
public class InlineForbiddenGistResponseJsonBlockX5df303c2(
  public val createdAt: String? = null,
  public val htmlUrl: String? = null,
  public val reason: String? = null,
) {
  public class Builder {
    public var createdAt: String? = null

    public var htmlUrl: String? = null

    public var reason: String? = null

    public fun build(): InlineForbiddenGistResponseJsonBlockX5df303c2 = InlineForbiddenGistResponseJsonBlockX5df303c2(
      createdAt = createdAt,
      htmlUrl = htmlUrl,
      reason = reason,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineForbiddenGistResponseJsonBlockX5df303c2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineForbiddenGistResponseJsonBlockX5df303c2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineForbiddenGistResponseJsonBlockX5df303c2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineForbiddenGistResponseJsonBlockX5df303c2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineForbiddenGistResponseJsonBlockX5df303c2 must be a JSON object")
      return InlineForbiddenGistResponseJsonBlockX5df303c2(
        createdAt = rawObject["created_at"]?.let { json.decodeFromJsonElement<String>(it) },
        htmlUrl = rawObject["html_url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        reason = rawObject["reason"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineForbiddenGistResponseJsonBlockX5df303c2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineForbiddenGistResponseJsonBlockX5df303c2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.createdAt?.let { put("created_at", it) }
        value.htmlUrl?.let { put("html_url", it) }
        value.reason?.let { put("reason", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineForbiddenGistResponseJsonBlockX5df303c2(block: InlineForbiddenGistResponseJsonBlockX5df303c2.Builder.() -> Unit): InlineForbiddenGistResponseJsonBlockX5df303c2 = InlineForbiddenGistResponseJsonBlockX5df303c2.build(block)
