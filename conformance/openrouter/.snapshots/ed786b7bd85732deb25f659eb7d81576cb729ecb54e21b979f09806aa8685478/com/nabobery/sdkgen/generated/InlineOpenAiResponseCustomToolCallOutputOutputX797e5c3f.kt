package com.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineOpenAiResponseCustomToolCallOutputOutputX797e5c3fBranch {
  Branch1,
  Branch2,
}

public sealed class InlineOpenAiResponseCustomToolCallOutputOutputX797e5c3fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineOpenAiResponseCustomToolCallOutputOutputX797e5c3fNoMatchException(
  message: String,
) : InlineOpenAiResponseCustomToolCallOutputOutputX797e5c3fDecodingException(message)

internal data class InlineOpenAiResponseCustomToolCallOutputOutputX797e5c3fInspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseCustomToolCallOutput/properties/output.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OpenAIResponseCustomToolCallOutput/properties/output
 */
@Serializable(with = InlineOpenAiResponseCustomToolCallOutputOutputX797e5c3f.Serializer::class)
public class InlineOpenAiResponseCustomToolCallOutputOutputX797e5c3f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineOpenAiResponseCustomToolCallOutputOutputX797e5c3fInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val branch2: List<InlineOpenAiResponseCustomToolCallOutputOutputAnyOf2ItemXedfffab4>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<List<InlineOpenAiResponseCustomToolCallOutputOutputAnyOf2ItemXedfffab4>>(raw) else null }

  public val matchedBranches: Set<InlineOpenAiResponseCustomToolCallOutputOutputX797e5c3fBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineOpenAiResponseCustomToolCallOutputOutputX797e5c3fBranch.Branch1)
      if (inspection.matchesBranch2) add(InlineOpenAiResponseCustomToolCallOutputOutputX797e5c3fBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineOpenAiResponseCustomToolCallOutputOutputX797e5c3f {
      val inspection = inspectInlineOpenAiResponseCustomToolCallOutputOutputX797e5c3f(raw)
      if (inspection.matchCount == 0) {
        throw InlineOpenAiResponseCustomToolCallOutputOutputX797e5c3fNoMatchException("InlineOpenAiResponseCustomToolCallOutputOutputX797e5c3f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineOpenAiResponseCustomToolCallOutputOutputX797e5c3f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineOpenAiResponseCustomToolCallOutputOutputX797e5c3f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOpenAiResponseCustomToolCallOutputOutputX797e5c3f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOpenAiResponseCustomToolCallOutputOutputX797e5c3f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineOpenAiResponseCustomToolCallOutputOutputX797e5c3f) {
      encoder.requireJsonEncoder("InlineOpenAiResponseCustomToolCallOutputOutputX797e5c3f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineOpenAiResponseCustomToolCallOutputOutputX797e5c3f(element: JsonElement): InlineOpenAiResponseCustomToolCallOutputOutputX797e5c3fInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<List<InlineOpenAiResponseCustomToolCallOutputOutputAnyOf2ItemXedfffab4>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  return InlineOpenAiResponseCustomToolCallOutputOutputX797e5c3fInspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesBranch2) add("Branch2: value does not match List")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
