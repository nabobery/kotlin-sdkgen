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

public enum class InlineV1TerminalConfigurationsPostRequestFormStripeS710X72a53b6dBranch {
  InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1X74d0686a,
  InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf2X6e0f7ef1,
}

public sealed class InlineV1TerminalConfigurationsPostRequestFormStripeS710X72a53b6dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TerminalConfigurationsPostRequestFormStripeS710X72a53b6dNoMatchException(
  message: String,
) : InlineV1TerminalConfigurationsPostRequestFormStripeS710X72a53b6dDecodingException(message)

internal data class InlineV1TerminalConfigurationsPostRequestFormStripeS710X72a53b6dInspection(
  public val matchesInlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1X74d0686a: Boolean,
  public val matchesInlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf2X6e0f7ef1: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1X74d0686a, matchesInlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf2X6e0f7ef1).count { it }
}

/**
 * An object containing device type specific settings for Stripe S710 readers.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/stripe_s710
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormStripeS710X72a53b6d.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormStripeS710X72a53b6d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1TerminalConfigurationsPostRequestFormStripeS710X72a53b6dInspection,
) {
  public val inlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1X74d0686a:
      InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1X74d0686a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1X74d0686a) json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1X74d0686a>(raw) else null }

  public val inlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf2X6e0f7ef1:
      InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf2X6e0f7ef1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf2X6e0f7ef1) json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf2X6e0f7ef1>(raw) else null }

  public val matchedBranches:
      Set<InlineV1TerminalConfigurationsPostRequestFormStripeS710X72a53b6dBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1X74d0686a) add(InlineV1TerminalConfigurationsPostRequestFormStripeS710X72a53b6dBranch.InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1X74d0686a)
      if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf2X6e0f7ef1) add(InlineV1TerminalConfigurationsPostRequestFormStripeS710X72a53b6dBranch.InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf2X6e0f7ef1)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TerminalConfigurationsPostRequestFormStripeS710X72a53b6d {
      val inspection = inspectInlineV1TerminalConfigurationsPostRequestFormStripeS710X72a53b6d(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TerminalConfigurationsPostRequestFormStripeS710X72a53b6dNoMatchException("InlineV1TerminalConfigurationsPostRequestFormStripeS710X72a53b6d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TerminalConfigurationsPostRequestFormStripeS710X72a53b6d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormStripeS710X72a53b6d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormStripeS710X72a53b6d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormStripeS710X72a53b6d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormStripeS710X72a53b6d) {
      encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormStripeS710X72a53b6d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TerminalConfigurationsPostRequestFormStripeS710X72a53b6d(element: JsonElement): InlineV1TerminalConfigurationsPostRequestFormStripeS710X72a53b6dInspection {
  val matchesInlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1X74d0686a = element.isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1X74d0686a>()
  val matchesInlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf2X6e0f7ef1 = element.isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf2X6e0f7ef1>()
  return InlineV1TerminalConfigurationsPostRequestFormStripeS710X72a53b6dInspection(
    matchesInlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1X74d0686a = matchesInlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1X74d0686a,
    matchesInlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf2X6e0f7ef1 = matchesInlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf2X6e0f7ef1,
    failures = buildList {
      if (!matchesInlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1X74d0686a) add("InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1X74d0686a: value does not match InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf1X74d0686a")
      if (!matchesInlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf2X6e0f7ef1) add("InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf2X6e0f7ef1: value does not match InlineV1TerminalConfigurationsPostRequestFormStripeS710AnyOf2X6e0f7ef1")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
