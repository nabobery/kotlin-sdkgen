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

public enum class InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX7fce3d6fBranch {
  Branch1,
  InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1AnyOf2X65697ce9,
}

public sealed class InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX7fce3d6fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX7fce3d6fNoMatchException(
  message: String,
) : InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX7fce3d6fDecodingException(message)

internal data class InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX7fce3d6fInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1AnyOf2X65697ce9:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1AnyOf2X65697ce9).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/verifone_p400/anyOf/0/properties/splashscreen.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/verifone_p400/anyOf/0/properties/splashscreen
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX7fce3d6f.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX7fce3d6f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX7fce3d6fInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1AnyOf2X65697ce9:
      InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1AnyOf2X65697ce9? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1AnyOf2X65697ce9) json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1AnyOf2X65697ce9>(raw) else null }

  public val matchedBranches:
      Set<InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX7fce3d6fBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX7fce3d6fBranch.Branch1)
      if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1AnyOf2X65697ce9) add(InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX7fce3d6fBranch.InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1AnyOf2X65697ce9)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX7fce3d6f {
      val inspection = inspectInlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX7fce3d6f(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX7fce3d6fNoMatchException("InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX7fce3d6f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX7fce3d6f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX7fce3d6f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX7fce3d6f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX7fce3d6f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX7fce3d6f) {
      encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX7fce3d6f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX7fce3d6f(element: JsonElement): InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX7fce3d6fInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1AnyOf2X65697ce9 = element.isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1AnyOf2X65697ce9>()
  return InlineV1TerminalConfigurationsPostRequestFormVerifoneP400SplashscreenX7fce3d6fInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1AnyOf2X65697ce9 = matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1AnyOf2X65697ce9,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1AnyOf2X65697ce9) add("InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1AnyOf2X65697ce9: value does not match InlineV1TerminalConfigurationsPostRequestFormVerifoneP400AnyOf1AnyOf2X65697ce9")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
