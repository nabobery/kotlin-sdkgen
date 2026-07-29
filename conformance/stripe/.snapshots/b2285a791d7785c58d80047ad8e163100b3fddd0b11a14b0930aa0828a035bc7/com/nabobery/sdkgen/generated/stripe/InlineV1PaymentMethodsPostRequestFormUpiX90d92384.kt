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
 * If this is a `upi` PaymentMethod, this hash contains details about the UPI payment method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/upi
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormUpiX90d92384.Serializer::class)
public class InlineV1PaymentMethodsPostRequestFormUpiX90d92384(
  public val mandateOptions:
      InlineV1PaymentMethodsPostRequestFormUpiMandateOptionsXff16e6d0? = null,
) {
  public class Builder {
    public var mandateOptions: InlineV1PaymentMethodsPostRequestFormUpiMandateOptionsXff16e6d0? =
        null

    public fun build(): InlineV1PaymentMethodsPostRequestFormUpiX90d92384 = InlineV1PaymentMethodsPostRequestFormUpiX90d92384(
      mandateOptions = mandateOptions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormUpiX90d92384 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormUpiX90d92384> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormUpiX90d92384 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodsPostRequestFormUpiX90d92384")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodsPostRequestFormUpiX90d92384 must be a JSON object")
      return InlineV1PaymentMethodsPostRequestFormUpiX90d92384(
        mandateOptions = rawObject["mandate_options"]?.let { json.decodeFromJsonElement<InlineV1PaymentMethodsPostRequestFormUpiMandateOptionsXff16e6d0>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodsPostRequestFormUpiX90d92384) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodsPostRequestFormUpiX90d92384")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.mandateOptions?.let { put("mandate_options", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodsPostRequestFormUpiX90d92384(block: InlineV1PaymentMethodsPostRequestFormUpiX90d92384.Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormUpiX90d92384 = InlineV1PaymentMethodsPostRequestFormUpiX90d92384.build(block)
