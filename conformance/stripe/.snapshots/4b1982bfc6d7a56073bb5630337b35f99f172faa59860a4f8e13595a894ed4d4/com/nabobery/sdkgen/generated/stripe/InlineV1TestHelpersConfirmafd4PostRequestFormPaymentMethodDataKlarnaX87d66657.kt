package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/klarna.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1confirmation_tokens/post/requestBody/content/application~1x-w
 * ww-form-urlencoded/schema/properties/payment_method_data/properties/klarna
 */
@Serializable(with = InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataKlarnaX87d66657.Serializer::class)
public class InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataKlarnaX87d66657(
  public val dob:
      InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataKlarnaDobX024612d2? = null,
) {
  public class Builder {
    public var dob:
        InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataKlarnaDobX024612d2? = null

    public fun build(): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataKlarnaX87d66657 = InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataKlarnaX87d66657(
      dob = dob,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataKlarnaX87d66657 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataKlarnaX87d66657> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataKlarnaX87d66657 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataKlarnaX87d66657")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataKlarnaX87d66657 must be a JSON object")
      return InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataKlarnaX87d66657(
        dob = rawObject["dob"]?.let { json.decodeFromJsonElement<InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataKlarnaDobX024612d2>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataKlarnaX87d66657) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataKlarnaX87d66657")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.dob?.let { put("dob", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataKlarnaX87d66657(block: InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataKlarnaX87d66657.Builder.() -> Unit): InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataKlarnaX87d66657 = InlineV1TestHelpersConfirmafd4PostRequestFormPaymentMethodDataKlarnaX87d66657.build(block)
