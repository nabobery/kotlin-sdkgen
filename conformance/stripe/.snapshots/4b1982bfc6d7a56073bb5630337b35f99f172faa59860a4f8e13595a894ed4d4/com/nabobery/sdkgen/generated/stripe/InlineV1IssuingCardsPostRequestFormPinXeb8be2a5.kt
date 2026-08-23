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
 * The desired PIN for this card.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards/post/requestBody/content/application~1x-www-form-urlencoded/
 * schema/properties/pin
 */
@Serializable(with = InlineV1IssuingCardsPostRequestFormPinXeb8be2a5.Serializer::class)
public class InlineV1IssuingCardsPostRequestFormPinXeb8be2a5(
  public val encryptedNumber: String? = null,
) {
  public class Builder {
    public var encryptedNumber: String? = null

    public fun build(): InlineV1IssuingCardsPostRequestFormPinXeb8be2a5 = InlineV1IssuingCardsPostRequestFormPinXeb8be2a5(
      encryptedNumber = encryptedNumber,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingCardsPostRequestFormPinXeb8be2a5 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1IssuingCardsPostRequestFormPinXeb8be2a5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardsPostRequestFormPinXeb8be2a5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingCardsPostRequestFormPinXeb8be2a5")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingCardsPostRequestFormPinXeb8be2a5 must be a JSON object")
      return InlineV1IssuingCardsPostRequestFormPinXeb8be2a5(
        encryptedNumber = rawObject["encrypted_number"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardsPostRequestFormPinXeb8be2a5) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingCardsPostRequestFormPinXeb8be2a5")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.encryptedNumber?.let { put("encrypted_number", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IssuingCardsPostRequestFormPinXeb8be2a5(block: InlineV1IssuingCardsPostRequestFormPinXeb8be2a5.Builder.() -> Unit): InlineV1IssuingCardsPostRequestFormPinXeb8be2a5 = InlineV1IssuingCardsPostRequestFormPinXeb8be2a5.build(block)
