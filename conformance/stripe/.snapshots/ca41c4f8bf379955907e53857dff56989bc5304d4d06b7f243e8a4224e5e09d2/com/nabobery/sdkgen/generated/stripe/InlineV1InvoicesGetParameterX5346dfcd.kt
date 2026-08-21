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

public enum class InlineV1InvoicesGetParameterX5346dfcdBranch {
  InlineV1InvoicesGetParameterAnyOf1Xaad724f8,
  Branch2,
}

public sealed class InlineV1InvoicesGetParameterX5346dfcdDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesGetParameterX5346dfcdNoMatchException(
  message: String,
) : InlineV1InvoicesGetParameterX5346dfcdDecodingException(message)

internal data class InlineV1InvoicesGetParameterX5346dfcdInspection(
  public val matchesInlineV1InvoicesGetParameterAnyOf1Xaad724f8: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1InvoicesGetParameterAnyOf1Xaad724f8, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1invoices/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1invoices/get/parameters/1/schema
 */
@Serializable(with = InlineV1InvoicesGetParameterX5346dfcd.Serializer::class)
public class InlineV1InvoicesGetParameterX5346dfcd internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1InvoicesGetParameterX5346dfcdInspection,
) {
  public val inlineV1InvoicesGetParameterAnyOf1Xaad724f8:
      InlineV1InvoicesGetParameterAnyOf1Xaad724f8? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesGetParameterAnyOf1Xaad724f8) json.decodeFromJsonElement<InlineV1InvoicesGetParameterAnyOf1Xaad724f8>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1InvoicesGetParameterX5346dfcdBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1InvoicesGetParameterAnyOf1Xaad724f8) add(InlineV1InvoicesGetParameterX5346dfcdBranch.InlineV1InvoicesGetParameterAnyOf1Xaad724f8)
      if (inspection.matchesBranch2) add(InlineV1InvoicesGetParameterX5346dfcdBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesGetParameterX5346dfcd {
      val inspection = inspectInlineV1InvoicesGetParameterX5346dfcd(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesGetParameterX5346dfcdNoMatchException("InlineV1InvoicesGetParameterX5346dfcd matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesGetParameterX5346dfcd(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesGetParameterX5346dfcd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesGetParameterX5346dfcd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesGetParameterX5346dfcd")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesGetParameterX5346dfcd) {
      encoder.requireJsonEncoder("InlineV1InvoicesGetParameterX5346dfcd").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesGetParameterX5346dfcd(element: JsonElement): InlineV1InvoicesGetParameterX5346dfcdInspection {
  val matchesInlineV1InvoicesGetParameterAnyOf1Xaad724f8 = element.isJsonDecodable<InlineV1InvoicesGetParameterAnyOf1Xaad724f8>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1InvoicesGetParameterX5346dfcdInspection(
    matchesInlineV1InvoicesGetParameterAnyOf1Xaad724f8 = matchesInlineV1InvoicesGetParameterAnyOf1Xaad724f8,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1InvoicesGetParameterAnyOf1Xaad724f8) add("InlineV1InvoicesGetParameterAnyOf1Xaad724f8: value does not match InlineV1InvoicesGetParameterAnyOf1Xaad724f8")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
