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

public enum class InlineInvoiceitemDiscountsItemXc729a9a7Branch {
  Branch1,
  Discount,
}

public sealed class InlineInvoiceitemDiscountsItemXc729a9a7DecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoiceitemDiscountsItemXc729a9a7NoMatchException(
  message: String,
) : InlineInvoiceitemDiscountsItemXc729a9a7DecodingException(message)

internal data class InlineInvoiceitemDiscountsItemXc729a9a7Inspection(
  public val matchesBranch1: Boolean,
  public val matchesDiscount: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesDiscount).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/components/schemas/invoiceitem/properties/discounts/items.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoiceitem/properties/discounts/items
 */
@Serializable(with = InlineInvoiceitemDiscountsItemXc729a9a7.Serializer::class)
public class InlineInvoiceitemDiscountsItemXc729a9a7 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInvoiceitemDiscountsItemXc729a9a7Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val discount: Discount? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDiscount) json.decodeFromJsonElement<Discount>(raw) else null }

  public val matchedBranches: Set<InlineInvoiceitemDiscountsItemXc729a9a7Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineInvoiceitemDiscountsItemXc729a9a7Branch.Branch1)
      if (inspection.matchesDiscount) add(InlineInvoiceitemDiscountsItemXc729a9a7Branch.Discount)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoiceitemDiscountsItemXc729a9a7 {
      val inspection = inspectInlineInvoiceitemDiscountsItemXc729a9a7(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoiceitemDiscountsItemXc729a9a7NoMatchException("InlineInvoiceitemDiscountsItemXc729a9a7 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoiceitemDiscountsItemXc729a9a7(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineInvoiceitemDiscountsItemXc729a9a7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoiceitemDiscountsItemXc729a9a7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoiceitemDiscountsItemXc729a9a7")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoiceitemDiscountsItemXc729a9a7) {
      encoder.requireJsonEncoder("InlineInvoiceitemDiscountsItemXc729a9a7").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoiceitemDiscountsItemXc729a9a7(element: JsonElement): InlineInvoiceitemDiscountsItemXc729a9a7Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesDiscount = element.isJsonDecodable<Discount>()
  return InlineInvoiceitemDiscountsItemXc729a9a7Inspection(
    matchesBranch1 = matchesBranch1,
    matchesDiscount = matchesDiscount,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesDiscount) add("Discount: value does not match Discount")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
