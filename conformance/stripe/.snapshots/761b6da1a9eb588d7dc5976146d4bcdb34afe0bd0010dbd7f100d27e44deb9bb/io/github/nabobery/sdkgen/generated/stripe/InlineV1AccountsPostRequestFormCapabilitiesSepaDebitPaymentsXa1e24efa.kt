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
 * /properties/capabilities/properties/sepa_debit_payments.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/capabilities/properties/sepa_debit_payments
 */
@Serializable(with = InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXa1e24efa.Serializer::class)
public class InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXa1e24efa(
  public val requested: Boolean? = null,
) {
  public class Builder {
    public var requested: Boolean? = null

    public fun build(): InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXa1e24efa = InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXa1e24efa(
      requested = requested,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXa1e24efa = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXa1e24efa> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXa1e24efa {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXa1e24efa")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXa1e24efa must be a JSON object")
      return InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXa1e24efa(
        requested = rawObject["requested"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXa1e24efa) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXa1e24efa")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.requested?.let { put("requested", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXa1e24efa(block: InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXa1e24efa.Builder.() -> Unit): InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXa1e24efa = InlineV1AccountsPostRequestFormCapabilitiesSepaDebitPaymentsXa1e24efa.build(block)
