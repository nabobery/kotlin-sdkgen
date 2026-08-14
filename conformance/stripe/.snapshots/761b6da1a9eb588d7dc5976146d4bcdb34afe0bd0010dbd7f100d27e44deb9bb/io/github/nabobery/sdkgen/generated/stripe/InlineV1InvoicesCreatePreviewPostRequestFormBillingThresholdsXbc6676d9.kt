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

public enum class InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbc6676d9Branch {
  InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X070a5d17,
  InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd4fe865e,
}

public sealed class InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbc6676d9DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbc6676d9NoMatchException(
  message: String,
) : InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbc6676d9DecodingException(message)

internal data class InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbc6676d9Inspection(
  public val matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X070a5d17:
      Boolean,
  public val matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd4fe865e:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X070a5d17, matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd4fe865e).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/items/items/properties/billing_thresh
 * olds.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/items/items/properties/billing_thresh
 * olds
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbc6676d9.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbc6676d9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbc6676d9Inspection,
) {
  public val inlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X070a5d17:
      InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X070a5d17? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X070a5d17) json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X070a5d17>(raw) else null }

  public val inlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd4fe865e:
      InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd4fe865e? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd4fe865e) json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd4fe865e>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbc6676d9Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X070a5d17) add(InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbc6676d9Branch.InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X070a5d17)
      if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd4fe865e) add(InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbc6676d9Branch.InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd4fe865e)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbc6676d9 {
      val inspection = inspectInlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbc6676d9(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbc6676d9NoMatchException("InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbc6676d9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbc6676d9(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbc6676d9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbc6676d9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbc6676d9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbc6676d9) {
      encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbc6676d9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbc6676d9(element: JsonElement): InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbc6676d9Inspection {
  val matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X070a5d17 = element.isJsonDecodable<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X070a5d17>()
  val matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd4fe865e = element.isJsonDecodable<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd4fe865e>()
  return InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXbc6676d9Inspection(
    matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X070a5d17 = matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X070a5d17,
    matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd4fe865e = matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd4fe865e,
    failures = buildList {
      if (!matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X070a5d17) add("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X070a5d17: value does not match InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X070a5d17")
      if (!matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd4fe865e) add("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd4fe865e: value does not match InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2Xd4fe865e")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
