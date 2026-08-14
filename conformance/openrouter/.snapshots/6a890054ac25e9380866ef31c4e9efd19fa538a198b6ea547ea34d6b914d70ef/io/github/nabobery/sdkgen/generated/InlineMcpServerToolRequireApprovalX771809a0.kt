package io.github.nabobery.sdkgen.generated

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

public enum class InlineMcpServerToolRequireApprovalX771809a0Branch {
  InlineMcpServerToolRequireApprovalAnyOf1Xb1591b56,
  InlineMcpServerToolRequireApprovalAnyOf2X5e1f3873,
  InlineMcpServerToolRequireApprovalAnyOf3X83ea0d3f,
  Branch4,
}

public sealed class InlineMcpServerToolRequireApprovalX771809a0DecodingException(
  message: String,
) : SerializationException(message)

public class InlineMcpServerToolRequireApprovalX771809a0NoMatchException(
  message: String,
) : InlineMcpServerToolRequireApprovalX771809a0DecodingException(message)

internal data class InlineMcpServerToolRequireApprovalX771809a0Inspection(
  public val matchesInlineMcpServerToolRequireApprovalAnyOf1Xb1591b56: Boolean,
  public val matchesInlineMcpServerToolRequireApprovalAnyOf2X5e1f3873: Boolean,
  public val matchesInlineMcpServerToolRequireApprovalAnyOf3X83ea0d3f: Boolean,
  public val matchesBranch4: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineMcpServerToolRequireApprovalAnyOf1Xb1591b56, matchesInlineMcpServerToolRequireApprovalAnyOf2X5e1f3873, matchesInlineMcpServerToolRequireApprovalAnyOf3X83ea0d3f, matchesBranch4).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/McpServerTool/properties/require_approval.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/McpServerTool/properties/require_approval
 */
@Serializable(with = InlineMcpServerToolRequireApprovalX771809a0.Serializer::class)
public class InlineMcpServerToolRequireApprovalX771809a0 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineMcpServerToolRequireApprovalX771809a0Inspection,
) {
  public val inlineMcpServerToolRequireApprovalAnyOf1Xb1591b56:
      InlineMcpServerToolRequireApprovalAnyOf1Xb1591b56? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineMcpServerToolRequireApprovalAnyOf1Xb1591b56) json.decodeFromJsonElement<InlineMcpServerToolRequireApprovalAnyOf1Xb1591b56>(raw) else null }

  public val inlineMcpServerToolRequireApprovalAnyOf2X5e1f3873:
      InlineMcpServerToolRequireApprovalAnyOf2X5e1f3873? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineMcpServerToolRequireApprovalAnyOf2X5e1f3873) json.decodeFromJsonElement<InlineMcpServerToolRequireApprovalAnyOf2X5e1f3873>(raw) else null }

  public val inlineMcpServerToolRequireApprovalAnyOf3X83ea0d3f:
      InlineMcpServerToolRequireApprovalAnyOf3X83ea0d3f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineMcpServerToolRequireApprovalAnyOf3X83ea0d3f) json.decodeFromJsonElement<InlineMcpServerToolRequireApprovalAnyOf3X83ea0d3f>(raw) else null }

  public val branch4: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch4) json.decodeFromJsonElement<JsonElement?>(raw) else null }

  public val matchedBranches: Set<InlineMcpServerToolRequireApprovalX771809a0Branch>
    get() = buildSet {
      if (inspection.matchesInlineMcpServerToolRequireApprovalAnyOf1Xb1591b56) add(InlineMcpServerToolRequireApprovalX771809a0Branch.InlineMcpServerToolRequireApprovalAnyOf1Xb1591b56)
      if (inspection.matchesInlineMcpServerToolRequireApprovalAnyOf2X5e1f3873) add(InlineMcpServerToolRequireApprovalX771809a0Branch.InlineMcpServerToolRequireApprovalAnyOf2X5e1f3873)
      if (inspection.matchesInlineMcpServerToolRequireApprovalAnyOf3X83ea0d3f) add(InlineMcpServerToolRequireApprovalX771809a0Branch.InlineMcpServerToolRequireApprovalAnyOf3X83ea0d3f)
      if (inspection.matchesBranch4) add(InlineMcpServerToolRequireApprovalX771809a0Branch.Branch4)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineMcpServerToolRequireApprovalX771809a0 {
      val inspection = inspectInlineMcpServerToolRequireApprovalX771809a0(raw)
      if (inspection.matchCount == 0) {
        throw InlineMcpServerToolRequireApprovalX771809a0NoMatchException("InlineMcpServerToolRequireApprovalX771809a0 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineMcpServerToolRequireApprovalX771809a0(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineMcpServerToolRequireApprovalX771809a0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMcpServerToolRequireApprovalX771809a0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMcpServerToolRequireApprovalX771809a0")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineMcpServerToolRequireApprovalX771809a0) {
      encoder.requireJsonEncoder("InlineMcpServerToolRequireApprovalX771809a0").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineMcpServerToolRequireApprovalX771809a0(element: JsonElement): InlineMcpServerToolRequireApprovalX771809a0Inspection {
  val matchesInlineMcpServerToolRequireApprovalAnyOf1Xb1591b56 = element.isJsonDecodable<InlineMcpServerToolRequireApprovalAnyOf1Xb1591b56>()
  val matchesInlineMcpServerToolRequireApprovalAnyOf2X5e1f3873 = element.isJsonDecodable<InlineMcpServerToolRequireApprovalAnyOf2X5e1f3873>()
  val matchesInlineMcpServerToolRequireApprovalAnyOf3X83ea0d3f = element.isJsonDecodable<InlineMcpServerToolRequireApprovalAnyOf3X83ea0d3f>()
  val matchesBranch4 = element.isJsonDecodable<JsonElement?>()
  return InlineMcpServerToolRequireApprovalX771809a0Inspection(
    matchesInlineMcpServerToolRequireApprovalAnyOf1Xb1591b56 = matchesInlineMcpServerToolRequireApprovalAnyOf1Xb1591b56,
    matchesInlineMcpServerToolRequireApprovalAnyOf2X5e1f3873 = matchesInlineMcpServerToolRequireApprovalAnyOf2X5e1f3873,
    matchesInlineMcpServerToolRequireApprovalAnyOf3X83ea0d3f = matchesInlineMcpServerToolRequireApprovalAnyOf3X83ea0d3f,
    matchesBranch4 = matchesBranch4,
    failures = buildList {
      if (!matchesInlineMcpServerToolRequireApprovalAnyOf1Xb1591b56) add("InlineMcpServerToolRequireApprovalAnyOf1Xb1591b56: value does not match InlineMcpServerToolRequireApprovalAnyOf1Xb1591b56")
      if (!matchesInlineMcpServerToolRequireApprovalAnyOf2X5e1f3873) add("InlineMcpServerToolRequireApprovalAnyOf2X5e1f3873: value does not match InlineMcpServerToolRequireApprovalAnyOf2X5e1f3873")
      if (!matchesInlineMcpServerToolRequireApprovalAnyOf3X83ea0d3f) add("InlineMcpServerToolRequireApprovalAnyOf3X83ea0d3f: value does not match InlineMcpServerToolRequireApprovalAnyOf3X83ea0d3f")
      if (!matchesBranch4) add("Branch4: value does not match JsonElement")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
