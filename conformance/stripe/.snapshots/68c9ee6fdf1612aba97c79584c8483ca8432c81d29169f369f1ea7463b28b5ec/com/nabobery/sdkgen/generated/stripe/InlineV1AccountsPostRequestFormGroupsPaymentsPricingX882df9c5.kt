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

public enum class InlineV1AccountsPostRequestFormGroupsPaymentsPricingX882df9c5Branch {
  Branch1,
  InlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2Xc253936c,
}

public sealed class InlineV1AccountsPostRequestFormGroupsPaymentsPricingX882df9c5DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsPostRequestFormGroupsPaymentsPricingX882df9c5NoMatchException(
  message: String,
) : InlineV1AccountsPostRequestFormGroupsPaymentsPricingX882df9c5DecodingException(message)

internal data class InlineV1AccountsPostRequestFormGroupsPaymentsPricingX882df9c5Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2Xc253936c: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2Xc253936c).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/groups/properties/payments_pricing.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/groups/properties/payments_pricing
 */
@Serializable(with = InlineV1AccountsPostRequestFormGroupsPaymentsPricingX882df9c5.Serializer::class)
public class InlineV1AccountsPostRequestFormGroupsPaymentsPricingX882df9c5 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1AccountsPostRequestFormGroupsPaymentsPricingX882df9c5Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2Xc253936c:
      InlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2Xc253936c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2Xc253936c) json.decodeFromJsonElement<InlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2Xc253936c>(raw) else null }

  public val matchedBranches:
      Set<InlineV1AccountsPostRequestFormGroupsPaymentsPricingX882df9c5Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1AccountsPostRequestFormGroupsPaymentsPricingX882df9c5Branch.Branch1)
      if (inspection.matchesInlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2Xc253936c) add(InlineV1AccountsPostRequestFormGroupsPaymentsPricingX882df9c5Branch.InlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2Xc253936c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsPostRequestFormGroupsPaymentsPricingX882df9c5 {
      val inspection = inspectInlineV1AccountsPostRequestFormGroupsPaymentsPricingX882df9c5(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsPostRequestFormGroupsPaymentsPricingX882df9c5NoMatchException("InlineV1AccountsPostRequestFormGroupsPaymentsPricingX882df9c5 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsPostRequestFormGroupsPaymentsPricingX882df9c5(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormGroupsPaymentsPricingX882df9c5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormGroupsPaymentsPricingX882df9c5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormGroupsPaymentsPricingX882df9c5")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormGroupsPaymentsPricingX882df9c5) {
      encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormGroupsPaymentsPricingX882df9c5").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsPostRequestFormGroupsPaymentsPricingX882df9c5(element: JsonElement): InlineV1AccountsPostRequestFormGroupsPaymentsPricingX882df9c5Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2Xc253936c = element.isJsonDecodable<InlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2Xc253936c>()
  return InlineV1AccountsPostRequestFormGroupsPaymentsPricingX882df9c5Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2Xc253936c = matchesInlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2Xc253936c,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2Xc253936c) add("InlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2Xc253936c: value does not match InlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2Xc253936c")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
