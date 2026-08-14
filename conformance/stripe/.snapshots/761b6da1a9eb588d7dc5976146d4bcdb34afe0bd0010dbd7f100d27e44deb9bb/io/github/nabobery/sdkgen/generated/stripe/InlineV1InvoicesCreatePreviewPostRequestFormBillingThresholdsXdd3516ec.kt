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

public enum class InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXdd3516ecBranch {
  InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X6e4ce7a0,
  InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X1563b1f8,
}

public sealed class InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXdd3516ecDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXdd3516ecNoMatchException(
  message: String,
) : InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXdd3516ecDecodingException(message)

internal data class InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXdd3516ecInspection(
  public val matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X6e4ce7a0:
      Boolean,
  public val matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X1563b1f8:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X6e4ce7a0, matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X1563b1f8).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/billing_thresholds.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/schedule_details/properties/phases/items/properties/billing_thresholds
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXdd3516ec.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXdd3516ec internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXdd3516ecInspection,
) {
  public val inlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X6e4ce7a0:
      InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X6e4ce7a0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X6e4ce7a0) json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X6e4ce7a0>(raw) else null }

  public val inlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X1563b1f8:
      InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X1563b1f8? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X1563b1f8) json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X1563b1f8>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXdd3516ecBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X6e4ce7a0) add(InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXdd3516ecBranch.InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X6e4ce7a0)
      if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X1563b1f8) add(InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXdd3516ecBranch.InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X1563b1f8)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXdd3516ec {
      val inspection = inspectInlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXdd3516ec(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXdd3516ecNoMatchException("InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXdd3516ec matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXdd3516ec(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXdd3516ec> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXdd3516ec {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXdd3516ec")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXdd3516ec) {
      encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXdd3516ec").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXdd3516ec(element: JsonElement): InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXdd3516ecInspection {
  val matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X6e4ce7a0 = element.isJsonDecodable<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X6e4ce7a0>()
  val matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X1563b1f8 = element.isJsonDecodable<InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X1563b1f8>()
  return InlineV1InvoicesCreatePreviewPostRequestFormBillingThresholdsXdd3516ecInspection(
    matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X6e4ce7a0 = matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X6e4ce7a0,
    matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X1563b1f8 = matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X1563b1f8,
    failures = buildList {
      if (!matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X6e4ce7a0) add("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X6e4ce7a0: value does not match InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf1X6e4ce7a0")
      if (!matchesInlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X1563b1f8) add("InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X1563b1f8: value does not match InlineV1InvoicesCreatePreviewPostRequestFormScheduleDetailsPhasesAnyOf2X1563b1f8")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
