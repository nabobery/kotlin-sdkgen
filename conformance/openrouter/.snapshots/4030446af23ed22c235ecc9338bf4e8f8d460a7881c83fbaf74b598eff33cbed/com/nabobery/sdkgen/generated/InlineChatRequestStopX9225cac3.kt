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

public enum class InlineChatRequestStopX9225cac3Branch {
  Branch1,
  Branch2,
  Branch3,
}

public sealed class InlineChatRequestStopX9225cac3DecodingException(
  message: String,
) : SerializationException(message)

public class InlineChatRequestStopX9225cac3NoMatchException(
  message: String,
) : InlineChatRequestStopX9225cac3DecodingException(message)

internal data class InlineChatRequestStopX9225cac3Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val matchesBranch3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2, matchesBranch3).count { it }
}

/**
 * Stop sequences (up to 4)
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatRequest/properties/stop
 */
@Serializable(with = InlineChatRequestStopX9225cac3.Serializer::class)
public class InlineChatRequestStopX9225cac3 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineChatRequestStopX9225cac3Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val branch2: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val branch3: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json.decodeFromJsonElement<JsonElement?>(raw) else null }

  public val matchedBranches: Set<InlineChatRequestStopX9225cac3Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineChatRequestStopX9225cac3Branch.Branch1)
      if (inspection.matchesBranch2) add(InlineChatRequestStopX9225cac3Branch.Branch2)
      if (inspection.matchesBranch3) add(InlineChatRequestStopX9225cac3Branch.Branch3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineChatRequestStopX9225cac3 {
      val inspection = inspectInlineChatRequestStopX9225cac3(raw)
      if (inspection.matchCount == 0) {
        throw InlineChatRequestStopX9225cac3NoMatchException("InlineChatRequestStopX9225cac3 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineChatRequestStopX9225cac3(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineChatRequestStopX9225cac3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineChatRequestStopX9225cac3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineChatRequestStopX9225cac3")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineChatRequestStopX9225cac3) {
      encoder.requireJsonEncoder("InlineChatRequestStopX9225cac3").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineChatRequestStopX9225cac3(element: JsonElement): InlineChatRequestStopX9225cac3Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 4 } == true
  val matchesBranch3 = element.isJsonDecodable<JsonElement?>()
  return InlineChatRequestStopX9225cac3Inspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    matchesBranch3 = matchesBranch3,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesBranch2) add("Branch2: value does not match List")
      if (!matchesBranch3) add("Branch3: value does not match JsonElement")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
