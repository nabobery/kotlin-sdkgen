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

public enum class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX954b5e87Branch {
  Branch1,
  InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X3d1e6ede,
}

public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX954b5e87DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX954b5e87NoMatchException(
  message: String,
) : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX954b5e87DecodingException(message)

internal data class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX954b5e87Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X3d1e6ede:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X3d1e6ede).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/klarna/properties/subscriptions.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/klarna/properties/subscriptions
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX954b5e87.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX954b5e87 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX954b5e87Inspection,
) {
  public val branch1:
      List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXb048b668>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXb048b668>>(raw) else null }

  public val inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X3d1e6ede:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X3d1e6ede? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X3d1e6ede) json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X3d1e6ede>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX954b5e87Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX954b5e87Branch.Branch1)
      if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X3d1e6ede) add(InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX954b5e87Branch.InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X3d1e6ede)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX954b5e87 {
      val inspection = inspectInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX954b5e87(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX954b5e87NoMatchException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX954b5e87 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX954b5e87(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX954b5e87> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX954b5e87 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX954b5e87")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX954b5e87) {
      encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX954b5e87").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX954b5e87(element: JsonElement): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX954b5e87Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaItemXb048b668>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X3d1e6ede = element.isJsonDecodable<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X3d1e6ede>()
  return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX954b5e87Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X3d1e6ede = matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X3d1e6ede,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X3d1e6ede) add("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X3d1e6ede: value does not match InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaAnyOf2X3d1e6ede")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
