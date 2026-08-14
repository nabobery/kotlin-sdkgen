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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1CheckoutSessionsPostRequestFormSubscriptionsX4f9fd890Branch {
  Branch1,
  InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X8ba83b88,
}

public sealed class InlineV1CheckoutSessionsPostRequestFormSubscriptionsX4f9fd890DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CheckoutSessionsPostRequestFormSubscriptionsX4f9fd890NoMatchException(
  message: String,
) : InlineV1CheckoutSessionsPostRequestFormSubscriptionsX4f9fd890DecodingException(message)

internal data class InlineV1CheckoutSessionsPostRequestFormSubscriptionsX4f9fd890Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X8ba83b88:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X8ba83b88).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/klarna/properties/subscriptions.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/klarna/properties/subscriptions
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormSubscriptionsX4f9fd890.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormSubscriptionsX4f9fd890 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1CheckoutSessionsPostRequestFormSubscriptionsX4f9fd890Inspection,
) {
  public val branch1:
      List<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaItemXbae8515d>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaItemXbae8515d>>(raw) else null }

  public val inlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X8ba83b88:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X8ba83b88? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X8ba83b88) json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X8ba83b88>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CheckoutSessionsPostRequestFormSubscriptionsX4f9fd890Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CheckoutSessionsPostRequestFormSubscriptionsX4f9fd890Branch.Branch1)
      if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X8ba83b88) add(InlineV1CheckoutSessionsPostRequestFormSubscriptionsX4f9fd890Branch.InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X8ba83b88)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CheckoutSessionsPostRequestFormSubscriptionsX4f9fd890 {
      val inspection = inspectInlineV1CheckoutSessionsPostRequestFormSubscriptionsX4f9fd890(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CheckoutSessionsPostRequestFormSubscriptionsX4f9fd890NoMatchException("InlineV1CheckoutSessionsPostRequestFormSubscriptionsX4f9fd890 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CheckoutSessionsPostRequestFormSubscriptionsX4f9fd890(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormSubscriptionsX4f9fd890> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormSubscriptionsX4f9fd890 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormSubscriptionsX4f9fd890")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormSubscriptionsX4f9fd890) {
      encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormSubscriptionsX4f9fd890").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CheckoutSessionsPostRequestFormSubscriptionsX4f9fd890(element: JsonElement): InlineV1CheckoutSessionsPostRequestFormSubscriptionsX4f9fd890Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaItemXbae8515d>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X8ba83b88 = element.isJsonDecodable<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X8ba83b88>()
  return InlineV1CheckoutSessionsPostRequestFormSubscriptionsX4f9fd890Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X8ba83b88 = matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X8ba83b88,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X8ba83b88) add("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X8ba83b88: value does not match InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X8ba83b88")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
