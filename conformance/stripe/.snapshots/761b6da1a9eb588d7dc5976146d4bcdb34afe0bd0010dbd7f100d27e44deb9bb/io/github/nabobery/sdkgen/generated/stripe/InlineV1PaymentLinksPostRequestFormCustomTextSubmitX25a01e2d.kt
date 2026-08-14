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

public enum class InlineV1PaymentLinksPostRequestFormCustomTextSubmitX25a01e2dBranch {
  InlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf1Xe8dc1b0f,
  InlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf2X89717e7a,
}

public sealed class InlineV1PaymentLinksPostRequestFormCustomTextSubmitX25a01e2dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentLinksPostRequestFormCustomTextSubmitX25a01e2dNoMatchException(
  message: String,
) : InlineV1PaymentLinksPostRequestFormCustomTextSubmitX25a01e2dDecodingException(message)

internal data class InlineV1PaymentLinksPostRequestFormCustomTextSubmitX25a01e2dInspection(
  public val matchesInlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf1Xe8dc1b0f: Boolean,
  public val matchesInlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf2X89717e7a: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf1Xe8dc1b0f, matchesInlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf2X89717e7a).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/custom_text/properties/submit.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/custom_text/properties/submit
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormCustomTextSubmitX25a01e2d.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormCustomTextSubmitX25a01e2d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PaymentLinksPostRequestFormCustomTextSubmitX25a01e2dInspection,
) {
  public val inlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf1Xe8dc1b0f:
      InlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf1Xe8dc1b0f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf1Xe8dc1b0f) json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf1Xe8dc1b0f>(raw) else null }

  public val inlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf2X89717e7a:
      InlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf2X89717e7a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf2X89717e7a) json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf2X89717e7a>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentLinksPostRequestFormCustomTextSubmitX25a01e2dBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf1Xe8dc1b0f) add(InlineV1PaymentLinksPostRequestFormCustomTextSubmitX25a01e2dBranch.InlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf1Xe8dc1b0f)
      if (inspection.matchesInlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf2X89717e7a) add(InlineV1PaymentLinksPostRequestFormCustomTextSubmitX25a01e2dBranch.InlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf2X89717e7a)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentLinksPostRequestFormCustomTextSubmitX25a01e2d {
      val inspection = inspectInlineV1PaymentLinksPostRequestFormCustomTextSubmitX25a01e2d(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentLinksPostRequestFormCustomTextSubmitX25a01e2dNoMatchException("InlineV1PaymentLinksPostRequestFormCustomTextSubmitX25a01e2d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentLinksPostRequestFormCustomTextSubmitX25a01e2d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormCustomTextSubmitX25a01e2d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormCustomTextSubmitX25a01e2d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormCustomTextSubmitX25a01e2d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormCustomTextSubmitX25a01e2d) {
      encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormCustomTextSubmitX25a01e2d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentLinksPostRequestFormCustomTextSubmitX25a01e2d(element: JsonElement): InlineV1PaymentLinksPostRequestFormCustomTextSubmitX25a01e2dInspection {
  val matchesInlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf1Xe8dc1b0f = element.isJsonDecodable<InlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf1Xe8dc1b0f>()
  val matchesInlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf2X89717e7a = element.isJsonDecodable<InlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf2X89717e7a>()
  return InlineV1PaymentLinksPostRequestFormCustomTextSubmitX25a01e2dInspection(
    matchesInlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf1Xe8dc1b0f = matchesInlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf1Xe8dc1b0f,
    matchesInlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf2X89717e7a = matchesInlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf2X89717e7a,
    failures = buildList {
      if (!matchesInlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf1Xe8dc1b0f) add("InlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf1Xe8dc1b0f: value does not match InlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf1Xe8dc1b0f")
      if (!matchesInlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf2X89717e7a) add("InlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf2X89717e7a: value does not match InlineV1PaymentLinksPostRequestFormCustomTextSubmitAnyOf2X89717e7a")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
