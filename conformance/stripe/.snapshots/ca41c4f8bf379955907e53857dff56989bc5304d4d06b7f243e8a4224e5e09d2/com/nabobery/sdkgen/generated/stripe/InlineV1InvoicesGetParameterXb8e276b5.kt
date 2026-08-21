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

public enum class InlineV1InvoicesGetParameterXb8e276b5Branch {
  InlineV1InvoicesGetParameterAnyOf1Xec7dd6cb,
  Branch2,
}

public sealed class InlineV1InvoicesGetParameterXb8e276b5DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesGetParameterXb8e276b5NoMatchException(
  message: String,
) : InlineV1InvoicesGetParameterXb8e276b5DecodingException(message)

internal data class InlineV1InvoicesGetParameterXb8e276b5Inspection(
  public val matchesInlineV1InvoicesGetParameterAnyOf1Xec7dd6cb: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1InvoicesGetParameterAnyOf1Xec7dd6cb, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1invoices/get/parameters/4/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1invoices/get/parameters/4/schema
 */
@Serializable(with = InlineV1InvoicesGetParameterXb8e276b5.Serializer::class)
public class InlineV1InvoicesGetParameterXb8e276b5 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1InvoicesGetParameterXb8e276b5Inspection,
) {
  public val inlineV1InvoicesGetParameterAnyOf1Xec7dd6cb:
      InlineV1InvoicesGetParameterAnyOf1Xec7dd6cb? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesGetParameterAnyOf1Xec7dd6cb) json.decodeFromJsonElement<InlineV1InvoicesGetParameterAnyOf1Xec7dd6cb>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1InvoicesGetParameterXb8e276b5Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1InvoicesGetParameterAnyOf1Xec7dd6cb) add(InlineV1InvoicesGetParameterXb8e276b5Branch.InlineV1InvoicesGetParameterAnyOf1Xec7dd6cb)
      if (inspection.matchesBranch2) add(InlineV1InvoicesGetParameterXb8e276b5Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesGetParameterXb8e276b5 {
      val inspection = inspectInlineV1InvoicesGetParameterXb8e276b5(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesGetParameterXb8e276b5NoMatchException("InlineV1InvoicesGetParameterXb8e276b5 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesGetParameterXb8e276b5(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesGetParameterXb8e276b5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesGetParameterXb8e276b5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesGetParameterXb8e276b5")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesGetParameterXb8e276b5) {
      encoder.requireJsonEncoder("InlineV1InvoicesGetParameterXb8e276b5").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesGetParameterXb8e276b5(element: JsonElement): InlineV1InvoicesGetParameterXb8e276b5Inspection {
  val matchesInlineV1InvoicesGetParameterAnyOf1Xec7dd6cb = element.isJsonDecodable<InlineV1InvoicesGetParameterAnyOf1Xec7dd6cb>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1InvoicesGetParameterXb8e276b5Inspection(
    matchesInlineV1InvoicesGetParameterAnyOf1Xec7dd6cb = matchesInlineV1InvoicesGetParameterAnyOf1Xec7dd6cb,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1InvoicesGetParameterAnyOf1Xec7dd6cb) add("InlineV1InvoicesGetParameterAnyOf1Xec7dd6cb: value does not match InlineV1InvoicesGetParameterAnyOf1Xec7dd6cb")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
