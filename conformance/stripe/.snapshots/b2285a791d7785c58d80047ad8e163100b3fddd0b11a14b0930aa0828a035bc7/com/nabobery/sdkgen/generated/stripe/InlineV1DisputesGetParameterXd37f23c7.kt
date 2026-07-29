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

public enum class InlineV1DisputesGetParameterXd37f23c7Branch {
  InlineV1DisputesGetParameterAnyOf1X6a56077b,
  Branch2,
}

public sealed class InlineV1DisputesGetParameterXd37f23c7DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1DisputesGetParameterXd37f23c7NoMatchException(
  message: String,
) : InlineV1DisputesGetParameterXd37f23c7DecodingException(message)

internal data class InlineV1DisputesGetParameterXd37f23c7Inspection(
  public val matchesInlineV1DisputesGetParameterAnyOf1X6a56077b: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1DisputesGetParameterAnyOf1X6a56077b, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1disputes/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1disputes/get/parameters/1/schema
 */
@Serializable(with = InlineV1DisputesGetParameterXd37f23c7.Serializer::class)
public class InlineV1DisputesGetParameterXd37f23c7 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1DisputesGetParameterXd37f23c7Inspection,
) {
  public val inlineV1DisputesGetParameterAnyOf1X6a56077b:
      InlineV1DisputesGetParameterAnyOf1X6a56077b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1DisputesGetParameterAnyOf1X6a56077b) json.decodeFromJsonElement<InlineV1DisputesGetParameterAnyOf1X6a56077b>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1DisputesGetParameterXd37f23c7Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1DisputesGetParameterAnyOf1X6a56077b) add(InlineV1DisputesGetParameterXd37f23c7Branch.InlineV1DisputesGetParameterAnyOf1X6a56077b)
      if (inspection.matchesBranch2) add(InlineV1DisputesGetParameterXd37f23c7Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1DisputesGetParameterXd37f23c7 {
      val inspection = inspectInlineV1DisputesGetParameterXd37f23c7(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1DisputesGetParameterXd37f23c7NoMatchException("InlineV1DisputesGetParameterXd37f23c7 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1DisputesGetParameterXd37f23c7(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1DisputesGetParameterXd37f23c7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1DisputesGetParameterXd37f23c7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1DisputesGetParameterXd37f23c7")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1DisputesGetParameterXd37f23c7) {
      encoder.requireJsonEncoder("InlineV1DisputesGetParameterXd37f23c7").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1DisputesGetParameterXd37f23c7(element: JsonElement): InlineV1DisputesGetParameterXd37f23c7Inspection {
  val matchesInlineV1DisputesGetParameterAnyOf1X6a56077b = element.isJsonDecodable<InlineV1DisputesGetParameterAnyOf1X6a56077b>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1DisputesGetParameterXd37f23c7Inspection(
    matchesInlineV1DisputesGetParameterAnyOf1X6a56077b = matchesInlineV1DisputesGetParameterAnyOf1X6a56077b,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1DisputesGetParameterAnyOf1X6a56077b) add("InlineV1DisputesGetParameterAnyOf1X6a56077b: value does not match InlineV1DisputesGetParameterAnyOf1X6a56077b")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
