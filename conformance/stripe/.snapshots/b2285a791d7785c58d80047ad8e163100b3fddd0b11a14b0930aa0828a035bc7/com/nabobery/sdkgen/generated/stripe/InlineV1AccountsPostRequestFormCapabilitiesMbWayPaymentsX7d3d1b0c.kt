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
 * /properties/capabilities/properties/mb_way_payments.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/capabilities/properties/mb_way_payments
 */
@Serializable(with = InlineV1AccountsPostRequestFormCapabilitiesMbWayPaymentsX7d3d1b0c.Serializer::class)
public class InlineV1AccountsPostRequestFormCapabilitiesMbWayPaymentsX7d3d1b0c(
  public val requested: Boolean? = null,
) {
  public class Builder {
    public var requested: Boolean? = null

    public fun build(): InlineV1AccountsPostRequestFormCapabilitiesMbWayPaymentsX7d3d1b0c = InlineV1AccountsPostRequestFormCapabilitiesMbWayPaymentsX7d3d1b0c(
      requested = requested,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormCapabilitiesMbWayPaymentsX7d3d1b0c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1AccountsPostRequestFormCapabilitiesMbWayPaymentsX7d3d1b0c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormCapabilitiesMbWayPaymentsX7d3d1b0c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormCapabilitiesMbWayPaymentsX7d3d1b0c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormCapabilitiesMbWayPaymentsX7d3d1b0c must be a JSON object")
      return InlineV1AccountsPostRequestFormCapabilitiesMbWayPaymentsX7d3d1b0c(
        requested = rawObject["requested"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormCapabilitiesMbWayPaymentsX7d3d1b0c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormCapabilitiesMbWayPaymentsX7d3d1b0c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.requested?.let { put("requested", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormCapabilitiesMbWayPaymentsX7d3d1b0c(block: InlineV1AccountsPostRequestFormCapabilitiesMbWayPaymentsX7d3d1b0c.Builder.() -> Unit): InlineV1AccountsPostRequestFormCapabilitiesMbWayPaymentsX7d3d1b0c = InlineV1AccountsPostRequestFormCapabilitiesMbWayPaymentsX7d3d1b0c.build(block)
