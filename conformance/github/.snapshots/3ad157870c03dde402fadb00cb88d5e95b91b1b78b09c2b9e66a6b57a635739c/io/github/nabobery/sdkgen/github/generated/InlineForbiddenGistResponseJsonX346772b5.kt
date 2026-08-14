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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/responses/forbidden_gist/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/components/responses/forbidden_gist/content/application~1json/schema
 */
@Serializable(with = InlineForbiddenGistResponseJsonX346772b5.Serializer::class)
public class InlineForbiddenGistResponseJsonX346772b5(
  public val block: InlineForbiddenGistResponseJsonBlockX5df303c2? = null,
  public val documentationUrl: String? = null,
  public val message: String? = null,
) {
  public class Builder {
    public var block: InlineForbiddenGistResponseJsonBlockX5df303c2? = null

    public var documentationUrl: String? = null

    public var message: String? = null

    public fun build(): InlineForbiddenGistResponseJsonX346772b5 = InlineForbiddenGistResponseJsonX346772b5(
      block = block,
      documentationUrl = documentationUrl,
      message = message,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineForbiddenGistResponseJsonX346772b5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineForbiddenGistResponseJsonX346772b5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineForbiddenGistResponseJsonX346772b5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineForbiddenGistResponseJsonX346772b5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineForbiddenGistResponseJsonX346772b5 must be a JSON object")
      return InlineForbiddenGistResponseJsonX346772b5(
        block = rawObject["block"]?.let { json.decodeFromJsonElement<InlineForbiddenGistResponseJsonBlockX5df303c2>(it) },
        documentationUrl = rawObject["documentation_url"]?.let { json.decodeFromJsonElement<String>(it) },
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineForbiddenGistResponseJsonX346772b5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineForbiddenGistResponseJsonX346772b5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.block?.let { put("block", json.encodeToJsonElement(it)) }
        value.documentationUrl?.let { put("documentation_url", it) }
        value.message?.let { put("message", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineForbiddenGistResponseJsonX346772b5(block: InlineForbiddenGistResponseJsonX346772b5.Builder.() -> Unit): InlineForbiddenGistResponseJsonX346772b5 = InlineForbiddenGistResponseJsonX346772b5.build(block)
