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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNameXf622f1f9Branch {
  Branch1,
  InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2Xbc0e03de,
}

public sealed class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNameXf622f1f9DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNameXf622f1f9NoMatchException(
  message: String,
) : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNameXf622f1f9DecodingException(message)

internal data class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNameXf622f1f9Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2Xbc0e03de:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2Xbc0e03de).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_data/properties/billing_details/properties/name.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_data/properties/billing_details/properties/name
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNameXf622f1f9.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNameXf622f1f9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNameXf622f1f9Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2Xbc0e03de:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2Xbc0e03de? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2Xbc0e03de) json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2Xbc0e03de>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNameXf622f1f9Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNameXf622f1f9Branch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2Xbc0e03de) add(InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNameXf622f1f9Branch.InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2Xbc0e03de)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNameXf622f1f9 {
      val inspection = inspectInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNameXf622f1f9(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNameXf622f1f9NoMatchException("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNameXf622f1f9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNameXf622f1f9(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNameXf622f1f9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNameXf622f1f9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNameXf622f1f9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNameXf622f1f9) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNameXf622f1f9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNameXf622f1f9(element: JsonElement): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNameXf622f1f9Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2Xbc0e03de = element.isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2Xbc0e03de>()
  return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataNameXf622f1f9Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2Xbc0e03de = matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2Xbc0e03de,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2Xbc0e03de) add("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2Xbc0e03de: value does not match InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2Xbc0e03de")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
