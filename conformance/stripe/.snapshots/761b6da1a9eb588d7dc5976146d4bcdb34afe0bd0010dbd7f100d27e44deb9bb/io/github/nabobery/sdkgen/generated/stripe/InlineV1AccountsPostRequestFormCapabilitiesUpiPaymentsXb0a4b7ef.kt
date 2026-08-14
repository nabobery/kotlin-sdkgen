package io.github.nabobery.sdkgen.generated.stripe

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
 * /properties/capabilities/properties/upi_payments.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/capabilities/properties/upi_payments
 */
@Serializable(with = InlineV1AccountsPostRequestFormCapabilitiesUpiPaymentsXb0a4b7ef.Serializer::class)
public class InlineV1AccountsPostRequestFormCapabilitiesUpiPaymentsXb0a4b7ef(
  public val requested: Boolean? = null,
) {
  public class Builder {
    public var requested: Boolean? = null

    public fun build(): InlineV1AccountsPostRequestFormCapabilitiesUpiPaymentsXb0a4b7ef = InlineV1AccountsPostRequestFormCapabilitiesUpiPaymentsXb0a4b7ef(
      requested = requested,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormCapabilitiesUpiPaymentsXb0a4b7ef = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormCapabilitiesUpiPaymentsXb0a4b7ef> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormCapabilitiesUpiPaymentsXb0a4b7ef {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormCapabilitiesUpiPaymentsXb0a4b7ef")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormCapabilitiesUpiPaymentsXb0a4b7ef must be a JSON object")
      return InlineV1AccountsPostRequestFormCapabilitiesUpiPaymentsXb0a4b7ef(
        requested = rawObject["requested"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormCapabilitiesUpiPaymentsXb0a4b7ef) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormCapabilitiesUpiPaymentsXb0a4b7ef")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.requested?.let { put("requested", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormCapabilitiesUpiPaymentsXb0a4b7ef(block: InlineV1AccountsPostRequestFormCapabilitiesUpiPaymentsXb0a4b7ef.Builder.() -> Unit): InlineV1AccountsPostRequestFormCapabilitiesUpiPaymentsXb0a4b7ef = InlineV1AccountsPostRequestFormCapabilitiesUpiPaymentsXb0a4b7ef.build(block)
