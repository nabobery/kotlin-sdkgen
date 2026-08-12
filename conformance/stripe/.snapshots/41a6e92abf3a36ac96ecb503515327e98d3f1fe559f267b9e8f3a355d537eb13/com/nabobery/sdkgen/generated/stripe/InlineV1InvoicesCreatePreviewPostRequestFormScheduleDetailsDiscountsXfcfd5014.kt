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

public enum class InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDiscountsXfcfd5014Branch {
  Branch1,
  InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X0fb87096,
}

public sealed class InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDiscountsXfcfd5014DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDiscountsXfcfd5014NoMatchException(
  message: String,
) : InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDiscountsXfcfd5014DecodingException(message)

internal data class InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDiscountsXfcfd5014Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X0fb87096:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X0fb87096).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/items/items/properties/discounts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/items/items/properties/discounts
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDiscountsXfcfd5014.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDiscountsXfcfd5014 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDiscountsXfcfd5014Inspection,
) {
  public val branch1:
      List<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesItemXd55ba9c0>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesItemXd55ba9c0>>(raw) else null }

  public val inlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X0fb87096:
      InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X0fb87096? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X0fb87096) json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X0fb87096>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDiscountsXfcfd5014Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDiscountsXfcfd5014Branch.Branch1)
      if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X0fb87096) add(InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDiscountsXfcfd5014Branch.InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X0fb87096)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDiscountsXfcfd5014 {
      val inspection = inspectInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDiscountsXfcfd5014(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDiscountsXfcfd5014NoMatchException("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDiscountsXfcfd5014 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDiscountsXfcfd5014(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDiscountsXfcfd5014> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDiscountsXfcfd5014 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDiscountsXfcfd5014")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDiscountsXfcfd5014) {
      encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDiscountsXfcfd5014").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDiscountsXfcfd5014(element: JsonElement): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDiscountsXfcfd5014Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesItemXd55ba9c0>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X0fb87096 = element.isJsonDecodable<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X0fb87096>()
  return InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsDiscountsXfcfd5014Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X0fb87096 = matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X0fb87096,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X0fb87096) add("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X0fb87096: value does not match InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X0fb87096")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
