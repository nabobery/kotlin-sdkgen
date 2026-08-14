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

public enum class InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenX91e022ddBranch {
  Branch1,
  InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2Xe4118009,
}

public sealed class InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenX91e022ddDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenX91e022ddNoMatchException(
  message: String,
) : InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenX91e022ddDecodingException(message)

internal data class InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenX91e022ddInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2Xe4118009: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2Xe4118009).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/stripe_s700/properties/splashscreen.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/stripe_s700/properties/splashscreen
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenX91e022dd.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenX91e022dd internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenX91e022ddInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2Xe4118009:
      InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2Xe4118009? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2Xe4118009) json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2Xe4118009>(raw) else null }

  public val matchedBranches:
      Set<InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenX91e022ddBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenX91e022ddBranch.Branch1)
      if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2Xe4118009) add(InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenX91e022ddBranch.InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2Xe4118009)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenX91e022dd {
      val inspection = inspectInlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenX91e022dd(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenX91e022ddNoMatchException("InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenX91e022dd matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenX91e022dd(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenX91e022dd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenX91e022dd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenX91e022dd")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenX91e022dd) {
      encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenX91e022dd").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenX91e022dd(element: JsonElement): InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenX91e022ddInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2Xe4118009 = element.isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2Xe4118009>()
  return InlineV1TerminalConfigurationsPostRequestFormStripeS700SplashscreenX91e022ddInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2Xe4118009 = matchesInlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2Xe4118009,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2Xe4118009) add("InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2Xe4118009: value does not match InlineV1TerminalConfigurationsPostRequestFormStripeS700AnyOf2Xe4118009")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
