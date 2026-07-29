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

public enum class InlineV1TopupsGetParameterXf8186291Branch {
  InlineV1TopupsGetParameterAnyOf1X6f1fa7e2,
  Branch2,
}

public sealed class InlineV1TopupsGetParameterXf8186291DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TopupsGetParameterXf8186291NoMatchException(
  message: String,
) : InlineV1TopupsGetParameterXf8186291DecodingException(message)

internal data class InlineV1TopupsGetParameterXf8186291Inspection(
  public val matchesInlineV1TopupsGetParameterAnyOf1X6f1fa7e2: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1TopupsGetParameterAnyOf1X6f1fa7e2, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1topups/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1topups/get/parameters/0/schema
 */
@Serializable(with = InlineV1TopupsGetParameterXf8186291.Serializer::class)
public class InlineV1TopupsGetParameterXf8186291 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TopupsGetParameterXf8186291Inspection,
) {
  public val inlineV1TopupsGetParameterAnyOf1X6f1fa7e2: InlineV1TopupsGetParameterAnyOf1X6f1fa7e2?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TopupsGetParameterAnyOf1X6f1fa7e2) json.decodeFromJsonElement<InlineV1TopupsGetParameterAnyOf1X6f1fa7e2>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1TopupsGetParameterXf8186291Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1TopupsGetParameterAnyOf1X6f1fa7e2) add(InlineV1TopupsGetParameterXf8186291Branch.InlineV1TopupsGetParameterAnyOf1X6f1fa7e2)
      if (inspection.matchesBranch2) add(InlineV1TopupsGetParameterXf8186291Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TopupsGetParameterXf8186291 {
      val inspection = inspectInlineV1TopupsGetParameterXf8186291(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TopupsGetParameterXf8186291NoMatchException("InlineV1TopupsGetParameterXf8186291 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TopupsGetParameterXf8186291(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1TopupsGetParameterXf8186291> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TopupsGetParameterXf8186291 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TopupsGetParameterXf8186291")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TopupsGetParameterXf8186291) {
      encoder.requireJsonEncoder("InlineV1TopupsGetParameterXf8186291").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TopupsGetParameterXf8186291(element: JsonElement): InlineV1TopupsGetParameterXf8186291Inspection {
  val matchesInlineV1TopupsGetParameterAnyOf1X6f1fa7e2 = element.isJsonDecodable<InlineV1TopupsGetParameterAnyOf1X6f1fa7e2>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1TopupsGetParameterXf8186291Inspection(
    matchesInlineV1TopupsGetParameterAnyOf1X6f1fa7e2 = matchesInlineV1TopupsGetParameterAnyOf1X6f1fa7e2,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1TopupsGetParameterAnyOf1X6f1fa7e2) add("InlineV1TopupsGetParameterAnyOf1X6f1fa7e2: value does not match InlineV1TopupsGetParameterAnyOf1X6f1fa7e2")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
