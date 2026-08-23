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

public enum class InlineCustomerDefaultSourceXa03c4ae9Branch {
  Branch1,
  BankAccount,
  Card,
  Source,
}

public sealed class InlineCustomerDefaultSourceXa03c4ae9DecodingException(
  message: String,
) : SerializationException(message)

public class InlineCustomerDefaultSourceXa03c4ae9NoMatchException(
  message: String,
) : InlineCustomerDefaultSourceXa03c4ae9DecodingException(message)

internal data class InlineCustomerDefaultSourceXa03c4ae9Inspection(
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
 * ID of the default payment source for the customer.
 *
 * If you use payment methods created through the PaymentMethods API, see the
 * [invoice_settings.default_payment_method](https://docs.stripe.com/api/customers/object#customer_object-invoice_settin
 * gs-default_payment_method) field instead.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/customer/properties/default_source
 */
@Serializable(with = InlineCustomerDefaultSourceXa03c4ae9.Serializer::class)
public class InlineCustomerDefaultSourceXa03c4ae9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCustomerDefaultSourceXa03c4ae9Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val bankAccount: BankAccount? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBankAccount) json.decodeFromJsonElement<BankAccount>(raw) else null }

  public val card: Card? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCard) json.decodeFromJsonElement<Card>(raw) else null }

  public val source: Source? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSource) json.decodeFromJsonElement<Source>(raw) else null }

  public val matchedBranches: Set<InlineCustomerDefaultSourceXa03c4ae9Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineCustomerDefaultSourceXa03c4ae9Branch.Branch1)
      if (inspection.matchesBankAccount) add(InlineCustomerDefaultSourceXa03c4ae9Branch.BankAccount)
      if (inspection.matchesCard) add(InlineCustomerDefaultSourceXa03c4ae9Branch.Card)
      if (inspection.matchesSource) add(InlineCustomerDefaultSourceXa03c4ae9Branch.Source)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCustomerDefaultSourceXa03c4ae9 {
      val inspection = inspectInlineCustomerDefaultSourceXa03c4ae9(raw)
      if (inspection.matchCount == 0) {
        throw InlineCustomerDefaultSourceXa03c4ae9NoMatchException("InlineCustomerDefaultSourceXa03c4ae9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCustomerDefaultSourceXa03c4ae9(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineCustomerDefaultSourceXa03c4ae9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCustomerDefaultSourceXa03c4ae9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCustomerDefaultSourceXa03c4ae9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCustomerDefaultSourceXa03c4ae9) {
      encoder.requireJsonEncoder("InlineCustomerDefaultSourceXa03c4ae9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCustomerDefaultSourceXa03c4ae9(element: JsonElement): InlineCustomerDefaultSourceXa03c4ae9Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBankAccount = element.isJsonDecodable<BankAccount>()
  val matchesCard = element.isJsonDecodable<Card>()
  val matchesSource = element.isJsonDecodable<Source>()
  return InlineCustomerDefaultSourceXa03c4ae9Inspection(
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
