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

public enum class InlineV1AccountsGetParameterXaa6c7ce8Branch {
  InlineV1AccountsGetParameterAnyOf1X8ca202e1,
  Branch2,
}

public sealed class InlineV1AccountsGetParameterXaa6c7ce8DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsGetParameterXaa6c7ce8NoMatchException(
  message: String,
) : InlineV1AccountsGetParameterXaa6c7ce8DecodingException(message)

internal data class InlineV1AccountsGetParameterXaa6c7ce8Inspection(
  public val matchesInlineV1AccountsGetParameterAnyOf1X8ca202e1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1AccountsGetParameterAnyOf1X8ca202e1, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1accounts/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1accounts/get/parameters/0/schema
 */
@Serializable(with = InlineV1AccountsGetParameterXaa6c7ce8.Serializer::class)
public class InlineV1AccountsGetParameterXaa6c7ce8 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1AccountsGetParameterXaa6c7ce8Inspection,
) {
  public val inlineV1AccountsGetParameterAnyOf1X8ca202e1:
      InlineV1AccountsGetParameterAnyOf1X8ca202e1? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsGetParameterAnyOf1X8ca202e1) json.decodeFromJsonElement<InlineV1AccountsGetParameterAnyOf1X8ca202e1>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1AccountsGetParameterXaa6c7ce8Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1AccountsGetParameterAnyOf1X8ca202e1) add(InlineV1AccountsGetParameterXaa6c7ce8Branch.InlineV1AccountsGetParameterAnyOf1X8ca202e1)
      if (inspection.matchesBranch2) add(InlineV1AccountsGetParameterXaa6c7ce8Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsGetParameterXaa6c7ce8 {
      val inspection = inspectInlineV1AccountsGetParameterXaa6c7ce8(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsGetParameterXaa6c7ce8NoMatchException("InlineV1AccountsGetParameterXaa6c7ce8 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsGetParameterXaa6c7ce8(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1AccountsGetParameterXaa6c7ce8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsGetParameterXaa6c7ce8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsGetParameterXaa6c7ce8")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsGetParameterXaa6c7ce8) {
      encoder.requireJsonEncoder("InlineV1AccountsGetParameterXaa6c7ce8").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsGetParameterXaa6c7ce8(element: JsonElement): InlineV1AccountsGetParameterXaa6c7ce8Inspection {
  val matchesInlineV1AccountsGetParameterAnyOf1X8ca202e1 = element.isJsonDecodable<InlineV1AccountsGetParameterAnyOf1X8ca202e1>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1AccountsGetParameterXaa6c7ce8Inspection(
    matchesInlineV1AccountsGetParameterAnyOf1X8ca202e1 = matchesInlineV1AccountsGetParameterAnyOf1X8ca202e1,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1AccountsGetParameterAnyOf1X8ca202e1) add("InlineV1AccountsGetParameterAnyOf1X8ca202e1: value does not match InlineV1AccountsGetParameterAnyOf1X8ca202e1")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
