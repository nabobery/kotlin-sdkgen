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
 * sdkgen://source/openapi.yaml#/components/responses/service_unavailable/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/components/responses/service_unavailable/content/application~1json/schema
 */
@Serializable(with = InlineServiceUnavailableResponseJsonX4cf316d5.Serializer::class)
public class InlineServiceUnavailableResponseJsonX4cf316d5(
  public val code: String? = null,
  public val documentationUrl: String? = null,
  public val message: String? = null,
) {
  public class Builder {
    public var code: String? = null

    public var documentationUrl: String? = null

    public var message: String? = null

    public fun build(): InlineServiceUnavailableResponseJsonX4cf316d5 = InlineServiceUnavailableResponseJsonX4cf316d5(
      code = code,
      documentationUrl = documentationUrl,
      message = message,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineServiceUnavailableResponseJsonX4cf316d5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineServiceUnavailableResponseJsonX4cf316d5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineServiceUnavailableResponseJsonX4cf316d5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineServiceUnavailableResponseJsonX4cf316d5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineServiceUnavailableResponseJsonX4cf316d5 must be a JSON object")
      return InlineServiceUnavailableResponseJsonX4cf316d5(
        code = rawObject["code"]?.let { json.decodeFromJsonElement<String>(it) },
        documentationUrl = rawObject["documentation_url"]?.let { json.decodeFromJsonElement<String>(it) },
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineServiceUnavailableResponseJsonX4cf316d5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineServiceUnavailableResponseJsonX4cf316d5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.code?.let { put("code", it) }
        value.documentationUrl?.let { put("documentation_url", it) }
        value.message?.let { put("message", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineServiceUnavailableResponseJsonX4cf316d5(block: InlineServiceUnavailableResponseJsonX4cf316d5.Builder.() -> Unit): InlineServiceUnavailableResponseJsonX4cf316d5 = InlineServiceUnavailableResponseJsonX4cf316d5.build(block)
