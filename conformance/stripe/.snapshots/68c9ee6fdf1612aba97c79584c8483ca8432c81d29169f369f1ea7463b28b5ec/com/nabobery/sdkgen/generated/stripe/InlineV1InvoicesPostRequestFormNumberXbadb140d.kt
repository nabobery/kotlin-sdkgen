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

public enum class InlineV1InvoicesPostRequestFormNumberXbadb140dBranch {
  Branch1,
  InlineV1InvoicesPostRequestFormNumberAnyOf2X6f40e42b,
}

public sealed class InlineV1InvoicesPostRequestFormNumberXbadb140dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesPostRequestFormNumberXbadb140dNoMatchException(
  message: String,
) : InlineV1InvoicesPostRequestFormNumberXbadb140dDecodingException(message)

internal data class InlineV1InvoicesPostRequestFormNumberXbadb140dInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoicesPostRequestFormNumberAnyOf2X6f40e42b: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoicesPostRequestFormNumberAnyOf2X6f40e42b).count { it }
}

/**
 * Set the number for this invoice. If no number is present then a number will be assigned automatically when the
 * invoice is finalized. In many markets, regulations require invoices to be unique, sequential and / or gapless. You
 * are responsible for ensuring this is true across all your different invoicing systems in the event that you edit the
 * invoice number using our API. If you use only Stripe for your invoices and do not change invoice numbers, Stripe
 * handles this aspect of compliance for you automatically.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1{invoice}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/number
 */
@Serializable(with = InlineV1InvoicesPostRequestFormNumberXbadb140d.Serializer::class)
public class InlineV1InvoicesPostRequestFormNumberXbadb140d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1InvoicesPostRequestFormNumberXbadb140dInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1InvoicesPostRequestFormNumberAnyOf2X6f40e42b:
      InlineV1InvoicesPostRequestFormNumberAnyOf2X6f40e42b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesPostRequestFormNumberAnyOf2X6f40e42b) json.decodeFromJsonElement<InlineV1InvoicesPostRequestFormNumberAnyOf2X6f40e42b>(raw) else null }

  public val matchedBranches: Set<InlineV1InvoicesPostRequestFormNumberXbadb140dBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoicesPostRequestFormNumberXbadb140dBranch.Branch1)
      if (inspection.matchesInlineV1InvoicesPostRequestFormNumberAnyOf2X6f40e42b) add(InlineV1InvoicesPostRequestFormNumberXbadb140dBranch.InlineV1InvoicesPostRequestFormNumberAnyOf2X6f40e42b)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesPostRequestFormNumberXbadb140d {
      val inspection = inspectInlineV1InvoicesPostRequestFormNumberXbadb140d(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesPostRequestFormNumberXbadb140dNoMatchException("InlineV1InvoicesPostRequestFormNumberXbadb140d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesPostRequestFormNumberXbadb140d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesPostRequestFormNumberXbadb140d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesPostRequestFormNumberXbadb140d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesPostRequestFormNumberXbadb140d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesPostRequestFormNumberXbadb140d) {
      encoder.requireJsonEncoder("InlineV1InvoicesPostRequestFormNumberXbadb140d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesPostRequestFormNumberXbadb140d(element: JsonElement): InlineV1InvoicesPostRequestFormNumberXbadb140dInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1InvoicesPostRequestFormNumberAnyOf2X6f40e42b = element.isJsonDecodable<InlineV1InvoicesPostRequestFormNumberAnyOf2X6f40e42b>()
  return InlineV1InvoicesPostRequestFormNumberXbadb140dInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoicesPostRequestFormNumberAnyOf2X6f40e42b = matchesInlineV1InvoicesPostRequestFormNumberAnyOf2X6f40e42b,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1InvoicesPostRequestFormNumberAnyOf2X6f40e42b) add("InlineV1InvoicesPostRequestFormNumberAnyOf2X6f40e42b: value does not match InlineV1InvoicesPostRequestFormNumberAnyOf2X6f40e42b")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
