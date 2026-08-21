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

public enum class InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX79af0e46Branch {
  Branch1,
  InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1AnyOf2Xfd133b67,
}

public sealed class InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX79af0e46DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX79af0e46NoMatchException(
  message: String,
) : InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX79af0e46DecodingException(message)

internal data class InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX79af0e46Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1AnyOf2Xfd133b67:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1AnyOf2Xfd133b67).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/verifone_p630/anyOf/0/properties/splashscreen.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/verifone_p630/anyOf/0/properties/splashscreen
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX79af0e46.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX79af0e46 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX79af0e46Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1AnyOf2Xfd133b67:
      InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1AnyOf2Xfd133b67? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1AnyOf2Xfd133b67) json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1AnyOf2Xfd133b67>(raw) else null }

  public val matchedBranches:
      Set<InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX79af0e46Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX79af0e46Branch.Branch1)
      if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1AnyOf2Xfd133b67) add(InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX79af0e46Branch.InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1AnyOf2Xfd133b67)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX79af0e46 {
      val inspection = inspectInlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX79af0e46(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX79af0e46NoMatchException("InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX79af0e46 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX79af0e46(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX79af0e46> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX79af0e46 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX79af0e46")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX79af0e46) {
      encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX79af0e46").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX79af0e46(element: JsonElement): InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX79af0e46Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1AnyOf2Xfd133b67 = element.isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1AnyOf2Xfd133b67>()
  return InlineV1TerminalConfigurationsPostRequestFormVerifoneP630SplashscreenX79af0e46Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1AnyOf2Xfd133b67 = matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1AnyOf2Xfd133b67,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1AnyOf2Xfd133b67) add("InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1AnyOf2Xfd133b67: value does not match InlineV1TerminalConfigurationsPostRequestFormVerifoneP630AnyOf1AnyOf2Xfd133b67")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
