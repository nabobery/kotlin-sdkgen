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

public enum class InlineInvoiceitemParentX5d8eb470Branch {
  BillingBillResourceInvoiceItemParentsInvoiceItemParent,
}

public sealed class InlineInvoiceitemParentX5d8eb470DecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoiceitemParentX5d8eb470NoMatchException(
  message: String,
) : InlineInvoiceitemParentX5d8eb470DecodingException(message)

internal data class InlineInvoiceitemParentX5d8eb470Inspection(
  public val matchesBillingBillResourceInvoiceItemParentsInvoiceItemParent: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBillingBillResourceInvoiceItemParentsInvoiceItemParent).count { it }
}

/**
 * The parent that generated this invoice item.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoiceitem/properties/parent
 */
@Serializable(with = InlineInvoiceitemParentX5d8eb470.Serializer::class)
public class InlineInvoiceitemParentX5d8eb470 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInvoiceitemParentX5d8eb470Inspection,
) {
  public val billingBillResourceInvoiceItemParentsInvoiceItemParent:
      BillingBillResourceInvoiceItemParentsInvoiceItemParentView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBillingBillResourceInvoiceItemParentsInvoiceItemParent) json.decodeFromJsonElement<BillingBillResourceInvoiceItemParentsInvoiceItemParentView>(raw) else null }

  public val matchedBranches: Set<InlineInvoiceitemParentX5d8eb470Branch>
    get() = buildSet {
      if (inspection.matchesBillingBillResourceInvoiceItemParentsInvoiceItemParent) add(InlineInvoiceitemParentX5d8eb470Branch.BillingBillResourceInvoiceItemParentsInvoiceItemParent)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoiceitemParentX5d8eb470 {
      val inspection = inspectInlineInvoiceitemParentX5d8eb470(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoiceitemParentX5d8eb470NoMatchException("InlineInvoiceitemParentX5d8eb470 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoiceitemParentX5d8eb470(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineInvoiceitemParentX5d8eb470> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoiceitemParentX5d8eb470 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoiceitemParentX5d8eb470")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoiceitemParentX5d8eb470) {
      encoder.requireJsonEncoder("InlineInvoiceitemParentX5d8eb470").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoiceitemParentX5d8eb470(element: JsonElement): InlineInvoiceitemParentX5d8eb470Inspection {
  val raw = element as? JsonObject ?: return InlineInvoiceitemParentX5d8eb470Inspection(
    matchesBillingBillResourceInvoiceItemParentsInvoiceItemParent = false,
    failures = listOf("BillingBillResourceInvoiceItemParentsInvoiceItemParent: expected JSON object"),
  )
  val matchesBillingBillResourceInvoiceItemParentsInvoiceItemParent = raw["type"] != null
  return InlineInvoiceitemParentX5d8eb470Inspection(
    matchesBillingBillResourceInvoiceItemParentsInvoiceItemParent = matchesBillingBillResourceInvoiceItemParentsInvoiceItemParent,
    failures = buildList {
      if (!matchesBillingBillResourceInvoiceItemParentsInvoiceItemParent) add("BillingBillResourceInvoiceItemParentsInvoiceItemParent: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
