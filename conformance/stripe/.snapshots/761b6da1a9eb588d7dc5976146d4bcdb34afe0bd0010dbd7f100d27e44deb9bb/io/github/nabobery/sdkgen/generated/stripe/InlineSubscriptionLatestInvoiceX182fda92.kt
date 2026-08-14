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

public enum class InlineSubscriptionLatestInvoiceX182fda92Branch {
  Branch1,
  Invoice,
}

public sealed class InlineSubscriptionLatestInvoiceX182fda92DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionLatestInvoiceX182fda92NoMatchException(
  message: String,
) : InlineSubscriptionLatestInvoiceX182fda92DecodingException(message)

internal data class InlineSubscriptionLatestInvoiceX182fda92Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInvoice: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInvoice).count { it }
}

/**
 * The most recent invoice this subscription has generated over its lifecycle (for example, when it cycles or is
 * updated).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/subscription/properties/latest_invoice
 */
@Serializable(with = InlineSubscriptionLatestInvoiceX182fda92.Serializer::class)
public class InlineSubscriptionLatestInvoiceX182fda92 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSubscriptionLatestInvoiceX182fda92Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val invoice: Invoice? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInvoice) json.decodeFromJsonElement<Invoice>(raw) else null }

  public val matchedBranches: Set<InlineSubscriptionLatestInvoiceX182fda92Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineSubscriptionLatestInvoiceX182fda92Branch.Branch1)
      if (inspection.matchesInvoice) add(InlineSubscriptionLatestInvoiceX182fda92Branch.Invoice)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionLatestInvoiceX182fda92 {
      val inspection = inspectInlineSubscriptionLatestInvoiceX182fda92(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionLatestInvoiceX182fda92NoMatchException("InlineSubscriptionLatestInvoiceX182fda92 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionLatestInvoiceX182fda92(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionLatestInvoiceX182fda92> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionLatestInvoiceX182fda92 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionLatestInvoiceX182fda92")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionLatestInvoiceX182fda92) {
      encoder.requireJsonEncoder("InlineSubscriptionLatestInvoiceX182fda92").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionLatestInvoiceX182fda92(element: JsonElement): InlineSubscriptionLatestInvoiceX182fda92Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInvoice = element.isJsonDecodable<Invoice>()
  return InlineSubscriptionLatestInvoiceX182fda92Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInvoice = matchesInvoice,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInvoice) add("Invoice: value does not match Invoice")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
