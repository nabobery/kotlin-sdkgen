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

public enum class InlineEasyInputMessageContentX288ec708Branch {
  Branch1,
  Branch2,
  Branch3,
}

public sealed class InlineEasyInputMessageContentX288ec708DecodingException(
  message: String,
) : SerializationException(message)

public class InlineEasyInputMessageContentX288ec708NoMatchException(
  message: String,
) : InlineEasyInputMessageContentX288ec708DecodingException(message)

internal data class InlineEasyInputMessageContentX288ec708Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val matchesBranch3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2, matchesBranch3).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/EasyInputMessage/properties/content.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/EasyInputMessage/properties/content
 */
@Serializable(with = InlineEasyInputMessageContentX288ec708.Serializer::class)
public class InlineEasyInputMessageContentX288ec708 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineEasyInputMessageContentX288ec708Inspection,
) {
  public val branch1: List<InlineEasyInputMessageContentAnyOf1ItemX4b243bfa>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineEasyInputMessageContentAnyOf1ItemX4b243bfa>>(raw) else null }

  public val branch2: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<String>(raw) else null }

  public val branch3: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json.decodeFromJsonElement<JsonElement?>(raw) else null }

  public val matchedBranches: Set<InlineEasyInputMessageContentX288ec708Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineEasyInputMessageContentX288ec708Branch.Branch1)
      if (inspection.matchesBranch2) add(InlineEasyInputMessageContentX288ec708Branch.Branch2)
      if (inspection.matchesBranch3) add(InlineEasyInputMessageContentX288ec708Branch.Branch3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineEasyInputMessageContentX288ec708 {
      val inspection = inspectInlineEasyInputMessageContentX288ec708(raw)
      if (inspection.matchCount == 0) {
        throw InlineEasyInputMessageContentX288ec708NoMatchException("InlineEasyInputMessageContentX288ec708 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineEasyInputMessageContentX288ec708(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineEasyInputMessageContentX288ec708> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEasyInputMessageContentX288ec708 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEasyInputMessageContentX288ec708")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineEasyInputMessageContentX288ec708) {
      encoder.requireJsonEncoder("InlineEasyInputMessageContentX288ec708").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineEasyInputMessageContentX288ec708(element: JsonElement): InlineEasyInputMessageContentX288ec708Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineEasyInputMessageContentAnyOf1ItemX4b243bfa>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesBranch2 = element.isJsonDecodable<String>()
  val matchesBranch3 = element.isJsonDecodable<JsonElement?>()
  return InlineEasyInputMessageContentX288ec708Inspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    matchesBranch3 = matchesBranch3,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesBranch2) add("Branch2: value does not match String")
      if (!matchesBranch3) add("Branch3: value does not match JsonElement")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
