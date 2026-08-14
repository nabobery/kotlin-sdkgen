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
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTaxRatesXe6eb7699Branch {
  Branch1,
  InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd9970931,
}

public sealed class InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTaxRatesXe6eb7699DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTaxRatesXe6eb7699NoMatchException(
  message: String,
) : InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTaxRatesXe6eb7699DecodingException(message)

internal data class InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTaxRatesXe6eb7699Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd9970931:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd9970931).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/add_invoice_items/items/properties/ta
 * x_rates.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/add_invoice_items/items/properties/ta
 * x_rates
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTaxRatesXe6eb7699.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTaxRatesXe6eb7699 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTaxRatesXe6eb7699Inspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd9970931:
      InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd9970931? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd9970931) json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd9970931>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTaxRatesXe6eb7699Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTaxRatesXe6eb7699Branch.Branch1)
      if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd9970931) add(InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTaxRatesXe6eb7699Branch.InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd9970931)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTaxRatesXe6eb7699 {
      val inspection = inspectInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTaxRatesXe6eb7699(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTaxRatesXe6eb7699NoMatchException("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTaxRatesXe6eb7699 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTaxRatesXe6eb7699(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTaxRatesXe6eb7699> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTaxRatesXe6eb7699 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTaxRatesXe6eb7699")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTaxRatesXe6eb7699) {
      encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTaxRatesXe6eb7699").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTaxRatesXe6eb7699(element: JsonElement): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTaxRatesXe6eb7699Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd9970931 = element.isJsonDecodable<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd9970931>()
  return InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsTaxRatesXe6eb7699Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd9970931 = matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd9970931,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd9970931) add("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd9970931: value does not match InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd9970931")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
