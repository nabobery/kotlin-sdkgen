package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.ConsistentCopyVisibility
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@ConsistentCopyVisibility
@Serializable
public data class PaymentMethodOptionsCardInstallmentsView internal constructor(
  @SerialName("available_plans")
  public val availablePlans: List<PaymentMethodDetailsCardInstallmentsPlan>? = null,
  public val enabled: Boolean,
  public val plan: InlinePaymentMethodOptionsCardInstallmentsPlanXd122284b? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_options_card_installments
 */
@Serializable(with = PaymentMethodOptionsCardInstallments.Serializer::class)
public class PaymentMethodOptionsCardInstallments(
  /**
   * Whether Installments are enabled for this PaymentIntent.
   */
  public val enabled: Boolean,
  availablePlans: List<PaymentMethodDetailsCardInstallmentsPlan>? = null,
  /**
   * Installment plan selected for this PaymentIntent.
   */
  public val plan: InlinePaymentMethodOptionsCardInstallmentsPlanXd122284b? = null,
) {
  /**
   * Installment plans that may be selected for this PaymentIntent.
   */
  public val availablePlans: List<PaymentMethodDetailsCardInstallmentsPlan>? =
      availablePlans?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var enabledValue: Boolean? = null

    public var enabled: Boolean
      get() = requireNotNull(enabledValue) { "enabled is required" }
      set(`value`) {
        enabledValue = value
      }

    private var availablePlansValue: List<PaymentMethodDetailsCardInstallmentsPlan>? = null

    /**
     * Installment plans that may be selected for this PaymentIntent.
     */
    public var availablePlans: List<PaymentMethodDetailsCardInstallmentsPlan>?
      get() = availablePlansValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        availablePlansValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Installment plan selected for this PaymentIntent.
     */
    public var plan: InlinePaymentMethodOptionsCardInstallmentsPlanXd122284b? = null

    public fun build(): PaymentMethodOptionsCardInstallments {
      check(enabledValue != null) { "enabled is required" }
      return PaymentMethodOptionsCardInstallments(
        enabled = enabled,
        availablePlans = availablePlans,
        plan = plan,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentMethodOptionsCardInstallments = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentMethodOptionsCardInstallments> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentMethodOptionsCardInstallments {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentMethodOptionsCardInstallments")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentMethodOptionsCardInstallments must be a JSON object")
      val enabled = json.decodeRequired<Boolean>(rawObject, "enabled")
      return PaymentMethodOptionsCardInstallments(
        enabled = enabled,
        availablePlans = rawObject["available_plans"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<PaymentMethodDetailsCardInstallmentsPlan>?>(element) },
        plan = rawObject["plan"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentMethodOptionsCardInstallmentsPlanXd122284b?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentMethodOptionsCardInstallments) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentMethodOptionsCardInstallments")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled", json.encodeToJsonElement(value.enabled))
        value.availablePlans?.let { put("available_plans", json.encodeToJsonElement(it)) }
        value.plan?.let { put("plan", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentMethodOptionsCardInstallments(block: PaymentMethodOptionsCardInstallments.Builder.() -> Unit): PaymentMethodOptionsCardInstallments = PaymentMethodOptionsCardInstallments.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentMethodOptionsCardInstallments is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
