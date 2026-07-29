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
 * /properties/capabilities/properties/cashapp_payments.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/capabilities/properties/cashapp_payments
 */
@Serializable(with = InlineV1AccountsPostRequestFormCapabilitiesCashappPaymentsXe9ac134b.Serializer::class)
public class InlineV1AccountsPostRequestFormCapabilitiesCashappPaymentsXe9ac134b(
  public val requested: Boolean? = null,
) {
  public class Builder {
    public var requested: Boolean? = null

    public fun build(): InlineV1AccountsPostRequestFormCapabilitiesCashappPaymentsXe9ac134b = InlineV1AccountsPostRequestFormCapabilitiesCashappPaymentsXe9ac134b(
      requested = requested,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormCapabilitiesCashappPaymentsXe9ac134b = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1AccountsPostRequestFormCapabilitiesCashappPaymentsXe9ac134b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormCapabilitiesCashappPaymentsXe9ac134b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormCapabilitiesCashappPaymentsXe9ac134b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormCapabilitiesCashappPaymentsXe9ac134b must be a JSON object")
      return InlineV1AccountsPostRequestFormCapabilitiesCashappPaymentsXe9ac134b(
        requested = rawObject["requested"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormCapabilitiesCashappPaymentsXe9ac134b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormCapabilitiesCashappPaymentsXe9ac134b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.requested?.let { put("requested", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormCapabilitiesCashappPaymentsXe9ac134b(block: InlineV1AccountsPostRequestFormCapabilitiesCashappPaymentsXe9ac134b.Builder.() -> Unit): InlineV1AccountsPostRequestFormCapabilitiesCashappPaymentsXe9ac134b = InlineV1AccountsPostRequestFormCapabilitiesCashappPaymentsXe9ac134b.build(block)
