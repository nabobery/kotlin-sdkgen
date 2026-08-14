package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
public data class CardGeneratedFromPaymentMethodDetailsView(
  @SerialName("card_present")
  public val cardPresent: PaymentMethodDetailsCardPresent? = null,
  public val type: String,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/card_generated_from_payment_method_details
 */
@Serializable(with = CardGeneratedFromPaymentMethodDetails.Serializer::class)
public class CardGeneratedFromPaymentMethodDetails(
  /**
   * The type of payment method transaction-specific details from the transaction that generated this `card` payment
   * method. Always `card_present`.
   */
  public val type: String,
  public val cardPresent: PaymentMethodDetailsCardPresent? = null,
) {
  public class Builder {
    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var cardPresent: PaymentMethodDetailsCardPresent? = null

    public fun build(): CardGeneratedFromPaymentMethodDetails {
      check(typeValue != null) { "type is required" }
      return CardGeneratedFromPaymentMethodDetails(
        type = type,
        cardPresent = cardPresent,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CardGeneratedFromPaymentMethodDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CardGeneratedFromPaymentMethodDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CardGeneratedFromPaymentMethodDetails {
      val jsonDecoder = decoder.requireJsonDecoder("CardGeneratedFromPaymentMethodDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CardGeneratedFromPaymentMethodDetails must be a JSON object")
      val type = json.decodeRequired<String>(rawObject, "type")
      return CardGeneratedFromPaymentMethodDetails(
        type = type,
        cardPresent = rawObject["card_present"]?.let { json.decodeFromJsonElement<PaymentMethodDetailsCardPresent>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CardGeneratedFromPaymentMethodDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("CardGeneratedFromPaymentMethodDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", value.type)
        value.cardPresent?.let { put("card_present", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun cardGeneratedFromPaymentMethodDetails(block: CardGeneratedFromPaymentMethodDetails.Builder.() -> Unit): CardGeneratedFromPaymentMethodDetails = CardGeneratedFromPaymentMethodDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CardGeneratedFromPaymentMethodDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
