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

public enum class InlineV1InvoicesPostRequestFormEffectiveAtX2b7c3a8aBranch {
  Branch1,
  InlineV1InvoicesPostRequestFormEffectiveAtAnyOf2Xeb1240d2,
}

public sealed class InlineV1InvoicesPostRequestFormEffectiveAtX2b7c3a8aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormEffectiveAtX2b7c3a8aNoMatchException(
  message: String,
) : InlineV1InvoicesPostRequestFormEffectiveAtX2b7c3a8aDecodingException(message)

internal data class InlineV1InvoicesPostRequestFormEffectiveAtX2b7c3a8aInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoicesPostRequestFormEffectiveAtAnyOf2Xeb1240d2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoicesPostRequestFormEffectiveAtAnyOf2Xeb1240d2).count { it }
}

/**
 * The date when this invoice is in effect. Same as `finalized_at` unless overwritten. When defined, this value replaces
 * the system-generated 'Date of issue' printed on the invoice PDF and receipt.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/effective_at
 */
@Serializable(with = InlineV1InvoicesPostRequestFormEffectiveAtX2b7c3a8a.Serializer::class)
public class InlineV1InvoicesPostRequestFormEffectiveAtX2b7c3a8a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1InvoicesPostRequestFormEffectiveAtX2b7c3a8aInspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1InvoicesPostRequestFormEffectiveAtAnyOf2Xeb1240d2:
      InlineV1InvoicesPostRequestFormEffectiveAtAnyOf2Xeb1240d2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormEffectiveAtAnyOf2Xeb1240d2) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormEffectiveAtAnyOf2Xeb1240d2>(raw) else null }

  public val matchedBranches: Set<InlineV1InvoicesPostRequestFormEffectiveAtX2b7c3a8aBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoicesPostRequestFormEffectiveAtX2b7c3a8aBranch.Branch1)
      if (inspection.matchesInlineV1InvoicesPostRequestFormEffectiveAtAnyOf2Xeb1240d2) add(InlineV1InvoicesPostRequestFormEffectiveAtX2b7c3a8aBranch.InlineV1InvoicesPostRequestFormEffectiveAtAnyOf2Xeb1240d2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesPostRequestFormEffectiveAtX2b7c3a8a {
      val inspection = inspectInlineV1InvoicesPostRequestFormEffectiveAtX2b7c3a8a(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesPostRequestFormEffectiveAtX2b7c3a8aNoMatchException("InlineV1InvoicesPostRequestFormEffectiveAtX2b7c3a8a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesPostRequestFormEffectiveAtX2b7c3a8a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormEffectiveAtX2b7c3a8a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormEffectiveAtX2b7c3a8a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormEffectiveAtX2b7c3a8a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormEffectiveAtX2b7c3a8a) {
      encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormEffectiveAtX2b7c3a8a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesPostRequestFormEffectiveAtX2b7c3a8a(element: JsonElement): InlineV1InvoicesPostRequestFormEffectiveAtX2b7c3a8aInspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1InvoicesPostRequestFormEffectiveAtAnyOf2Xeb1240d2 = element.isJsonDecodable<InlineV1InvoicesPostRequestFormEffectiveAtAnyOf2Xeb1240d2>()
  return InlineV1InvoicesPostRequestFormEffectiveAtX2b7c3a8aInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoicesPostRequestFormEffectiveAtAnyOf2Xeb1240d2 = matchesInlineV1InvoicesPostRequestFormEffectiveAtAnyOf2Xeb1240d2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1InvoicesPostRequestFormEffectiveAtAnyOf2Xeb1240d2) add("InlineV1InvoicesPostRequestFormEffectiveAtAnyOf2Xeb1240d2: value does not match InlineV1InvoicesPostRequestFormEffectiveAtAnyOf2Xeb1240d2")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
