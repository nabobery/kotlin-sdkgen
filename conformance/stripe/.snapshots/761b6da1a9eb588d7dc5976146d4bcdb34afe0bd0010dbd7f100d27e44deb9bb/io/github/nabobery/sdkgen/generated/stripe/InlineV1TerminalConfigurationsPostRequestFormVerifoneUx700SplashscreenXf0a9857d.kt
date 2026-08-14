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

public enum class InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenXf0a9857dBranch {
  Branch1,
  InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1AnyOf2X87fc9717,
}

public sealed class InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenXf0a9857dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenXf0a9857dNoMatchException(
  message: String,
) : InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenXf0a9857dDecodingException(message)

internal data class InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenXf0a9857dInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1AnyOf2X87fc9717:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1AnyOf2X87fc9717).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/verifone_ux700/anyOf/0/properties/splashscreen.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/verifone_ux700/anyOf/0/properties/splashscreen
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenXf0a9857d.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenXf0a9857d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenXf0a9857dInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1AnyOf2X87fc9717:
      InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1AnyOf2X87fc9717? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1AnyOf2X87fc9717) json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1AnyOf2X87fc9717>(raw) else null }

  public val matchedBranches:
      Set<InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenXf0a9857dBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenXf0a9857dBranch.Branch1)
      if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1AnyOf2X87fc9717) add(InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenXf0a9857dBranch.InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1AnyOf2X87fc9717)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenXf0a9857d {
      val inspection = inspectInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenXf0a9857d(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenXf0a9857dNoMatchException("InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenXf0a9857d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenXf0a9857d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenXf0a9857d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenXf0a9857d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenXf0a9857d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenXf0a9857d) {
      encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenXf0a9857d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenXf0a9857d(element: JsonElement): InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenXf0a9857dInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1AnyOf2X87fc9717 = element.isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1AnyOf2X87fc9717>()
  return InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenXf0a9857dInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1AnyOf2X87fc9717 = matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1AnyOf2X87fc9717,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1AnyOf2X87fc9717) add("InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1AnyOf2X87fc9717: value does not match InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf1AnyOf2X87fc9717")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
