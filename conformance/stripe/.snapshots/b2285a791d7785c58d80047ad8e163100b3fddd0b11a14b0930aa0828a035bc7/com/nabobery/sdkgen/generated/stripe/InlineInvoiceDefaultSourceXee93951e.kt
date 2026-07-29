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

public enum class InlineInvoiceDefaultSourceXee93951eBranch {
  Branch1,
  BankAccount,
  Card,
  Source,
}

public sealed class InlineInvoiceDefaultSourceXee93951eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoiceDefaultSourceXee93951eNoMatchException(
  message: String,
) : InlineInvoiceDefaultSourceXee93951eDecodingException(message)

internal data class InlineInvoiceDefaultSourceXee93951eInspection(
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
 * ID of the default payment source for the invoice. It must belong to the customer associated with the invoice and be
 * in a chargeable state. If not set, defaults to the subscription's default source, if any, or to the customer's
 * default source.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice/properties/default_source
 */
@Serializable(with = InlineInvoiceDefaultSourceXee93951e.Serializer::class)
public class InlineInvoiceDefaultSourceXee93951e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInvoiceDefaultSourceXee93951eInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val bankAccount: BankAccount? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBankAccount) json.decodeFromJsonElement<BankAccount>(raw) else null }

  public val card: Card? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesCard) json.decodeFromJsonElement<Card>(raw) else null }

  public val source: Source? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSource) json.decodeFromJsonElement<Source>(raw) else null }

  public val matchedBranches: Set<InlineInvoiceDefaultSourceXee93951eBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineInvoiceDefaultSourceXee93951eBranch.Branch1)
      if (inspection.matchesBankAccount) add(InlineInvoiceDefaultSourceXee93951eBranch.BankAccount)
      if (inspection.matchesCard) add(InlineInvoiceDefaultSourceXee93951eBranch.Card)
      if (inspection.matchesSource) add(InlineInvoiceDefaultSourceXee93951eBranch.Source)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoiceDefaultSourceXee93951e {
      val inspection = inspectInlineInvoiceDefaultSourceXee93951e(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoiceDefaultSourceXee93951eNoMatchException("InlineInvoiceDefaultSourceXee93951e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoiceDefaultSourceXee93951e(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineInvoiceDefaultSourceXee93951e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoiceDefaultSourceXee93951e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoiceDefaultSourceXee93951e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoiceDefaultSourceXee93951e) {
      encoder.requireJsonEncoder("InlineInvoiceDefaultSourceXee93951e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoiceDefaultSourceXee93951e(element: JsonElement): InlineInvoiceDefaultSourceXee93951eInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBankAccount = element.isJsonDecodable<BankAccount>()
  val matchesCard = element.isJsonDecodable<Card>()
  val matchesSource = element.isJsonDecodable<Source>()
  return InlineInvoiceDefaultSourceXee93951eInspection(
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
