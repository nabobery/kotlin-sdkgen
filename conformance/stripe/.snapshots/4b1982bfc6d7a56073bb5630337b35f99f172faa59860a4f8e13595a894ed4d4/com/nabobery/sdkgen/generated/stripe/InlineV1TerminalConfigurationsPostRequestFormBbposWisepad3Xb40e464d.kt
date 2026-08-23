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

public enum class InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xb40e464dBranch {
  InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1X3ec9b4cf,
  InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf2Xa20c8659,
}

public sealed class InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xb40e464dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xb40e464dNoMatchException(
  message: String,
) : InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xb40e464dDecodingException(message)

internal data class InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xb40e464dInspection(
  public val matchesInlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1X3ec9b4cf:
      Boolean,
  public val matchesInlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf2Xa20c8659:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1X3ec9b4cf, matchesInlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf2Xa20c8659).count { it }
}

/**
 * An object containing device type specific settings for BBPOS WisePad 3 readers.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/bbpos_wisepad3
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xb40e464d.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xb40e464d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xb40e464dInspection,
) {
  public val inlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1X3ec9b4cf:
      InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1X3ec9b4cf? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1X3ec9b4cf) json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1X3ec9b4cf>(raw) else null }

  public val inlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf2Xa20c8659:
      InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf2Xa20c8659? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf2Xa20c8659) json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf2Xa20c8659>(raw) else null }

  public val matchedBranches:
      Set<InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xb40e464dBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1X3ec9b4cf) add(InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xb40e464dBranch.InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1X3ec9b4cf)
      if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf2Xa20c8659) add(InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xb40e464dBranch.InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf2Xa20c8659)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xb40e464d {
      val inspection = inspectInlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xb40e464d(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xb40e464dNoMatchException("InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xb40e464d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xb40e464d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xb40e464d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xb40e464d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xb40e464d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xb40e464d) {
      encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xb40e464d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xb40e464d(element: JsonElement): InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xb40e464dInspection {
  val matchesInlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1X3ec9b4cf = element.isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1X3ec9b4cf>()
  val matchesInlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf2Xa20c8659 = element.isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf2Xa20c8659>()
  return InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3Xb40e464dInspection(
    matchesInlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1X3ec9b4cf = matchesInlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1X3ec9b4cf,
    matchesInlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf2Xa20c8659 = matchesInlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf2Xa20c8659,
    failures = buildList {
      if (!matchesInlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1X3ec9b4cf) add("InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1X3ec9b4cf: value does not match InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf1X3ec9b4cf")
      if (!matchesInlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf2Xa20c8659) add("InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf2Xa20c8659: value does not match InlineV1TerminalConfigurationsPostRequestFormBbposWisepad3AnyOf2Xa20c8659")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
