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
 * The desired new PIN for this card.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cards~1{card}/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/pin
 */
@Serializable(with = InlineV1IssuingCardsPostRequestFormPinX79b8e620.Serializer::class)
public class InlineV1IssuingCardsPostRequestFormPinX79b8e620(
  public val encryptedNumber: String? = null,
) {
  public class Builder {
    public var encryptedNumber: String? = null

    public fun build(): InlineV1IssuingCardsPostRequestFormPinX79b8e620 = InlineV1IssuingCardsPostRequestFormPinX79b8e620(
      encryptedNumber = encryptedNumber,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingCardsPostRequestFormPinX79b8e620 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1IssuingCardsPostRequestFormPinX79b8e620> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardsPostRequestFormPinX79b8e620 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingCardsPostRequestFormPinX79b8e620")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingCardsPostRequestFormPinX79b8e620 must be a JSON object")
      return InlineV1IssuingCardsPostRequestFormPinX79b8e620(
        encryptedNumber = rawObject["encrypted_number"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardsPostRequestFormPinX79b8e620) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingCardsPostRequestFormPinX79b8e620")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.encryptedNumber?.let { put("encrypted_number", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IssuingCardsPostRequestFormPinX79b8e620(block: InlineV1IssuingCardsPostRequestFormPinX79b8e620.Builder.() -> Unit): InlineV1IssuingCardsPostRequestFormPinX79b8e620 = InlineV1IssuingCardsPostRequestFormPinX79b8e620.build(block)
