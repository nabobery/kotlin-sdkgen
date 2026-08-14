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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class PaymentMethodCardGeneratedCardView(
  public val charge: String? = null,
  @SerialName("payment_method_details")
  public val paymentMethodDetails:
      InlinePaymentMethodCardGeneratedCardPaymentMethodDetailsX44f490d9? = null,
  @SerialName("setup_attempt")
  public val setupAttempt: InlinePaymentMethodCardGeneratedCardSetupAttemptX3d2ada0d? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_card_generated_card
 */
@Serializable(with = PaymentMethodCardGeneratedCard.Serializer::class)
public class PaymentMethodCardGeneratedCard(
  /**
   * The charge that created this object.
   */
  public val charge: String? = null,
  /**
   * Transaction-specific details of the payment method used in the payment.
   */
  public val paymentMethodDetails:
      InlinePaymentMethodCardGeneratedCardPaymentMethodDetailsX44f490d9? = null,
  /**
   * The ID of the SetupAttempt that generated this PaymentMethod, if any.
   */
  public val setupAttempt: InlinePaymentMethodCardGeneratedCardSetupAttemptX3d2ada0d? = null,
) {
  public class Builder {
    /**
     * The charge that created this object.
     */
    public var charge: String? = null

    /**
     * Transaction-specific details of the payment method used in the payment.
     */
    public var paymentMethodDetails:
        InlinePaymentMethodCardGeneratedCardPaymentMethodDetailsX44f490d9? = null

    /**
     * The ID of the SetupAttempt that generated this PaymentMethod, if any.
     */
    public var setupAttempt: InlinePaymentMethodCardGeneratedCardSetupAttemptX3d2ada0d? = null

    public fun build(): PaymentMethodCardGeneratedCard = PaymentMethodCardGeneratedCard(
      charge = charge,
      paymentMethodDetails = paymentMethodDetails,
      setupAttempt = setupAttempt,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodCardGeneratedCard = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodCardGeneratedCard> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodCardGeneratedCard {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodCardGeneratedCard")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodCardGeneratedCard must be a JSON object")
      return PaymentMethodCardGeneratedCard(
        charge = rawObject["charge"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        paymentMethodDetails = rawObject["payment_method_details"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodCardGeneratedCardPaymentMethodDetailsX44f490d9?>(element) },
        setupAttempt = rawObject["setup_attempt"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodCardGeneratedCardSetupAttemptX3d2ada0d?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodCardGeneratedCard) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodCardGeneratedCard")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.charge?.let { put("charge", it) }
        value.paymentMethodDetails?.let { put("payment_method_details", json.encodeToJsonElement(it)) }
        value.setupAttempt?.let { put("setup_attempt", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodCardGeneratedCard(block: PaymentMethodCardGeneratedCard.Builder.() -> Unit): PaymentMethodCardGeneratedCard = PaymentMethodCardGeneratedCard.build(block)
