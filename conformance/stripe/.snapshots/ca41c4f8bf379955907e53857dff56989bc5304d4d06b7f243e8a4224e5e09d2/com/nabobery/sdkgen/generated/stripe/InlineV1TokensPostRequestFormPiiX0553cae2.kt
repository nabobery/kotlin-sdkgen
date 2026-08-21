package com.nabobery.sdkgen.generated.stripe

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
 * The PII this token represents.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tokens/post/requestBody/content/application~1x-www-form-urlencoded/schema/p
 * roperties/pii
 */
@Serializable(with = InlineV1TokensPostRequestFormPiiX0553cae2.Serializer::class)
public class InlineV1TokensPostRequestFormPiiX0553cae2(
  public val idNumber: String? = null,
) {
  public class Builder {
    public var idNumber: String? = null

    public fun build(): InlineV1TokensPostRequestFormPiiX0553cae2 = InlineV1TokensPostRequestFormPiiX0553cae2(
      idNumber = idNumber,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TokensPostRequestFormPiiX0553cae2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TokensPostRequestFormPiiX0553cae2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TokensPostRequestFormPiiX0553cae2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TokensPostRequestFormPiiX0553cae2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TokensPostRequestFormPiiX0553cae2 must be a JSON object")
      return InlineV1TokensPostRequestFormPiiX0553cae2(
        idNumber = rawObject["id_number"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TokensPostRequestFormPiiX0553cae2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TokensPostRequestFormPiiX0553cae2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.idNumber?.let { put("id_number", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TokensPostRequestFormPiiX0553cae2(block: InlineV1TokensPostRequestFormPiiX0553cae2.Builder.() -> Unit): InlineV1TokensPostRequestFormPiiX0553cae2 = InlineV1TokensPostRequestFormPiiX0553cae2.build(block)
