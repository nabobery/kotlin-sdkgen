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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineBillingBillResourceI03fcProrationDetailsX7d0edd12Branch {
  BillingBillResourceInvoicingLinesCommonProrationDetails,
}

public sealed class InlineBillingBillResourceI03fcProrationDetailsX7d0edd12DecodingException(
  message: String,
) : SerializationException(message)

public class InlineBillingBillResourceI03fcProrationDetailsX7d0edd12NoMatchException(
  message: String,
) : InlineBillingBillResourceI03fcProrationDetailsX7d0edd12DecodingException(message)

internal data class InlineBillingBillResourceI03fcProrationDetailsX7d0edd12Inspection(
  public val matchesBillingBillResourceInvoicingLinesCommonProrationDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBillingBillResourceInvoicingLinesCommonProrationDetails).count { it }
}

/**
 * Additional details for proration line items
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/billing_bill_resource_invoicing_lines_parents_invoice_line_item_invo
 * ice_item_parent/properties/proration_details
 */
@Serializable(with = InlineBillingBillResourceI03fcProrationDetailsX7d0edd12.Serializer::class)
public class InlineBillingBillResourceI03fcProrationDetailsX7d0edd12 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineBillingBillResourceI03fcProrationDetailsX7d0edd12Inspection,
) {
  public val billingBillResourceInvoicingLinesCommonProrationDetails:
      BillingBillResourceInvoicingLinesCommonProrationDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBillingBillResourceInvoicingLinesCommonProrationDetails) json.decodeFromJsonElement<BillingBillResourceInvoicingLinesCommonProrationDetailsView>(raw) else null }

  public val matchedBranches: Set<InlineBillingBillResourceI03fcProrationDetailsX7d0edd12Branch>
    get() = buildSet {
      if (inspection.matchesBillingBillResourceInvoicingLinesCommonProrationDetails) add(InlineBillingBillResourceI03fcProrationDetailsX7d0edd12Branch.BillingBillResourceInvoicingLinesCommonProrationDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineBillingBillResourceI03fcProrationDetailsX7d0edd12 {
      val inspection = inspectInlineBillingBillResourceI03fcProrationDetailsX7d0edd12(raw)
      if (inspection.matchCount == 0) {
        throw InlineBillingBillResourceI03fcProrationDetailsX7d0edd12NoMatchException("InlineBillingBillResourceI03fcProrationDetailsX7d0edd12 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineBillingBillResourceI03fcProrationDetailsX7d0edd12(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineBillingBillResourceI03fcProrationDetailsX7d0edd12> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBillingBillResourceI03fcProrationDetailsX7d0edd12 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBillingBillResourceI03fcProrationDetailsX7d0edd12")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineBillingBillResourceI03fcProrationDetailsX7d0edd12) {
      encoder.requireJsonEncoder("InlineBillingBillResourceI03fcProrationDetailsX7d0edd12").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineBillingBillResourceI03fcProrationDetailsX7d0edd12(element: JsonElement): InlineBillingBillResourceI03fcProrationDetailsX7d0edd12Inspection {
  val raw = element as? JsonObject ?: return InlineBillingBillResourceI03fcProrationDetailsX7d0edd12Inspection(
    matchesBillingBillResourceInvoicingLinesCommonProrationDetails = false,
    failures = listOf("BillingBillResourceInvoicingLinesCommonProrationDetails: expected JSON object"),
  )
  val matchesBillingBillResourceInvoicingLinesCommonProrationDetails = true
  return InlineBillingBillResourceI03fcProrationDetailsX7d0edd12Inspection(
    matchesBillingBillResourceInvoicingLinesCommonProrationDetails = matchesBillingBillResourceInvoicingLinesCommonProrationDetails,
    failures = buildList {
      if (!matchesBillingBillResourceInvoicingLinesCommonProrationDetails) add("BillingBillResourceInvoicingLinesCommonProrationDetails: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
