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

public enum class InlineV1SetupIntentsGetParameterX536b4840Branch {
  InlineV1SetupIntentsGetParameterAnyOf1X2d9471dc,
  Branch2,
}

public sealed class InlineV1SetupIntentsGetParameterX536b4840DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SetupIntentsGetParameterX536b4840NoMatchException(
  message: String,
) : InlineV1SetupIntentsGetParameterX536b4840DecodingException(message)

internal data class InlineV1SetupIntentsGetParameterX536b4840Inspection(
  public val matchesInlineV1SetupIntentsGetParameterAnyOf1X2d9471dc: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SetupIntentsGetParameterAnyOf1X2d9471dc, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/get/parameters/1/schema
 */
@Serializable(with = InlineV1SetupIntentsGetParameterX536b4840.Serializer::class)
public class InlineV1SetupIntentsGetParameterX536b4840 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SetupIntentsGetParameterX536b4840Inspection,
) {
  public val inlineV1SetupIntentsGetParameterAnyOf1X2d9471dc:
      InlineV1SetupIntentsGetParameterAnyOf1X2d9471dc? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SetupIntentsGetParameterAnyOf1X2d9471dc) json.decodeFromJsonElement<InlineV1SetupIntentsGetParameterAnyOf1X2d9471dc>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1SetupIntentsGetParameterX536b4840Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1SetupIntentsGetParameterAnyOf1X2d9471dc) add(InlineV1SetupIntentsGetParameterX536b4840Branch.InlineV1SetupIntentsGetParameterAnyOf1X2d9471dc)
      if (inspection.matchesBranch2) add(InlineV1SetupIntentsGetParameterX536b4840Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SetupIntentsGetParameterX536b4840 {
      val inspection = inspectInlineV1SetupIntentsGetParameterX536b4840(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SetupIntentsGetParameterX536b4840NoMatchException("InlineV1SetupIntentsGetParameterX536b4840 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SetupIntentsGetParameterX536b4840(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsGetParameterX536b4840> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsGetParameterX536b4840 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsGetParameterX536b4840")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsGetParameterX536b4840) {
      encoder.requireJsonEncoder("InlineV1SetupIntentsGetParameterX536b4840").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SetupIntentsGetParameterX536b4840(element: JsonElement): InlineV1SetupIntentsGetParameterX536b4840Inspection {
  val matchesInlineV1SetupIntentsGetParameterAnyOf1X2d9471dc = element.isJsonDecodable<InlineV1SetupIntentsGetParameterAnyOf1X2d9471dc>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1SetupIntentsGetParameterX536b4840Inspection(
    matchesInlineV1SetupIntentsGetParameterAnyOf1X2d9471dc = matchesInlineV1SetupIntentsGetParameterAnyOf1X2d9471dc,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1SetupIntentsGetParameterAnyOf1X2d9471dc) add("InlineV1SetupIntentsGetParameterAnyOf1X2d9471dc: value does not match InlineV1SetupIntentsGetParameterAnyOf1X2d9471dc")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
