package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineSubscriptionSchedulePhaseConfigurationDefaultPaymentMethodX23a6342eBranch {
  Branch1,
  PaymentMethod,
}

public sealed class InlineSubscriptionSchedulePhaseConfigurationDefaultPaymentMethodX23a6342eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionSchedulePhaseConfigurationDefaultPaymentMethodX23a6342eNoMatchException(
  message: String,
) : InlineSubscriptionSchedulePhaseConfigurationDefaultPaymentMethodX23a6342eDecodingException(message)

internal data class InlineSubscriptionSchedulePhaseConfigurationDefaultPaymentMethodX23a6342eInspection(
  public val matchesBranch1: Boolean,
  public val matchesPaymentMethod: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesPaymentMethod).count { it }
}

/**
 * ID of the default payment method for the subscription schedule. It must belong to the customer associated with the
 * subscription schedule. If not set, invoices will use the default payment method in the customer's invoice settings.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscription_schedule_phase_configuration/properties/default_payment
 * _method
 */
@Serializable(with = InlineSubscriptionSchedulePhaseConfigurationDefaultPaymentMethodX23a6342e.Serializer::class)
public class InlineSubscriptionSchedulePhaseConfigurationDefaultPaymentMethodX23a6342e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineSubscriptionSchedulePhaseConfigurationDefaultPaymentMethodX23a6342eInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val paymentMethod: PaymentMethod? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentMethod) json.decodeFromJsonElement<PaymentMethod>(raw) else null }

  public val matchedBranches:
      Set<InlineSubscriptionSchedulePhaseConfigurationDefaultPaymentMethodX23a6342eBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineSubscriptionSchedulePhaseConfigurationDefaultPaymentMethodX23a6342eBranch.Branch1)
      if (inspection.matchesPaymentMethod) add(InlineSubscriptionSchedulePhaseConfigurationDefaultPaymentMethodX23a6342eBranch.PaymentMethod)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionSchedulePhaseConfigurationDefaultPaymentMethodX23a6342e {
      val inspection = inspectInlineSubscriptionSchedulePhaseConfigurationDefaultPaymentMethodX23a6342e(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionSchedulePhaseConfigurationDefaultPaymentMethodX23a6342eNoMatchException("InlineSubscriptionSchedulePhaseConfigurationDefaultPaymentMethodX23a6342e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionSchedulePhaseConfigurationDefaultPaymentMethodX23a6342e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionSchedulePhaseConfigurationDefaultPaymentMethodX23a6342e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionSchedulePhaseConfigurationDefaultPaymentMethodX23a6342e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionSchedulePhaseConfigurationDefaultPaymentMethodX23a6342e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionSchedulePhaseConfigurationDefaultPaymentMethodX23a6342e) {
      encoder.requireJsonEncoder("InlineSubscriptionSchedulePhaseConfigurationDefaultPaymentMethodX23a6342e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionSchedulePhaseConfigurationDefaultPaymentMethodX23a6342e(element: JsonElement): InlineSubscriptionSchedulePhaseConfigurationDefaultPaymentMethodX23a6342eInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesPaymentMethod = element.isJsonDecodable<PaymentMethod>()
  return InlineSubscriptionSchedulePhaseConfigurationDefaultPaymentMethodX23a6342eInspection(
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
