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

public enum class InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenX78f1caadBranch {
  Branch1,
  InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf2Xdff54bd1,
}

public sealed class InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenX78f1caadDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenX78f1caadNoMatchException(
  message: String,
) : InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenX78f1caadDecodingException(message)

internal data class InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenX78f1caadInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf2Xdff54bd1:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf2Xdff54bd1).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/verifone_ux700/properties/splashscreen.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/verifone_ux700/properties/splashscreen
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenX78f1caad.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenX78f1caad internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenX78f1caadInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf2Xdff54bd1:
      InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf2Xdff54bd1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf2Xdff54bd1) json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf2Xdff54bd1>(raw) else null }

  public val matchedBranches:
      Set<InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenX78f1caadBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenX78f1caadBranch.Branch1)
      if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf2Xdff54bd1) add(InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenX78f1caadBranch.InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf2Xdff54bd1)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenX78f1caad {
      val inspection = inspectInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenX78f1caad(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenX78f1caadNoMatchException("InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenX78f1caad matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenX78f1caad(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenX78f1caad> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenX78f1caad {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenX78f1caad")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenX78f1caad) {
      encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenX78f1caad").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenX78f1caad(element: JsonElement): InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenX78f1caadInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf2Xdff54bd1 = element.isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf2Xdff54bd1>()
  return InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700SplashscreenX78f1caadInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf2Xdff54bd1 = matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf2Xdff54bd1,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf2Xdff54bd1) add("InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf2Xdff54bd1: value does not match InlineV1TerminalConfigurationsPostRequestFormVerifoneUx700AnyOf2Xdff54bd1")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
