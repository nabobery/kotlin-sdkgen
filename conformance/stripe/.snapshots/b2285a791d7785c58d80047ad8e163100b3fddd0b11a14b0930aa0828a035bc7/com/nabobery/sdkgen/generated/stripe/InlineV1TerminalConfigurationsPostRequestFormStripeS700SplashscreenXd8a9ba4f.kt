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

public enum class InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenXd8a9ba4fBranch {
  Branch1,
  InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1AnyOf2X39ae4730,
}

public sealed class InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenXd8a9ba4fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenXd8a9ba4fNoMatchException(
  message: String,
) : InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenXd8a9ba4fDecodingException(message)

internal data class InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenXd8a9ba4fInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1AnyOf2X39ae4730:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1AnyOf2X39ae4730).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/stripe_s700/anyOf/0/properties/splashscreen.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/stripe_s700/anyOf/0/properties/splashscreen
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenXd8a9ba4f.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenXd8a9ba4f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenXd8a9ba4fInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1AnyOf2X39ae4730:
      InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1AnyOf2X39ae4730? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1AnyOf2X39ae4730) json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1AnyOf2X39ae4730>(raw) else null }

  public val matchedBranches:
      Set<InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenXd8a9ba4fBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenXd8a9ba4fBranch.Branch1)
      if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1AnyOf2X39ae4730) add(InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenXd8a9ba4fBranch.InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1AnyOf2X39ae4730)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenXd8a9ba4f {
      val inspection = inspectInlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenXd8a9ba4f(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenXd8a9ba4fNoMatchException("InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenXd8a9ba4f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenXd8a9ba4f(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenXd8a9ba4f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenXd8a9ba4f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenXd8a9ba4f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenXd8a9ba4f) {
      encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenXd8a9ba4f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenXd8a9ba4f(element: JsonElement): InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenXd8a9ba4fInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1AnyOf2X39ae4730 = element.isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1AnyOf2X39ae4730>()
  return InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenXd8a9ba4fInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1AnyOf2X39ae4730 = matchesInlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1AnyOf2X39ae4730,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1AnyOf2X39ae4730) add("InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1AnyOf2X39ae4730: value does not match InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf1AnyOf2X39ae4730")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
