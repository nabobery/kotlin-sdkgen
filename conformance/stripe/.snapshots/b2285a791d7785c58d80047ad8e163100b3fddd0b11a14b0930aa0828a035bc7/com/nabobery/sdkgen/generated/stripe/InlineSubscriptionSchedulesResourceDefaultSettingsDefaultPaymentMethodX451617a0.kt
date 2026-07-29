package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineSubscriptionSchedulesResourceDefaultSettingsDefaultPaymentMethodX451617a0Branch {
  Branch1,
  PaymentMethod,
}

public sealed class InlineSubscriptionSchedulesResourceDefaultSettingsDefaultPaymentMethodX451617a0DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionSchedulesResourceDefaultSettingsDefaultPaymentMethodX451617a0NoMatchException(
  message: String,
) : InlineSubscriptionSchedulesResourceDefaultSettingsDefaultPaymentMethodX451617a0DecodingException(message)

internal data class InlineSubscriptionSchedulesResourceDefaultSettingsDefaultPaymentMethodX451617a0Inspection(
  public val matchesBranch1: Boolean,
  public val matchesPaymentMethod: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesPaymentMethod).count { it }
}

/**
 * ID of the default payment method for the subscription schedule. If not set, invoices will use the default payment
 * method in the customer's invoice settings.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscription_schedules_resource_default_settings/properties/default_
 * payment_method
 */
@Serializable(with = InlineSubscriptionSchedulesResourceDefaultSettingsDefaultPaymentMethodX451617a0.Serializer::class)
public class InlineSubscriptionSchedulesResourceDefaultSettingsDefaultPaymentMethodX451617a0 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineSubscriptionSchedulesResourceDefaultSettingsDefaultPaymentMethodX451617a0Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val paymentMethod: PaymentMethod? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentMethod) json.decodeFromJsonElement<PaymentMethod>(raw) else null }

  public val matchedBranches:
      Set<InlineSubscriptionSchedulesResourceDefaultSettingsDefaultPaymentMethodX451617a0Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineSubscriptionSchedulesResourceDefaultSettingsDefaultPaymentMethodX451617a0Branch.Branch1)
      if (inspection.matchesPaymentMethod) add(InlineSubscriptionSchedulesResourceDefaultSettingsDefaultPaymentMethodX451617a0Branch.PaymentMethod)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionSchedulesResourceDefaultSettingsDefaultPaymentMethodX451617a0 {
      val inspection = inspectInlineSubscriptionSchedulesResourceDefaultSettingsDefaultPaymentMethodX451617a0(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionSchedulesResourceDefaultSettingsDefaultPaymentMethodX451617a0NoMatchException("InlineSubscriptionSchedulesResourceDefaultSettingsDefaultPaymentMethodX451617a0 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionSchedulesResourceDefaultSettingsDefaultPaymentMethodX451617a0(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineSubscriptionSchedulesResourceDefaultSettingsDefaultPaymentMethodX451617a0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionSchedulesResourceDefaultSettingsDefaultPaymentMethodX451617a0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionSchedulesResourceDefaultSettingsDefaultPaymentMethodX451617a0")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionSchedulesResourceDefaultSettingsDefaultPaymentMethodX451617a0) {
      encoder.requireJsonEncoder("InlineSubscriptionSchedulesResourceDefaultSettingsDefaultPaymentMethodX451617a0").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionSchedulesResourceDefaultSettingsDefaultPaymentMethodX451617a0(element: JsonElement): InlineSubscriptionSchedulesResourceDefaultSettingsDefaultPaymentMethodX451617a0Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesPaymentMethod = element.isJsonDecodable<PaymentMethod>()
  return InlineSubscriptionSchedulesResourceDefaultSettingsDefaultPaymentMethodX451617a0Inspection(
    matchesBranch1 = matchesBranch1,
    matchesPaymentMethod = matchesPaymentMethod,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesPaymentMethod) add("PaymentMethod: value does not match PaymentMethod")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
