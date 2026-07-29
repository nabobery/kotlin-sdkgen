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

public enum class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX0d1f3ac7Branch {
  Branch1,
  InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2Xd2b7f50c,
}

public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX0d1f3ac7DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX0d1f3ac7NoMatchException(
  message: String,
) : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX0d1f3ac7DecodingException(message)

internal data class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX0d1f3ac7Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2Xd2b7f50c:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2Xd2b7f50c).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/klarna/properties/subscriptions.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/klarna/properties/subscriptions
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX0d1f3ac7.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX0d1f3ac7 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX0d1f3ac7Inspection,
) {
  public val branch1:
      List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXd11c02fd>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXd11c02fd>>(raw) else null }

  public val inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2Xd2b7f50c:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2Xd2b7f50c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2Xd2b7f50c) json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2Xd2b7f50c>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX0d1f3ac7Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX0d1f3ac7Branch.Branch1)
      if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2Xd2b7f50c) add(InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX0d1f3ac7Branch.InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2Xd2b7f50c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX0d1f3ac7 {
      val inspection = inspectInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX0d1f3ac7(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX0d1f3ac7NoMatchException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX0d1f3ac7 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX0d1f3ac7(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX0d1f3ac7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX0d1f3ac7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX0d1f3ac7")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX0d1f3ac7) {
      encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX0d1f3ac7").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX0d1f3ac7(element: JsonElement): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX0d1f3ac7Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXd11c02fd>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2Xd2b7f50c = element.isJsonDecodable<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2Xd2b7f50c>()
  return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX0d1f3ac7Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2Xd2b7f50c = matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2Xd2b7f50c,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2Xd2b7f50c) add("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2Xd2b7f50c: value does not match InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2Xd2b7f50c")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
