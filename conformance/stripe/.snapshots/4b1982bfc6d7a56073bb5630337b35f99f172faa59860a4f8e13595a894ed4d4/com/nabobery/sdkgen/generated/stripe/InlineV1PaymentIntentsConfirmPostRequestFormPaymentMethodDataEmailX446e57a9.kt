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

public enum class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEmailX446e57a9Branch {
  Branch1,
  InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X1b38d356,
}

public sealed class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEmailX446e57a9DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEmailX446e57a9NoMatchException(
  message: String,
) : InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEmailX446e57a9DecodingException(message)

internal data class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEmailX446e57a9Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X1b38d356:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X1b38d356).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_data/properties/billing_details/properties/email.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_data/properties/billing_details/properties/email
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEmailX446e57a9.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEmailX446e57a9 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEmailX446e57a9Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X1b38d356:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X1b38d356? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X1b38d356) json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X1b38d356>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEmailX446e57a9Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEmailX446e57a9Branch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X1b38d356) add(InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEmailX446e57a9Branch.InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X1b38d356)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEmailX446e57a9 {
      val inspection = inspectInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEmailX446e57a9(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEmailX446e57a9NoMatchException("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEmailX446e57a9 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEmailX446e57a9(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEmailX446e57a9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEmailX446e57a9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEmailX446e57a9")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEmailX446e57a9) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEmailX446e57a9").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEmailX446e57a9(element: JsonElement): InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEmailX446e57a9Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X1b38d356 = element.isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X1b38d356>()
  return InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataEmailX446e57a9Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X1b38d356 = matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X1b38d356,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X1b38d356) add("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X1b38d356: value does not match InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X1b38d356")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
