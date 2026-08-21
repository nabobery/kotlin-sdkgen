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

public enum class InlineV1AccountsPostRequestFormGroupsPaymentsPricingX8830e40eBranch {
  Branch1,
  InlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2X59d54aba,
}

public sealed class InlineV1AccountsPostRequestFormGroupsPaymentsPricingX8830e40eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsPostRequestFormGroupsPaymentsPricingX8830e40eNoMatchException(
  message: String,
) : InlineV1AccountsPostRequestFormGroupsPaymentsPricingX8830e40eDecodingException(message)

internal data class InlineV1AccountsPostRequestFormGroupsPaymentsPricingX8830e40eInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2X59d54aba: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2X59d54aba).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/groups/properties/payments_pricing.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}/post/requestBody/content/application~1x-www-form-urlenc
 * oded/schema/properties/groups/properties/payments_pricing
 */
@Serializable(with = InlineV1AccountsPostRequestFormGroupsPaymentsPricingX8830e40e.Serializer::class)
public class InlineV1AccountsPostRequestFormGroupsPaymentsPricingX8830e40e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1AccountsPostRequestFormGroupsPaymentsPricingX8830e40eInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2X59d54aba:
      InlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2X59d54aba? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2X59d54aba) json.decodeFromJsonElement<InlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2X59d54aba>(raw) else null }

  public val matchedBranches:
      Set<InlineV1AccountsPostRequestFormGroupsPaymentsPricingX8830e40eBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1AccountsPostRequestFormGroupsPaymentsPricingX8830e40eBranch.Branch1)
      if (inspection.matchesInlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2X59d54aba) add(InlineV1AccountsPostRequestFormGroupsPaymentsPricingX8830e40eBranch.InlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2X59d54aba)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsPostRequestFormGroupsPaymentsPricingX8830e40e {
      val inspection = inspectInlineV1AccountsPostRequestFormGroupsPaymentsPricingX8830e40e(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsPostRequestFormGroupsPaymentsPricingX8830e40eNoMatchException("InlineV1AccountsPostRequestFormGroupsPaymentsPricingX8830e40e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsPostRequestFormGroupsPaymentsPricingX8830e40e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormGroupsPaymentsPricingX8830e40e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormGroupsPaymentsPricingX8830e40e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormGroupsPaymentsPricingX8830e40e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormGroupsPaymentsPricingX8830e40e) {
      encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormGroupsPaymentsPricingX8830e40e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsPostRequestFormGroupsPaymentsPricingX8830e40e(element: JsonElement): InlineV1AccountsPostRequestFormGroupsPaymentsPricingX8830e40eInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2X59d54aba = element.isJsonDecodable<InlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2X59d54aba>()
  return InlineV1AccountsPostRequestFormGroupsPaymentsPricingX8830e40eInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2X59d54aba = matchesInlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2X59d54aba,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2X59d54aba) add("InlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2X59d54aba: value does not match InlineV1AccountsPostRequestFormGroupsPaymentsPricingAnyOf2X59d54aba")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
