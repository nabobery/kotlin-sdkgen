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
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/capabilities/properties/sepa_debit_payments.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/capabilities/properties/sepa_debit_payments
 */
@Serializable(with = InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXaadf131b.Serializer::class)
public class InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXaadf131b(
  public val requested: Boolean? = null,
) {
  public class Builder {
    public var requested: Boolean? = null

    public fun build(): InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXaadf131b = InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXaadf131b(
      requested = requested,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXaadf131b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXaadf131b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXaadf131b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXaadf131b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXaadf131b must be a JSON object")
      return InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXaadf131b(
        requested = rawObject["requested"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXaadf131b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXaadf131b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.requested?.let { put("requested", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXaadf131b(block: InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXaadf131b.Builder.() -> Unit): InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXaadf131b = InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXaadf131b.build(block)
