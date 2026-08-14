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

public enum class InlineV1TerminalConfigurationsPostRequestFormStripeS700Xd691cbe3Branch {
  InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1Xd8b7a966,
  InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2X82c9c431,
}

public sealed class InlineV1TerminalConfigurationsPostRequestFormStripeS700Xd691cbe3DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TerminalConfigurationsPostRequestFormStripeS700Xd691cbe3NoMatchException(
  message: String,
) : InlineV1TerminalConfigurationsPostRequestFormStripeS700Xd691cbe3DecodingException(message)

internal data class InlineV1TerminalConfigurationsPostRequestFormStripeS700Xd691cbe3Inspection(
  public val matchesInlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1Xd8b7a966: Boolean,
  public val matchesInlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2X82c9c431: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1Xd8b7a966, matchesInlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2X82c9c431).count { it }
}

/**
 * An object containing device type specific settings for Stripe S700 readers.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/stripe_s700
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormStripeS700Xd691cbe3.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormStripeS700Xd691cbe3 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1TerminalConfigurationsPostRequestFormStripeS700Xd691cbe3Inspection,
) {
  public val inlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1Xd8b7a966:
      InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1Xd8b7a966? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1Xd8b7a966) json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1Xd8b7a966>(raw) else null }

  public val inlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2X82c9c431:
      InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2X82c9c431? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2X82c9c431) json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2X82c9c431>(raw) else null }

  public val matchedBranches:
      Set<InlineV1TerminalConfigurationsPostRequestFormStripeS700Xd691cbe3Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1Xd8b7a966) add(InlineV1TerminalConfigurationsPostRequestFormStripeS700Xd691cbe3Branch.InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1Xd8b7a966)
      if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2X82c9c431) add(InlineV1TerminalConfigurationsPostRequestFormStripeS700Xd691cbe3Branch.InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2X82c9c431)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TerminalConfigurationsPostRequestFormStripeS700Xd691cbe3 {
      val inspection = inspectInlineV1TerminalConfigurationsPostRequestFormStripeS700Xd691cbe3(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TerminalConfigurationsPostRequestFormStripeS700Xd691cbe3NoMatchException("InlineV1TerminalConfigurationsPostRequestFormStripeS700Xd691cbe3 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TerminalConfigurationsPostRequestFormStripeS700Xd691cbe3(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormStripeS700Xd691cbe3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormStripeS700Xd691cbe3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormStripeS700Xd691cbe3")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormStripeS700Xd691cbe3) {
      encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormStripeS700Xd691cbe3").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TerminalConfigurationsPostRequestFormStripeS700Xd691cbe3(element: JsonElement): InlineV1TerminalConfigurationsPostRequestFormStripeS700Xd691cbe3Inspection {
  val matchesInlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1Xd8b7a966 = element.isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1Xd8b7a966>()
  val matchesInlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2X82c9c431 = element.isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2X82c9c431>()
  return InlineV1TerminalConfigurationsPostRequestFormStripeS700Xd691cbe3Inspection(
    matchesInlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1Xd8b7a966 = matchesInlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1Xd8b7a966,
    matchesInlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2X82c9c431 = matchesInlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2X82c9c431,
    failures = buildList {
      if (!matchesInlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1Xd8b7a966) add("InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1Xd8b7a966: value does not match InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1Xd8b7a966")
      if (!matchesInlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2X82c9c431) add("InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2X82c9c431: value does not match InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2X82c9c431")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
