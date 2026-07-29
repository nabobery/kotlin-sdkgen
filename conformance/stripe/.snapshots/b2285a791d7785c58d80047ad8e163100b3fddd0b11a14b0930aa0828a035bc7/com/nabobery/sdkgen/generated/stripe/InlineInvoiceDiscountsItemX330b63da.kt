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

public enum class InlineInvoiceDiscountsItemX330b63daBranch {
  Branch1,
  Discount,
  DeletedDiscount,
}

public sealed class InlineInvoiceDiscountsItemX330b63daDecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoiceDiscountsItemX330b63daNoMatchException(
  message: String,
) : InlineInvoiceDiscountsItemX330b63daDecodingException(message)

internal data class InlineInvoiceDiscountsItemX330b63daInspection(
  public val matchesBranch1: Boolean,
  public val matchesDiscount: Boolean,
  public val matchesDeletedDiscount: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesDiscount, matchesDeletedDiscount).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/components/schemas/invoice/properties/discounts/items.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice/properties/discounts/items
 */
@Serializable(with = InlineInvoiceDiscountsItemX330b63da.Serializer::class)
public class InlineInvoiceDiscountsItemX330b63da internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInvoiceDiscountsItemX330b63daInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val discount: Discount? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDiscount) json.decodeFromJsonElement<Discount>(raw) else null }

  public val deletedDiscount: DeletedDiscount? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedDiscount) json.decodeFromJsonElement<DeletedDiscount>(raw) else null }

  public val matchedBranches: Set<InlineInvoiceDiscountsItemX330b63daBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineInvoiceDiscountsItemX330b63daBranch.Branch1)
      if (inspection.matchesDiscount) add(InlineInvoiceDiscountsItemX330b63daBranch.Discount)
      if (inspection.matchesDeletedDiscount) add(InlineInvoiceDiscountsItemX330b63daBranch.DeletedDiscount)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoiceDiscountsItemX330b63da {
      val inspection = inspectInlineInvoiceDiscountsItemX330b63da(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoiceDiscountsItemX330b63daNoMatchException("InlineInvoiceDiscountsItemX330b63da matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoiceDiscountsItemX330b63da(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineInvoiceDiscountsItemX330b63da> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoiceDiscountsItemX330b63da {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoiceDiscountsItemX330b63da")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoiceDiscountsItemX330b63da) {
      encoder.requireJsonEncoder("InlineInvoiceDiscountsItemX330b63da").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoiceDiscountsItemX330b63da(element: JsonElement): InlineInvoiceDiscountsItemX330b63daInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesDiscount = element.isJsonDecodable<Discount>()
  val matchesDeletedDiscount = element.isJsonDecodable<DeletedDiscount>()
  return InlineInvoiceDiscountsItemX330b63daInspection(
    matchesBranch1 = matchesBranch1,
    matchesDiscount = matchesDiscount,
    matchesDeletedDiscount = matchesDeletedDiscount,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesDiscount) add("Discount: value does not match Discount")
      if (!matchesDeletedDiscount) add("DeletedDiscount: value does not match DeletedDiscount")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
