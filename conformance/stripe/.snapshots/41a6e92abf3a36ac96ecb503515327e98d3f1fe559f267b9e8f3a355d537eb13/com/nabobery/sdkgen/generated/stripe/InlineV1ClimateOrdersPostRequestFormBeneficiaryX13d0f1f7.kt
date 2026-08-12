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

public enum class InlineV1ClimateOrdersPostRequestFormBeneficiaryX13d0f1f7Branch {
  InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1X59335f3f,
  InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf2Xce94a6b5,
}

public sealed class InlineV1ClimateOrdersPostRequestFormBeneficiaryX13d0f1f7DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1ClimateOrdersPostRequestFormBeneficiaryX13d0f1f7NoMatchException(
  message: String,
) : InlineV1ClimateOrdersPostRequestFormBeneficiaryX13d0f1f7DecodingException(message)

internal data class InlineV1ClimateOrdersPostRequestFormBeneficiaryX13d0f1f7Inspection(
  public val matchesInlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1X59335f3f: Boolean,
  public val matchesInlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf2Xce94a6b5: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1X59335f3f, matchesInlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf2Xce94a6b5).count { it }
}

/**
 * Publicly sharable reference for the end beneficiary of carbon removal. Assumed to be the Stripe account if not set.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1climate~1orders~1{order}/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/beneficiary
 */
@Serializable(with = InlineV1ClimateOrdersPostRequestFormBeneficiaryX13d0f1f7.Serializer::class)
public class InlineV1ClimateOrdersPostRequestFormBeneficiaryX13d0f1f7 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1ClimateOrdersPostRequestFormBeneficiaryX13d0f1f7Inspection,
) {
  public val inlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1X59335f3f:
      InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1X59335f3f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1X59335f3f) json.decodeFromJsonElement<InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1X59335f3f>(raw) else null }

  public val inlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf2Xce94a6b5:
      InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf2Xce94a6b5? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf2Xce94a6b5) json.decodeFromJsonElement<InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf2Xce94a6b5>(raw) else null }

  public val matchedBranches: Set<InlineV1ClimateOrdersPostRequestFormBeneficiaryX13d0f1f7Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1X59335f3f) add(InlineV1ClimateOrdersPostRequestFormBeneficiaryX13d0f1f7Branch.InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1X59335f3f)
      if (inspection.matchesInlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf2Xce94a6b5) add(InlineV1ClimateOrdersPostRequestFormBeneficiaryX13d0f1f7Branch.InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf2Xce94a6b5)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1ClimateOrdersPostRequestFormBeneficiaryX13d0f1f7 {
      val inspection = inspectInlineV1ClimateOrdersPostRequestFormBeneficiaryX13d0f1f7(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1ClimateOrdersPostRequestFormBeneficiaryX13d0f1f7NoMatchException("InlineV1ClimateOrdersPostRequestFormBeneficiaryX13d0f1f7 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1ClimateOrdersPostRequestFormBeneficiaryX13d0f1f7(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1ClimateOrdersPostRequestFormBeneficiaryX13d0f1f7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ClimateOrdersPostRequestFormBeneficiaryX13d0f1f7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ClimateOrdersPostRequestFormBeneficiaryX13d0f1f7")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ClimateOrdersPostRequestFormBeneficiaryX13d0f1f7) {
      encoder.requireJsonEncoder("InlineV1ClimateOrdersPostRequestFormBeneficiaryX13d0f1f7").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1ClimateOrdersPostRequestFormBeneficiaryX13d0f1f7(element: JsonElement): InlineV1ClimateOrdersPostRequestFormBeneficiaryX13d0f1f7Inspection {
  val matchesInlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1X59335f3f = element.isJsonDecodable<InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1X59335f3f>()
  val matchesInlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf2Xce94a6b5 = element.isJsonDecodable<InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf2Xce94a6b5>()
  return InlineV1ClimateOrdersPostRequestFormBeneficiaryX13d0f1f7Inspection(
    matchesInlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1X59335f3f = matchesInlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1X59335f3f,
    matchesInlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf2Xce94a6b5 = matchesInlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf2Xce94a6b5,
    failures = buildList {
      if (!matchesInlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1X59335f3f) add("InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1X59335f3f: value does not match InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1X59335f3f")
      if (!matchesInlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf2Xce94a6b5) add("InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf2Xce94a6b5: value does not match InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf2Xce94a6b5")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
