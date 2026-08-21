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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineLineItemParentX36380c91Branch {
  BillingBillResourceInvoicingLinesParentsInvoiceLineItemParent,
}

public sealed class InlineLineItemParentX36380c91DecodingException(
  message: String,
) : SerializationException(message)

public class InlineLineItemParentX36380c91NoMatchException(
  message: String,
) : InlineLineItemParentX36380c91DecodingException(message)

internal data class InlineLineItemParentX36380c91Inspection(
  public val matchesBillingBillResourceInvoicingLinesParentsInvoiceLineItemParent: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBillingBillResourceInvoicingLinesParentsInvoiceLineItemParent).count { it }
}

/**
 * The parent that generated this line item.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/line_item/properties/parent
 */
@Serializable(with = InlineLineItemParentX36380c91.Serializer::class)
public class InlineLineItemParentX36380c91 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineLineItemParentX36380c91Inspection,
) {
  public val billingBillResourceInvoicingLinesParentsInvoiceLineItemParent:
      BillingBillResourceInvoicingLinesParentsInvoiceLineItemParentView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBillingBillResourceInvoicingLinesParentsInvoiceLineItemParent) json.decodeFromJsonElement<BillingBillResourceInvoicingLinesParentsInvoiceLineItemParentView>(raw) else null }

  public val matchedBranches: Set<InlineLineItemParentX36380c91Branch>
    get() = buildSet {
      if (inspection.matchesBillingBillResourceInvoicingLinesParentsInvoiceLineItemParent) add(InlineLineItemParentX36380c91Branch.BillingBillResourceInvoicingLinesParentsInvoiceLineItemParent)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineLineItemParentX36380c91 {
      val inspection = inspectInlineLineItemParentX36380c91(raw)
      if (inspection.matchCount == 0) {
        throw InlineLineItemParentX36380c91NoMatchException("InlineLineItemParentX36380c91 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineLineItemParentX36380c91(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineLineItemParentX36380c91> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineLineItemParentX36380c91 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineLineItemParentX36380c91")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineLineItemParentX36380c91) {
      encoder.requireJsonEncoder("InlineLineItemParentX36380c91").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineLineItemParentX36380c91(element: JsonElement): InlineLineItemParentX36380c91Inspection {
  val raw = element as? JsonObject ?: return InlineLineItemParentX36380c91Inspection(
    matchesBillingBillResourceInvoicingLinesParentsInvoiceLineItemParent = false,
    failures = listOf("BillingBillResourceInvoicingLinesParentsInvoiceLineItemParent: expected JSON object"),
  )
  val matchesBillingBillResourceInvoicingLinesParentsInvoiceLineItemParent = raw["type"] != null
  return InlineLineItemParentX36380c91Inspection(
    matchesBillingBillResourceInvoicingLinesParentsInvoiceLineItemParent = matchesBillingBillResourceInvoicingLinesParentsInvoiceLineItemParent,
    failures = buildList {
      if (!matchesBillingBillResourceInvoicingLinesParentsInvoiceLineItemParent) add("BillingBillResourceInvoicingLinesParentsInvoiceLineItemParent: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
