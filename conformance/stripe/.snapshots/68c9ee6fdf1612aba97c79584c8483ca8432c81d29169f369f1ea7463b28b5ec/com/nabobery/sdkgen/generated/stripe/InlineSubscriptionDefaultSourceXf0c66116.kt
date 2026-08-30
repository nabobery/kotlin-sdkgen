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

public enum class InlineSubscriptionDefaultSourceXf0c66116Branch {
  Branch1,
  BankAccount,
  Card,
  Source,
}

public sealed class InlineSubscriptionDefaultSourceXf0c66116DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionDefaultSourceXf0c66116NoMatchException(
  message: String,
) : InlineSubscriptionDefaultSourceXf0c66116DecodingException(message)

internal data class InlineSubscriptionDefaultSourceXf0c66116Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBankAccount: Boolean,
  public val matchesCard: Boolean,
  public val matchesSource: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBankAccount, matchesCard, matchesSource).count { it }
}

/**
 * ID of the default payment source for the subscription. It must belong to the customer associated with the
 * subscription and be in a chargeable state. If `default_payment_method` is also set, `default_payment_method` will
 * take precedence. If neither are set, invoices will use the customer's
 * [invoice_settings.default_payment_method](https://docs.stripe.com/api/customers/object#customer_object-invoice_settin
 * gs-default_payment_method) or
 * [default_source](https://docs.stripe.com/api/customers/object#customer_object-default_source).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription/properties/default_source
 */
@Serializable(with = InlineSubscriptionDefaultSourceXf0c66116.Serializer::class)
public class InlineSubscriptionDefaultSourceXf0c66116 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSubscriptionDefaultSourceXf0c66116Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val bankAccount: BankAccount? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBankAccount) json.decodeFromJsonElement<BankAccount>(raw) else null }

  public val card: Card? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCard) json.decodeFromJsonElement<Card>(raw) else null }

  public val source: Source? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSource) json.decodeFromJsonElement<Source>(raw) else null }

  public val matchedBranches: Set<InlineSubscriptionDefaultSourceXf0c66116Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineSubscriptionDefaultSourceXf0c66116Branch.Branch1)
      if (inspection.matchesBankAccount) add(InlineSubscriptionDefaultSourceXf0c66116Branch.BankAccount)
      if (inspection.matchesCard) add(InlineSubscriptionDefaultSourceXf0c66116Branch.Card)
      if (inspection.matchesSource) add(InlineSubscriptionDefaultSourceXf0c66116Branch.Source)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionDefaultSourceXf0c66116 {
      val inspection = inspectInlineSubscriptionDefaultSourceXf0c66116(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionDefaultSourceXf0c66116NoMatchException("InlineSubscriptionDefaultSourceXf0c66116 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionDefaultSourceXf0c66116(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionDefaultSourceXf0c66116> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionDefaultSourceXf0c66116 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionDefaultSourceXf0c66116")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionDefaultSourceXf0c66116) {
      encoder.requireJsonEncoder("InlineSubscriptionDefaultSourceXf0c66116").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionDefaultSourceXf0c66116(element: JsonElement): InlineSubscriptionDefaultSourceXf0c66116Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBankAccount = element.isJsonDecodable<BankAccount>()
  val matchesCard = element.isJsonDecodable<Card>()
  val matchesSource = element.isJsonDecodable<Source>()
  return InlineSubscriptionDefaultSourceXf0c66116Inspection(
    matchesBranch1 = matchesBranch1,
    matchesBankAccount = matchesBankAccount,
    matchesCard = matchesCard,
    matchesSource = matchesSource,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesBankAccount) add("BankAccount: value does not match BankAccount")
      if (!matchesCard) add("Card: value does not match Card")
      if (!matchesSource) add("Source: value does not match Source")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
