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

public enum class InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsStartDateXc1a7f0b9Branch {
  Branch1,
  InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X04239579,
}

public sealed class InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsStartDateXc1a7f0b9DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsStartDateXc1a7f0b9NoMatchException(
  message: String,
) : InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsStartDateXc1a7f0b9DecodingException(message)

internal data class InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsStartDateXc1a7f0b9Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X04239579:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X04239579).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/start_date.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/start_date
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsStartDateXc1a7f0b9.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsStartDateXc1a7f0b9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsStartDateXc1a7f0b9Inspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X04239579:
      InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X04239579? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X04239579) json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X04239579>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsStartDateXc1a7f0b9Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsStartDateXc1a7f0b9Branch.Branch1)
      if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X04239579) add(InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsStartDateXc1a7f0b9Branch.InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X04239579)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsStartDateXc1a7f0b9 {
      val inspection = inspectInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsStartDateXc1a7f0b9(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsStartDateXc1a7f0b9NoMatchException("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsStartDateXc1a7f0b9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsStartDateXc1a7f0b9(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsStartDateXc1a7f0b9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsStartDateXc1a7f0b9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsStartDateXc1a7f0b9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsStartDateXc1a7f0b9) {
      encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsStartDateXc1a7f0b9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsStartDateXc1a7f0b9(element: JsonElement): InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsStartDateXc1a7f0b9Inspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X04239579 = element.isJsonDecodable<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X04239579>()
  return InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsStartDateXc1a7f0b9Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X04239579 = matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X04239579,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X04239579) add("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X04239579: value does not match InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X04239579")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
