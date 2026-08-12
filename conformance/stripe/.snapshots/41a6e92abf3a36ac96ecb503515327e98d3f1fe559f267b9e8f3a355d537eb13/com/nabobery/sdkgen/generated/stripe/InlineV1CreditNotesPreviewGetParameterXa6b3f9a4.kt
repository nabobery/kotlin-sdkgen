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
 * Generated model for sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview/get/parameters/13/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1credit_notes~1preview/get/parameters/13/schema
 */
@Serializable(with = InlineV1CreditNotesPreviewGetParameterXa6b3f9a4.Serializer::class)
public class InlineV1CreditNotesPreviewGetParameterXa6b3f9a4(
  public val shippingRate: String? = null,
) {
  public class Builder {
    public var shippingRate: String? = null

    public fun build(): InlineV1CreditNotesPreviewGetParameterXa6b3f9a4 = InlineV1CreditNotesPreviewGetParameterXa6b3f9a4(
      shippingRate = shippingRate,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CreditNotesPreviewGetParameterXa6b3f9a4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CreditNotesPreviewGetParameterXa6b3f9a4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CreditNotesPreviewGetParameterXa6b3f9a4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CreditNotesPreviewGetParameterXa6b3f9a4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CreditNotesPreviewGetParameterXa6b3f9a4 must be a JSON object")
      return InlineV1CreditNotesPreviewGetParameterXa6b3f9a4(
        shippingRate = rawObject["shipping_rate"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CreditNotesPreviewGetParameterXa6b3f9a4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CreditNotesPreviewGetParameterXa6b3f9a4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.shippingRate?.let { put("shipping_rate", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CreditNotesPreviewGetParameterXa6b3f9a4(block: InlineV1CreditNotesPreviewGetParameterXa6b3f9a4.Builder.() -> Unit): InlineV1CreditNotesPreviewGetParameterXa6b3f9a4 = InlineV1CreditNotesPreviewGetParameterXa6b3f9a4.build(block)
