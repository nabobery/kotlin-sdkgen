package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class PaymentMethodDetailsCardNetworkTokenView(
  public val used: Boolean,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_card_network_token
 */
@Serializable(with = PaymentMethodDetailsCardNetworkToken.Serializer::class)
public class PaymentMethodDetailsCardNetworkToken(
  /**
   * Indicates if Stripe used a network token, either user provided or Stripe managed when processing the transaction.
   */
  public val used: Boolean,
) {
  public class Builder {
    private var usedValue: Boolean? = null

    public var used: Boolean
      get() = requireNotNull(usedValue) { "used is required" }
      set(`value`) {
        usedValue = value
      }

    public fun build(): PaymentMethodDetailsCardNetworkToken {
      check(usedValue != null) { "used is required" }
      return PaymentMethodDetailsCardNetworkToken(
        used = used,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodDetailsCardNetworkToken = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodDetailsCardNetworkToken> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodDetailsCardNetworkToken {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodDetailsCardNetworkToken")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodDetailsCardNetworkToken must be a JSON object")
      val used = json.decodeRequired<Boolean>(rawObject, "used")
      return PaymentMethodDetailsCardNetworkToken(
        used = used,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodDetailsCardNetworkToken) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodDetailsCardNetworkToken")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("used", json.encodeToJsonElement(value.used))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodDetailsCardNetworkToken(block: PaymentMethodDetailsCardNetworkToken.Builder.() -> Unit): PaymentMethodDetailsCardNetworkToken = PaymentMethodDetailsCardNetworkToken.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentMethodDetailsCardNetworkToken is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
