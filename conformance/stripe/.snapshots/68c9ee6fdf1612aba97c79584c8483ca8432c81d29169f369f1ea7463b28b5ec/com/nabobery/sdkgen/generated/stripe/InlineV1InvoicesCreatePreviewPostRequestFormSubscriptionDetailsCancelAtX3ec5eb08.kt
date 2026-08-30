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

public enum class InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsCancelAtX3ec5eb08Branch {
  Branch1,
  InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X02adb7a6,
  InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf3X07356f8b,
}

public sealed class InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsCancelAtX3ec5eb08DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsCancelAtX3ec5eb08NoMatchException(
  message: String,
) : InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsCancelAtX3ec5eb08DecodingException(message)

internal data class InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsCancelAtX3ec5eb08Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X02adb7a6:
      Boolean,
  public val matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf3X07356f8b:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X02adb7a6, matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf3X07356f8b).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/cancel_at.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/cancel_at
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsCancelAtX3ec5eb08.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsCancelAtX3ec5eb08 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsCancelAtX3ec5eb08Inspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X02adb7a6:
      InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X02adb7a6? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X02adb7a6) json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X02adb7a6>(raw) else null }

  public val inlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf3X07356f8b:
      InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf3X07356f8b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf3X07356f8b) json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf3X07356f8b>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsCancelAtX3ec5eb08Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsCancelAtX3ec5eb08Branch.Branch1)
      if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X02adb7a6) add(InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsCancelAtX3ec5eb08Branch.InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X02adb7a6)
      if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf3X07356f8b) add(InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsCancelAtX3ec5eb08Branch.InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf3X07356f8b)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsCancelAtX3ec5eb08 {
      val inspection = inspectInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsCancelAtX3ec5eb08(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsCancelAtX3ec5eb08NoMatchException("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsCancelAtX3ec5eb08 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsCancelAtX3ec5eb08(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsCancelAtX3ec5eb08> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsCancelAtX3ec5eb08 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsCancelAtX3ec5eb08")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsCancelAtX3ec5eb08) {
      encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsCancelAtX3ec5eb08").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsCancelAtX3ec5eb08(element: JsonElement): InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsCancelAtX3ec5eb08Inspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X02adb7a6 = element.isJsonDecodable<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X02adb7a6>()
  val matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf3X07356f8b = element.isJsonDecodable<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf3X07356f8b>()
  return InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsCancelAtX3ec5eb08Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X02adb7a6 = matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X02adb7a6,
    matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf3X07356f8b = matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf3X07356f8b,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X02adb7a6) add("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X02adb7a6: value does not match InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X02adb7a6")
      if (!matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf3X07356f8b) add("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf3X07356f8b: value does not match InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf3X07356f8b")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
