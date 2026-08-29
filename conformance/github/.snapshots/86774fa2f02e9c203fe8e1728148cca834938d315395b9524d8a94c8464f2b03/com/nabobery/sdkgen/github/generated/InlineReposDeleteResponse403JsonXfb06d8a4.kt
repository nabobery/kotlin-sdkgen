package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}/delete/responses/403/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}/delete/responses/403/content/application~1json/schema
 */
@Serializable(with = InlineReposDeleteResponse403JsonXfb06d8a4.Serializer::class)
public class InlineReposDeleteResponse403JsonXfb06d8a4(
  public val documentationUrl: String? = null,
  public val message: String? = null,
) {
  public class Builder {
    public var documentationUrl: String? = null

    public var message: String? = null

    public fun build(): InlineReposDeleteResponse403JsonXfb06d8a4 = InlineReposDeleteResponse403JsonXfb06d8a4(
      documentationUrl = documentationUrl,
      message = message,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposDeleteResponse403JsonXfb06d8a4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposDeleteResponse403JsonXfb06d8a4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposDeleteResponse403JsonXfb06d8a4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposDeleteResponse403JsonXfb06d8a4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposDeleteResponse403JsonXfb06d8a4 must be a JSON object")
      return InlineReposDeleteResponse403JsonXfb06d8a4(
        documentationUrl = rawObject["documentation_url"]?.let { json.decodeFromJsonElement<String>(it) },
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposDeleteResponse403JsonXfb06d8a4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposDeleteResponse403JsonXfb06d8a4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.documentationUrl?.let { put("documentation_url", it) }
        value.message?.let { put("message", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposDeleteResponse403JsonXfb06d8a4(block: InlineReposDeleteResponse403JsonXfb06d8a4.Builder.() -> Unit): InlineReposDeleteResponse403JsonXfb06d8a4 = InlineReposDeleteResponse403JsonXfb06d8a4.build(block)
