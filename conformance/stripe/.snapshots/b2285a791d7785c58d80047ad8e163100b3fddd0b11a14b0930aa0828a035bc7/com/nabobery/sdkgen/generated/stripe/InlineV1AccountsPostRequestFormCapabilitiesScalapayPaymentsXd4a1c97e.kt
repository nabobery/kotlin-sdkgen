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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/capabilities/properties/scalapay_payments.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/capabilities/properties/scalapay_payments
 */
@Serializable(with = InlineV1AccountsPostRequestFormCapabilitiesScalapayPaymentsXd4a1c97e.Serializer::class)
public class InlineV1AccountsPostRequestFormCapabilitiesScalapayPaymentsXd4a1c97e(
  public val requested: Boolean? = null,
) {
  public class Builder {
    public var requested: Boolean? = null

    public fun build(): InlineV1AccountsPostRequestFormCapabilitiesScalapayPaymentsXd4a1c97e = InlineV1AccountsPostRequestFormCapabilitiesScalapayPaymentsXd4a1c97e(
      requested = requested,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormCapabilitiesScalapayPaymentsXd4a1c97e = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1AccountsPostRequestFormCapabilitiesScalapayPaymentsXd4a1c97e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormCapabilitiesScalapayPaymentsXd4a1c97e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormCapabilitiesScalapayPaymentsXd4a1c97e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormCapabilitiesScalapayPaymentsXd4a1c97e must be a JSON object")
      return InlineV1AccountsPostRequestFormCapabilitiesScalapayPaymentsXd4a1c97e(
        requested = rawObject["requested"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormCapabilitiesScalapayPaymentsXd4a1c97e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormCapabilitiesScalapayPaymentsXd4a1c97e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.requested?.let { put("requested", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormCapabilitiesScalapayPaymentsXd4a1c97e(block: InlineV1AccountsPostRequestFormCapabilitiesScalapayPaymentsXd4a1c97e.Builder.() -> Unit): InlineV1AccountsPostRequestFormCapabilitiesScalapayPaymentsXd4a1c97e = InlineV1AccountsPostRequestFormCapabilitiesScalapayPaymentsXd4a1c97e.build(block)
