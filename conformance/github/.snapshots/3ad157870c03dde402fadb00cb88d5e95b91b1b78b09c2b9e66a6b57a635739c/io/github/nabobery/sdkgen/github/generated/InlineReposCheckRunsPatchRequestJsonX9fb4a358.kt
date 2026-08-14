package io.github.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

@Serializable
public data class InlineReposCheckRunsPatchRequestJsonX9fb4a358InlineReposCheckRunsPatchRequestJsonAnyOf1Xd5511babView(
  public val status: InlineReposCheckRunsPatchRequestJsonAnyOf1StatusX3609567e? = null,
)

@Serializable
public data class InlineReposCheckRunsPatchRequestJsonX9fb4a358InlineReposCheckRunsPatchRequestJsonAnyOf2X9277df7dView(
  public val status: InlineReposCheckRunsPatchRequestJsonAnyOf2StatusX6383d0a5? = null,
)

public enum class InlineReposCheckRunsPatchRequestJsonX9fb4a358Branch {
  InlineReposCheckRunsPatchRequestJsonAnyOf1Xd5511bab,
  InlineReposCheckRunsPatchRequestJsonAnyOf2X9277df7d,
}

public sealed class InlineReposCheckRunsPatchRequestJsonX9fb4a358DecodingException(
  message: String,
) : SerializationException(message)

public class InlineReposCheckRunsPatchRequestJsonX9fb4a358NoMatchException(
  message: String,
) : InlineReposCheckRunsPatchRequestJsonX9fb4a358DecodingException(message)

internal data class InlineReposCheckRunsPatchRequestJsonX9fb4a358Inspection(
  public val matchesInlineReposCheckRunsPatchRequestJsonAnyOf1Xd5511bab: Boolean,
  public val matchesInlineReposCheckRunsPatchRequestJsonAnyOf2X9277df7d: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineReposCheckRunsPatchRequestJsonAnyOf1Xd5511bab, matchesInlineReposCheckRunsPatchRequestJsonAnyOf2X9277df7d).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-runs~1{check_run_id}/patch/requestBody/content/ap
 * plication~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1check-runs~1{check_run_id}/patch/requestBody/content/ap
 * plication~1json/schema
 */
@Serializable(with = InlineReposCheckRunsPatchRequestJsonX9fb4a358.Serializer::class)
public class InlineReposCheckRunsPatchRequestJsonX9fb4a358 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineReposCheckRunsPatchRequestJsonX9fb4a358Inspection,
) {
  public val inlineReposCheckRunsPatchRequestJsonAnyOf1Xd5511bab:
      InlineReposCheckRunsPatchRequestJsonX9fb4a358InlineReposCheckRunsPatchRequestJsonAnyOf1Xd5511babView?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineReposCheckRunsPatchRequestJsonAnyOf1Xd5511bab) json.decodeFromJsonElement<InlineReposCheckRunsPatchRequestJsonX9fb4a358InlineReposCheckRunsPatchRequestJsonAnyOf1Xd5511babView>(raw) else null }

  public val inlineReposCheckRunsPatchRequestJsonAnyOf2X9277df7d:
      InlineReposCheckRunsPatchRequestJsonX9fb4a358InlineReposCheckRunsPatchRequestJsonAnyOf2X9277df7dView?
      by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineReposCheckRunsPatchRequestJsonAnyOf2X9277df7d) json.decodeFromJsonElement<InlineReposCheckRunsPatchRequestJsonX9fb4a358InlineReposCheckRunsPatchRequestJsonAnyOf2X9277df7dView>(raw) else null }

  public val matchedBranches: Set<InlineReposCheckRunsPatchRequestJsonX9fb4a358Branch>
    get() = buildSet {
      if (inspection.matchesInlineReposCheckRunsPatchRequestJsonAnyOf1Xd5511bab) add(InlineReposCheckRunsPatchRequestJsonX9fb4a358Branch.InlineReposCheckRunsPatchRequestJsonAnyOf1Xd5511bab)
      if (inspection.matchesInlineReposCheckRunsPatchRequestJsonAnyOf2X9277df7d) add(InlineReposCheckRunsPatchRequestJsonX9fb4a358Branch.InlineReposCheckRunsPatchRequestJsonAnyOf2X9277df7d)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineReposCheckRunsPatchRequestJsonX9fb4a358 {
      val inspection = inspectInlineReposCheckRunsPatchRequestJsonX9fb4a358(raw)
      if (inspection.matchCount == 0) {
        throw InlineReposCheckRunsPatchRequestJsonX9fb4a358NoMatchException("InlineReposCheckRunsPatchRequestJsonX9fb4a358 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineReposCheckRunsPatchRequestJsonX9fb4a358(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineReposCheckRunsPatchRequestJsonX9fb4a358> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposCheckRunsPatchRequestJsonX9fb4a358 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposCheckRunsPatchRequestJsonX9fb4a358")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposCheckRunsPatchRequestJsonX9fb4a358) {
      encoder.requireJsonEncoder("InlineReposCheckRunsPatchRequestJsonX9fb4a358").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineReposCheckRunsPatchRequestJsonX9fb4a358(element: JsonElement): InlineReposCheckRunsPatchRequestJsonX9fb4a358Inspection {
  val raw = element as? JsonObject ?: return InlineReposCheckRunsPatchRequestJsonX9fb4a358Inspection(
    matchesInlineReposCheckRunsPatchRequestJsonAnyOf1Xd5511bab = false,
    matchesInlineReposCheckRunsPatchRequestJsonAnyOf2X9277df7d = false,
    failures = listOf("InlineReposCheckRunsPatchRequestJsonAnyOf1Xd5511bab: expected JSON object", "InlineReposCheckRunsPatchRequestJsonAnyOf2X9277df7d: expected JSON object"),
  )
  val matchesInlineReposCheckRunsPatchRequestJsonAnyOf1Xd5511bab = true
  val matchesInlineReposCheckRunsPatchRequestJsonAnyOf2X9277df7d = true
  return InlineReposCheckRunsPatchRequestJsonX9fb4a358Inspection(
    matchesInlineReposCheckRunsPatchRequestJsonAnyOf1Xd5511bab = matchesInlineReposCheckRunsPatchRequestJsonAnyOf1Xd5511bab,
    matchesInlineReposCheckRunsPatchRequestJsonAnyOf2X9277df7d = matchesInlineReposCheckRunsPatchRequestJsonAnyOf2X9277df7d,
    failures = buildList {
      if (!matchesInlineReposCheckRunsPatchRequestJsonAnyOf1Xd5511bab) add("InlineReposCheckRunsPatchRequestJsonAnyOf1Xd5511bab: required properties  do not match their declared types")
      if (!matchesInlineReposCheckRunsPatchRequestJsonAnyOf2X9277df7d) add("InlineReposCheckRunsPatchRequestJsonAnyOf2X9277df7d: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
