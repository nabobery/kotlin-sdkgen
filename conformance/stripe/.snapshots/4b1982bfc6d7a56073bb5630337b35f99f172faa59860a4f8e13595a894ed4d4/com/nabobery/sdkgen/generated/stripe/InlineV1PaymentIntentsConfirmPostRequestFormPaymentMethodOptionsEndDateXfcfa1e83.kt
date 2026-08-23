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

public enum class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateXfcfa1e83Branch {
  Branch1,
  InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xfab9b3e7,
}

public sealed class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateXfcfa1e83DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateXfcfa1e83NoMatchException(
  message: String,
) : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateXfcfa1e83DecodingException(message)

internal data class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateXfcfa1e83Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xfab9b3e7:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xfab9b3e7).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/payto/anyOf/0/properties/mandate_options/prop
 * erties/end_date.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/payto/anyOf/0/properties/mandate_options/prop
 * erties/end_date
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateXfcfa1e83.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateXfcfa1e83 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateXfcfa1e83Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xfab9b3e7:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xfab9b3e7? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xfab9b3e7) json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xfab9b3e7>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateXfcfa1e83Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateXfcfa1e83Branch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xfab9b3e7) add(InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateXfcfa1e83Branch.InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xfab9b3e7)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateXfcfa1e83 {
      val inspection = inspectInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateXfcfa1e83(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateXfcfa1e83NoMatchException("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateXfcfa1e83 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateXfcfa1e83(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateXfcfa1e83> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateXfcfa1e83 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateXfcfa1e83")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateXfcfa1e83) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateXfcfa1e83").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateXfcfa1e83(element: JsonElement): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateXfcfa1e83Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xfab9b3e7 = element.isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xfab9b3e7>()
  return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsEndDateXfcfa1e83Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xfab9b3e7 = matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xfab9b3e7,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xfab9b3e7) add("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xfab9b3e7: value does not match InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xfab9b3e7")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
