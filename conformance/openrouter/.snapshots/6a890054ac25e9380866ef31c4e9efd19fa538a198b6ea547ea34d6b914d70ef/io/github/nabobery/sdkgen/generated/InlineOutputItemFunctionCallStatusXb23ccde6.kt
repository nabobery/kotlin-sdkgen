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

public enum class InlineOutputItemFunctionCallStatusXb23ccde6Branch {
  InlineOutputItemFunctionCallStatusAnyOf1Xf1907dcd,
  InlineOutputItemFunctionCallStatusAnyOf2Xc3fcf49d,
  InlineOutputItemFunctionCallStatusAnyOf3X6b0655cd,
}

public sealed class InlineOutputItemFunctionCallStatusXb23ccde6DecodingException(
  message: String,
) : SerializationException(message)

public class InlineOutputItemFunctionCallStatusXb23ccde6NoMatchException(
  message: String,
) : InlineOutputItemFunctionCallStatusXb23ccde6DecodingException(message)

internal data class InlineOutputItemFunctionCallStatusXb23ccde6Inspection(
  public val matchesInlineOutputItemFunctionCallStatusAnyOf1Xf1907dcd: Boolean,
  public val matchesInlineOutputItemFunctionCallStatusAnyOf2Xc3fcf49d: Boolean,
  public val matchesInlineOutputItemFunctionCallStatusAnyOf3X6b0655cd: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineOutputItemFunctionCallStatusAnyOf1Xf1907dcd, matchesInlineOutputItemFunctionCallStatusAnyOf2Xc3fcf49d, matchesInlineOutputItemFunctionCallStatusAnyOf3X6b0655cd).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/OutputItemFunctionCall/properties/status.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/OutputItemFunctionCall/properties/status
 */
@Serializable(with = InlineOutputItemFunctionCallStatusXb23ccde6.Serializer::class)
public class InlineOutputItemFunctionCallStatusXb23ccde6 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineOutputItemFunctionCallStatusXb23ccde6Inspection,
) {
  public val inlineOutputItemFunctionCallStatusAnyOf1Xf1907dcd:
      InlineOutputItemFunctionCallStatusAnyOf1Xf1907dcd? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineOutputItemFunctionCallStatusAnyOf1Xf1907dcd) json.decodeFromJsonElement<InlineOutputItemFunctionCallStatusAnyOf1Xf1907dcd>(raw) else null }

  public val inlineOutputItemFunctionCallStatusAnyOf2Xc3fcf49d:
      InlineOutputItemFunctionCallStatusAnyOf2Xc3fcf49d? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineOutputItemFunctionCallStatusAnyOf2Xc3fcf49d) json.decodeFromJsonElement<InlineOutputItemFunctionCallStatusAnyOf2Xc3fcf49d>(raw) else null }

  public val inlineOutputItemFunctionCallStatusAnyOf3X6b0655cd:
      InlineOutputItemFunctionCallStatusAnyOf3X6b0655cd? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineOutputItemFunctionCallStatusAnyOf3X6b0655cd) json.decodeFromJsonElement<InlineOutputItemFunctionCallStatusAnyOf3X6b0655cd>(raw) else null }

  public val matchedBranches: Set<InlineOutputItemFunctionCallStatusXb23ccde6Branch>
    get() = buildSet {
      if (inspection.matchesInlineOutputItemFunctionCallStatusAnyOf1Xf1907dcd) add(InlineOutputItemFunctionCallStatusXb23ccde6Branch.InlineOutputItemFunctionCallStatusAnyOf1Xf1907dcd)
      if (inspection.matchesInlineOutputItemFunctionCallStatusAnyOf2Xc3fcf49d) add(InlineOutputItemFunctionCallStatusXb23ccde6Branch.InlineOutputItemFunctionCallStatusAnyOf2Xc3fcf49d)
      if (inspection.matchesInlineOutputItemFunctionCallStatusAnyOf3X6b0655cd) add(InlineOutputItemFunctionCallStatusXb23ccde6Branch.InlineOutputItemFunctionCallStatusAnyOf3X6b0655cd)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineOutputItemFunctionCallStatusXb23ccde6 {
      val inspection = inspectInlineOutputItemFunctionCallStatusXb23ccde6(raw)
      if (inspection.matchCount == 0) {
        throw InlineOutputItemFunctionCallStatusXb23ccde6NoMatchException("InlineOutputItemFunctionCallStatusXb23ccde6 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineOutputItemFunctionCallStatusXb23ccde6(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineOutputItemFunctionCallStatusXb23ccde6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOutputItemFunctionCallStatusXb23ccde6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOutputItemFunctionCallStatusXb23ccde6")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineOutputItemFunctionCallStatusXb23ccde6) {
      encoder.requireJsonEncoder("InlineOutputItemFunctionCallStatusXb23ccde6").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineOutputItemFunctionCallStatusXb23ccde6(element: JsonElement): InlineOutputItemFunctionCallStatusXb23ccde6Inspection {
  val matchesInlineOutputItemFunctionCallStatusAnyOf1Xf1907dcd = element.isJsonDecodable<InlineOutputItemFunctionCallStatusAnyOf1Xf1907dcd>()
  val matchesInlineOutputItemFunctionCallStatusAnyOf2Xc3fcf49d = element.isJsonDecodable<InlineOutputItemFunctionCallStatusAnyOf2Xc3fcf49d>()
  val matchesInlineOutputItemFunctionCallStatusAnyOf3X6b0655cd = element.isJsonDecodable<InlineOutputItemFunctionCallStatusAnyOf3X6b0655cd>()
  return InlineOutputItemFunctionCallStatusXb23ccde6Inspection(
    matchesInlineOutputItemFunctionCallStatusAnyOf1Xf1907dcd = matchesInlineOutputItemFunctionCallStatusAnyOf1Xf1907dcd,
    matchesInlineOutputItemFunctionCallStatusAnyOf2Xc3fcf49d = matchesInlineOutputItemFunctionCallStatusAnyOf2Xc3fcf49d,
    matchesInlineOutputItemFunctionCallStatusAnyOf3X6b0655cd = matchesInlineOutputItemFunctionCallStatusAnyOf3X6b0655cd,
    failures = buildList {
      if (!matchesInlineOutputItemFunctionCallStatusAnyOf1Xf1907dcd) add("InlineOutputItemFunctionCallStatusAnyOf1Xf1907dcd: value does not match InlineOutputItemFunctionCallStatusAnyOf1Xf1907dcd")
      if (!matchesInlineOutputItemFunctionCallStatusAnyOf2Xc3fcf49d) add("InlineOutputItemFunctionCallStatusAnyOf2Xc3fcf49d: value does not match InlineOutputItemFunctionCallStatusAnyOf2Xc3fcf49d")
      if (!matchesInlineOutputItemFunctionCallStatusAnyOf3X6b0655cd) add("InlineOutputItemFunctionCallStatusAnyOf3X6b0655cd: value does not match InlineOutputItemFunctionCallStatusAnyOf3X6b0655cd")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
