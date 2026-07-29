package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/capabilities/properties/grabpay_payments.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/capabilities/properties/grabpay_payments
 */
@Serializable(with = InlineV1AccountsPostRequestFormCapabilitiesGrabpayPaymentsXe4c2757a.Serializer::class)
public class InlineV1AccountsPostRequestFormCapabilitiesGrabpayPaymentsXe4c2757a(
  public val requested: Boolean? = null,
) {
  public class Builder {
    public var requested: Boolean? = null

    public fun build(): InlineV1AccountsPostRequestFormCapabilitiesGrabpayPaymentsXe4c2757a = InlineV1AccountsPostRequestFormCapabilitiesGrabpayPaymentsXe4c2757a(
      requested = requested,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormCapabilitiesGrabpayPaymentsXe4c2757a = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1AccountsPostRequestFormCapabilitiesGrabpayPaymentsXe4c2757a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormCapabilitiesGrabpayPaymentsXe4c2757a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormCapabilitiesGrabpayPaymentsXe4c2757a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormCapabilitiesGrabpayPaymentsXe4c2757a must be a JSON object")
      return InlineV1AccountsPostRequestFormCapabilitiesGrabpayPaymentsXe4c2757a(
        requested = rawObject["requested"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormCapabilitiesGrabpayPaymentsXe4c2757a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormCapabilitiesGrabpayPaymentsXe4c2757a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.requested?.let { put("requested", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormCapabilitiesGrabpayPaymentsXe4c2757a(block: InlineV1AccountsPostRequestFormCapabilitiesGrabpayPaymentsXe4c2757a.Builder.() -> Unit): InlineV1AccountsPostRequestFormCapabilitiesGrabpayPaymentsXe4c2757a = InlineV1AccountsPostRequestFormCapabilitiesGrabpayPaymentsXe4c2757a.build(block)
