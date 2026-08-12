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
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1InvoicesCreatePreviewPostRequestFormAccountTaxIdsXa5c99459Branch {
  Branch1,
  InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X31bc351f,
}

public sealed class InlineV1InvoicesCreatePreviewPostRequestFormAccountTaxIdsXa5c99459DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesCreatePreviewPostRequestFormAccountTaxIdsXa5c99459NoMatchException(
  message: String,
) : InlineV1InvoicesCreatePreviewPostRequestFormAccountTaxIdsXa5c99459DecodingException(message)

internal data class InlineV1InvoicesCreatePreviewPostRequestFormAccountTaxIdsXa5c99459Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X31bc351f:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X31bc351f).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/invoice_settings/properties/account_t
 * ax_ids.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/invoice_settings/properties/account_t
 * ax_ids
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormAccountTaxIdsXa5c99459.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormAccountTaxIdsXa5c99459 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesCreatePreviewPostRequestFormAccountTaxIdsXa5c99459Inspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X31bc351f:
      InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X31bc351f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X31bc351f) json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X31bc351f>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesCreatePreviewPostRequestFormAccountTaxIdsXa5c99459Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoicesCreatePreviewPostRequestFormAccountTaxIdsXa5c99459Branch.Branch1)
      if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X31bc351f) add(InlineV1InvoicesCreatePreviewPostRequestFormAccountTaxIdsXa5c99459Branch.InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X31bc351f)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesCreatePreviewPostRequestFormAccountTaxIdsXa5c99459 {
      val inspection = inspectInlineV1InvoicesCreatePreviewPostRequestFormAccountTaxIdsXa5c99459(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesCreatePreviewPostRequestFormAccountTaxIdsXa5c99459NoMatchException("InlineV1InvoicesCreatePreviewPostRequestFormAccountTaxIdsXa5c99459 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesCreatePreviewPostRequestFormAccountTaxIdsXa5c99459(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormAccountTaxIdsXa5c99459> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormAccountTaxIdsXa5c99459 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormAccountTaxIdsXa5c99459")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormAccountTaxIdsXa5c99459) {
      encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormAccountTaxIdsXa5c99459").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesCreatePreviewPostRequestFormAccountTaxIdsXa5c99459(element: JsonElement): InlineV1InvoicesCreatePreviewPostRequestFormAccountTaxIdsXa5c99459Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X31bc351f = element.isJsonDecodable<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X31bc351f>()
  return InlineV1InvoicesCreatePreviewPostRequestFormAccountTaxIdsXa5c99459Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X31bc351f = matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X31bc351f,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X31bc351f) add("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X31bc351f: value does not match InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X31bc351f")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
