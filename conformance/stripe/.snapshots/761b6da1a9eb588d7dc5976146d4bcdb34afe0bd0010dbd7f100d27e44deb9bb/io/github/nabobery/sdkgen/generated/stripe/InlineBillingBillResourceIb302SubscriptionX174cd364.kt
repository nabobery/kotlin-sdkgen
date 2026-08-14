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

public enum class InlineBillingBillResourceIb302SubscriptionX174cd364Branch {
  Branch1,
  Subscription,
}

public sealed class InlineBillingBillResourceIb302SubscriptionX174cd364DecodingException(
  message: String,
) : SerializationException(message)

public class InlineBillingBillResourceIb302SubscriptionX174cd364NoMatchException(
  message: String,
) : InlineBillingBillResourceIb302SubscriptionX174cd364DecodingException(message)

internal data class InlineBillingBillResourceIb302SubscriptionX174cd364Inspection(
  public val matchesBranch1: Boolean,
  public val matchesSubscription: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesSubscription).count { it }
}

/**
 * The subscription that generated this invoice
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/billing_bill_resource_invoicing_parents_invoice_subscription_parent/
 * properties/subscription
 */
@Serializable(with = InlineBillingBillResourceIb302SubscriptionX174cd364.Serializer::class)
public class InlineBillingBillResourceIb302SubscriptionX174cd364 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineBillingBillResourceIb302SubscriptionX174cd364Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val subscription: Subscription? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSubscription) json.decodeFromJsonElement<Subscription>(raw) else null }

  public val matchedBranches: Set<InlineBillingBillResourceIb302SubscriptionX174cd364Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineBillingBillResourceIb302SubscriptionX174cd364Branch.Branch1)
      if (inspection.matchesSubscription) add(InlineBillingBillResourceIb302SubscriptionX174cd364Branch.Subscription)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineBillingBillResourceIb302SubscriptionX174cd364 {
      val inspection = inspectInlineBillingBillResourceIb302SubscriptionX174cd364(raw)
      if (inspection.matchCount == 0) {
        throw InlineBillingBillResourceIb302SubscriptionX174cd364NoMatchException("InlineBillingBillResourceIb302SubscriptionX174cd364 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineBillingBillResourceIb302SubscriptionX174cd364(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineBillingBillResourceIb302SubscriptionX174cd364> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBillingBillResourceIb302SubscriptionX174cd364 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBillingBillResourceIb302SubscriptionX174cd364")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineBillingBillResourceIb302SubscriptionX174cd364) {
      encoder.requireJsonEncoder("InlineBillingBillResourceIb302SubscriptionX174cd364").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineBillingBillResourceIb302SubscriptionX174cd364(element: JsonElement): InlineBillingBillResourceIb302SubscriptionX174cd364Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesSubscription = element.isJsonDecodable<Subscription>()
  return InlineBillingBillResourceIb302SubscriptionX174cd364Inspection(
    matchesBranch1 = matchesBranch1,
    matchesSubscription = matchesSubscription,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesSubscription) add("Subscription: value does not match Subscription")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
