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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsXb9a018acBranch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X3fe9b6ae,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsXb9a018acDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsXb9a018acNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsXb9a018acDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsXb9a018acInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X3fe9b6ae:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X3fe9b6ae).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/klarna/anyOf/0/properties/subscriptions.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/klarna/anyOf/0/properties/subscriptions
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsXb9a018ac.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsXb9a018ac internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsXb9a018acInspection,
) {
  public val branch1:
      List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaItemX80d96cbf>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaItemX80d96cbf>>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X3fe9b6ae:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X3fe9b6ae? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X3fe9b6ae) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X3fe9b6ae>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsXb9a018acBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsXb9a018acBranch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X3fe9b6ae) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsXb9a018acBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X3fe9b6ae)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsXb9a018ac {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsXb9a018ac(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsXb9a018acNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsXb9a018ac matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsXb9a018ac(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsXb9a018ac> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsXb9a018ac {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsXb9a018ac")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsXb9a018ac) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsXb9a018ac").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsXb9a018ac(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsXb9a018acInspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaItemX80d96cbf>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X3fe9b6ae = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X3fe9b6ae>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsSubscriptionsXb9a018acInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X3fe9b6ae = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X3fe9b6ae,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X3fe9b6ae) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X3fe9b6ae: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X3fe9b6ae")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
