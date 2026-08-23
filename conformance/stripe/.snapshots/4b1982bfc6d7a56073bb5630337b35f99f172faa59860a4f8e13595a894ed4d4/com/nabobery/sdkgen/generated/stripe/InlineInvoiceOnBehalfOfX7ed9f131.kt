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

public enum class InlineInvoiceOnBehalfOfX7ed9f131Branch {
  Branch1,
  Account,
}

public sealed class InlineInvoiceOnBehalfOfX7ed9f131DecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoiceOnBehalfOfX7ed9f131NoMatchException(
  message: String,
) : InlineInvoiceOnBehalfOfX7ed9f131DecodingException(message)

internal data class InlineInvoiceOnBehalfOfX7ed9f131Inspection(
  public val matchesBranch1: Boolean,
  public val matchesAccount: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesAccount).count { it }
}

/**
 * The account (if any) for which the funds of the invoice payment are intended. If set, the invoice will be presented
 * with the branding and support information of the specified account. See the [Invoices with
 * Connect](https://docs.stripe.com/billing/invoices/connect) documentation for details.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice/properties/on_behalf_of
 */
@Serializable(with = InlineInvoiceOnBehalfOfX7ed9f131.Serializer::class)
public class InlineInvoiceOnBehalfOfX7ed9f131 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInvoiceOnBehalfOfX7ed9f131Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val account: Account? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAccount) json.decodeFromJsonElement<Account>(raw) else null }

  public val matchedBranches: Set<InlineInvoiceOnBehalfOfX7ed9f131Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineInvoiceOnBehalfOfX7ed9f131Branch.Branch1)
      if (inspection.matchesAccount) add(InlineInvoiceOnBehalfOfX7ed9f131Branch.Account)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoiceOnBehalfOfX7ed9f131 {
      val inspection = inspectInlineInvoiceOnBehalfOfX7ed9f131(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoiceOnBehalfOfX7ed9f131NoMatchException("InlineInvoiceOnBehalfOfX7ed9f131 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoiceOnBehalfOfX7ed9f131(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineInvoiceOnBehalfOfX7ed9f131> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoiceOnBehalfOfX7ed9f131 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoiceOnBehalfOfX7ed9f131")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoiceOnBehalfOfX7ed9f131) {
      encoder.requireJsonEncoder("InlineInvoiceOnBehalfOfX7ed9f131").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoiceOnBehalfOfX7ed9f131(element: JsonElement): InlineInvoiceOnBehalfOfX7ed9f131Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesAccount = element.isJsonDecodable<Account>()
  return InlineInvoiceOnBehalfOfX7ed9f131Inspection(
    matchesBranch1 = matchesBranch1,
    matchesAccount = matchesAccount,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesAccount) add("Account: value does not match Account")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
