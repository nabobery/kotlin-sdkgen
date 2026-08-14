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

public enum class InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX7b182895Branch {
  InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1X10ef7706,
  InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf2X4fc6f44e,
}

public sealed class InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX7b182895DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX7b182895NoMatchException(
  message: String,
) : InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX7b182895DecodingException(message)

internal data class InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX7b182895Inspection(
  public val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1X10ef7706:
      Boolean,
  public val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf2X4fc6f44e:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1X10ef7706, matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf2X4fc6f44e).count { it }
}

/**
 * An object containing device type specific settings for Verifone V660p readers.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1configurations~1{configuration}/post/requestBody/content/applicat
 * ion~1x-www-form-urlencoded/schema/properties/verifone_v660p
 */
@Serializable(with = InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX7b182895.Serializer::class)
public class InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX7b182895 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX7b182895Inspection,
) {
  public val inlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1X10ef7706:
      InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1X10ef7706? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1X10ef7706) json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1X10ef7706>(raw) else null }

  public val inlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf2X4fc6f44e:
      InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf2X4fc6f44e? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf2X4fc6f44e) json.decodeFromJsonElement<InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf2X4fc6f44e>(raw) else null }

  public val matchedBranches:
      Set<InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX7b182895Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1X10ef7706) add(InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX7b182895Branch.InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1X10ef7706)
      if (inspection.matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf2X4fc6f44e) add(InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX7b182895Branch.InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf2X4fc6f44e)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX7b182895 {
      val inspection = inspectInlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX7b182895(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX7b182895NoMatchException("InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX7b182895 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX7b182895(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX7b182895> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX7b182895 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX7b182895")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX7b182895) {
      encoder.requireJsonEncoder("InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX7b182895").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX7b182895(element: JsonElement): InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX7b182895Inspection {
  val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1X10ef7706 = element.isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1X10ef7706>()
  val matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf2X4fc6f44e = element.isJsonDecodable<InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf2X4fc6f44e>()
  return InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pX7b182895Inspection(
    matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1X10ef7706 = matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1X10ef7706,
    matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf2X4fc6f44e = matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf2X4fc6f44e,
    failures = buildList {
      if (!matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1X10ef7706) add("InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1X10ef7706: value does not match InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf1X10ef7706")
      if (!matchesInlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf2X4fc6f44e) add("InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf2X4fc6f44e: value does not match InlineV1TerminalConfigurationsPostRequestFormVerifoneV660pAnyOf2X4fc6f44e")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
