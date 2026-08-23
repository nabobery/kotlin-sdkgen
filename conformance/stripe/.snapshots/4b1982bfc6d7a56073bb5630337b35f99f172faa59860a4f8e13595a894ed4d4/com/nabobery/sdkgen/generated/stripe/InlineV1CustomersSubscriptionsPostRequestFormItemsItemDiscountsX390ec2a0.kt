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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX390ec2a0Branch {
  Branch1,
  InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsAnyOf2Xe85bac65,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX390ec2a0DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX390ec2a0NoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX390ec2a0DecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX390ec2a0Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsAnyOf2Xe85bac65:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsAnyOf2Xe85bac65).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/items/items/properties/discounts.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/items/items/properties/discounts
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX390ec2a0.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX390ec2a0 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX390ec2a0Inspection,
) {
  public val branch1:
      List<InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsItemXce99a5a8>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsItemXce99a5a8>>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsAnyOf2Xe85bac65:
      InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsAnyOf2Xe85bac65? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsAnyOf2Xe85bac65) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsAnyOf2Xe85bac65>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX390ec2a0Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX390ec2a0Branch.Branch1)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsAnyOf2Xe85bac65) add(InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX390ec2a0Branch.InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsAnyOf2Xe85bac65)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX390ec2a0 {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX390ec2a0(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX390ec2a0NoMatchException("InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX390ec2a0 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX390ec2a0(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX390ec2a0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX390ec2a0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX390ec2a0")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX390ec2a0) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX390ec2a0").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX390ec2a0(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX390ec2a0Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsItemXce99a5a8>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsAnyOf2Xe85bac65 = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsAnyOf2Xe85bac65>()
  return InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsX390ec2a0Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsAnyOf2Xe85bac65 = matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsAnyOf2Xe85bac65,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsAnyOf2Xe85bac65) add("InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsAnyOf2Xe85bac65: value does not match InlineV1CustomersSubscriptionsPostRequestFormItemsItemDiscountsAnyOf2Xe85bac65")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
