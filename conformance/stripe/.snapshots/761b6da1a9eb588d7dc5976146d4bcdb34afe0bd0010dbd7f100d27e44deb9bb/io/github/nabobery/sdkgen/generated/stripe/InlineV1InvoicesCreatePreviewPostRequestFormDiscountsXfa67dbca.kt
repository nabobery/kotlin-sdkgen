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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa67dbcaBranch {
  Branch1,
  InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X882c6616,
}

public sealed class InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa67dbcaDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa67dbcaNoMatchException(
  message: String,
) : InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa67dbcaDecodingException(message)

internal data class InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa67dbcaInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X882c6616:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X882c6616).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/items/items/properties/discounts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1invoices~1create_preview/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/subscription_details/properties/items/items/properties/discounts
 */
@Serializable(with = InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa67dbca.Serializer::class)
public class InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa67dbca internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa67dbcaInspection,
) {
  public val branch1:
      List<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX17c8bb18>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX17c8bb18>>(raw) else null }

  public val inlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X882c6616:
      InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X882c6616? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X882c6616) json.decodeFromJsonElement<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X882c6616>(raw) else null }

  public val matchedBranches:
      Set<InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa67dbcaBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa67dbcaBranch.Branch1)
      if (inspection.matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X882c6616) add(InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa67dbcaBranch.InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X882c6616)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa67dbca {
      val inspection = inspectInlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa67dbca(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa67dbcaNoMatchException("InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa67dbca matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa67dbca(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa67dbca> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa67dbca {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa67dbca")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa67dbca) {
      encoder.requireJsonEncoder("InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa67dbca").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa67dbca(element: JsonElement): InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa67dbcaInspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsItemX17c8bb18>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X882c6616 = element.isJsonDecodable<InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X882c6616>()
  return InlineV1InvoicesCreatePreviewPostRequestFormDiscountsXfa67dbcaInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X882c6616 = matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X882c6616,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X882c6616) add("InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X882c6616: value does not match InlineV1InvoicesCreatePreviewPostRequestFormSubscriptionDetailsAnyOf2X882c6616")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
