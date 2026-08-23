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

public enum class InlineV1CheckoutSessionsPostRequestFormReferencePrefixX94fe75c2Branch {
  Branch1,
  InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAnyOf2Xc07fc167,
}

public sealed class InlineV1CheckoutSessionsPostRequestFormReferencePrefixX94fe75c2DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CheckoutSessionsPostRequestFormReferencePrefixX94fe75c2NoMatchException(
  message: String,
) : InlineV1CheckoutSessionsPostRequestFormReferencePrefixX94fe75c2DecodingException(message)

internal data class InlineV1CheckoutSessionsPostRequestFormReferencePrefixX94fe75c2Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAnyOf2Xc07fc167:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAnyOf2Xc07fc167).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/bacs_debit/properties/mandate_options/properties/reference_pr
 * efix.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/bacs_debit/properties/mandate_options/properties/reference_pr
 * efix
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormReferencePrefixX94fe75c2.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormReferencePrefixX94fe75c2 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1CheckoutSessionsPostRequestFormReferencePrefixX94fe75c2Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAnyOf2Xc07fc167:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAnyOf2Xc07fc167? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAnyOf2Xc07fc167) json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAnyOf2Xc07fc167>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CheckoutSessionsPostRequestFormReferencePrefixX94fe75c2Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CheckoutSessionsPostRequestFormReferencePrefixX94fe75c2Branch.Branch1)
      if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAnyOf2Xc07fc167) add(InlineV1CheckoutSessionsPostRequestFormReferencePrefixX94fe75c2Branch.InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAnyOf2Xc07fc167)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CheckoutSessionsPostRequestFormReferencePrefixX94fe75c2 {
      val inspection = inspectInlineV1CheckoutSessionsPostRequestFormReferencePrefixX94fe75c2(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CheckoutSessionsPostRequestFormReferencePrefixX94fe75c2NoMatchException("InlineV1CheckoutSessionsPostRequestFormReferencePrefixX94fe75c2 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CheckoutSessionsPostRequestFormReferencePrefixX94fe75c2(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormReferencePrefixX94fe75c2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormReferencePrefixX94fe75c2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormReferencePrefixX94fe75c2")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormReferencePrefixX94fe75c2) {
      encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormReferencePrefixX94fe75c2").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CheckoutSessionsPostRequestFormReferencePrefixX94fe75c2(element: JsonElement): InlineV1CheckoutSessionsPostRequestFormReferencePrefixX94fe75c2Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAnyOf2Xc07fc167 = element.isJsonDecodable<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAnyOf2Xc07fc167>()
  return InlineV1CheckoutSessionsPostRequestFormReferencePrefixX94fe75c2Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAnyOf2Xc07fc167 = matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAnyOf2Xc07fc167,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAnyOf2Xc07fc167) add("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAnyOf2Xc07fc167: value does not match InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAnyOf2Xc07fc167")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
