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

public enum class InlineV1SetupIntentsConfirmPostRequestFormSubscriptionsX9095d02aBranch {
  Branch1,
  InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X3f4e3ca8,
}

public sealed class InlineV1SetupIntentsConfirmPostRequestFormSubscriptionsX9095d02aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SetupIntentsConfirmPostRequestFormSubscriptionsX9095d02aNoMatchException(
  message: String,
) : InlineV1SetupIntentsConfirmPostRequestFormSubscriptionsX9095d02aDecodingException(message)

internal data class InlineV1SetupIntentsConfirmPostRequestFormSubscriptionsX9095d02aInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X3f4e3ca8:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X3f4e3ca8).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/klarna/properties/subscriptions.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/klarna/properties/subscriptions
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormSubscriptionsX9095d02a.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormSubscriptionsX9095d02a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SetupIntentsConfirmPostRequestFormSubscriptionsX9095d02aInspection,
) {
  public val branch1:
      List<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsItemX24692a83>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsItemX24692a83>>(raw) else null }

  public val inlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X3f4e3ca8:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X3f4e3ca8? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X3f4e3ca8) json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X3f4e3ca8>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SetupIntentsConfirmPostRequestFormSubscriptionsX9095d02aBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SetupIntentsConfirmPostRequestFormSubscriptionsX9095d02aBranch.Branch1)
      if (inspection.matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X3f4e3ca8) add(InlineV1SetupIntentsConfirmPostRequestFormSubscriptionsX9095d02aBranch.InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X3f4e3ca8)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SetupIntentsConfirmPostRequestFormSubscriptionsX9095d02a {
      val inspection = inspectInlineV1SetupIntentsConfirmPostRequestFormSubscriptionsX9095d02a(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SetupIntentsConfirmPostRequestFormSubscriptionsX9095d02aNoMatchException("InlineV1SetupIntentsConfirmPostRequestFormSubscriptionsX9095d02a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SetupIntentsConfirmPostRequestFormSubscriptionsX9095d02a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormSubscriptionsX9095d02a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormSubscriptionsX9095d02a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsConfirmPostRequestFormSubscriptionsX9095d02a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormSubscriptionsX9095d02a) {
      encoder.requireJsonEncoder("InlineV1SetupIntentsConfirmPostRequestFormSubscriptionsX9095d02a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SetupIntentsConfirmPostRequestFormSubscriptionsX9095d02a(element: JsonElement): InlineV1SetupIntentsConfirmPostRequestFormSubscriptionsX9095d02aInspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsItemX24692a83>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X3f4e3ca8 = element.isJsonDecodable<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X3f4e3ca8>()
  return InlineV1SetupIntentsConfirmPostRequestFormSubscriptionsX9095d02aInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X3f4e3ca8 = matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X3f4e3ca8,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X3f4e3ca8) add("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X3f4e3ca8: value does not match InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X3f4e3ca8")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
