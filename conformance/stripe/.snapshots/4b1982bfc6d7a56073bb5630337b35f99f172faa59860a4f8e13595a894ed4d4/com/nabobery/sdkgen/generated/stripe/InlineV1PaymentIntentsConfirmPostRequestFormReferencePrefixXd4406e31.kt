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

public enum class InlineV1PaymentIntentsConfirmPostRequestFormReferencePrefixXd4406e31Branch {
  Branch1,
  InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X887fa9f3,
}

public sealed class InlineV1PaymentIntentsConfirmPostRequestFormReferencePrefixXd4406e31DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsConfirmPostRequestFormReferencePrefixXd4406e31NoMatchException(
  message: String,
) : InlineV1PaymentIntentsConfirmPostRequestFormReferencePrefixXd4406e31DecodingException(message)

internal data class InlineV1PaymentIntentsConfirmPostRequestFormReferencePrefixXd4406e31Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X887fa9f3:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X887fa9f3).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/sepa_debit/anyOf/0/properties/mandate_options
 * /properties/reference_prefix.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/sepa_debit/anyOf/0/properties/mandate_options
 * /properties/reference_prefix
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormReferencePrefixXd4406e31.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormReferencePrefixXd4406e31 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsConfirmPostRequestFormReferencePrefixXd4406e31Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X887fa9f3:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X887fa9f3? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X887fa9f3) json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X887fa9f3>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsConfirmPostRequestFormReferencePrefixXd4406e31Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsConfirmPostRequestFormReferencePrefixXd4406e31Branch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X887fa9f3) add(InlineV1PaymentIntentsConfirmPostRequestFormReferencePrefixXd4406e31Branch.InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X887fa9f3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsConfirmPostRequestFormReferencePrefixXd4406e31 {
      val inspection = inspectInlineV1PaymentIntentsConfirmPostRequestFormReferencePrefixXd4406e31(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsConfirmPostRequestFormReferencePrefixXd4406e31NoMatchException("InlineV1PaymentIntentsConfirmPostRequestFormReferencePrefixXd4406e31 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsConfirmPostRequestFormReferencePrefixXd4406e31(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormReferencePrefixXd4406e31> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormReferencePrefixXd4406e31 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormReferencePrefixXd4406e31")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormReferencePrefixXd4406e31) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormReferencePrefixXd4406e31").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsConfirmPostRequestFormReferencePrefixXd4406e31(element: JsonElement): InlineV1PaymentIntentsConfirmPostRequestFormReferencePrefixXd4406e31Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X887fa9f3 = element.isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X887fa9f3>()
  return InlineV1PaymentIntentsConfirmPostRequestFormReferencePrefixXd4406e31Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X887fa9f3 = matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X887fa9f3,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X887fa9f3) add("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X887fa9f3: value does not match InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X887fa9f3")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
