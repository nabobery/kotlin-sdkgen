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
 * oded/schema/properties/capabilities/properties/klarna_payments.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/capabilities/properties/klarna_payments
 */
@Serializable(with = InlineV1AccountsPostRequestFormCapabilitiesKlarnaPaymentsX32c51e6c.Serializer::class)
public class InlineV1AccountsPostRequestFormCapabilitiesKlarnaPaymentsX32c51e6c(
  public val requested: Boolean? = null,
) {
  public class Builder {
    public var requested: Boolean? = null

    public fun build(): InlineV1AccountsPostRequestFormCapabilitiesKlarnaPaymentsX32c51e6c = InlineV1AccountsPostRequestFormCapabilitiesKlarnaPaymentsX32c51e6c(
      requested = requested,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormCapabilitiesKlarnaPaymentsX32c51e6c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormCapabilitiesKlarnaPaymentsX32c51e6c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormCapabilitiesKlarnaPaymentsX32c51e6c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormCapabilitiesKlarnaPaymentsX32c51e6c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormCapabilitiesKlarnaPaymentsX32c51e6c must be a JSON object")
      return InlineV1AccountsPostRequestFormCapabilitiesKlarnaPaymentsX32c51e6c(
        requested = rawObject["requested"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormCapabilitiesKlarnaPaymentsX32c51e6c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormCapabilitiesKlarnaPaymentsX32c51e6c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.requested?.let { put("requested", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormCapabilitiesKlarnaPaymentsX32c51e6c(block: InlineV1AccountsPostRequestFormCapabilitiesKlarnaPaymentsX32c51e6c.Builder.() -> Unit): InlineV1AccountsPostRequestFormCapabilitiesKlarnaPaymentsX32c51e6c = InlineV1AccountsPostRequestFormCapabilitiesKlarnaPaymentsX32c51e6c.build(block)
