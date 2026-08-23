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

public enum class InlineV1PaymentIntentsCapturePostRequestFormOrderReferenceX58a0ec4cBranch {
  Branch1,
  InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1AnyOf2Xf5e3f82a,
}

public sealed class InlineV1PaymentIntentsCapturePostRequestFormOrderReferenceX58a0ec4cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsCapturePostRequestFormOrderReferenceX58a0ec4cNoMatchException(
  message: String,
) : InlineV1PaymentIntentsCapturePostRequestFormOrderReferenceX58a0ec4cDecodingException(message)

internal data class InlineV1PaymentIntentsCapturePostRequestFormOrderReferenceX58a0ec4cInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1AnyOf2Xf5e3f82a:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1AnyOf2Xf5e3f82a).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_details/anyOf/0/properties/order_reference.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1capture/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_details/anyOf/0/properties/order_reference
 */
@Serializable(with = InlineV1PaymentIntentsCapturePostRequestFormOrderReferenceX58a0ec4c.Serializer::class)
public class InlineV1PaymentIntentsCapturePostRequestFormOrderReferenceX58a0ec4c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsCapturePostRequestFormOrderReferenceX58a0ec4cInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1AnyOf2Xf5e3f82a:
      InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1AnyOf2Xf5e3f82a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1AnyOf2Xf5e3f82a) json.decodeFromJsonElement<InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1AnyOf2Xf5e3f82a>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsCapturePostRequestFormOrderReferenceX58a0ec4cBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsCapturePostRequestFormOrderReferenceX58a0ec4cBranch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1AnyOf2Xf5e3f82a) add(InlineV1PaymentIntentsCapturePostRequestFormOrderReferenceX58a0ec4cBranch.InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1AnyOf2Xf5e3f82a)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsCapturePostRequestFormOrderReferenceX58a0ec4c {
      val inspection = inspectInlineV1PaymentIntentsCapturePostRequestFormOrderReferenceX58a0ec4c(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsCapturePostRequestFormOrderReferenceX58a0ec4cNoMatchException("InlineV1PaymentIntentsCapturePostRequestFormOrderReferenceX58a0ec4c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsCapturePostRequestFormOrderReferenceX58a0ec4c(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsCapturePostRequestFormOrderReferenceX58a0ec4c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsCapturePostRequestFormOrderReferenceX58a0ec4c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsCapturePostRequestFormOrderReferenceX58a0ec4c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsCapturePostRequestFormOrderReferenceX58a0ec4c) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsCapturePostRequestFormOrderReferenceX58a0ec4c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsCapturePostRequestFormOrderReferenceX58a0ec4c(element: JsonElement): InlineV1PaymentIntentsCapturePostRequestFormOrderReferenceX58a0ec4cInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1AnyOf2Xf5e3f82a = element.isJsonDecodable<InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1AnyOf2Xf5e3f82a>()
  return InlineV1PaymentIntentsCapturePostRequestFormOrderReferenceX58a0ec4cInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1AnyOf2Xf5e3f82a = matchesInlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1AnyOf2Xf5e3f82a,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1AnyOf2Xf5e3f82a) add("InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1AnyOf2Xf5e3f82a: value does not match InlineV1PaymentIntentsCapturePostRequestFormPaymentDetailsAnyOf1AnyOf2Xf5e3f82a")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
