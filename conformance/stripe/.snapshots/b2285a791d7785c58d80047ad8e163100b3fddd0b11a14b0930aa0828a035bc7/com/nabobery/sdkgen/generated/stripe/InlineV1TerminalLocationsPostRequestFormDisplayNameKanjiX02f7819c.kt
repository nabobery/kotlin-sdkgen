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

public enum class InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiX02f7819cBranch {
  Branch1,
  InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiAnyOf2Xa4ad03ef,
}

public sealed class InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiX02f7819cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiX02f7819cNoMatchException(
  message: String,
) : InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiX02f7819cDecodingException(message)

internal data class InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiX02f7819cInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1TerminalLocationsPostRequestFormDisplayNameKanjiAnyOf2Xa4ad03ef:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1TerminalLocationsPostRequestFormDisplayNameKanjiAnyOf2Xa4ad03ef).count { it }
}

/**
 * The Kanji variation of the name for the location (Japan only).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1locations~1{location}/post/requestBody/content/application~1x-www
 * -form-urlencoded/schema/properties/display_name_kanji
 */
@Serializable(with = InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiX02f7819c.Serializer::class)
public class InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiX02f7819c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiX02f7819cInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1TerminalLocationsPostRequestFormDisplayNameKanjiAnyOf2Xa4ad03ef:
      InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiAnyOf2Xa4ad03ef? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalLocationsPostRequestFormDisplayNameKanjiAnyOf2Xa4ad03ef) json.decodeFromJsonElement<InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiAnyOf2Xa4ad03ef>(raw) else null }

  public val matchedBranches:
      Set<InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiX02f7819cBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiX02f7819cBranch.Branch1)
      if (inspection.matchesInlineV1TerminalLocationsPostRequestFormDisplayNameKanjiAnyOf2Xa4ad03ef) add(InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiX02f7819cBranch.InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiAnyOf2Xa4ad03ef)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiX02f7819c {
      val inspection = inspectInlineV1TerminalLocationsPostRequestFormDisplayNameKanjiX02f7819c(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiX02f7819cNoMatchException("InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiX02f7819c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiX02f7819c(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiX02f7819c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiX02f7819c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiX02f7819c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiX02f7819c) {
      encoder.requireJsonEncoder("InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiX02f7819c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TerminalLocationsPostRequestFormDisplayNameKanjiX02f7819c(element: JsonElement): InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiX02f7819cInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1TerminalLocationsPostRequestFormDisplayNameKanjiAnyOf2Xa4ad03ef = element.isJsonDecodable<InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiAnyOf2Xa4ad03ef>()
  return InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiX02f7819cInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1TerminalLocationsPostRequestFormDisplayNameKanjiAnyOf2Xa4ad03ef = matchesInlineV1TerminalLocationsPostRequestFormDisplayNameKanjiAnyOf2Xa4ad03ef,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1TerminalLocationsPostRequestFormDisplayNameKanjiAnyOf2Xa4ad03ef) add("InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiAnyOf2Xa4ad03ef: value does not match InlineV1TerminalLocationsPostRequestFormDisplayNameKanjiAnyOf2Xa4ad03ef")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
