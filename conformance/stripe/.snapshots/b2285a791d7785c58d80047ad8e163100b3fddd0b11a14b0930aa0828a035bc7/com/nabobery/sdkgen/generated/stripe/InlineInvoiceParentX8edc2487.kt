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

public enum class InlineInvoiceParentX8edc2487Branch {
  BillingBillResourceInvoicingParentsInvoiceParent,
}

public sealed class InlineInvoiceParentX8edc2487DecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoiceParentX8edc2487NoMatchException(
  message: String,
) : InlineInvoiceParentX8edc2487DecodingException(message)

internal data class InlineInvoiceParentX8edc2487Inspection(
  public val matchesBillingBillResourceInvoicingParentsInvoiceParent: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBillingBillResourceInvoicingParentsInvoiceParent).count { it }
}

/**
 * The parent that generated this invoice
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice/properties/parent
 */
@Serializable(with = InlineInvoiceParentX8edc2487.Serializer::class)
public class InlineInvoiceParentX8edc2487 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInvoiceParentX8edc2487Inspection,
) {
  public val billingBillResourceInvoicingParentsInvoiceParent:
      BillingBillResourceInvoicingParentsInvoiceParentView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBillingBillResourceInvoicingParentsInvoiceParent) json.decodeFromJsonElement<BillingBillResourceInvoicingParentsInvoiceParentView>(raw) else null }

  public val matchedBranches: Set<InlineInvoiceParentX8edc2487Branch>
    get() = buildSet {
      if (inspection.matchesBillingBillResourceInvoicingParentsInvoiceParent) add(InlineInvoiceParentX8edc2487Branch.BillingBillResourceInvoicingParentsInvoiceParent)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoiceParentX8edc2487 {
      val inspection = inspectInlineInvoiceParentX8edc2487(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoiceParentX8edc2487NoMatchException("InlineInvoiceParentX8edc2487 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoiceParentX8edc2487(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineInvoiceParentX8edc2487> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoiceParentX8edc2487 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoiceParentX8edc2487")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoiceParentX8edc2487) {
      encoder.requireJsonEncoder("InlineInvoiceParentX8edc2487").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoiceParentX8edc2487(element: JsonElement): InlineInvoiceParentX8edc2487Inspection {
  val raw = element as? JsonObject ?: return InlineInvoiceParentX8edc2487Inspection(
    matchesBillingBillResourceInvoicingParentsInvoiceParent = false,
    failures = listOf("BillingBillResourceInvoicingParentsInvoiceParent: expected JSON object"),
  )
  val matchesBillingBillResourceInvoicingParentsInvoiceParent = raw["type"] != null
  return InlineInvoiceParentX8edc2487Inspection(
    matchesBillingBillResourceInvoicingParentsInvoiceParent = matchesBillingBillResourceInvoicingParentsInvoiceParent,
    failures = buildList {
      if (!matchesBillingBillResourceInvoicingParentsInvoiceParent) add("BillingBillResourceInvoicingParentsInvoiceParent: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
