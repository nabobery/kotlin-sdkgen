package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
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

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_us_bank_account_blocked
 */
@Serializable(with = PaymentMethodUsBankAccountBlocked.Serializer::class)
public class PaymentMethodUsBankAccountBlocked(
  /**
   * The ACH network code that resulted in this block.
   */
  public val networkCode: InlinePaymentMethodUsBankAccountBlockedNetworkCodeX0a662ce1? = null,
  /**
   * The reason why this PaymentMethod's fingerprint has been blocked
   */
  public val reason: InlinePaymentMethodUsBankAccountBlockedReasonX9256636c? = null,
) {
  public class Builder {
    /**
     * The ACH network code that resulted in this block.
     */
    public var networkCode: InlinePaymentMethodUsBankAccountBlockedNetworkCodeX0a662ce1? = null

    /**
     * The reason why this PaymentMethod's fingerprint has been blocked
     */
    public var reason: InlinePaymentMethodUsBankAccountBlockedReasonX9256636c? = null

    public fun build(): PaymentMethodUsBankAccountBlocked = PaymentMethodUsBankAccountBlocked(
      networkCode = networkCode,
      reason = reason,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodUsBankAccountBlocked = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodUsBankAccountBlocked> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodUsBankAccountBlocked {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodUsBankAccountBlocked")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodUsBankAccountBlocked must be a JSON object")
      return PaymentMethodUsBankAccountBlocked(
        networkCode = rawObject["network_code"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodUsBankAccountBlockedNetworkCodeX0a662ce1?>(element) },
        reason = rawObject["reason"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodUsBankAccountBlockedReasonX9256636c?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodUsBankAccountBlocked) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodUsBankAccountBlocked")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.networkCode?.let { put("network_code", json.encodeToJsonElement(it)) }
        value.reason?.let { put("reason", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodUsBankAccountBlocked(block: PaymentMethodUsBankAccountBlocked.Builder.() -> Unit): PaymentMethodUsBankAccountBlocked = PaymentMethodUsBankAccountBlocked.build(block)
