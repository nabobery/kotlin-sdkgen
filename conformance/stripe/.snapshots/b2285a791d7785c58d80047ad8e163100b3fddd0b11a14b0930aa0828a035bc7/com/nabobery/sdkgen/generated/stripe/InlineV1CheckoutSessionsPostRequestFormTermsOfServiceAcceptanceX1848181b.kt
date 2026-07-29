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

public enum class InlineV1CheckoutSessionsPostRequestFormTermsOfServiceAcceptanceX1848181bBranch {
  InlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf1Xf5625044,
  InlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf2X470283cc,
}

public sealed class InlineV1CheckoutSessionsPostRequestFormTermsOfServiceAcceptanceX1848181bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CheckoutSessionsPostRequestFormTermsOfServiceAcceptanceX1848181bNoMatchException(
  message: String,
) : InlineV1CheckoutSessionsPostRequestFormTermsOfServiceAcceptanceX1848181bDecodingException(message)

internal data class InlineV1CheckoutSessionsPostRequestFormTermsOfServiceAcceptanceX1848181bInspection(
  public val matchesInlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf1Xf5625044: Boolean,
  public val matchesInlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf2X470283cc: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf1Xf5625044, matchesInlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf2X470283cc).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/custom_text/properties/terms_of_service_acceptance.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/custom_text/properties/terms_of_service_acceptance
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormTermsOfServiceAcceptanceX1848181b.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormTermsOfServiceAcceptanceX1848181b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CheckoutSessionsPostRequestFormTermsOfServiceAcceptanceX1848181bInspection,
) {
  public val inlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf1Xf5625044:
      InlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf1Xf5625044? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf1Xf5625044) json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf1Xf5625044>(raw) else null }

  public val inlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf2X470283cc:
      InlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf2X470283cc? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf2X470283cc) json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf2X470283cc>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CheckoutSessionsPostRequestFormTermsOfServiceAcceptanceX1848181bBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf1Xf5625044) add(InlineV1CheckoutSessionsPostRequestFormTermsOfServiceAcceptanceX1848181bBranch.InlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf1Xf5625044)
      if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf2X470283cc) add(InlineV1CheckoutSessionsPostRequestFormTermsOfServiceAcceptanceX1848181bBranch.InlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf2X470283cc)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CheckoutSessionsPostRequestFormTermsOfServiceAcceptanceX1848181b {
      val inspection = inspectInlineV1CheckoutSessionsPostRequestFormTermsOfServiceAcceptanceX1848181b(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CheckoutSessionsPostRequestFormTermsOfServiceAcceptanceX1848181bNoMatchException("InlineV1CheckoutSessionsPostRequestFormTermsOfServiceAcceptanceX1848181b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CheckoutSessionsPostRequestFormTermsOfServiceAcceptanceX1848181b(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormTermsOfServiceAcceptanceX1848181b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormTermsOfServiceAcceptanceX1848181b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormTermsOfServiceAcceptanceX1848181b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormTermsOfServiceAcceptanceX1848181b) {
      encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormTermsOfServiceAcceptanceX1848181b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CheckoutSessionsPostRequestFormTermsOfServiceAcceptanceX1848181b(element: JsonElement): InlineV1CheckoutSessionsPostRequestFormTermsOfServiceAcceptanceX1848181bInspection {
  val matchesInlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf1Xf5625044 = element.isJsonDecodable<InlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf1Xf5625044>()
  val matchesInlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf2X470283cc = element.isJsonDecodable<InlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf2X470283cc>()
  return InlineV1CheckoutSessionsPostRequestFormTermsOfServiceAcceptanceX1848181bInspection(
    matchesInlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf1Xf5625044 = matchesInlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf1Xf5625044,
    matchesInlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf2X470283cc = matchesInlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf2X470283cc,
    failures = buildList {
      if (!matchesInlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf1Xf5625044) add("InlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf1Xf5625044: value does not match InlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf1Xf5625044")
      if (!matchesInlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf2X470283cc) add("InlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf2X470283cc: value does not match InlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf2X470283cc")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
