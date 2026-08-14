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
 * /properties/capabilities/properties/bank_transfer_payments.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/capabilities/properties/bank_transfer_payments
 */
@Serializable(with = InlineV1AccountsPostRequestFormCapabilitiesBankTransferPaymentsX027f0dd0.Serializer::class)
public class InlineV1AccountsPostRequestFormCapabilitiesBankTransferPaymentsX027f0dd0(
  public val requested: Boolean? = null,
) {
  public class Builder {
    public var requested: Boolean? = null

    public fun build(): InlineV1AccountsPostRequestFormCapabilitiesBankTransferPaymentsX027f0dd0 = InlineV1AccountsPostRequestFormCapabilitiesBankTransferPaymentsX027f0dd0(
      requested = requested,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormCapabilitiesBankTransferPaymentsX027f0dd0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormCapabilitiesBankTransferPaymentsX027f0dd0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormCapabilitiesBankTransferPaymentsX027f0dd0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormCapabilitiesBankTransferPaymentsX027f0dd0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormCapabilitiesBankTransferPaymentsX027f0dd0 must be a JSON object")
      return InlineV1AccountsPostRequestFormCapabilitiesBankTransferPaymentsX027f0dd0(
        requested = rawObject["requested"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormCapabilitiesBankTransferPaymentsX027f0dd0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormCapabilitiesBankTransferPaymentsX027f0dd0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.requested?.let { put("requested", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormCapabilitiesBankTransferPaymentsX027f0dd0(block: InlineV1AccountsPostRequestFormCapabilitiesBankTransferPaymentsX027f0dd0.Builder.() -> Unit): InlineV1AccountsPostRequestFormCapabilitiesBankTransferPaymentsX027f0dd0 = InlineV1AccountsPostRequestFormCapabilitiesBankTransferPaymentsX027f0dd0.build(block)
