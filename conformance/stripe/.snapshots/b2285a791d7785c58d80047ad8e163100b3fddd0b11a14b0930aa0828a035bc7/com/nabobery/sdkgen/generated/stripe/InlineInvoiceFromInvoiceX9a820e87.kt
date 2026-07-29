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

public enum class InlineInvoiceFromInvoiceX9a820e87Branch {
  InvoicesResourceFromInvoice,
}

public sealed class InlineInvoiceFromInvoiceX9a820e87DecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoiceFromInvoiceX9a820e87NoMatchException(
  message: String,
) : InlineInvoiceFromInvoiceX9a820e87DecodingException(message)

internal data class InlineInvoiceFromInvoiceX9a820e87Inspection(
  public val matchesInvoicesResourceFromInvoice: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInvoicesResourceFromInvoice).count { it }
}

/**
 * Details of the invoice that was cloned. See the [revision
 * documentation](https://docs.stripe.com/invoicing/invoice-revisions) for more details.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice/properties/from_invoice
 */
@Serializable(with = InlineInvoiceFromInvoiceX9a820e87.Serializer::class)
public class InlineInvoiceFromInvoiceX9a820e87 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInvoiceFromInvoiceX9a820e87Inspection,
) {
  public val invoicesResourceFromInvoice: InvoicesResourceFromInvoiceView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInvoicesResourceFromInvoice) json.decodeFromJsonElement<InvoicesResourceFromInvoiceView>(raw) else null }

  public val matchedBranches: Set<InlineInvoiceFromInvoiceX9a820e87Branch>
    get() = buildSet {
      if (inspection.matchesInvoicesResourceFromInvoice) add(InlineInvoiceFromInvoiceX9a820e87Branch.InvoicesResourceFromInvoice)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoiceFromInvoiceX9a820e87 {
      val inspection = inspectInlineInvoiceFromInvoiceX9a820e87(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoiceFromInvoiceX9a820e87NoMatchException("InlineInvoiceFromInvoiceX9a820e87 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoiceFromInvoiceX9a820e87(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineInvoiceFromInvoiceX9a820e87> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoiceFromInvoiceX9a820e87 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoiceFromInvoiceX9a820e87")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoiceFromInvoiceX9a820e87) {
      encoder.requireJsonEncoder("InlineInvoiceFromInvoiceX9a820e87").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoiceFromInvoiceX9a820e87(element: JsonElement): InlineInvoiceFromInvoiceX9a820e87Inspection {
  val raw = element as? JsonObject ?: return InlineInvoiceFromInvoiceX9a820e87Inspection(
    matchesInvoicesResourceFromInvoice = false,
    failures = listOf("InvoicesResourceFromInvoice: expected JSON object"),
  )
  val matchesInvoicesResourceFromInvoice = raw["action"].isString() && raw["invoice"] != null
  return InlineInvoiceFromInvoiceX9a820e87Inspection(
    matchesInvoicesResourceFromInvoice = matchesInvoicesResourceFromInvoice,
    failures = buildList {
      if (!matchesInvoicesResourceFromInvoice) add("InvoicesResourceFromInvoice: required properties 'action', 'invoice' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
