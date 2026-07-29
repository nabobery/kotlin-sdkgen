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

public enum class InlineV1RadarValueListItemsGetParameterXf7579e3aBranch {
  InlineV1RadarValueListItemsGetParameterAnyOf1Xa279ec1f,
  Branch2,
}

public sealed class InlineV1RadarValueListItemsGetParameterXf7579e3aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1RadarValueListItemsGetParameterXf7579e3aNoMatchException(
  message: String,
) : InlineV1RadarValueListItemsGetParameterXf7579e3aDecodingException(message)

internal data class InlineV1RadarValueListItemsGetParameterXf7579e3aInspection(
  public val matchesInlineV1RadarValueListItemsGetParameterAnyOf1Xa279ec1f: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1RadarValueListItemsGetParameterAnyOf1Xa279ec1f, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1radar~1value_list_items/get/parameters/0/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1radar~1value_list_items/get/parameters/0/schema
 */
@Serializable(with = InlineV1RadarValueListItemsGetParameterXf7579e3a.Serializer::class)
public class InlineV1RadarValueListItemsGetParameterXf7579e3a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1RadarValueListItemsGetParameterXf7579e3aInspection,
) {
  public val inlineV1RadarValueListItemsGetParameterAnyOf1Xa279ec1f:
      InlineV1RadarValueListItemsGetParameterAnyOf1Xa279ec1f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1RadarValueListItemsGetParameterAnyOf1Xa279ec1f) json.decodeFromJsonElement<InlineV1RadarValueListItemsGetParameterAnyOf1Xa279ec1f>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1RadarValueListItemsGetParameterXf7579e3aBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1RadarValueListItemsGetParameterAnyOf1Xa279ec1f) add(InlineV1RadarValueListItemsGetParameterXf7579e3aBranch.InlineV1RadarValueListItemsGetParameterAnyOf1Xa279ec1f)
      if (inspection.matchesBranch2) add(InlineV1RadarValueListItemsGetParameterXf7579e3aBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1RadarValueListItemsGetParameterXf7579e3a {
      val inspection = inspectInlineV1RadarValueListItemsGetParameterXf7579e3a(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1RadarValueListItemsGetParameterXf7579e3aNoMatchException("InlineV1RadarValueListItemsGetParameterXf7579e3a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1RadarValueListItemsGetParameterXf7579e3a(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1RadarValueListItemsGetParameterXf7579e3a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1RadarValueListItemsGetParameterXf7579e3a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1RadarValueListItemsGetParameterXf7579e3a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1RadarValueListItemsGetParameterXf7579e3a) {
      encoder.requireJsonEncoder("InlineV1RadarValueListItemsGetParameterXf7579e3a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1RadarValueListItemsGetParameterXf7579e3a(element: JsonElement): InlineV1RadarValueListItemsGetParameterXf7579e3aInspection {
  val matchesInlineV1RadarValueListItemsGetParameterAnyOf1Xa279ec1f = element.isJsonDecodable<InlineV1RadarValueListItemsGetParameterAnyOf1Xa279ec1f>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1RadarValueListItemsGetParameterXf7579e3aInspection(
    matchesInlineV1RadarValueListItemsGetParameterAnyOf1Xa279ec1f = matchesInlineV1RadarValueListItemsGetParameterAnyOf1Xa279ec1f,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1RadarValueListItemsGetParameterAnyOf1Xa279ec1f) add("InlineV1RadarValueListItemsGetParameterAnyOf1Xa279ec1f: value does not match InlineV1RadarValueListItemsGetParameterAnyOf1Xa279ec1f")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
